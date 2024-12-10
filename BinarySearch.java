import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of  array");
        for (int i = 0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("enter the data to search");
        int data = scn.nextInt();
        int low =0;
        int high = arr.length-1;
        int mid;

        while(low<high){
            mid = (high-low)/2+low;
            if(arr[mid]==data)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>data){
                high = high -1;
            }
            else{
                low = low +1;
            }
        }
    }
}
