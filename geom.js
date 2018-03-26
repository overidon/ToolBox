// MARK: Canvas SETUP
var dataCanvas = document.getElementById("dataCanvas");
var ctxDATA = dataCanvas.getContext("2d");


// MARK: Object constructor area
class CircleBall {

  constructor (name, x, y, radius, color) {

    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;

    this.name = name;

    // push this object into the drawList
    drawList.push(this);
  }

  // update CircleBall
  update() {

    if (this.name == "COMP") {
      this.x = 200 + drawList[4].xComponent;

    }

  }

  // The draw method will be called from the render function
  draw() {
    ctxDATA.beginPath();
    ctxDATA.arc(this.x, this.y, this.radius, 0, 2 * Math.PI, false);
    ctxDATA.lineWidth = 3;
    ctxDATA.strokeStyle = BLACK;
    ctxDATA.stroke();
    ctxDATA.fillStyle = this.color;
    ctxDATA.fill();
  }
}

class AngleBall {

  constructor ( x, y, radius, color ) {

    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.distanceFromCenter = 150;

    this.name = "THETA_BALL";

    this.move = false;

    // The angle of the AngleBall will start at 0
    this.angle = 0;

    this.xComponent = 0;
    this.yComponent = 0;

    this.sinTheta = 0;

    this.cosTheta = 0;

    // push this object into the drawList
    drawList.push(this);
  }

  // update AngleBall
  update() {

    if (this.move === true) {
      this.angle += 1;
    }

    document.getElementById("angle0").innerHTML = ( Math.round( this.angle * 100)/100 ).toString();

    this.sinTheta = sinTheta();

    document.getElementById("sin0").innerHTML   = ( Math.round( this.sinTheta * 10000)/ 10000 ).toString();

    this.cosTheta = cosTheta();

    document.getElementById("cos0").innerHTML   = ( Math.round( this.cosTheta * 10000)/ 10000 ).toString();

    document.getElementById("hyp0").innerHTML   = ( this.distanceFromCenter ).toString();

    // add the data to the html for the x and y component data
    this.xComponent = this.cosTheta * this.distanceFromCenter;

    document.getElementById("xcom0").innerHTML = ( Math.round( this.xComponent * 1000)/ 1000 ).toString();

    this.yComponent = this.sinTheta * this.distanceFromCenter;

    document.getElementById("ycom0").innerHTML = ( Math.round( this.yComponent * 1000)/ 1000 ).toString();


    this.y = 200 + ( this.yComponent  * -1) ;
    this.x = 200 + this.xComponent;

  }

  // The draw method will be called from the render function
  draw() {

    ctxDATA.beginPath();
    ctxDATA.arc(this.x, this.y, this.radius, 0, 2 * Math.PI, false);
    ctxDATA.lineWidth = 3;
    ctxDATA.strokeStyle = BLACK;
    ctxDATA.stroke();
    ctxDATA.fillStyle = this.color;
    ctxDATA.fill();
  }
}

// NOTE: The AngleLink will connect the CircleBall  and/or  AngleBall together
class AngleLink {

  constructor (name, x, y, targetX, targetY, color ) {
    this.x = x;
    this.y = y;
    this.targetX = targetX;
    this.targetY = targetY;
    this.color = color;
    this.name = name;

    // This data should be LAST
    drawList.push(this);
  }

  update() {
  }

  draw() {

    if (this.name == "HEAVY_LINK") {
      // Draw the AngleLink
      ctxDATA.beginPath();
      ctxDATA.strokeStyle = this.color;
      ctxDATA.lineWidth = 1;
      ctxDATA.moveTo(this.x, this.y);
      ctxDATA.lineTo(drawList[4].x, drawList[4].y);
      ctxDATA.stroke();

    } else if (this.name == "COMP_LINKY"){
      // Draw the AngleLink
      ctxDATA.beginPath();
      ctxDATA.strokeStyle = this.color;
      ctxDATA.lineWidth = 1;
      ctxDATA.moveTo(drawList[6].x, drawList[6].y);
      ctxDATA.lineTo(drawList[4].x, drawList[4].y);
      ctxDATA.stroke();
    } else if (this.name == "COMP_LINKX"){
      // Draw the AngleLink
      ctxDATA.beginPath();
      ctxDATA.strokeStyle = this.color;
      ctxDATA.lineWidth = 1;
      ctxDATA.moveTo(drawList[6].x, drawList[6].y);
      ctxDATA.lineTo(drawList[1].x, drawList[1].y);
      ctxDATA.stroke();
    } else {
      // Draw the AngleLink
      ctxDATA.beginPath();
      ctxDATA.strokeStyle = this.color;
      ctxDATA.lineWidth = 1;
      ctxDATA.moveTo(this.x, this.y);
      ctxDATA.lineTo(this.targetX, this.targetY);
      ctxDATA.stroke();
    }

  }
}
