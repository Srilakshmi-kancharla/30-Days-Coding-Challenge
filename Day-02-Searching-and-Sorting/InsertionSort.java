class InsertionSort {
   public static void insertionSort(int arr[]) {
     for(int i=1; i<n; i++) {
       int item = arr[i];
       int j = i-1;
       while(j>=0 && arr[j] > item) {
         arr[j+1] = arr[j];
         j = j-1;
       }
       arr[j+1] = item;
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
    insertionSort(arr);
    System.out.println("After sorting: ");
    for(int element: arr) {
      System.out.print(element + " ");
    }
  }
}
