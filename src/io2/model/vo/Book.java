package io2.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4881499510888889752L;
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discount;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	
	public Book(String title, String author, int price, Calendar dates, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the dates
	 */
	public Calendar getDates() {
		return dates;
	}

	/**
	 * @param dates the dates to set
	 */
	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		SimpleDateFormat st = new SimpleDateFormat("yyyy년 MM월 dd일"); // st에 날짜포멧 형식을 담아준다.
		  String str = st.format(dates.getTime()); // 
		  
		return title +" "+  author + " " + price + " " + str + " 출간 " + discount ;
	}

	

	
	
	
	
	
	
	
}
