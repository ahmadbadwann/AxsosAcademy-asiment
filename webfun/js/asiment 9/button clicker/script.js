function alertLog(){
    alert("this massege says : ninja was like")
}

function hide(){
    remove()
}
function loginLogout(login){
    if(login.innerText == "login"){login.innerText = "logout";}
    else{login.innerText = "login";}
}
function del(i){
    var x=document.querySelector(i);
    x.remove();
}