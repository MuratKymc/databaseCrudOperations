package com.muratk.databaseOp;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private final CustomerRepository customerRepository;
	
	public CustomerController(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}
	
	@GetMapping
	List<Customer> customers(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	Customer byId(@PathVariable Long id) {

		return customerRepository.findById(id).orElse(null);
	}
	
	@PostMapping
	Customer save(@RequestBody Customer customer){
		return customerRepository.save(customer);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable Long id){
		customerRepository.deleteById(id);
	}
	
	@GetMapping("/search")
	List<Customer> searchByAge(@RequestParam int age){
		return customerRepository.findByAge(age);
	}
}
