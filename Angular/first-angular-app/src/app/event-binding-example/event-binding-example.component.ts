import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding-example',
  templateUrl: './event-binding-example.component.html',
  styleUrls: ['./event-binding-example.component.css']
})
export class EventBindingExampleComponent {

  clickCount:number=0;
  
  clickMe()
  {
    this.clickCount=this.clickCount + 1;
  }

  test(e:any)
  {
    alert(e.target.value +' is checked');
  }

  name:string="";
  getText(e:any)
  {
    //alert();
    console.log(e);
    this.name=e.target.value;
  }


  color:any="red";
  bgColor:any="blue";
}
