import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {

  name:any;
  id:any;
  constructor(private route:ActivatedRoute)
  {
    this.name=this.route.snapshot.queryParamMap.get('name');
    this.id=this.route.snapshot.queryParamMap.get('id');
  }

}
