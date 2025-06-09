import java.util.ArrayList;

public class UnionArray {

    public static ArrayList<Integer> unionArray(int[] a1, int[] a2) {
        if (a1 == null || a2 == null)
            return new ArrayList<Integer>();

        if (a1.length < 1 || a2.length < 1)
            return new ArrayList<Integer>();

        int n1 = a1.length;
        int n2 = a2.length;
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (p1 < n1 && p2 < n2) {
            if (a1[p1] <= a2[p2]) {
                if (res.size() == 0 || res.get(res.size() - 1) != a1[p1])
                    res.add(a1[p1]);
                p1++;
            } else {
                if (res.size() == 0 || res.get(res.size() - 1) != a2[p2])
                    res.add(a2[p2]);
                p2++;
            }
        }

        while (p1 < n1) {
            if (res.get(res.size() - 1) != a1[p1])
                res.add(a1[p1]);
            p1++;
        }

        while (p2 < n2) {
            if (res.get(res.size() - 1) != a2[p2])
                res.add(a2[p2]);
            p2++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        ArrayList<Integer> union = unionArray(arr1, arr2);

        for (int u : union) {
            System.out.println(u);
        }
    }
}