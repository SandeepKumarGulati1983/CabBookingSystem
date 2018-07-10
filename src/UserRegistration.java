
public class UserRegistration {

	String name;
	String phoneNumber;
	double lattitude;
	double longitude;
	boolean registrationStatus;
	
	
	public UserRegistration(String name , String phNumber, double lat, double longi,boolean regStatus) {
		this.name = name ; 
		this.phoneNumber = phNumber; 
		this.lattitude = lat;
		this.longitude =  longi;
		this.registrationStatus = regStatus;
		
	}
	
}
