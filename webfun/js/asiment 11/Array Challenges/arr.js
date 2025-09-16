function alwaysHungry(arr){
    var x =arr;
    for(var i=0;i< x.length;i++){
        if(x[i] == "food"){
            console.log("yummy");
        }else{
            console.log("i'm hungry")
        }
        
    }
}

alwaysHungry(["3.14","food","oie","true","food"]);

alwaysHungry([4, 1, 5, 7, 2]);

function highPass(arr,cutoff){
    var filteredArr = [];
    var c=0;
    for(var i=0; i<arr.length;i++){
        if(cutoff<arr[i]){
            filteredArr[c]=arr[i];
            c++;
        }
    }
    return filteredArr;
}
var result = highPass([6,8,3,10,-2,5,9],5);
console.log(result);


function betterThanAverage(arr) {
    var sum = 0;
    // calculate the average
    
    for(var i=0;i<arr.length;i++){
        s=sum+arr[i];
    }
    var average=sum/arr.length;
    var count = 0;
    // count how many values are greated than the average
    for(var s=0;s<arr.length;s++){
        if(arr[s]>average){
            count=count+1;
        }
    }

    return count;
}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); // we expect back 4


function reverse(arr){
    //you code here
    let x=[];
    var f=0;
    for(var i=arr.length-1;i>=0;i--){
        x[f]=arr[i];
        f++;
    }
    for(var c=0;c<arr.length;c++){
        arr[c]=x[c];
    }
    return arr;
}
var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result); // we expect back 4

function fibonacciArray(n) {
     // the [0, 1] are the starting values of the array to calculate the rest from
        var fibArr = [0, 1];
        // your code here 
        for(var i=0;i<n-2;i++){
            fibArr[i+2]=fibArr[i]+fibArr[i+1];
        }
        
        return fibArr;
    }
var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]