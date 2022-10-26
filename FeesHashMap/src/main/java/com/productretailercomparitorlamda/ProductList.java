package com.productretailercomparitorlamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.productretailer.Product;

public class ProductList {

	public static void main(String[] args) {

		List<Product> lop = new ArrayList<>();
		lop.add(new Product(101, "Biscuit", "Britania", 20, 30));
		lop.add(new Product(102, "Biscuit", "Horlics", 40, 35));
		lop.add(new Product(103, "Biscuit", "Amul", 30, 28));
		lop.add(new Product(104, "Biscuit", "Sunfest", 40, 20));

		System.out.println("-------Price sort-----------");
		Collections.sort(lop, new pricePerQuantityComparator());

		for (Product p : lop) {
			System.out.println(p);
		}

		System.out.println("-------Quantity sort-----------");
		Collections.sort(lop, new QuantityComparator());

		for (Product p : lop) {
			System.out.println(p);

		}
	}
}
