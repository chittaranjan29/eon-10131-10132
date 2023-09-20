import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {
  
  sampleForm:any;
  
  ngOnInit(): void {
    
    this.sampleForm=new FormGroup(
      {
        'name':new FormControl('',[Validators.required]),
        'email':new FormControl('',[Validators.required,Validators.email]),
        'age':new FormControl('',[Validators.required, Validators.pattern('^[0-9]+$')])
      }
    );

  }


  handleFormData()
  {
    console.log(this.sampleForm.value)
  }


}
