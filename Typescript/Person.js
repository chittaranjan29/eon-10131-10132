var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.getFirstName = function () {
        return this.first_name;
    };
    Person.prototype.getLastName = function () {
        return this.last_name;
    };
    Person.prototype.getAge = function () {
        return this.age;
    };
    Person.prototype.setFirstName = function (first_name) {
        this.first_name = first_name;
    };
    Person.prototype.setLastName = function (last_name) {
        this.last_name = last_name;
    };
    Person.prototype.setAge = function (age) {
        this.age = age;
    };
    return Person;
}());
var person1 = new Person();
person1.setFirstName("Robin");
person1.setLastName("Roy");
person1.setAge(23);
console.log(person1.getFirstName());
console.log(person1.getLastName());
console.log(person1.getAge());
