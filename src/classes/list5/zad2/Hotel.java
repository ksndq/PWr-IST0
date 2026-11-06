package classes.list5.zad2;

public class Hotel {
    private final Room[] rooms;

    public Hotel(int numberOfRooms) {
        this.rooms = new Room[numberOfRooms];

        for (int i = 0; i < numberOfRooms; i++) {
            this.rooms[i] = new Room();
        }
    }

    public int getNumberOfRooms() {
        return this.rooms.length;
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public Room getRoom(int roomNumber) {
        return this.rooms[roomNumber - 1];
    }

    public boolean rentRoom(Guest guest) {
        for (Room room : rooms) {
            if (room.isFree()) {
                room.rentTo(guest);
                return true;
            }
        }
        return false;
    }


    public boolean rentRoom(int roomNumber, Guest guest) {
        int index = roomNumber - 1;
        if (index >= 0 && index < rooms.length && rooms[index].isFree()) {
                rooms[index].rentTo(guest);
                return true;
            }

        return false;
    }
}
