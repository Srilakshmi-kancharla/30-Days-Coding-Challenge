import java.util.Scanner;
class Main {
    public static int partition(int arr[], int start, int end) {
        int idx = -1;
        int pivot = arr[end];
        for(int j=0; j<end; j++) {
            if(arr[j] <= pivot) {
                idx++;
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }
        idx++;
        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
    public static void quickSort(int arr[], int start, int end) {
        if(start < end) {
            int pivIdx = partition(arr, start, end);
            quickSort(arr, start, pivIdx-1);
            quickSort(arr, pivIdx+1, end);
        }
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++) {
           arr[i] = scan.nextInt();
       }
       quickSort(arr, 0, arr.length-1);
       for(int val: arr) {
           System.out.print(val + " ");
       }
       
    }
}
