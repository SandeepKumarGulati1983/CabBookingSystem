
public class OlaUberAlgo {

	

	/*
	 * This will search near about cab , so provide cabs lies in 5 Km area 
	 * 
	 * Return an array of near about cabs , Which we will place in the map. 
	 * 
	 * near cabs are those which lies in 5 KM range and have status Empty
	 */
	public void searchNearCabs(){
		
	}
	
	/*
	 * This will provide the nearest cab distance 
	 */
	public int possibleReachableTimeOfCab(){
		return 0;
		
	}
	
	/*
	 * Confirm booking - will update the cab booked status and provide cab object for detail display 
	 */
	public void confirmBooking(){
		
	}
	
	/*
	 * Shared Booking
	 * cab having status SHARE and EMPTy and lies in 5 KM range 
	 * provide a list of shared cab 
	 */
	
	public void lookForSharedCab() {
		
	}
	
	/*
	 * This will provide the nearest cab distance 
	 */
	public int possibleReachableTimeOfSharedCab() {
		return 0;
		
	}
	
	/*
	 * Confirm shared booking - 
	 * Will update the status from share to sharingDone
	 */
	public void confirmSharedBooking() {
		
	}
	
	/*
	 * this is for finding the distance between car and user 
	 * https://www.movable-type.co.uk/scripts/latlong.html
	 * 
	 * This uses the ‘haversine’ formula to calculate the great-circle distance between two points 
	 * – that is, the shortest distance over the earth’s surface – 
	 * giving an ‘as-the-crow-flies’ distance between the points 
	 * (ignoring any hills they fly over, of course!).

		Haversine formula:	a = sin²(Δφ/2) + cos φ1 ⋅ cos φ2 ⋅ sin²(Δλ/2)
		c = 2 ⋅ atan2( √a, √(1−a) )
		d = R ⋅ c
		where	φ is latitude, λ is longitude, R is earth’s radius (mean radius = 6,371km);
		note that angles need to be in radians to pass to trig functions!
	 */
	
	private double distance(double lat1, double lng1, double lat2, double lng2) {

	    double earthRadius = 6371 ; //3958.75; // in miles, change to 6371 for kilometer output

	    double dLat = Math.toRadians(lat2-lat1);
	    double dLng = Math.toRadians(lng2-lng1);

	    double sindLat = Math.sin(dLat / 2);
	    double sindLng = Math.sin(dLng / 2);

	    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
	        * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));

	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

	    double dist = earthRadius * c;

	    return dist; // output distance, in MILES
	}
	
}
