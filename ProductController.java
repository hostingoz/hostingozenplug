package com.thinkitive.reebokshop.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.thinkitive.reebokshop.dto.ProductDTO;
import com.thinkitive.reebokshop.model.Product;
import com.thinkitive.reebokshop.model.TriggeredProduct;
import com.thinkitive.reebokshop.repo.ProductRepo;
import com.thinkitive.reebokshop.repo.TriggeredProductRepo;
import com.thinkitive.reebokshop.service.FileStorageService;
import com.thinkitive.reebokshop.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

	private static String UPLOADED_FOLDER = "/var/www/html/assets/";
	
	Queue<TriggeredProduct> triggerQ1 = new LinkedList<>(); 

	Queue<TriggeredProduct> triggerQ2 = new LinkedList<>(); 

	Queue<TriggeredProduct> triggerQ3 = new LinkedList<>(); 
	
	Queue<TriggeredProduct> triggerQ4 = new LinkedList<>(); 
	
	Queue<TriggeredProduct> triggerQ5 = new LinkedList<>(); 

	@Autowired
	ProductService productService;

	@Autowired
	TriggeredProductRepo triggeredProductRepo;

	@Autowired
	ProductRepo productRepo;

	@Autowired
	FileStorageService fileStorageService;

	@PostMapping("/trigger/addProduct")
	public ResponseEntity<?> retriveImage(@RequestBody ProductDTO productDTO) {
		try {
//			System.out.println("Product received is "+ productDTO);
			this.productService.addProduct(productDTO);
			return ResponseEntity.status(HttpStatus.OK).body(productDTO);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

		}
	}

	@GetMapping("/getTriggeredProduct/q1")
	public ResponseEntity<?> getTriggeredProduct1() {
		try {
			
			
			TriggeredProduct triggeredProduct = triggerQ1.poll();
//			TriggeredProduct triggeredProduct = this.triggeredProductRepo.findById(1);
//			System.out.println(triggeredProduct);
			JSONObject triggerTemp = new JSONObject();
			triggerTemp.put("path", triggeredProduct.getPath());
			triggerTemp.put("name", triggeredProduct.getName());
			triggerTemp.put("triggered", triggeredProduct.isTriggered());
			triggerTemp.put("duration", triggeredProduct.getDuration());
			triggerTemp.put("fileType",triggeredProduct.getFileType());
			triggerTemp.put("productName",triggeredProduct.getProductName());
		
			System.out.println("Response triggred Product to be sent" +triggerTemp);
			return ResponseEntity.ok().body(triggerTemp.toString());

		} catch (Exception e) {
			System.out.println("Exception in getting triggreProduct" + e);
			return null;
		}
	}
	
	
	@GetMapping("/getTriggeredProduct/q2")
	public ResponseEntity<?> getTriggeredProduct2() {
		try {
			
			
			TriggeredProduct triggeredProduct = triggerQ2.poll();
			
			System.out.println("Triggerd Product Received form queue is" + triggeredProduct);
			JSONObject triggerTemp = new JSONObject();
			triggerTemp.put("path", triggeredProduct.getPath());
			triggerTemp.put("name", triggeredProduct.getName());
			triggerTemp.put("triggered", triggeredProduct.isTriggered());
			triggerTemp.put("duration", triggeredProduct.getDuration());
			triggerTemp.put("fileType",triggeredProduct.getFileType());
		
			System.out.println("Response triggred Product to be sent" +triggerTemp);
			return ResponseEntity.ok().body(triggerTemp.toString());

		} catch (Exception e) {
			System.out.println("Exception in getting triggreProduct" + e);
			return null;
		}
	}
	
	
	@GetMapping("/getTriggeredProduct/q3")
	public ResponseEntity<?> getTriggeredProduct3() {
		try {
			
			
			TriggeredProduct triggeredProduct = triggerQ3.poll();
			System.out.println("Triggerd Product Received form queue is" + triggeredProduct);
			JSONObject triggerTemp = new JSONObject();
			triggerTemp.put("path", triggeredProduct.getPath());
			triggerTemp.put("name", triggeredProduct.getName());
			triggerTemp.put("triggered", triggeredProduct.isTriggered());
			triggerTemp.put("duration", triggeredProduct.getDuration());
			triggerTemp.put("fileType",triggeredProduct.getFileType());
		
			System.out.println("Response triggred Product to be sent" +triggerTemp);
			return ResponseEntity.ok().body(triggerTemp.toString());
		} catch (Exception e) {
			System.out.println("Exception in getting triggreProduct" + e);
			return null;
		}
	}
	
	@GetMapping("/getTriggeredProduct/q4")
	public ResponseEntity<?> getTriggeredProduct4() {
		try {
			
			
			TriggeredProduct triggeredProduct = triggerQ4.poll();
			System.out.println("Triggerd Product Received form queue is" + triggeredProduct);
			JSONObject triggerTemp = new JSONObject();
			triggerTemp.put("path", triggeredProduct.getPath());
			triggerTemp.put("name", triggeredProduct.getName());
			triggerTemp.put("triggered", triggeredProduct.isTriggered());
			triggerTemp.put("duration", triggeredProduct.getDuration());
			triggerTemp.put("fileType",triggeredProduct.getFileType());
		
			System.out.println("Response triggred Product to be sent" +triggerTemp);
			return ResponseEntity.ok().body(triggerTemp.toString());
		} catch (Exception e) {
			System.out.println("Exception in getting triggreProduct" + e);
			return null;
		}
	}
	
	@GetMapping("/getTriggeredProduct/q5")
	public ResponseEntity<?> getTriggeredProduct5() {
		try {
			
			
			TriggeredProduct triggeredProduct = triggerQ5.poll();
			System.out.println("Triggerd Product Received form queue is" + triggeredProduct);
			JSONObject triggerTemp = new JSONObject();
			triggerTemp.put("path", triggeredProduct.getPath());
			triggerTemp.put("name", triggeredProduct.getName());
			triggerTemp.put("triggered", triggeredProduct.isTriggered());
			triggerTemp.put("duration", triggeredProduct.getDuration());
			triggerTemp.put("fileType",triggeredProduct.getFileType());
		
			System.out.println("Response triggred Product to be sent" +triggerTemp);
			return ResponseEntity.ok().body(triggerTemp.toString());
		} catch (Exception e) {
			System.out.println("Exception in getting triggreProduct" + e);
			return null;
		}
	}
	
	
	

	
	@GetMapping("triggerProduct/{productName}")
	public ResponseEntity<?> changeProduct(@PathVariable("productName") String name) {
		try {
			Product product = this.productRepo.findByProductName(name);
			System.out.println("Prodcut matched" + product);

			
			

			TriggeredProduct triggeredProduct = new TriggeredProduct();
			triggeredProduct.setId(1);
			triggeredProduct.setName(product.getName());
			triggeredProduct.setPath(product.getPath());
			triggeredProduct.setProductName(product.getProductName());
			triggeredProduct.setTriggered(true);
			triggeredProduct.setDuration(product.getDuration());
			triggeredProduct.setFileType(product.getFileType());
			this.triggeredProductRepo.save(triggeredProduct);
			
			if(name.equals("p1")|| name.equals("p2") || name.equals("p3")) {
				triggerQ1.add(triggeredProduct);
				System.out.println("Added in q1");
			}
			else
			if(name.equals("p4")|| name.equals("p5") || name.equals("p6")) {
				triggerQ2.add(triggeredProduct);
				System.out.println("Added in q2");
			}
			else
			if(name.equals("p7")|| name.equals("p8") || name.equals("p9")) {
				triggerQ3.add(triggeredProduct);
				System.out.println("Added in q3");
			}
			else
			if(name.equals("p10")|| name.equals("p11") || name.equals("p12")) {
				triggerQ4.add(triggeredProduct);
				System.out.println("Added in q4");
			}
			else
				if(name.equals("p13")|| name.equals("p14") || name.equals("p15")) {
					triggerQ5.add(triggeredProduct);
					System.out.println("Added in q5");
				}
			else {
				System.out.println("product out of range");
			}
			System.out.println("Product to be added in queue" + triggeredProduct);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} catch (Exception e) {
			System.out.println("Exception in adding triggeredProduct " + e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

		}

	}

	@GetMapping("triggerProducts/{productName}")
	public void revertTrigger(@PathVariable("productName") String name) {
		try {
			TriggeredProduct triggeredProduct = this.triggeredProductRepo.findByName(name);
			triggeredProduct.setTriggered(false);
			this.triggeredProductRepo.save(triggeredProduct);
		} catch (Exception e) {
			System.out.println("Unable to change status exception is " + e);
		}
	}

	@CrossOrigin()
	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("productName") String productName, @RequestParam("duration") String duration) {
		String fileName = this.fileStorageService.storeFile(file);
		String filetype =  file.getContentType();
		System.out.println("Is "+ filetype);
		long durationTime = Long.parseLong(duration);
		ProductDTO productDTO = new ProductDTO();
		Product p = new Product();
		p.setName(file.getOriginalFilename());
		p.setPath(UPLOADED_FOLDER + file.getOriginalFilename());
		p.setProductName(productName);
		p.setDuration(durationTime);
		
		if(filetype.equals("video/mp4")) {
		p.setFileType("video");
		}
		else {
		p.setFileType("image");
		}
		this.productRepo.save(p);

		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
				.path(fileName).toUriString();

		return new String("File successfully uploaded");
	}

	@GetMapping("/downloadFile/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		// Load file as Resource
		System.out.println("************");
		Resource resource = fileStorageService.loadFileAsResource(fileName);

		// Try to determine file's content type
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			System.out.println("Could not determine file type.");
		}

		// Fallback to the default content type if type could not be determined
		if (contentType == null) {
			contentType = "application/octet-stream";
		}
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

	



}
