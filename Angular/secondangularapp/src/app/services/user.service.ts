import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  
  userListURL="https://reqres.in/api/users?page=2";
  userURL="https://reqres.in/api/users/2";
  addUserURL="https://reqres.in/api/users";
  updateUserURL="https://reqres.in/api/users/2";

  constructor(private http:HttpClient) { }


  getUserList():Observable<any>
  {
    return this.http.get(this.userListURL);
  }

  getUser():Observable<any>
  {
    return this.http.get(this.userURL);
  }


  addUser(userObj:any):Observable<any>
  {
    console.log(userObj)
    const headers={'content-type':'application/json'};
    const body=JSON.stringify(userObj);
    return this.http.post(this.addUserURL,body,{'headers':headers});
  }

  updateUser(userObj:any):Observable<any>
  {
    const headers={'content-type':'application/json'};
    const body=JSON.stringify(userObj);
    //return this.http.put(this.updateUserURL,body,{'headers':headers});
    return this.http.patch(this.updateUserURL,body,{'headers':headers});
  }


}
