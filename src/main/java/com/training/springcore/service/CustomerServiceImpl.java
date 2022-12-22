package com.training.springcore.service;

import java.util.List;

import com.training.springcore.model.Customer;
import com.training.springcore.repository.CustomerRepository;
import com.training.springcore.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
		super();
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("CustomerServiceImpl DI By constructor 1 arg");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("CustomerServiceImpl DI By Setter");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	// @Override
	public List<Customer> findAllByNewInstance() {
		return new CustomerRepositoryImpl().findAll();
	}

}
