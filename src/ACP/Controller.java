package ACP;

import java.util.HashMap;

public class Controller {
	
	public static HashMap<String, Banking> map = new HashMap <String, Banking>();
	
	public void Controller() {
		
	}
	
	public double handleRequest(String request, double balance, double amount) {
		
		map.put("2", new Withdraw()); 
		map.put("3", new Deposit());
		map.put("1", new Balance());
		
		Banking handler = map.get(request);
		balance = handler.bank(balance, amount);
		
		return balance;
		
	}
	
}
