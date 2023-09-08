import { Component } from '@angular/core';

@Component({
  selector: 'app-two-way-data-binding-example',
  templateUrl: './two-way-data-binding-example.component.html',
  styleUrls: ['./two-way-data-binding-example.component.css']
})
export class TwoWayDataBindingExampleComponent {


  name:string="";
  clear()
  {
    this.name="";
  }


  getData(e:any)
  {
    this.name=e.target.value;
  }

  v:string="";
  clearvalue()
  {
    this.v="";
  }

}
