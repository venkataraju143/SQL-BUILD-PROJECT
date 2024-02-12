package com.warproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warproject.entity.Addresss;
import com.warproject.service.AddressService;



@RestController
@RequestMapping("/api/adrs")
public class AddressController {
	
	@Autowired
	 AddressService addressService;
	
	@PostMapping("/saveaddress")
	public ResponseEntity<?>saveAddress(@RequestBody Addresss address){
		return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddress")
	public List<Addresss> getAllAddress(){
		return addressService.getAllAddress();
		
}
//	@GetMapping("/getAddressById/{id}")
//	public ResponseEntity<?>getAddressById(@PathVariable long id){
//		return new ResponseEntity<>(addressService.getAddressById(id),HttpStatus.OK);
//		
//	}
//	
//	@PatchMapping("/updateaddressDetails/{id}")
//	public ResponseEntity<?> updateAddressDetails(@RequestBody Address address,@PathVariable Long id){
//		return new ResponseEntity<>(addressService.updateAddressDetails(address, id), HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<?> deleteAddress(@PathVariable("id") long id){
//		return new ResponseEntity<>("Address deleted successfully", HttpStatus.OK);
//		
//	}
	
	

}
