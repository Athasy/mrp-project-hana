package sap.cloud.mrp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OrderRecord {
	private String productName;
	private int amount;
	private Date date;
	
	public OrderRecord(String name, int am, String dat){
		this.productName = name;
		this.amount = am;
		
		DateFormat format = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
		try {
			this.date = format.parse(dat);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getName(){
		return productName;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public Date getDate(){
		return date;
	}
}
