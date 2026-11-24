package group1;

public class BusinessLoan extends Loan { 
	public static final double intestRate = 12.0;
	public static final int maxPeriodMonths = 24;
	public static final double minAmount = 100000;
	public static final double mixAmount = 1000000;
	
	public BusinessLoan(double principal,double interestRate,int repaymentPeriod) {
			super(principal,interestRate,repaymentPeriod);
		}
		@Override
		public double  calculateInterest() {
			return principal  * (interestRate / 100) * repaymentPeriod;
		
				
			}
		
		public static void main(String[] args){
			PersonalLoan loan = new PersonalLoan(500000,15,24);
			loan.displayLoanDetails();
			
			System.out.println("Interent only: " + loan.calculateInterest());
			System.out.println("Total Payable: " + loan.calculateTotalPayable());}
		}
		
			

		
