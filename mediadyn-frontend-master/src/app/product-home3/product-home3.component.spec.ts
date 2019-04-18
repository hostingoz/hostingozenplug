import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductHome3Component } from './product-home3.component';

describe('ProductHome3Component', () => {
  let component: ProductHome3Component;
  let fixture: ComponentFixture<ProductHome3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductHome3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductHome3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
