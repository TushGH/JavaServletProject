package model;

public class ViewMyReservationModel {

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

	public ViewMyReservationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ViewMyReservationModel(String CarName, String StartTime, String startdate, String enddate, String EndTime,String Reservationid) {
		super();
		this.CarName=CarName;
		this.startdate = startdate;
		this.enddate = enddate;
		this.StartTime = StartTime;
		this.EndTime = EndTime;
		this.Reservationid= Reservationid;
	}
public void validateViewMyReservationModel(ViewMyReservationModel view, viewmyreservation_errormsgs viewerrorMsgs) {
		
		viewerrorMsgs.setV_CarNameError(validatecarname(view.getCarName()));
		viewerrorMsgs.setV_StartTimeError(validatestarttime(view.getStartTime()));
		viewerrorMsgs.setV_EndTimeError(validateendtime(view.getEndTime()));
		viewerrorMsgs.setV_startdateError(validatestartdate(view.getstartdate()));
		viewerrorMsgs.setV_enddateError(validateenddate(view.getenddate()));
		viewerrorMsgs.setV_ReservationidError(validatereservationid(view.getReservationid()));
		viewerrorMsgs.setV_errorMsg();
	}
	
	private boolean stringSize(String string, int min, int max) {
		return string.length()>=min && string.length()<=max;
	}
	private String validatecarname(String CarName) {
		String result="";

		if (!stringSize(CarName,4,15))
			result= "Your CarName must between 4 and 15 digits";
	
		return result;
	}
	private String validatestarttime(String StartTime) {
		String result="";
		if(!StartTime.isEmpty())
			result="Start date should not be empty";
		else
			result="";
		return result;
	}
	private String validateendtime(String EndTime) {
		String result="";
		if(!EndTime.isEmpty())
			result="Start date should not be empty";
		else
			result="";
		return result;
	}
	private String validatestartdate(String startdate) {
		String result="";
		if(!startdate.isEmpty())
			result="Start date should not be empty";
		else
			result="";
		return result;
	}
	private String validateenddate(String enddate) {
		String result="";
		if(!enddate.isEmpty())
			result="End date should not be empty";
		else
			result="";
		return result;
	}
	private String validatereservationid(String Reservationid) {
		String result="";
		if(Reservationid.length()!=6)
		{
			result="please enter the 6 digit  number";
		}
		else if(!isTextAnInteger(Reservationid))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	}
	 private boolean isTextAnInteger (String string) {
	        boolean result;
			try
	        {
	            Long.parseLong(string);
	            result=true;
	        } 
	        catch (NumberFormatException e) 
	        {
	            result=false;
	        }
			return result;
		}
	
	
	
	
}
