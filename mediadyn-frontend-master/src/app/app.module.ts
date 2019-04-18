import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient,HttpParams } from '@angular/common/http';
import { AddProductComponent } from './add-product/add-product.component';
import { MaterialModule } from './material.module';
import { Routes } from '@angular/router';
import { ProductHomeComponent } from './product-home/product-home.component';
import { ProductNewComponent } from './product-new/product-new.component';
import { ProductHome2Component } from './product-home2/product-home2.component';
import { ProductHome3Component } from './product-home3/product-home3.component';
import { ProductHome4Component } from './product-home4/product-home4.component';
import { ProductHome5Component } from './product-home5/product-home5.component';
import { ServiceWorkerModule } from '@angular/service-worker';
import { environment } from '../environments/environment';

const routes: Routes = [
  { path: 'addProduct', component: AddProductComponent }
];


@NgModule({
  declarations: [
    AppComponent,
    AddProductComponent,
    ProductHomeComponent,
    ProductNewComponent,
    ProductHome2Component,
    ProductHome3Component,
    ProductHome4Component,
    ProductHome5Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ServiceWorkerModule.register('ngsw-worker.js', { enabled: environment.production })
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
