package com.HotelReservationSystem;


public class HotelReservation {
	
	public static void main( String[] args )
    {
    	
    	HotelReservationSystem hotelReservationSystem=new HotelReservationSystem();
    	System.out.println("Hotel Reservation System");
    	hotelReservationSystem.addHotel("Lakewood", 110);
    	hotelReservationSystem.addHotel("Brigwood", 160);
    	hotelReservationSystem.addHotel("Ridgewood", 220);
    	
    	//Writing For each method for avoiding Sop
    	
    	for(Hotel List: hotelReservationSystem.hotelList
    			) {
    		System.out.println(List);
    	}
    }
}
