import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-singleuser',
  templateUrl: './singleuser.component.html',
  styleUrls: ['./singleuser.component.css']
})
export class SingleuserComponent implements OnInit {


  user:any;
  constructor(private service:UserService)
  {

  }
  ngOnInit(): void {
    this.service.getUser().subscribe(
      (response)=>{
        this.user=response.data;
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
