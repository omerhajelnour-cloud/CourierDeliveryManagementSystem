package courier.model;

public class Parcel {
    public String id, senderName, senderPhone, receiverName, receiverPhone;
    public String fromCity, toCity, weight, price, status;

    public Parcel(String id, String senderName, String senderPhone, String receiverName,
                  String receiverPhone, String fromCity, String toCity, String weight, String price) {
        this.id = id;
        this.senderName = senderName;
        this.senderPhone = senderPhone;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.weight = weight;
        this.price = price;
        this.status = "Booked";
    }

    public void displayDetails() {
        System.out.println("\n----- PARCEL FULL DETAILS -----");
        System.out.println("Parcel ID      : " + id);
        System.out.println("Sender Name    : " + senderName);
        System.out.println("Sender Phone   : " + senderPhone);
        System.out.println("Receiver Name  : " + receiverName);
        System.out.println("Receiver Phone : " + receiverPhone);
        System.out.println("From City      : " + fromCity);
        System.out.println("To City        : " + toCity);
        System.out.println("Weight         : " + weight);
        System.out.println("Price          : " + price);
        System.out.println("Status         : " + status);
        System.out.println("-------------------------------");
    }
}
