// this key will control if shift is down
var paint = false;

var mouseDown = 0;

document.body.onmousedown = function() { 
    mouseDown = 1;

    document.getElementById('mouse_scan').src="./images/" + "mouse_down" + ".png";

    document.getElementById('mouse_status').innerHTML = "MOUSE_DOWN";
}

document.body.onmouseup = function() {
    mouseDown = 0;

    document.getElementById('mouse_scan').src="./images/" + "mouse_up" + ".png";
    document.getElementById('mouse_status').innerHTML = "MOUSE_UP";
}
