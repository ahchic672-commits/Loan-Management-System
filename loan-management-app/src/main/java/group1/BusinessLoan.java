package group1;

public class BusinessLoan extends Loan {
	private String businessName;
	public BusinessLoan(double principal,double interestRate,int repaymentPeriod,String businessName) {
			super(principal,interestRate,repaymentPeriod);
		this.businessName=businessName;
		}
		@Override
		public double  calculateInterest() {
			return principal  * (interestRate / 100) * repaymentPeriod;
			}
}
		
			

		
