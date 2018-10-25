package model;

public class AddCarModel {
	private String CarName;
	private String Capacity;
	private String WeekDay;
	private String WeekEnd;
	private String Week;
	private String Gps;
	private String OnStar;
	private String SiriusXM;
	
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCapacity() {
		return Capacity;
	}
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}
	public String getWeekDay() {
		return WeekDay;
	}
	public void setWeekDay(String weekDay) {
		WeekDay = weekDay;
	}
	public String getWeekEnd() {
		return WeekEnd;
	}
	public void setWeekEnd(String weekEnd) {
		WeekEnd = weekEnd;
	}
	public String getWeek() {
		return Week;
	}
	public void setWeek(String week) {
		Week = week;
	}
	public String getGps() {
		return Gps;
	}
	public void setGps(String gps) {
		Gps = gps;
	}
	public String getOnStar() {
		return OnStar;
	}
	public void setOnStar(String onStar) {
		OnStar = onStar;
	}
	public String getSiriusXM() {
		return SiriusXM;
	}
	public void setSiriusXM(String siriusXM) {
		SiriusXM = siriusXM;
	}
	
	public AddCarModel(String CarName, String Capacity, String WeekDay, String WeekEnd, String Week,
			String Gps, String OnStar, String SiriusXM) {
		super();
		this.CarName = CarName;
		this.Capacity = Capacity;
		this.WeekDay = WeekDay;
		this.WeekEnd = WeekEnd;
		this.Week = Week;
		this.Gps = Gps;
		this.OnStar = OnStar;
		this.SiriusXM = SiriusXM;
	}
    
	public AddCarModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void validateAddCarModel(AddCarModel addcar, addcar_errormsgs addcarerrorMsgs) {
		
		addcarerrorMsgs.setA_CarNameError(validatecarname(addcar.getCarName()));
		addcarerrorMsgs.setA_CapacityError(validatecapacity(addcar.getCapacity()));
		addcarerrorMsgs.setA_WeekDayError(validateweekday(addcar.getWeekDay()));
		addcarerrorMsgs.setA_WeekEndError(validateweekend(addcar.getWeekEnd()));
		addcarerrorMsgs.setA_WeekError(validateweek(addcar.getWeek()));
		addcarerrorMsgs.setA_GpsError(validategps(addcar.getGps()));
		addcarerrorMsgs.setA_OnStarError(validateonstar(addcar.getOnStar()));
		addcarerrorMsgs.setA_SiriusXMError(validatesiriusxm(addcar.getSiriusXM()));
		addcarerrorMsgs.setA_errorMsg();
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
	private String validatecapacity(String Capacity) {
		String result="";
		if(!isTextAnInteger(Capacity))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	}
	private String validateweekday(String WeekDay) {
		String result="";
		if(!isTextAnInteger(WeekDay))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	}

	private String validateweekend(String WeekEnd) {
		String result="";
		if(!isTextAnInteger(WeekEnd))
		{
			result="you just have to enter numbers";
		
		}
		else
			result="";
		return result;
	}	
	 

	private String validateweek(String Week) {
		String result="";
		if(!isTextAnInteger(Week))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	}
	
	private String validategps(String Gps) {
		String result="";
		if(!isTextAnInteger(Gps))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	} 
	
	private String validateonstar(String OnStar) {
		String result="";
		if(!isTextAnInteger(OnStar))
		{
			result="you just have to enter numbers";
			
		}
		else
			result="";
		return result;
	} 
	private String validatesiriusxm(String siriusxm) {
		String result="";
		if(!isTextAnInteger(siriusxm))
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
