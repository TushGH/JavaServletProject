package tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import model.CancelReservationModel;

import model.cancelreservation_errormsgs;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class CancelReservationTest {
	//declare variable here
	CancelReservationModel cancel;
	cancelreservation_errormsgs cErrorMsgs;
	
	
	@Before
	public void setUp() throws Exception {
		//instantiate variable here
		cancel = new CancelReservationModel();
		cErrorMsgs = new cancelreservation_errormsgs();
		
	}

	@FileParameters("src/tests/test11.csv")
	@Test
	public void test(int testCaseNumber, String confirmationid, String confirmationidError) {

		cancel.setCancelReservationModel(confirmationid);
		//validate
		cancel.validateCancelReservationModel(cancel, cErrorMsgs);

		assertEquals(confirmationidError,cErrorMsgs.getC_confirmationidError());
	
	    	    
	}
}
