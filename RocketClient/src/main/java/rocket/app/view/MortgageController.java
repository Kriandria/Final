package rocket.app.view;

import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	private MainApp mainApp;
	private double txtIncome;
	private double txtExpenses;
	private int txtCreditScore;
	private int txtHouseCost;
	private int loanTerm;
	private String error;
	private boolean button;

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	

	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Object message = null;
		
		Action a = new Action(eAction.CalculatePayment);
		LoanRequest lq = new LoanRequest();
		lq.setdIncome(txtIncome);
		lq.setiTerm(loanTerm);
		lq.setdExpenses(txtExpenses);
		lq.setiCreditScore(txtCreditScore);
		lq.setdAmount(txtHouseCost);

		a.setLoanRequest(lq);
		
		//	send lq as a message to RocketHub		
		mainApp.messageSend(lq);
	}
	
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		//	TODO - RocketClient.HandleLoanRequestDetails
		//			lRequest is an instance of LoanRequest.
		//			after it's returned back from the server, the payment (dPayment)
		//			should be calculated.
		//			Display dPayment on the form, rounded to two decimal places
		
	}
}
