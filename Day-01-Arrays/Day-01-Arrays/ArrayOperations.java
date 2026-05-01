class Main {

  //------ Largest Element------
  public static int largestElemnt(int arr[]) {

    int largest = arr[0];
    for(int i=1; i <= arr.length-1; i++) {
        if(arr[i] > largest) {
          largest = arr[i];
        }
    }
    return largest;
  }

  // --------Smallest Element-----------
   public static int smallestElemnt(int arr[]) {

    int min = arr[0];
    for(int i=1; i <= arr.length-1; i++) {
        if(arr[i] < min) {
         min = arr[i];
        }
    }
    return min;
  }

   // ---------- Second largest-----------
  
    public static int secondLargest(int arr[]) {

      int max = arr[0];
      int secondMax = arr[0];
      for(int i=1; i <= arr.length-1; i++) {
         if(arr[i] > max) {
            secondMax = max;
            max = arr[i];
         } 
        else if(arr[i] > secondMax && arr[i] != max) {
          secondMax = arr[i];
        }
      }
      return secondMax;
    }

   //------------- Reverse Array -------------------------

  public static int[] reverse(int arr[]) {

    // creating an array that stores elements in reverse order...

     int reverseArr[] = new int[arr.length];
     int j=0;  
     for(int i = arr.length-1; i>=0; i--) {
       reverseArr[j] = arr[i];
       j++; 
     }
    return reverseArr;
  }

  // check Duplicates present or not ----> Return true or false

  public static boolean isDuplicated(int arr[]) {
    
     HashSet<Integer> seen = new HashSet<>();
     for(int i=0; i <= arr.length-1; i++) {
        if(seen.contains(arr[i]) {
          return true;
        }
        seen.add(arr[i]);
     }
    return false;
  }

  // ------ Check array is Sorted or not --> return true -> if Sorted else return false

  public static boolean isSorted(int arr[]) {
    
    for(int i=1; i<=arr.length-1; i++) {
      if(arr[i-1] > arr[i])  // we can also write arr[i] < arr[i-1] it checks that current element is smaller then array is not sorted.
      {
        return false;
      }
    }
    return true;
  }

  // --------------- linear search ----------------------

  public static int search(int arr[], int element) {
 
      for(int i=0; i<arr.length; i++) {
         if(arr[i] == element) {
           return i;
         }
      }
    return -1;
  }

  // Main method
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++) {
      arr[i] = scan.nextInt();
    }
     int searchElement = scan.nextInt();
    
    System.out.println("Maximum elemnt:" + largestElement(arr));
    System.out.println("Minimum elemnt:" + smallestElement(arr));
    System.out.println("Second largest:" +  secondLargest(arr));
    System.out.println("Reversed Array:" + reverse(arr));
    System.out.println("Duplicate Elements Presented :" + isDuplicated(arr));
    System.out.println("Array is sorted :" +isSorted(arr));
    System.out.println("Element presented at index :" + search(arr, searchElement));
  }
}

/* 
 n = 7
 arr = [1, 4, 5, 6, 8, 11, 47]
 searchElement = 8
 ----------------- OUTPUT : --------------------

  Maximum elemnt: 47
  Minimum elemnt: 1
  Second largest: 11
  Reversed Array: 947, 11, 8, 6, 5, 4, 1]
  Duplicate Elements Presented : false
  Array is sorted: true
  Element presented at index: 4
*/
 
