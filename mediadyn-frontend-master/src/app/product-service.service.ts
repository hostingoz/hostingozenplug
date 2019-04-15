import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  private url = "http://localhost:8080/api/getTriggeredProduct"
  constructor(private http:HttpClient) { 

  }


 
}
