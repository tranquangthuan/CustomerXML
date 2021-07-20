package com.training.springcore.repository;

import java.util.List;

import com.training.springcore.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();
}
