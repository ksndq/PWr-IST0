package classes.list5.zad1;

import java.util.Random;

public class Table {
    private int[] table;

    public Table(int length) {
        this.table = new int[length];
    }

    public void setTable(int[] table) {
        this.table = table;
    }

    public void fillTable() {
        Random random = new Random();
        for (int i = 0; i < this.table.length; i++) {
            this.table[i] = random.nextInt();
        }
    }

    public int find(int number) {
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int number) {
        int count = 0;
        for (int val : this.table) {
            if (val == number) {
                count++;
            }
        }
        if (count == 0) {
            return;
        }
        int[] table = new int[this.table.length - count];
        for (int i = 0, k = 0; i < this.table.length; i++) {
            if (this.table[i] != number) {
                table[k++] = this.table[i];
            }
        }
        setTable(table);
    }


    public int get(int index) {
        return this.table[index];
    }

    public int getLast() {
        return this.table[table.length - 1];
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i : table) {
            output.append(i).append(", ");
        }
        return output.toString();
    }
}
