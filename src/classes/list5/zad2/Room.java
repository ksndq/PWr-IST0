package classes.list5.zad2;

public class Room {
    private boolean isFree;
    private Guest guest;

    public Room(boolean isFree, Guest guest) {
        this.isFree = isFree;
        this.guest = guest;
    }

    public Room() {
        this.isFree = true;
        this.guest = null;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public void rentTo(Guest guest) {
        this.isFree = false;
        this.guest = guest;
    }
}
