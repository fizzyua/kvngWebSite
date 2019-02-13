// Get the modal
var modal = document.getElementById('myModal');

var btns = document.getElementsByClassName("myBtn");

for (var i = 0; i < btns.length; i++){
    var b = document.getElementById(btns[i].id);
    b.onclick = function () {
        modal.style.display = "block";
    }

}



// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];



// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}



