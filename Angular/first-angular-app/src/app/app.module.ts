import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AComponent } from './a/a.component';
import { BComponent } from './b/b.component';
import { CComponent } from './c/c.component';
import { PropertyBindingExampleComponent } from './property-binding-example/property-binding-example.component';
import { EventBindingExampleComponent } from './event-binding-example/event-binding-example.component';
import { AttributeBindingExampleComponent } from './attribute-binding-example/attribute-binding-example.component';
import { TwoWayDataBindingExampleComponent } from './two-way-data-binding-example/two-way-data-binding-example.component';
import { FormsModule } from '@angular/forms';
import { DirectiveExampleComponent } from './directive-example/directive-example.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './parent/child/child.component';
import { PrimaryComponent } from './primary/primary.component';
import { SecondaryComponent } from './primary/secondary/secondary.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AComponent,
    BComponent,
    CComponent,
    PropertyBindingExampleComponent,
    EventBindingExampleComponent,
    AttributeBindingExampleComponent,
    TwoWayDataBindingExampleComponent,
    DirectiveExampleComponent,
    ParentComponent,
    ChildComponent,
    PrimaryComponent,
    SecondaryComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
