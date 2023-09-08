import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-binding-example',
  templateUrl: './attribute-binding-example.component.html',
  styleUrls: ['./attribute-binding-example.component.css']
})
export class AttributeBindingExampleComponent {

  pageHeader:string="Strudent Details";
  firstName:string="Demo";
  lastName:string="Demo";
  branch:string="CSE";
  mobile:number=93737383993;
  gender:string="Male";
  age:number=22;

  columnSpan:number=2;
}
