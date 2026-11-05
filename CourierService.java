package courier.service;

import java.util.ArrayList;
import courier.model.Parcel;

public class CourierService {
    public ArrayList<Parcel> parcels = new ArrayList<>();

    public CourierService() {
        // Sample Data
        parcels.add(new Parcel("C101", "Ahmed", "03001234567", "Ali", "03007654321", "Lahore", "Karachi", "2kg", "500"));
        parcels.add(new Parcel("C102", "Sara", "03211234567", "Ayesha", "03331234567", "Islamabad", "Multan", "5kg", "900"));
    }

    public void addParcel(Parcel p) {
        parcels.add(p);
        System.out.println("Parcel Booked Successfully!");
    }

    // DISPLAY BY ENTERING ONLY ID
    public void displayById(String searchId) {
        for (Parcel p : parcels) {
            if (p.id.equalsIgnoreCase(searchId)) {
                p.displayDetails();
                return;
            }
        }
        System.out.println("Parcel Not Found!");
    }

    public void updateStatus(String searchId, String newStatus) {
        for (Parcel p : parcels) {
            if (p.id.equalsIgnoreCase(searchId)) {
                p.status = newStatus;
                System.out.println("Status Updated!");
                return;
            }
        }
        System.out.println("Parcel Not Found!");
    }

    public void deleteParcel(String searchId) {
        for (Parcel p : parcels) {
            if (p.id.equalsIgnoreCase(searchId)) {
                parcels.remove(p);
                System.out.println("Parcel Deleted!");
                return;
            }
        }
        System.out.println("Parcel Not Found!");
    }

    public void viewAll() {
        for (Parcel p : parcels) {
            System.out.println(p.id + " | " + p.senderName + " -> " + p.receiverName + " | " + p.status);
        }
    }
}
