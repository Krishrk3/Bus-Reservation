package Jdbc;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter passanger Name ; ");
		passengerName=scanner.next();
		
		System.out.println("Enter Bus No ; ");
		busNo=scanner.nextInt();
		
		System.out.println("Enter Date (DD-MM-YYYY) ; ");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MM-YYYY");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public boolean isAvailable()throws SQLException{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao =new BookingDAO();
		int capacity=busdao.getCapacity(busNo);;

		int booked=bookingdao.getBookedCount(busNo,date);
		return booked<capacity;
	}

}
