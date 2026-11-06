package classes.list5.zad2;


public class Zad {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);

        Guest gosc = new Guest("Mateusz", "Marczak");

        hotel.rentRoom(7, gosc);

        System.out.println(hotel.getRoom(7).getGuest());
    }
}
