package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;

import in.cjctech.wonderhomeapp.app.service.ApplicantService;
@CrossOrigin("*")
@RestController
public class ApplicantController 
{
	@Autowired
	ApplicantService as;
	

	@PostMapping("/saveApplicant")
	public ResponseEntity<CustomerApplicationForm> saveApplicant(@RequestPart("applicantdata") String  applicant,
																@RequestPart("slip") MultipartFile salaryslip,
																@RequestPart("propertyProof") MultipartFile propertyProof,
																@RequestPart("Gaadhar") MultipartFile Gaadhar,
																@RequestPart("Baadhar") MultipartFile Baadhar,
																@RequestPart("BPan") MultipartFile BPan,
																@RequestPart("pan") MultipartFile panCard,
																@RequestPart("aadharCard") MultipartFile aadhar,
																@RequestPart("addressProof") MultipartFile address,
																@RequestPart("cheque") MultipartFile cheque,
																@RequestPart("photo") MultipartFile photo,
																@RequestPart("sign") MultipartFile sign,
																@RequestPart("tax") MultipartFile tax,
																@RequestPart("statment") MultipartFile statment

																
															)	
	{	
		
		CustomerApplicationForm cf1=as.saveApplicant(applicant,salaryslip,Gaadhar,Baadhar,BPan,propertyProof,panCard,aadhar,address,cheque,photo,sign,tax,statment);
		return new ResponseEntity<CustomerApplicationForm>(HttpStatus.CREATED);
		
		
	}
	
	
		@GetMapping("/getApplicant")
		public ResponseEntity<List<CustomerApplicationForm>> getApplicant()
		{
				List<CustomerApplicationForm> list1=as.getalldata();
			return new ResponseEntity<List<CustomerApplicationForm>>(list1,HttpStatus.CREATED);
		}
		
		@DeleteMapping("/deleteApplicant/{applicationNumber}")
		public ResponseEntity<String> deleteApplicant(@PathVariable long applicationNumber)
		{	
			as.deleteData(applicationNumber);
			return  new ResponseEntity<String>("Delete",HttpStatus.OK);
		}
		
	@GetMapping("/editApplicant/{applicationNumber}")
	public ResponseEntity<CustomerApplicationForm> editApplicant(@PathVariable long applicationNumber)
	{
		CustomerApplicationForm caf=as.getfindData(applicationNumber);
		return new ResponseEntity<CustomerApplicationForm>(caf,HttpStatus.OK);
		
	}
	
		@GetMapping("/findbystatus/{status}")
		public ResponseEntity<List<CustomerApplicationForm>> findstatus(@PathVariable String status)
		{
			List<CustomerApplicationForm> cust=as.getuserStatus(status);
			return ResponseEntity.ok(cust);
		}
	
	}
