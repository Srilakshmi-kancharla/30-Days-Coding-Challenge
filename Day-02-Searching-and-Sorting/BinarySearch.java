import java.util.Scanner;
class BinarySearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // INPUTS 
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<=n-1; i++) {
      arr[i] = scan.nextInt();
    }
    int searchElement = scan.nextInt();
    
    // binarysearch logic -> element are in sorting order.
    int left = 0;
    int right = n-1;
    while(left <= right) {
      int mid = (left + right) / 2;
      if(arr[mid] == searchElement) {
        System.out.println("Element found at index: " + mid);
        return;
      } 
      else if(arr[mid] < searchElement) {
        left++;
      } 
      else {
        right--;
      }
    }
    System.out.println("Element is not found");
  }
}

/*
 n = 7
 arr = [1, 5, 7, 10, 15, 19, 25]
 searchElement = 10
 output : 
 Element found at index: 3
 searchElement = 29
 output:
 Element is not found
*/



