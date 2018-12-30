import java.util.Scanner;
public class masiv {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String[] chisla = a.split(" ");
		int[] b = new int[chisla.length];
		for (int i = 0; i < chisla.length; i++) {
			b[i] = Integer.parseInt(chisla[i]);
		}
		int sum = sumArray(b);
		int max = maxNumber(b);
		int min = minNumber(b);
		double avg = averageArray(b);
		System.out.println("Sum: "+sum);
		System.out.println("Avg: " + avg);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);

	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	public static double averageArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / arr.length;
		return avg;

	}

	public static int maxNumber(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int minNumber(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}
	
	

}
