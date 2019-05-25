package ACP;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Controller bank = new Controller();
		double balance = (int)((Math.random() * 1000) + 100);
		double amount;
		String request;
		
                System.out.println(" /$$      /$$           /$$ /$$                 /$$$$$$$$                                    \n" +
"| $$  /$ | $$          | $$| $$                | $$_____/                                    \n" +
"| $$ /$$$| $$  /$$$$$$ | $$| $$  /$$$$$$$      | $$    /$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$ \n" +
"| $$/$$ $$ $$ /$$__  $$| $$| $$ /$$_____/      | $$$$$|____  $$ /$$__  $$ /$$__  $$ /$$__  $$\n" +
"| $$$$_  $$$$| $$$$$$$$| $$| $$|  $$$$$$       | $$__/ /$$$$$$$| $$  \\__/| $$  \\ $$| $$  \\ $$\n" +
"| $$$/ \\  $$$| $$_____/| $$| $$ \\____  $$      | $$   /$$__  $$| $$      | $$  | $$| $$  | $$\n" +
"| $$/   \\  $$|  $$$$$$$| $$| $$ /$$$$$$$/      | $$  |  $$$$$$$| $$      |  $$$$$$$|  $$$$$$/\n" +
"|__/     \\__/ \\_______/|__/|__/|_______/       |__/   \\_______/|__/       \\____  $$ \\______/ \n" +
"                                                                          /$$  \\ $$          \n" +
"                                                                         |  $$$$$$/          \n" +
"                                                                          \\______/           ");
		System.out.println("Welcome to Wells Fargo. What would you like to do?");
                System.out.println("1 for BALANCE \n2 for WITHDRAW \n3 for DEPOSIT \n4 for QUIT");
		
		request = input.nextLine();
		
		while (request != "QUIT") {
			
			switch(request) {
			
				case "1":
					balance = bank.handleRequest(request, balance, 0);
  					break;
					
				case "2":
					System.out.println("Please enter the amount");
					amount = Integer.parseInt(input.nextLine());

                                    if ( balance >= amount){
					balance = bank.handleRequest(request, balance, amount);
                                    } else{
                                        System.out.println("\nBalance is not sufficient!");
                                        System.out.println("Please try again.");
                                        System.out.println("1 for BALANCE \n2 for WITHDRAW \n3 for DEPOSIT \n4 for QUIT");
                                        request = input.nextLine();
                                    }break;
				case "3":
					System.out.println("Please enter the amount");
					amount = Integer.parseInt(input.nextLine());
					balance = bank.handleRequest(request, balance, amount);
					break;
                                case "4":
                                        System.out.println("\nThank you. Please take your receipt or money!");
                                        System.exit(0);

				default: 
					System.out.println("Please try again.");
					break;			
			}
			
        		System.out.println("1 for BALANCE \n2 for WITHDRAW \n3 for DEPOSIT \n4 for QUIT");
			request = input.nextLine();
		}
		
		System.out.println("Thank you. Have a good day!.");
	}

}
