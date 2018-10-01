package model;

public class CancelReservation {
	private String confirmationid;
	private String UTAID;
	
	public String setconfirmationid() {
		return confirmationid;
	}
	public void getconfirmationid(String confirmationid) {
		this.confirmationid = confirmationid;
	}
	public String setUTAID() {
		return UTAID;
	}
	public void getUTAID(String UTAID) {
		this.UTAID = UTAID;
	}
	
	public CancelReservation() {
		super();
		
	}

	public CancelReservation(String confirmationid,String UTAID)
	{
		this.confirmationid=confirmationid;
		this.UTAID=UTAID;
	}
}
