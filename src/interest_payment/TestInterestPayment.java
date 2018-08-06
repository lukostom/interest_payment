package interest_payment;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

/**
 * @author tom
 * class containing JUnit tests
 * for InterestPayment class
 */
public class TestInterestPayment {
	
	/**
	 * METHOD 1
	 * Testing original update payment method
	 * This test fail if method update payment will throw exception
	 */
	@Test
	public void testInterestPaymentForExceptions() {
		InterestPayment interestPayment = 
				new InterestPayment();
		try {
			interestPayment.updatePayment(new Payment(1, new BigDecimal(1200)));
		}catch(Exception e) {
			fail("Method updatePayment in InterestPayment class"
					+ " throws unexpected exception");
		}
		
	}
	
	/**
	 * METHOD 2
	 * Testing functionality in original update payment method
	 * in that case the test throws NullPointerExceptoin
	 * which implies that test failed
	 */
	@Test
	public void testInterestPayment(){
		InterestPayment interestPayment = 
				new InterestPayment();
		assertTrue("Method updatePayment in InterestPayment class returns FALSE for new payment",
				interestPayment.updatePayment(new Payment(1, new BigDecimal(1200))));
		assertTrue("Method updatePayment in InterestPayment class returns FALSE for payment within 5 days",
				interestPayment.updatePayment(new Payment(4, new BigDecimal(1200))));
		assertFalse("Method updatePayment in InterestPayment class returns TRUE for payment over 5 days",
				interestPayment.updatePayment(new Payment(12, new BigDecimal(1200))));
	}
	
	/**
	 * METHOD 3
	 * Testing CORRECTED update payment method
	 * This test should now pass as the error is corrected
	 */
	@Test
	public void testValidInterestPayment(){
		InterestPayment interestPayment = 
				new InterestPayment();
		assertTrue("Method updatePayment in InterestPayment class returns FALSE for new payment",
				interestPayment.updatePaymentVALID(new Payment(1, new BigDecimal(1200))));
		assertTrue("Method updatePayment in InterestPayment class returns FALSE for payment within 5 days",
				interestPayment.updatePaymentVALID(new Payment(4, new BigDecimal(1200))));
		assertFalse("Method updatePayment in InterestPayment class returns TRUE for payment over 5 days",
				interestPayment.updatePaymentVALID(new Payment(12, new BigDecimal(1200))));
	}
	
}