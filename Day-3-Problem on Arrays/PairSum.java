class PairSum {
  public static int[] pairSum(int arr[], int target) {
    int left = 0;
    int right = arr.length-1;
    while(left < right) {
      if(arr[left] + arr[right] == target) {
        return new int[] {i, j};
      } else if(arr[left] + arr[right] > target) {
        right--;
      } else{
        left++;
    }
  }
    return new int[] {-1,-1};
}
  public static void main(String args[]) {
    int arr[] = {2, 7, 11, 15};
    int target = 9;
    int ans[] = pairSum(arr, target);
    for(int val: ans) {
      System.out.print(val + " ");
    }
  }
}
