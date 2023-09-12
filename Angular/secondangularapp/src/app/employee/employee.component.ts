import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  id:any;
  deptId:any;
  constructor(private route:ActivatedRoute)
  {
    //this.id=this.route.snapshot.params['id'];
    this.id=this.route.snapshot.paramMap.get('id');
    this.deptId=this.route.snapshot.paramMap.get('deptid');
  }
}
