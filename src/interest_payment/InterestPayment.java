package interest_payment;

/**
 * class that updates Payment
 */
public class InterestPayment
{
	private static int PAYMENT_DAY_TOLERANCE = 5;
	private Payment currentPayment;
	
	/**
	* Update the payment if and only if the new payment is
	* within 5 days of the existing payment.
	* @param payment object containing payment details
	* @return true if payment within 5 days, false otherwise.
	*/
	public boolean updatePayment(Payment payment){
		/* 
		 * below line contains error: getDayNumber will return 
		 * null pointer exception first time as current 
		 * payment is not instantiated 
		 */
		if (payment.getDayNumber() - currentPayment.getDayNumber()
				< PAYMENT_DAY_TOLERANCE) {
			this.currentPayment = payment;
			return true;
		}
		return false;
	}
	
	
	/**
	 * This is corrected version of updatePayment method
	 * @param payment object containing payment details
	 * @return true if payment within 5 days, false otherwise.
	 */
	public boolean updatePaymentVALID(Payment payment){
		if ( (currentPayment == null)  ||
			(payment.getDayNumber() - currentPayment.getDayNumber()
				< PAYMENT_DAY_TOLERANCE) ) {
			this.currentPayment = payment;
			return true;
		}
		return false;
	}
}