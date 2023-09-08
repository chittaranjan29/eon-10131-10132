import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeBindingExampleComponent } from './attribute-binding-example.component';

describe('AttributeBindingExampleComponent', () => {
  let component: AttributeBindingExampleComponent;
  let fixture: ComponentFixture<AttributeBindingExampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AttributeBindingExampleComponent]
    });
    fixture = TestBed.createComponent(AttributeBindingExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
