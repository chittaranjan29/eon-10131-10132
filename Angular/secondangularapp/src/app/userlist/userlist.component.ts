import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  
   users: User[] = [];
   user:any;
  constructor(private service:UserService)
  {

  }
  ngOnInit(): void {   

    this.service.getUserList().subscribe(
      (response) => {          //next() callback 
        console.log(response)
        this.users=response.data;

      },

      (error)=>{               //error() callback
        console.log("Request failed with error");
        console.log(error)
      },

      ()=>{                    //camplete() callback  
        console.log("Request completed");
       // alert('request completed');
      }

    );


    this.service.getUser().subscribe(
      (response)=>{
        this.user=response;
        console.log(response);
      },
  

      (error)=>{               //error() callback
        console.log("Request failed with error");
        console.log(error)
      },

      ()=>{                    //camplete() callback  
        console.log("Request completed");
       // alert('request completed');
      }

    );



  }

}

export class User
{
 id:any;
 first_name:any;
 last_name:any;
 email:any;
 avatar:any;
}
