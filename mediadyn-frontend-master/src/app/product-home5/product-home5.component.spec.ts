import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductHome5Component } from './product-home5.component';

describe('ProductHome5Component', () => {
  let component: ProductHome5Component;
  let fixture: ComponentFixture<ProductHome5Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductHome5Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductHome5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
