//Writing Test case for Hotel reservation System

package com.HotelReservationSystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	
	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue()
	{ 
		 
		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 110);
		Hotel hotelLakewood=new Hotel("Lakewood", 110);
		Assert.assertEquals(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());
	}
}
