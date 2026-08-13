package Basic_Code;



public class MissingNumber {

    public static int findMissingNumber(int[] arr) {

        int n = arr.length + 1;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return total - sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7};

        int ans = findMissingNumber(arr);

        System.out.println("Missing number = " + ans);
    }
}