import java.util.Scanner;

class LinearSearch {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int arr[] = new int[n];
  for(int i=0; i<=n-1; i++) {
     arr[i] = scan.nextInt();
  }
  int searchElement = scan.nextInt();
  for(int i=0; i<n; i++) {
    if(arr[i] == searchElement) {
      System.out.println("Element found at index: " + i);
      return;
    }
  }
  System.out.println("Element not found");
 }
}


/*
 n = 5
 arr = [14, 5, 7, 8, 2]
 searchElement = 7
 OUTPUT:
 Element found at index: 2
 searchElement = 10
 output: Element not found
*/ 
