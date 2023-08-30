export class Employee
{
    id:number;
    name:string;
    designation:string;
    salary?:number;  //optional property
    readonly password:string;

    /*
    constructor()  //default constructor
    {
        //console.log('Default constructor inviked!')
    }
    */

    constructor(id,name,designation, salary?) //Parameterized constructor
    {
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        //this.display()
    }

    display()
    {
        console.log(this.id + " "+this.name + " "+this.designation+" "+this.salary)
    }
}

//let emp1=new Employee();
//emp1.id=24324;
//emp1.name="raman";
//emp1.designation="Sr. manager";
//emp1.salary=60000;

//emp1.display();

//let emp1=new Employee(1234,"Kumar","Developer");
//emp1.display();


