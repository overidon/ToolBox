// This is in the target file
// Such as getKey method etc


if (control.allowed[id]) {
  control[id]();
}


// This is in the actual input javascript file 

class keyController {

  constructor () {
    console.log("The keyController was constructed");

    this.allowed = {
      "key_97":true,
      "key_98":true,
      "key_101":true, 
      "key_119":true, 
      "key_102":true, 
      "key_113":true, 
      "key_114":true, 
      "key_115":true
    }

  // end of the keyController constructor   
  }

  key_97() {
    console.log("...setting the FUSE_EL_NE to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_EL_NE.png";
    document.getElementById("paint_item").value = "FUSE_EL_NE";

  }

  key_98() {
    console.log("...setting the LINK_UNIT to the active paint object now.");

    document.getElementById("paint_item_img").src= "./images/link_unit.png";
    document.getElementById("paint_item").value = "link_unit";

  }

  key_102() {
    console.log("...setting the FUSE_EL_NW to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_EL_NW.png";
    document.getElementById("paint_item").value = "FUSE_EL_NW";
  }

  key_113() {
    console.log("...setting the FUSE_EL_SE to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_EL_SE.png";
    document.getElementById("paint_item").value = "FUSE_EL_SE";
  }


  key_114() {
    console.log("...setting the FUSE_EL_SW to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_EL_SW.png";
    document.getElementById("paint_item").value = "FUSE_EL_SW";
  }

  key_115() {
    console.log("...setting the FUSE_HORIZ to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_HORIZ.png";
    document.getElementById("paint_item").value = "FUSE_HORIZ";
  }


  key_119() {
    console.log("...setting the FUSE_VERT to the active paint object now.");
    document.getElementById("paint_item_img").src= "./images/FUSE_VERT.png";
    document.getElementById("paint_item").value = "FUSE_VERT";
  }



  key_101() {
    console.log("...setting the EMPTY to the active paint object now.");

    document.getElementById("paint_item_img").src= "./images/BLANK.png";
    document.getElementById("paint_item").value = "BLANK";
  }

// end of the keyController class   
}

let control = new keyController();
