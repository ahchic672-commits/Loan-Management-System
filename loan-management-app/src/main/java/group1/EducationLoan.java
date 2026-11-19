package group1;


	public class EducationLoan extends Loan{
		
		public EducationLoan(double principal,double interestRate,int repaymentPeriod) {
				super(principal,interestRate,repaymentPeriod);
			}
			@Override
			public double  calculateInterest() {
				return principal  * (interestRate / 100) * repaymentPeriod;
			
					
				}
	}


