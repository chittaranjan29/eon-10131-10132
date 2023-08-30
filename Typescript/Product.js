//way 1 - by object
var product1 = {
    id: 35435,
    name: "Dell laptop",
    price: 55000,
    calculate: function (quantity) {
        return this.price * quantity;
    }
};
console.log(product1.calculate(3));
//way 2 - by class
var Myproduct = /** @class */ (function () {
    function Myproduct(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    Myproduct.prototype.calculation = function (quantity) {
        return this.price * quantity;
    };
    return Myproduct;
}());
var product2 = new Myproduct(2622, "Lenovo laptop", 45000);
console.log(product2.calculation(3));
