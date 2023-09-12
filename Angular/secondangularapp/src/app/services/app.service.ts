import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AppService {

  counter:number=1;
  count:any;

  constructor()
  {
    this.count=new BehaviorSubject(this.counter);
  }

  nextCount()
  {
    this.counter++;
    this.count.next(this.counter);
  }



   addition(a:number, b:number)
   {
    return a+b;
   }
   
}
