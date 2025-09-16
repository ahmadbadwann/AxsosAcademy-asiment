function alarrt(){
    console.log("loading wethar report...");
}
function deletee(element){
    element.parentElement.remove();
}
function changtoforc(el){
    
    var secf =el.value;
    var a=document.querySelectorAll(".red-color");
    var n=document.querySelectorAll(".blo-color");
    console.log(a);
    
    if(secf=="f"){
    for(var i=0;i<a.length;i++){
        var h=a[i].innerText;
        a[i].innerText=(h*9/5)+32;
    }
    for(var k=0;k<n.length;k++){
        var j=n[k].innerText;
        n[k].innerText=(j*9/5)+32;
    }
}else{
    for(var i=0;i<a.length;i++){
        var h=a[i].innerText;
        a[i].innerText=Math.round((h-32)*5/9);
    }
    for(var k=0;k<n.length;k++){
        var j=n[k].innerText;
        n[k].innerText=Math.round((j-32)*5/9);
    }
}
}