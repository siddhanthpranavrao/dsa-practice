import java.util.ArrayList;

public class UnionArray {

    public static ArrayList<Integer> unionArray(int[] a1, int[] a2) {
        // Use the two pointer method
        int p1 = 0; int p2 = 0;
        // Create the final union Array List
        ArrayList<Integer> union = new ArrayList<>();
        int n1 = a1.length; int n2 = a2.length;

        // Loop over until one of them hits the boundary of the array
        while (p1 < n1 && p2 < n2) {
            // if <= add from first array
            if (a1[p1] <= a2[p2]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a1[p1])
                    union.add(a1[p1]);
                p1++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != a2[p2])
                    union.add(a2[p2]);
                p2++;
            }
        }

        while (p1 < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != a1[p1])
                union.add(a1[p1]);
            p1++;
        }

        while (p2 < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != a2[p2])
                union.add(a2[p2]);
            p2++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3};
        int[] arr2 = {2, 2, 3, 3, 4};
        ArrayList<Integer> union = unionArray(arr1, arr2);


        for (int u : union) {
            System.out.println(u);
        }
    }
}