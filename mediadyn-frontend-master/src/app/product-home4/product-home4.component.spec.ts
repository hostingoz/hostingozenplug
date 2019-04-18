import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductHome4Component } from './product-home4.component';

describe('ProductHome4Component', () => {
  let component: ProductHome4Component;
  let fixture: ComponentFixture<ProductHome4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductHome4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductHome4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
