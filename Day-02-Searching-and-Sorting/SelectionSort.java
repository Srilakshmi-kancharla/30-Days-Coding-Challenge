class SelectionSort {
   public static void selectionSort(int arr[]) {
     for(int i = 0; i<n-1; i++) {
       int min = arr[i];
       int pos = i;
       for(int j = i+1; j<n; j++) {
         if(arr[j] < min) {
           min = arr[j];
           pos = j;
         }
       }
       int temp = arr[i];
       arr[i] = arr[pos];
       arr[pos] = temp;
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
    SelectionSort(arr);
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
