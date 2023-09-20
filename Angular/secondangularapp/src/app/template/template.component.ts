import { Component } from '@angular/core';
import { NgForm} from '@angular/forms';
@Component({
  selector: 'app-template',
  templateUrl: './template.component.html',
  styleUrls: ['./template.component.css']
})
export class TemplateComponent {

 handleFormData(data:NgForm)
 {
  console.log(data.value);
 }

 save(form:any)
 {
  console.log(form.value);
 }
}
