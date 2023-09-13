import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router, Routes } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  constructor(private route:Router)
  {
    
  }
  
  redirect()
  {
    alert();
    this.route.navigate(['/products/product-detail']);
  }
}
