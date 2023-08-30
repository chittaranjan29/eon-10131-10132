"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    /*
    constructor()  //default constructor
    {
        //console.log('Default constructor inviked!')
    }
    */
    function Employee(id, name, designation, salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    Employee.prototype.display = function () {
        console.log(this.id + " " + this.name + " " + this.designation + " " + this.salary);
    };
    return Employee;
}());
exports.Employee = Employee;
//let emp1=new Employee();
//emp1.id=24324;
//emp1.name="raman";
//emp1.designation="Sr. manager";
//emp1.salary=60000;
//emp1.display();
//let emp1=new Employee(1234,"Kumar","Developer");
//emp1.display();
