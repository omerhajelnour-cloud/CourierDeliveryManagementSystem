package courier.main;

import java.util.Scanner;
import courier.model.Parcel;
import courier.service.CourierService;

public class Main {
    public static void main(String[] args) {
        CourierService service = new CourierService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== COURIER DELIVERY MANAGEMENT SYSTEM ===");

        while (true) {
            System.out.println("\n1. Book Parcel");
            System.out.println("2. Display All Details By ID");
            System.out.println("3. Update Status By ID");
            System.out.println("4. Delete By ID");
            System.out.println("5. View All");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Parcel ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Sender Name: ");
                String sName = sc.nextLine();
                System.out.print("Enter Sender Phone: ");
                String sPhone = sc.nextLine();
                System.out.print("Enter Receiver Name: ");
                String rName = sc.nextLine();
                System.out.print("Enter Receiver Phone: ");
                String rPhone = sc.nextLine();
                System.out.print("Enter From City: ");
                String from = sc.nextLine();
                System.out.print("Enter To City: ");
                String to = sc.nextLine();
                System.out.print("Enter Weight: ");
                String weight = sc.nextLine();
                System.out.print("Enter Price: ");
                String price = sc.nextLine();

                service.addParcel(new Parcel(id, sName, sPhone, rName, rPhone, from, to, weight, price));

            } else if (choice == 2) {
                System.out.print("Enter Parcel ID: ");
                String id = sc.nextLine();
                service.displayById(id);

            } else if (choice == 3) {
                System.out.print("Enter Parcel ID: ");
                String id = sc.nextLine();
                System.out.print("Enter New Status: ");
                String status = sc.nextLine();
                service.updateStatus(id, status);

            } else if (choice == 4) {
                System.out.print("Enter Parcel ID: ");
                String id = sc.nextLine();
                service.deleteParcel(id);

            } else if (choice == 5) {
                service.viewAll();
            } else if (choice == 6) break;
        }
        sc.close();
    }
}
