package javaPackage;

public class CustomerMethod {
	
	void fee_paid_amount(int fee)
	{
		System.out.println("Pay the fee amount: $"+fee);
	}

	
	public static void main(String[] args) {

		CustomerMethod obj =new CustomerMethod();
		obj.fee_paid_amount(100);
		
		CustomerMethod obj1 =new CustomerMethod();
		obj1.fee_paid_amount(200);
		
		CustomerMethod obj2 =new CustomerMethod();
		obj2.fee_paid_amount(300);
		
		CustomerMethod obj3 =new CustomerMethod();
		obj3.fee_paid_amount(400);
	}

}
