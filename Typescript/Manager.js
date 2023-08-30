"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Employee_1 = require("./Employee");
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(id, name, designation, salary, department) {
        var _this = _super.call(this, id, name, designation, salary) || this;
        _this.department = department;
        return _this;
        //this.salary=salary;
    }
    Manager.prototype.display = function () {
        _super.prototype.display.call(this);
        console.log(this.department);
    };
    return Manager;
}(Employee_1.Employee));
var manager1 = new Manager(5363, "Mr. Arun", "Asst. Manager", 90000, "Finance");
manager1.display();
