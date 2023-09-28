import { Component } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-deleteuser',
  templateUrl: './deleteuser.component.html',
  styleUrls: ['./deleteuser.component.css']
})
export class DeleteuserComponent {
  id:any;
  
  constructor(private service:UserService)
  {

  }

  handleFormData(data:any)
  {
    this.id=data.value.id;
    sessionStorage.setItem('id',this.id);
    localStorage.setItem('id',this.id);
    
    this.service.deleteUser(this.id).subscribe(
      (response)=>{
        console.log(response);
         alert('user deleted!')
      },

      (error)=>{
        alert('something went wrong!')
      }
    );
  }
}
