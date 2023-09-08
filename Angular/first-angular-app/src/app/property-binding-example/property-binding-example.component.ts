import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding-example',
  templateUrl: './property-binding-example.component.html',
  styleUrls: ['./property-binding-example.component.css']
})
export class PropertyBindingExampleComponent {

  status:boolean=false;
  heading:any="Property binding example";
  html:any="<strong>This is s demo text</strong>";
  bgcolor:string="red";
  color:string="yellow";
}
