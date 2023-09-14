import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { ServiceComponent } from './service/service.component';
import { MainContentComponent } from './main-content/main-content.component';
import { ErrorComponent } from './error/error.component';
import { EmployeeComponent } from './employee/employee.component';
import { StudentComponent } from './student/student.component';
import { ProductsComponent } from './products/products.component';
import { ProductDetailComponent } from './products/product-detail/product-detail.component';
import { authGuard } from './services/auth.guard';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {'path':'', component: MainContentComponent},
  {'path':'about', component: AboutUsComponent},
  {'path':'contact', component: ContactComponent},
  {'path':'service', component: ServiceComponent,canActivate:[authGuard]},
  {'path':'employee/:id/:deptid', component: EmployeeComponent},
  {'path':'student', component:StudentComponent},
  {'path':'login', component:LoginComponent},
  {'path':'product-detail', component:ProductDetailComponent},
  {'path':'products', component:ProductsComponent,
    children:[
      {'path':'product-detail',redirectTo:'/product-detail'}
    ]

  },
  {'path':'**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
