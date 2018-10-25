package model;

public class viewmyreservation_errormsgs {
	private String v_errorMsg;
	private String v_CarNameError;
	private String v_StartTimeError;
	private String v_startdateError;
	private String v_EndTimeError;
	private String v_enddateError;
	private String v_ReservationidError;

	public viewmyreservation_errormsgs(){
		this.v_errorMsg="";
		this.v_CarNameError="";
		this.v_StartTimeError="";
		this.v_startdateError="";
		this.v_enddateError="";
		this.v_EndTimeError="";
		this.v_ReservationidError="";
	}
	
	public String getV_ReservationidError() {
		return v_ReservationidError;
	}
	public void setV_ReservationidError(String v_ReservationidError) {
		this.v_ReservationidError = v_ReservationidError;
	}
	
	public String getV_CarNameError() {
		return v_CarNameError;
	}

	public void setV_CarNameError(String v_CarNameError) {
		this.v_CarNameError = v_CarNameError;
	}

	public String getV_StartTimeError() {
		return v_StartTimeError;
	}

	public void setV_StartTimeError(String v_StartTimeError) {
		this.v_StartTimeError = v_StartTimeError;
	}

	public String getV_startdateError() {
		return v_startdateError;
	}

	public void setV_startdateError(String v_startdateError) {
		this.v_startdateError = v_startdateError;
	}

	public String getV_EndTimeError() {
		return v_EndTimeError;
	}

	public void setV_EndTimeError(String v_EndTimeError) {
		this.v_EndTimeError = v_EndTimeError;
	}

	public String getV_enddateError() {
		return v_enddateError;
	}

	public void setV_enddateError(String v_enddateError) {
		this.v_enddateError = v_enddateError;
	}

	
	public String getV_errorMsg() {
		return v_errorMsg;
	}
	public void setV_errorMsg() {
		if (!v_CarNameError.equals("") || !v_StartTimeError.equals("") ||!v_startdateError.equals("")||!v_EndTimeError.equals("")
				||!v_enddateError.equals("") || !v_ReservationidError.equals(""))
			v_errorMsg="Please correct the following errors";
	}
	
}
