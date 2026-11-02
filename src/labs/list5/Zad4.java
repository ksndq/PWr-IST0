package labs.list5;

public class Zad4 {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 3, 2, 1};

        System.out.println(isTableSymmetrical(table));
    }


    public static boolean isTableSymmetrical(int[] table) {
        if (table == null) return false;

        int length = table.length;
        for (int i = 0; i < length / 2; i++) {
            if (table[i] != table[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
