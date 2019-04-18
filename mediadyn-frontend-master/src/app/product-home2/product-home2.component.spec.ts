import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductHome2Component } from './product-home2.component';

describe('ProductHome2Component', () => {
  let component: ProductHome2Component;
  let fixture: ComponentFixture<ProductHome2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductHome2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductHome2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
