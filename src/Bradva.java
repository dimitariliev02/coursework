import java.util.Scanner;
public class Bradva {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

	double vegInLv = Double.parseDouble(console.nextLine());
	double fruitsInLev = Double.parseDouble(console.nextLine());

	if (vegInLv <= 1000 && fruitsInLev <= 1000) {
		int vegKg = Integer.parseInt(console.nextLine());
		int fruitKg = Integer.parseInt(console.nextLine());

		System.out.println((vegInLv * vegKg + fruitKg * fruitsInLev) / 1.94);

	}

}
}
		

