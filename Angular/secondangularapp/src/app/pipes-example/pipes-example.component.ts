import { Component } from '@angular/core';

@Component({
  selector: 'app-pipes-example',
  templateUrl: './pipes-example.component.html',
  styleUrls: ['./pipes-example.component.css']
})
export class PipesExampleComponent {

  dateObj:Date=new Date();
  title:string="Welcome to Angular 16";
  num:number=9542.12554;
  per:number=.7414;
  cur:number=123; 
}
