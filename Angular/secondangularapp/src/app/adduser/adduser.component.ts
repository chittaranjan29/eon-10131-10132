import { Component } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent {

  user=new User();

  constructor(private service:UserService)
  {

  }

  handleFormData(data:any)
  {
    
    this.user.name=data.value.name;
    this.user.job=data.value.job;
    
    console.log(this.user)
    this.service.addUser(this.user).subscribe(
      (response) =>{
        console.log(response)
      },
    (error)=>{
      console.log(error)
    }
    );
  }
}


class User{
  name:any;
  job:any
}
