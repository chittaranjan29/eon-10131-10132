import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWayDataBindingExampleComponent } from './two-way-data-binding-example.component';

describe('TwoWayDataBindingExampleComponent', () => {
  let component: TwoWayDataBindingExampleComponent;
  let fixture: ComponentFixture<TwoWayDataBindingExampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TwoWayDataBindingExampleComponent]
    });
    fixture = TestBed.createComponent(TwoWayDataBindingExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
