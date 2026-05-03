import java.util.*;
class MergeSort {
  public static void merge(int arr[], int start, int mid, int end) {
      ArrayList<Integer> list = new ArrayList<>();
      int i=start;
      int j = mid+1;
      while(i<=mid && j<=end) {
        if(arr[i] < arr[j]) {
           list.add(arr[i]);
           i++;
        }
        else {
          list.add(arr[j]);
          j++;
        }
      }
    while(i<=mid) {
       list.add(arr[i]);
           i++;
    }
    while(j <= end) {
      list.add(arr[j]);
      j++;
    }
    for(int idx = 0; idx < list.size(); idx++) {
       arr[idx + start] = list.get(idx);
    }
  }
  public static void mergeSort(int arr[], int start, int end) {
     if(start < end) {
       int mid = start + (end-start) / 2;
       mergeSort(arr, start, mid);
       mergeSort(arr, mid+1, end);
       merge(arr, start, mid, end);
     }
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = scan.nextInt();
    }
    mergeSort(arr, 0, n-1);
    for(int val: arr) {
      System.out.print(val + " ");
    }
  }
}
