import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'demo'
})
export class DemoPipe implements PipeTransform {

  transform(value: number, multiply: string): number { 
    let mul = parseFloat(multiply); 
    return mul * value 
 }
}
