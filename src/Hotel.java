import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());

        double priceStudio = 50;
        double priceApartment = 65;


        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nights > 7 && nights <= 14) {
                priceStudio = 50 - (50 * 0.05);

            } else if (nights > 14) {
                priceStudio = 50 - (50 * 0.3);
                priceApartment = 65 - (65 * 0.1);
            }

        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.2;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio = 75.2 - (75.2 * 0.2);
                priceApartment = 68.70 - (68.70 * 0.1);
            }

        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nights > 14) {
                priceStudio = 76;
                priceApartment = 77 - (77 * 0.1);
            }
        }
       double tottalPriceStudio = priceStudio*nights;
        double tottalPriceApartment = priceApartment*nights;

        System.out.printf("Apartment: %.2f lv.", tottalPriceApartment);
        System.out.printf("Studio: %.2f lv.", tottalPriceStudio);
    }
}