import java.util.Scanner;
public class StopirastoChislo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int n = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your second number: ");
		int m = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your stop number: ");
		int s = Integer.parseInt(scanner.nextLine());

		for (int i = m; i >= n; i--) {
			if (i % 2 == 0 && i % 3 == 0) {
				if (i == s) {
					break;
				}
				System.out.print(i + " ");

			}

		}
	}
}