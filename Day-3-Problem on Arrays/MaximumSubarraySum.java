class MaximumSubarraySum {
  public static int maxSum(int arr[]) {
    int max_val = Integer.MIN_VALUE;
    int currentSum = 0;
    for(int i=0; i<arr.length; i++) {
      currentSum += arr[i];
      max_val = Math.max(currentSum, max_val);
      if(currentSum < 0) {
        currentSum = 0;
      }
    }
    return max_val;
  }
  public static void main(String args[]) {
    int arr[] = {5,8,-4,-12,7,4,-1,2};
    System.out.println(maxSum);
  }
}
