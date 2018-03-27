// MARK: Canvas SETUP
var dataCanvas = document.getElementById("dataCanvas");
var ctxDATA = dataCanvas.getContext("2d");

// MARK: Setup the drawList -> this is for update AND render
var drawList = [];

// MARK: Trigonometry function area
function sinTheta() {
  var sinPrime = Math.sin(drawList[4].angle * (Math.PI / 180));
  return (sinPrime) ;
}

function cosTheta() {
  var cosPrime = Math.cos(drawList[4].angle * (Math.PI / 180));
  return (cosPrime) ;
}

function updateAngle() {

    drawList[4].angle += 1;
}

function animateAngle(){
  if (drawList[4].move) {
    drawList[4].move = false;
  } else {
    drawList[4].move = true;
  }
}

// MARK: update function Area -> update
function update() {


  // NOTE: loop through and update the objects in the drawList
  for (g = 0; g < drawList.length; g++) {
    drawList[g].update();
  }

  // MARK: render function call
  render();

  // IMPORTANT: Call MAX Frame Nano Time...----> Callback...
  window.requestAnimationFrame(update);

}

//MARK: render function Area - render()
function render() {

 //IMPORTANT: This is a canvas clear code for animation
 ctxDATA.clearRect(0,0,dataCanvas.width,dataCanvas.height );


 // NOTE: loop through and render the objects in the drawList
 for (g = 0; g < drawList.length; g++) {
  drawList[g].draw();
 }

}

// MARK: object instance creation area

// NOTE: the unit circle will be the larger circle
var unitCircle = new CircleBall( "UNIT", 200, 200, 150, MENUBLUE);

var unitOrigin = new CircleBall( "ORIGIN", 200, 200,   5, NUKE);

var circleEdge = new CircleBall( "EDGE0", 350, 200,   5, GREEN);

var angleBase  = new AngleLink ( "BASE", 200, 200, 350, 200, BLACK);

var anglePrime = new AngleBall ( 350, 200, 4, PURPLE);

var angleBase1  = new AngleLink ( "HEAVY_LINK", 200, 200, 350, 200, BLACK);

var compCircle = new CircleBall( "COMP", 350, 200, 5, PLASMAYELLOW);

var compLink0  = new AngleLink ( "COMP_LINKY", drawList[4].x, drawList[4].y,  drawList[6].x, drawList[6].y, RED);
var compLink0  = new AngleLink ( "COMP_LINKX", drawList[1].x, drawList[1].y,  drawList[6].x, drawList[6].y, BLUE);

drawList[4].move = false;






//MARK: SETUP MAX-FRAME NANO TIME -> Nano Time (MAX FRAME VS TRUE TIME...)
window.requestAnimationFrame(update);
