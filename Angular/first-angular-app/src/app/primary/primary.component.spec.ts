import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimaryComponent } from './primary.component';

describe('PrimaryComponent', () => {
  let component: PrimaryComponent;
  let fixture: ComponentFixture<PrimaryComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PrimaryComponent]
    });
    fixture = TestBed.createComponent(PrimaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
