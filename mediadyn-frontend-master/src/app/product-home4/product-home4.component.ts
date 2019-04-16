import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-product-home4',
  templateUrl: './product-home4.component.html',
  styleUrls: ['./product-home4.component.css']
})
export class ProductHome4Component implements OnInit {
  title = 'reebok';

  product: string = 'default';
  tempProduct: string;
  base64Data;
  converted_image;
  display = true;
  triggerShown = true;
  triggerCount = 0;
  isVideo: boolean=false;
  isImage :boolean =false;

  videoSrc = [];
  imgSrc= [];
  @ViewChild('videoPlayer') public videoPlayer: ElementRef;

   bSubject = new BehaviorSubject({}); 

   interval = 2000;
  constructor(private http: HttpClient, private elRef: ElementRef) {

    

    this.get()
    
    // this.bSubject.subscribe(res =>{
    //   this.videoSrc = [];
    //   this.videoSrc.push(res);
    // })
    
    
    // setTimeout(()=>{
    //   clearInterval(myInter)
    // },this.interval)

 

    // this.product = 'default';
   

  }

  ngOnInit() {
    if ('serviceWorker' in navigator) {
      navigator.serviceWorker
      .register('ngsw-worker.js');
    }
  }

  get() {

    let that = this;
      this.http.get('https://theenplugapp.com/api/getTriggeredProduct/q4').subscribe(res => {
      console.log('res', res);
      this.display = false;
      let result = res as any;
          //let searchParams = new URLSearchParams(window.location.search);
          let searchParams =  window.location.href
          console.log('searchParams:: '+searchParams);
          
          if(res == null){
             let newurl = window.location.protocol + "//" + window.location.host + window.location.pathname;
             window.history.pushState({path:newurl},'',newurl);
          }

      if(!result || result.name == null){
        this.isVideo=false;
        this.isImage=false;
        this.interval = 130;

        this.display = true;
      } else {
        console.log(result.fileType);
        if(result.productName != null || result.productName != ''){
          let newurl = window.location.protocol + "//" + window.location.host + window.location.pathname + '?'+result.productName;
          window.history.pushState({path:newurl},'',newurl);
        }
        if(result.fileType === "video"){
          
          this.isVideo = true;
          this.interval = result.duration;
          this.isImage=false;
        }
        else{
          this.isVideo=false;
          this.isImage=true;
          this.interval = result.duration;
        }
        this.converted_image = "https://theenplugapp.com/api/downloadFile/" + result.name;
        if(this.isVideo){
          // this = chosenCamera;
          // this.videoPlayer.nativeElement.play();
          this.videoSrc = [];
          this.videoSrc.push(this.converted_image);
          // this.videoPlayer.nativeElement.load();
        } 
        
        else{
          this.imgSrc = [];
          this.imgSrc.push(this.converted_image);
        }
      }
      console.log("interval : ", this.interval)
      setTimeout(()=>{
        this.get()
      }, this.interval)
  
      // this.base64Data = result.data;
      // this.converted_image= "data:"+result.name + "/png;base64,"+this.base64Data;

     
      // this.bSubject.next(converted_image)
      // console.log(this.converted_image);
      // this.bSubject.next(this.converted_image);
      // console.log(result);

      // console.log("this.product = ", this.product)
      // console.log("this.tempProduct = ", this.tempProduct)
      // console.log("this.triggerShown = ", this.triggerCount)
      // this.triggerCount = result.triggerCount;
      // if (result.name != this.product && result.name != this.tempProduct) {
      //   this.product = result.name;
      //   this.tempProduct = result.name;
      //   this.http.get('https://theenplugapp.com/api/triggerProducts/' + result.name).subscribe(res => {
      //     console.log("Updated");
      //   })
       
      //   console.log("in one");
      // }
      // else if (result.triggerCount != this.triggerCount) {
      //   this.display = false;
      //   this.triggerShown =false;
      //   console.log("in two");
      // }
      // else {
      //   // this.product = 'default';
      //   this.display = true;

      // }

    
      

      // this.http.get('https://theenplugapp.com/api/triggerProducts/'+result.name).subscribe(res=>{
      //   console.log("Updated");
      // })

      this.interval = 120

    })
    
    
  }


}
