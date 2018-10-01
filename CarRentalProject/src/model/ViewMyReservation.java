package model;

public class ViewMyReservation {
	private String startdate;
	private String enddate;
	private String Reservationid;
	private String CarName;
	private String StartTime;
	private String EndTime;
	
	public String getstartdate() {
		return startdate;
	}
	public void setstartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getenddate() {
		return enddate;
	}
	public void setenddate(String enddate) {
		this.enddate = enddate;
	}
	public String getReservationid() {
		return Reservationid;
	}
	public void setReservationid(String Reservationid) {
		this.Reservationid = Reservationid;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String CarName) {
		this.CarName = CarName;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String StartTime) {
		this.StartTime = StartTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String EndTime) {
		this.EndTime = EndTime;
	}
	
	
	public ViewMyReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewMyReservation(String startdate,String enddate)
	{
		this.startdate=startdate;
		this.enddate=enddate;
	}
}
