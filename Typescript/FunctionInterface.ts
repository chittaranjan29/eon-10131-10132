//interface implementation using function 

interface Add
{
    
    price:number;
    calculation(quantity:number,price:number):number
}


let cal=function(quantity:number,price:number){
    
    return price * quantity;
};

console.log(cal(10,40000));