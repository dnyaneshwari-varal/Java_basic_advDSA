package Searching_Techniques;

import java.util.Scanner;

public class Binary_Search {

    public static boolean binarySearch(int arr[], int num) {

        int low = 0;
        int high = arr.length - 1;
    
        boolean ans=false;
        while(low<=high) {
        		int mid=(low+high)/2;
        		
        		if(arr[mid]==num) {
        			ans=true;
        			return ans;
        		}else if(num < arr[mid]){
        			high=mid-1;
        		}else {
        			low=mid+1;
        		}
        }

        return ans;                   
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];

        System.out.println("Enter 7 sorted elements:");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to find:");
        int toFind = sc.nextInt();

        boolean result = binarySearch(arr, toFind);

        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}