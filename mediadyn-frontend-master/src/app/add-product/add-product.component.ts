import { Component, OnInit } from '@angular/core';
import { Image } from './image';
import { HttpClient } from '@angular/common/http';
import { MaterialModule } from '../material.module';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  image : Image ={name :"",img : "", duration :""}
  base64textString : string;
  constructor(private http: HttpClient) { }
  prodcuctName : string ='';
  imgURL;
  imagePath;

  ngOnInit() {
  }
  selectedFile: File

  onFileChanged(event) {
    this.selectedFile = event.target.files[0];
    console.log("file is", this.selectedFile)
    // this.handleFileSelect(event);
   console.log(this.image.name); 
  }


  onUpload() {
    //Sending Multi part file
    let formdata = new FormData();
  
  formdata.append("file", this.selectedFile);
  formdata.append("productName", this.image.name);
  formdata.append("duration", this.image.duration);
    this.http.post('http://localhost:8080/api/uploadFile',formdata).subscribe(res=>{
      console.log(res);
      },
      err=>{
        console.log(err);
      });



    // Previous code for base 64
    // this.image.img = this.base64textString;
    // this.http.post('http://localhost:8080/api/trigger/addProduct',this.image).subscribe(res=>{
    //   console.log(res);
    // },
    // err=>{
    //   console.log(err);
    // })
    // upload code goes he
  }

  handleFileSelect(evt){
    let files = evt.target.files;
    let file = files[0];
    
  if (files && file) {
      let reader = new FileReader();

      reader.onload =this._handleReaderLoaded.bind(this);

      // This code shows image previw but gives error after and image do not gets saved
      // this.imagePath = files;
      // reader.readAsDataURL(files[0]); 
      // reader.onload = (evt) => { 
      //   this.imgURL = reader.result; 
      // }
      reader.readAsBinaryString(file);
  }
}



_handleReaderLoaded(readerEvt) {
  console.log(readerEvt.target.result);
   var binaryString = readerEvt.target.result;
          this.base64textString= btoa(binaryString);
          // console.log('Image is',this.base64textString);
          // console.log(btoa(binaryString));
  }


}
