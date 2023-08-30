//Abstraction: It is a machinism to hide the implementation details from the outside
//world.
//In typescript an interface can be implemented by three ways i)Using class ii)using Object iii)function interface
interface Product
{
    id:number;
    name:string;
    price:number;

    calculation(quantity:number):number
}

//way 1 - by object
let product1={
    id:35435,
    name:"Dell laptop",
    price:55000,
    calculate(quantity:number):number
    {
      return this.price * quantity;  
    }
};

console.log(product1.calculate(3));

//way 2 - by class
class Myproduct implements Product
{
    id: number;
    name: string;
    price: number;

    constructor(id,name,price)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    calculation(quantity: number): number {
      
        return this.price * quantity;
    }

}

let product2=new Myproduct(2622,"Lenovo laptop",45000);
console.log(product2.calculation(3));

