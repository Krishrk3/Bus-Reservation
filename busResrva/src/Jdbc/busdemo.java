package Jdbc;
import java.sql.SQLException;
import java.util.*;

public class busdemo {

	public static void main(String[] args) throws SQLException {
		BusDAO busdao=new BusDAO();
		busdao.displayBusInfo();

		
		Scanner scanner=new Scanner(System.in);
		int userOpt=1;
		
		
		while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 Cancelation ");//to Exit
			userOpt=scanner.nextInt();
			if(userOpt==1) 
				System.out.println("Booking....");
				Booking booking=new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao=new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("booked Succesfully");
				}
				else
					System.out.println("Sorry , Bus is Full Try another Bus!! ");
					
		}
		do {
			System.out.println("Enter 1 to book and 2 ");//to Exit
			userOpt=scanner.nextInt();
			if(userOpt==1)
				System.out.println("Booking....");
		}while(userOpt==1);
	}

}
