import { Component, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';
import { UserService } from '../services/user.service';
import { User } from '../models/user';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit, OnDestroy, OnChanges {
  user=new User();

  constructor(private service:UserService)
  {

  }
  ngOnChanges(changes: SimpleChanges): void {
    console.log('onChanges invoked')
  }
  ngOnDestroy(): void {
   console.log('onDestroy invoked')
  }
  ngOnInit(): void {
    console.log('onInit invoked')
  }



  handleFormData(data:any)
  {
    
    this.user.name=data.value.name;
    this.user.job=data.value.job;
    
    console.log(this.user)
    this.service.updateUser(this.user).subscribe(
      (response) =>{
        console.log(response)
      },
    (error)=>{
      console.log(error)
    }
    );
  }
}



