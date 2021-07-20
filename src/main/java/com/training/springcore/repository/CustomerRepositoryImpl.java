package com.training.springcore.repository;

import java.util.Arrays;
import java.util.List;

import com.training.springcore.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = Arrays.asList(new Customer(1, "A"), new Customer(2, "B"));
		return customers;
	}

}
