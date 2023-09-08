import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-secondary',
  templateUrl: './secondary.component.html',
  styleUrls: ['./secondary.component.css']
})
export class SecondaryComponent {
  @Input() count:any;

  @Output() countChanged:EventEmitter<number>=new EventEmitter();

  incrementCount()
  {
    this.count++;
    this.countChanged.emit(this.count);
  }

  decrementCount()
  {
    this.count--;
    this.countChanged.emit(this.count); 
  }
}
