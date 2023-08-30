import { Employee } from "./Employee";

class Manager extends Employee
{
    department:string;

    constructor(id,name,designation,salary,department)
    {
       super(id,name,designation,salary); 
       this.department=department;
       //this.salary=salary;
    }

    display(): void {
        super.display();
        console.log(this.department);
    }
}

var manager1=new Manager(5363,"Mr. Arun","Asst. Manager",90000,"Finance");
manager1.display();