import java.util.Scanner;
public class PospalivataKotka {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many free days will have the cat s owner: ");
		int FreeDays = Integer.parseInt(scanner.nextLine());
		final int DayInYear= 365, isWorkMin = 63, IsHolidayMin = 127, normForSleep = 30000;
		int WorksDay= DayInYear - FreeDays;
		int MinuteForPlay  = (WorksDay * isWorkMin);
		int different = normForSleep - MinuteForPlay;
		int hours = Math.abs(different/60);
		int minutes = Math.abs(different % 60);
		if (different < 0) {
			System.out.println("Tom will run away");
			System.out.printf("%d hours and %d minutes more for play",hours, minutes);
		}else {
			System.out.println("Tom sleps well ");
			System.out.printf("%d hours and %d minutes less for play",hours, minutes);
		}

	}
}