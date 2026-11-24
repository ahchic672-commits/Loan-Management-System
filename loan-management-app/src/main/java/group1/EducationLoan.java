package group1;


	public class EducationLoan extends Loan{
		private String passcode;
		private String instituionName;
		
		
		public EducationLoan(double principal,double interestRate,int repaymentPeriod,String passcode, String instituitionName) {
				super(principal,interestRate,repaymentPeriod);
				this.passcode=passcode;
				this.instituitionalName=instituitionalName;
			}
			@Override
			public double  calculateInterest() {
				return principal  * (interestRate / 100) * repaymentPeriod;	
				}
	}


