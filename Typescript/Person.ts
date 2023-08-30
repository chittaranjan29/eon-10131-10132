class Person
{
    private first_name:any;
    private last_name:any;
    private age:any;

    constructor()
    {

    }

    public getFirstName()
    {
        return this.first_name;
    }

    public getLastName()
    {
        return this.last_name;
    }

    public getAge()
    {
        return this.age;
    }

    public setFirstName(first_name:any)
    {
        this.first_name=first_name;
    }

    public setLastName(last_name:any)
    {
        this.last_name=last_name;
    }

    public setAge(age:any)
    {
        this.age=age;
    }
}

let person1=new Person();
person1.setFirstName("Robin");
person1.setLastName("Roy");
person1.setAge(23);

console.log(person1.getFirstName());
console.log(person1.getLastName());
console.log(person1.getAge());