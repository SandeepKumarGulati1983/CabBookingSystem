
public class CabRegistration {
	
	String name;

	double lattitude;
	double longitude;
	boolean registrationStatus;
	boolean OnDutyStatus;
	BookedStatus status;
	enum BookedStatus 
	{
	    EMPTY, SINGLE, SHARE, SHARING_DONE;
	}
	
	public CabRegistration(String name , double lat, double longi, boolean onduty, BookedStatus status ) {
		this.name = name ; 
		//this.phoneNumber = phNo; 
		this.lattitude = lat;
		this.longitude =  longi;
		this.OnDutyStatus = onduty;
		this.status = status;
	}

}
