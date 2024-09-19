import java.util.Scanner;

//Question 3B
public class Main {
    public static void main(String[] args) {
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};

        Scanner sc = new Scanner(System.in);
        System.out.println("Available services: oil change, tire rotation, battery check, brake inspection.");
        System.out.println("Enter the first three characters of a service:");
        String service = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < services.length; i++) {
            if (services[i].startsWith(service)) {
                System.out.println("Service: " + services[i] + " - Price: $" + prices[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: Invalid service entered.");
        }
    }
}