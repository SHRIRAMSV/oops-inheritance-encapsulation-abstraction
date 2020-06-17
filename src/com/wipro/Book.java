package com.wipro;

import java.util.Scanner;

public class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the author");
		String name = sc.next();
		System.out.println("Enter the email of the author");
		String email = sc.next();
		System.out.println("Enter the gender of the author");
		char gender = sc.next().charAt(0);
		Author author = new Author (name, email, gender);
		
		System.out.println("Enter the book name");
		String bookName = sc.next();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity");
		int qtyInStock = sc.nextInt();
		Book book =  new Book (bookName, author,price, qtyInStock);
		System.out.println(book);
		
	}
}
