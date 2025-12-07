class Ninja{
    constructor(name){
        this.name=name;
        this.health=100;
        this.speed=350;
        this.strength=3;
    }
    sayname(){
        console.log("Ninja's name "+this.name);
    }
    showStats(){
        console.log("name: " + this.name + " health:" + this.health +" speed:"+ this.speed + " strength:" + this.strength);
    } 
    drinkSake(){
        this.health+=10;
    }
    
}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayname();
ninja1.showStats();
ninja1.drinkSake();
ninja1.showStats();




class Sensei extends Ninja{
    constructor(name){
        super(name)
        this.health = 100;
        this.speed = 350;
        this.strength = 10;
        this.wisdom = 10;
    }
    speakWisdom(){
        this.drinkSake();
        console.log("What one programmer can do in one month, two programmers can do in two months.");
    }
}