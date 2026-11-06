package classes.list5.zad1;

public class Zad {
    public static void main(String[] args) {
        Table table = new Table(5);
        table.fillTable();

        System.out.println(table.get(3));

        System.out.println(table.find(123213123));
    }
}
