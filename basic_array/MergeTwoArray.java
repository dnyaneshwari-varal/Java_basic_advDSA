package Basic_Code;

public class MergeTwoArray {

    public static int[] mergeArray(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];

        for (int i = 0; i < arr.length; i++) {

            if (i < a.length) {
                arr[i] = a[i];
            } else {
                arr[i] = b[i-a.length];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] result = mergeArray(a, b);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}