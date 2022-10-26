package com.productretailercomparitorlamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.productretailer.Product;

public class ComparitorLamda {

	public static void main(String[] args) {

		List<Product> lop = new ArrayList<>();
		lop.add(new Product(101, "Biscuit", "Britania", 20, 30));
		lop.add(new Product(102, "Biscuit", "Horlics", 40, 35));
		lop.add(new Product(103, "Biscuit", "Amul", 30, 28));
		lop.add(new Product(104, "Biscuit", "Sunfest", 40, 20));

		System.out.println("-------using AIC---------");

		Comparator<Product> com = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPricePerQuantity().compareTo(p2.getPricePerQuantity());
			}

		};

		Collections.sort(lop);

		for (Product p : lop) {
			System.out.println(p);
		}

		System.out.println("-------using Lambda---------");

		List<Product> lop1 = new ArrayList<>();
		lop1.add(new Product(101, "Biscuit", "Britania", 20, 30));
		lop1.add(new Product(102, "Biscuit", "Horlics", 40, 35));
		lop1.add(new Product(103, "Biscuit", "Amul", 30, 28));
		lop1.add(new Product(104, "Biscuit", "Sunfest", 40, 20));

		Collections.sort(lop1, (Product p1, Product p2) -> {

			return p1.getName().compareTo(p2.getName());


		lop1.forEach((Product) -> System.out.println(Product));

	}
}
}
