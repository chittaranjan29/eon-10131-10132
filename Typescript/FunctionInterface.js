//interface implementation using function 
//let add=function(a:number, b:number){
//    return a + b;
//}
var cal = function (quantity) {
    this.price = 40000;
    return this.price * quantity;
};
console.log(cal(10));
