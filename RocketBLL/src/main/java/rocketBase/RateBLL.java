package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) 
	{

		
		ArrayList<RateDomainModel> rates = new ArrayList<RateDomainModel>();
		rates = _RateDAL.getAllRates();
		
		double correctRate = 0;
		
		return correctRate;
		
		
	}
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
