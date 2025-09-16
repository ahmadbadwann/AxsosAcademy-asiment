document.getElementById("display");
let num1 = "";
let num2 = "";
let op = "";
function press(num) {
  num1;
  num1 += num;
  display.innerHTML = num1;
}
function setOP(key) {
  op = key;
  num2 = num1;
  num1 = "";
}
function clr(key) {
  num1 = "";
  num2 = "";
  op = "";
  display.innerHTML = 0;
}
function calculate() {
  if (op == "+") {
    display.innerHTML = num1 + num2;
  } else if (op == "*") {
    display.innerHTML = num1 * num2;
  }
  else if (op == "-") {
    display.innerHTML = num1 - num2;
  } else if (op == "/"){
    display.innerHTML = num1 / num2;
}
}
