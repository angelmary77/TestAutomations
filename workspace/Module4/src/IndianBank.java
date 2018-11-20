
public class IndianBank implements Bank {
	
	@Override
	public void transferMoney(){
		System.out.println("IndianBank transferring money");
	}
	
	@Override
	public void debit(){
		System.out.println("IndianBank debiting money");
	}
	
	@Override
	public void credit(){
		System.out.println("IndianBank crediting money");
	}
	
	public void newAccount(){
		System.out.println("Open new account in IndianBank");
	}

}
 