import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  private url = "https://theenplugapp.com/api/getTriggeredProduct"
  constructor(private http:HttpClient) { 

  }


 
}
