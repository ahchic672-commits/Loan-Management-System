package group1;
import java.util.Scanner;

public class Customer {
	Scanner scanner=new Scanner(System.in);
	
	String customerId;
	String firstName;
	String lastName;
	String nationalId;
	String emailAddress;
	String physicalAddress;
	String employmentStatus;
	String phoneNumber;
	Double monthlyIncome;
	String customerStatus;
	
	public Customer(String customerId, String firstName, String lastName, String nationalId, 
			String emailAddress, String physicalAddress, String employmentStatus, String phoneNumber, BigDecimal monthlyIncome, String customerStatus) {
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
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public BigDecimal getMonthlyIncome() {
			return monthlyIncome;
		}
		
		public String getEmailAddress() {
			return emailAddress;
		} 
		
		public String getNationalId() {
			return nationalId;
		}
		
		public String getPhysicalAddress() {
			return physicalAddress;
		}
		
		public String getCustomerStatus() {
			return customerStatus;
		}
		
		public String getEmploymentStatus() {
			return employmentStatus;
		}
		
		public void setMonthlyIncome(Double monthlyIncome) {
			this.monthlyIncome = monthlyIncome;
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

		public void searchCustomer(){
			//search customer
		}

		public void listAllCustomers(){
			
		}
}

		
