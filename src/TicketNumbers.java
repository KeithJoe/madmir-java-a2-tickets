import java.util.Scanner;

public class TicketNumbers {

	public static void main(String[] args) {
		int ticketNumber, stem, checkDigit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a six-digit number: ");
		ticketNumber = sc.nextInt();
		stem = ticketNumber / 10;
		checkDigit = ticketNumber % 10;
		
		while (checkDigit != stem % 7) {
			System.out.println("That is Not a valid ticket number, bucko!");
			System.out.print("Try again: ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
		}
		System.out.println("That is a valid ticket number, well done!");
				
	}

}
