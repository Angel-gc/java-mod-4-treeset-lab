import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        // your code here
        TreeSet<Integer> tree = new TreeSet<>();
        for(int num: nums){
            tree.add(num);
        };
        System.out.println(tree);
        SortedSet<Integer> sortedList = tree.tailSet(25);
        ArrayList<Integer> finalList = new ArrayList<>(sortedList);

        return finalList;

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int num: nums){
//            list.add(num);
//        }
//        list.removeIf(integer -> (integer < 25));
//        return list;

    }
}