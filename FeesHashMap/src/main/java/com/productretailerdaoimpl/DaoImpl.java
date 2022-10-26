package com.productretailerdaoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.productretailer.Product;
import com.productretailerdao.ProductDao;

public class DaoImpl implements ProductDao {

	List<Product> pList = new ArrayList<Product>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating student object

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub

		// creating student object
		Product pp = new Product();
		// input the details of student
		System.out.println("Enter the id :");
		pp.setId(sc.nextInt());
		System.out.println("Enter the Itemname :");
		pp.setItemName(sc.next());
		System.out.println("Enter the Brand :");
		pp.setBrand(sc.next());
		System.out.println("Enter the Quantity :");
		pp.setQuantity(sc.nextDouble());
		System.out.println("Enter the pricePerQuantity");
		pp.setPricePerQuantity(sc.nextDouble());

		// adding the student into the collection
		pList.add(pp);
		System.out.println(pList);
	}

	@Override
	public boolean deleteProduct(int id) {

		// TODO Auto-generated method stub
		boolean status = false;
		Product pdel = null;
		// finding the student
		for (Product s : pList) {
			if (s.getId() == id)
				pdel = s;
		}
		// check whether the record is present
		if (pdel == null)
			status = false;
		else {
			pList.remove(pdel);
			status = true;
		}

		return status;
	}

	@Override
	public void displayAllProduct() {
		// TODO Auto-generated method stub

		for (Product p : pList) {
			System.out.println(p);
		}

	}
}
