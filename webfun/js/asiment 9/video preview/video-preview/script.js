console.log("page loaded...");
let vid = document.getElementById("preview");

vid.onmouseover = function() {
    vid.play();
}

vid.onmouseout = function() {
    vid.pause();
}