import { Component,OnInit } from '@angular/core';
import { AppService } from '../services/app.service';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {
  
  //constructor injection
  c:any;
  constructor(private appService:AppService)
  {
  }

  ngOnInit()
  {
    console.log(this.appService.addition(10,30));
    
    this.appService.count.subscribe(
      (res: any) =>{
      this.c=res;
     }
    );
  }

  increaseValue()
  {
    this.appService.nextCount();
  }

  

}
