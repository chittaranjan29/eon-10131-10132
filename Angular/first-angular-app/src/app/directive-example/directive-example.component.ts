import { Component } from '@angular/core';

@Component({
  selector: 'app-directive-example',
  templateUrl: './directive-example.component.html',
  styleUrls: ['./directive-example.component.css']
})
export class DirectiveExampleComponent {

  students:any=[
    {
      'id':37733,
      'name':'Rohan'
    },
    {
      'id':55656,
      'name':'Shalini'
    },
    {
      'id':56565,
      'name':'Aman'
    }
  ];

  status:boolean=false;
  choice:number=5+10;
  num1:number=10
  num2:number=20

}
