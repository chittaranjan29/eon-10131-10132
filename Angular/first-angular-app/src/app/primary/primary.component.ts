import { Component } from '@angular/core';

@Component({
  selector: 'app-primary',
  templateUrl: './primary.component.html',
  styleUrls: ['./primary.component.css']
})
export class PrimaryComponent {
 counter:any=5;

 countChangedHandler(count:number)
 {
  this.counter=count;
  console.log(this.counter)
 }
}
