import { Component } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent {
  user=new User();

  constructor(private service:UserService)
  {

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


class User{
  name:any;
  job:any
}
