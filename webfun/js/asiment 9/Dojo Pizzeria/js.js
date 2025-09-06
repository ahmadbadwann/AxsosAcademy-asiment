function pizzaOven(crust, sauce, cheeses, toppings){
    var pizza={};
    pizza.crust=crust;
    pizza.sauce=sauce;
    pizza.cheeses=cheeses;
    pizza.toppings=toppings;
    return pizza;
}
var p1=pizzaOven("deep dish","traditional","mozzarella",["pepperoni","sausage"]);
console.log("p1:" , p1);

var p2=pizzaOven("hand tossed", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log("p2:" , p2);

var p3 = pizzaOven("thin crust", "alfredo", "parmesan", ["chicken", "spinach"]);
console.log("P3:", p3);


var crustR = ["deep dish", "hand tossed", "thin crust", "stuffed crust"];
var sauceR = ["traditional", "marinara", "alfredo", "bbq"];
var cheesesR = ["mozzarella", "feta", "parmesan", "cheddar"];
var toppingsR = ["pepperoni", "sausage", "mushrooms", "olives", "onions", "chicken", "spinach", "jalapenos", "beef"];

function randomChoice(arr) {
    var index = Math.floor(Math.random() * arr.length);
    return arr[index];
}
function randompizza(){
return pizzaOven(
    randomChoice(crustR),
    randomChoice(sauceR),
    randomChoice(cheesesR),
    randomChoice(toppingsR)
);
}
var rp = randompizza();
console.log("randompizza",rp);