package interest_payment;

import java.math.BigDecimal;

/**
 * class representing payment details
 */
public class Payment{
	
	/* The number of days after 1/1/1970 */
	private long dayNumber;
	private BigDecimal rate;
	
	// constructor
	public Payment(long dayNumber, BigDecimal rate){
		this.dayNumber = dayNumber;
		this.rate = rate;
	}
	
	// getter
	public long getDayNumber(){
		return dayNumber;
	}
}