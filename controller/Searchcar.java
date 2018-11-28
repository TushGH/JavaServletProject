package model;

import java.text.ParseException;

import data.transactionDAO;

public class Searchcar {
private String StartDate;


private String EndDate;
private String StartTime;
private String EndTime;
private String Passengers;

public String getStartDate() {
	return StartDate;
}
public void setStartDate(String startDate) {
	StartDate = startDate;
}
public String getEndDate() {
	return EndDate;
}
public void setEndDate(String endDate) {
	EndDate = endDate;
}
public String getStartTime() {
	return StartTime;
}
public void setStartTime(String startTime) {
	StartTime = startTime;
}
public String getEndTime() {
	return EndTime;
}
public void setEndTime(String endTime) {
	EndTime = endTime;
}
public String getPassengers() {
	return Passengers;
}
public void setPassengers(String passengers) {
	Passengers = passengers;
}
public Searchcar(String startdate, String enddate, String starttime , String endtime, String capacity) {
	super();
StartDate=startdate;
EndDate=enddate;
StartTime=starttime;
EndTime=endtime;
Passengers=capacity;

}
public void validatesearch(Searchcar search, SearchCar_errormsgs scerror) throws ParseException {
	
	scerror.setS_capacityError(validatecapacity(search.getPassengers()));
	scerror.setS_startdateError(validatestartdate(search.getStartDate()));
	scerror.setS_enddateError(validateenddate(search.getStartDate(),search.getEndDate()));
	scerror.setS_starttimeError(validatestarttime(search.getStartTime()));
	scerror.setS_endtimeError(validateendtime(search.getStartDate(),search.getEndDate(),search.getStartTime(),search.getEndTime()));
	scerror.setS_errorMsg();


}
public boolean stringSize(String string, int min, int max) {
	return string.length()>=min && string.length()<=max;
}

public String validatecapacity(String cap)
{String result="";
if(cap.isEmpty())
{ 
	result="Capcity cant be empty";
 	
}

//else if(!cap.equals("1")||!cap.equals("2")||!cap.equals("3")||!cap.equals("4")||!cap.equals("5")||!cap.equals("6")
		//||!cap.equals("7")||!cap.equals("8")||!cap.equals("9"))
//{
	//result="Please give correct capacity values";}
	
else
{
  result="";	
}

return result;
}


public String validatestartdate(String stdate )
{ String result="";
	if(stdate.isEmpty())
	{
		result="startdate cant be empty";
	}

	else
	{
		result="";
		
	}
	
	return result;
}

public String validateenddate(String stdate,String enddate ) throws ParseException
{ String result="";
transactionDAO tc = new transactionDAO();
	if(enddate.isEmpty())
	{
		result="enddate cant be empty";
	}

	else if(((tc.searchdates(stdate, enddate))==1))
	{
		result="The enddate has to be after the start date";
		
	}
	else
	{
		result="";
	}
	System.out.println("the result for this is"+result);
	return result;
}
public String validatestarttime(String sttime )
{ String result="";
	if(sttime.isEmpty())
	{
		result="starttime cant be empty";
	}

	else
	{
		result="";
		
	}
	
	return result;
}

public String validateendtime(String stdate,String enddate,String sttime,String endtime) throws ParseException
{
	String result="";
	transactionDAO t = new transactionDAO();
	if(endtime.isEmpty())
	{
		result="starttime cant be empty";
	}
	else if((t.searchtime(stdate,enddate,sttime,endtime)==1))
	{
		result="endtime has to be greater than starttime";
	}

	else
	{
		result="";
		
	}
	
	return result;



}


}


