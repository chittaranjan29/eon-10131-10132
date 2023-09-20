import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  
  userListURL="https://reqres.in/api/users?page=2";
  userURL="https://reqres.in/api/users/2";
  constructor(private http:HttpClient) { }


  getUserList():Observable<any>
  {
    return this.http.get(this.userListURL);
  }

  getUser():Observable<any>
  {
    return this.http.get(this.userURL);
  }
}
