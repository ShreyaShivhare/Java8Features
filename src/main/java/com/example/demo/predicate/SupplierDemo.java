package com.example.demo.predicate;

import java.util.Date;
import java.util.function.Supplier;

//have nothing like chaining as no input given to this.
public class SupplierDemo {

	public static void main(String[] args) {
		SupplierDemo supplierDemo = new SupplierDemo();
		System.out.println(supplierDemo.fetchCurrentdate());
		
		Supplier<Date> currentdate = () -> new Date();
		System.out.println(currentdate.get());

	}

	public Date fetchCurrentdate() {
		
		return new Date();
	}

}
