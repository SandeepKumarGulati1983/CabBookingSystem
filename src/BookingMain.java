

public class BookingMain {

	public static void main(String[] args) {
		

		/*
		 * Test Date for registering user 
		 */

		UserRegistration user1 =  new UserRegistration("Sandeep", "9958007917", 11.2, 14.2, true);
		
		/*
		 * Test data for registering cabs 
		 */
		CabRegistration  cab1 = new CabRegistration("cab1", 15.2, 13.4, false, CabRegistration.BookedStatus.EMPTY);
		CabRegistration  cab2 = new CabRegistration("cab2", 16.2, 14.4, false, CabRegistration.BookedStatus.EMPTY);
		CabRegistration  cab3 = new CabRegistration("cab3", 17.2, 15.4, false, CabRegistration.BookedStatus.EMPTY);
	
		
		/*
		 *OLA / UBER obejct  
		 */
		OlaUberAlgo ola = new OlaUberAlgo();
		
		
		/*
		 * This will search near about cab , so provide cabs lies in 5 Km area 
		 * 
		 * Return an array of near about cabs , Which we will place in the map. 
		 * 
		 * near cabs are those which lies in 5 KM range and have status Empty
		 */
		ola.searchNearCabs();
		
		/*
		 * This will provide the nearest cab distance 
		 */
		ola.possibleReachableTimeOfCab();
		
		/*
		 * Confirm booking - will update the cab booked status and provide cab object for detail display 
		 */
		ola.confirmBooking();
		
		/*
		 * Shared Booking
		 * cab having status SHARE and EMPTy and lies in 5 KM range 
		 * provide a list of shared cab 
		 */
		
		ola.lookForSharedCab();
		
		/*
		 * This will provide the nearest cab distance 
		 */
		ola.possibleReachableTimeOfSharedCab();
		
		/*
		 * Confirm shared booking - 
		 * Will update the status from share to sharingDone
		 */
		ola.confirmSharedBooking();
		
	}

}
