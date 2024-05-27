import java.util.ArrayList;

public class ArrayListExp {
    static ArrayList<Integer> multiply(ArrayList<Integer> arr) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            arr2.add(arr.get(i) * 2);
        }
        return arr2;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.print(arr1);
        arr2 = multiply(arr1);
        System.out.print(arr2);

    }
}