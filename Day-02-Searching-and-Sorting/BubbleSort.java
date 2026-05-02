import java.util.Scanner;
class BubbleSort {
  public static void bubbleSort(int arr[]) {
    // sorting logic---------->
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-i-1; j++) {
        if(arr[j] > arr[j+1]) // comparing with next Element
        {
          // swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n]; 
    for(int i=0; i<n; i++) {
      arr[i] = scan.nextInt(); 
    }
    System.out.println("Before Sorting: ");
    for(int element: arr) {
      System.out.print(element + " ");
    }
    bubbleSort(arr);
    System.out.println("After sorting: ");
    for(int element: arr) {
      System.out.print(element + " ");
    }
  }
}

/*
n = 7
arr = [100, 50, 150, 25, 75, 125, 175]
output:
Before sorting:
100 50 150 25 75 125 175
After sorting:
25 50 75 100 125 150 175
*/


