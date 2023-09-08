import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first-angular-app';
  courseName="Java Full Stack Development";
  mycolor="red";
  user:any={
    'name':'Chittaranjan',
    'city':'Durgapur',
    'email':'chittaranjanghosh7@gmail.com'
  };

  userList:any=[
    {
      'name':'Demo1',
      'city':'Demo1',
      'email':'Demo1@gmail.com'
    },
    {
      'name':'Demo2',
      'city':'Demo2',
      'email':'Demo2@gmail.com'
    },
    {
      'name':'Demo3',
      'city':'Demo3',
      'email':'Demo3@gmail.com'
    }
  ];
  
  test():string
  {
    return "Welcome to Data Binding";
  }

  addition(a:number, b:number):number
  {
    return a+b;
  }


}
