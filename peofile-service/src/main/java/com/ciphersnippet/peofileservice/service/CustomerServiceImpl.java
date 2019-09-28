package com.ciphersnippet.peofileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciphersnippet.peofileservice.repository.CustomerRepository;
import com.ciphersnippet.rentcloud.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

}
