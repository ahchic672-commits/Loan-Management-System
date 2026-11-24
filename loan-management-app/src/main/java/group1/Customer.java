package group1;
import java.util.Scanner;

public class Customer {
	Scanner scanner = new Scanner(System.in);
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String nationalId;
	private String emailAddress;
	private String physicalAddress;
	private String employmentStatus;
	private String phoneNumber;
	private double monthlyIncome;
	private String customerStatus;
	
	public Customer(String customerId, String firstName, String lastName, String nationalId, 
			String emailAddress, String physicalAddress, String employmentStatus, String phoneNumber, double monthlyIncome, String customerStatus) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
		this.employmentStatus = employmentStatus;
		this.phoneNumber = phoneNumber;
		this.monthlyIncome = monthlyIncome;
		this.customerStatus = customerStatus;
		}
		
		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId){
			this.customerId = customerId;
		}

		public double getMonthlyIncome() {
			return monthlyIncome;
		}

		public void setMonthlyIncome(double monthlyIncome){
			this.monthlyIncome = monthlyIncome;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber){
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmailAddress() {
			return emailAddress;
		} 

		public void setEmailAddress(String emailAddress){
			this.emailAddress = emailAddress;
		}
		
		public String getNationalId() {
			return nationalId;
		}

		public void setNationalId(String nationalId){
			this.nationalId = nationalId;
		}
		
		public String getPhysicalAddress() {
			return physicalAddress;
		}

		public void setPhysicalAddress(String physicalAddress){
			this.physicalAddress = physicalAddress;
		}
		
		public String getCustomerStatus() {
			return customerStatus;
		}

		public void setCustomerStatus(String customerStatus){
			this.customerStatus = customerStatus;
		}
		
		public String getEmploymentStatus() {
			return employmentStatus;
		}

		public void setEmploymentStatus(String employmentStatus){
			this.employmentStatus = employmentStatus;
		}
		
	    public void addCustomer(){
			System.out.println("Enter First Name: ");
			this.firstName=scanner.nextLine();

			System.out.println("Enter Last Name: ");
			this.lastName=scanner.nextLine();

			System.out.println("Enter national ID: ");
			this.nationalId=scanner.nextLine();
			
			System.out.println("Enter Phone number: ");
			this.phoneNumber=scanner.nextLine();
			
			System.out.println("Enter Email Address: ");
			this.emailAddress=scanner.nextLine();

			System.out.println("Enter Physical Address: ");
			this.physicalAddress=scanner.nextLine();
			
			System.out.println("Enter Employment Status: ");
			this.employmentStatus=scanner.nextLine();
			
			System.out.println("Enter Monthly Income: ");
			this.monthlyIncome=scanner.nextDouble();
			scanner.nextLine();

			this.customerStatus="ACTIVE";
	
		}
		public void viewCustomerInfo(){
			System.out.println("Customer ID: " + getCustomerId());
			System.out.println("Name " + getFirstName() + " " + getLastName());
			System.out.println("Phone: " + getPhoneNumber());
	    	System.out.println("Monthly Income: MKW " + getMonthlyIncome());
	    	System.out.println("Email Address: " + getEmailAddress());
	    	System.out.println("Physical Address: " + getPhysicalAddress());
	    	System.out.println("Customer Status: " + getCustomerStatus());
	    	System.out.println("National ID: " + getNationalId() );
	    	System.out.println("Employment Status: " + getEmploymentStatus());
	    	System.out.println("Interent only: " + calculateInterest());
			System.out.println("Total Payable: " + calculateTotalPayable());
			System.out.println("Loan detail:  "+ displayLoanDetails(););
		}
		public void searchCustomer(){
			//search customer
		}

		public void listAllCustomers(){
			
		}
}

		
