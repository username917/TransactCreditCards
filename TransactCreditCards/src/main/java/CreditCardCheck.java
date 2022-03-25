
public class CreditCardCheck {
	
	

	//this class is going to check for the validity of a credit card number
	
	public String checkCCNumber (String cardNumber) {
		
		
		String statement;
	    
	    
		//numeroCardEnum numero = numeroCardEnum.valueOf
		
		switch(cardNumber) {
		
		case "444411112222":
			
			statement = "Transaction was successfully processed";
			break;
			
		case "440011113333":
		
			statement = "Transaction was successfully processed";
			break;	
			
		case "111188886699":
			
			statement = "Transaction was successfully processed";
			break;
		
		default:
			
			statement = "Transaction not possible due to invalid card number";
			
			
		}
			
		return statement;
		
		
	}
}
