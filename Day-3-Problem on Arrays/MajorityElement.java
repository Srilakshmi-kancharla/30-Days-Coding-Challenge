class MajorityElement {
  public static int majorityElement (int arr[]){
    int ans = -1;
    int freq = 0;
    for(int i=0; i<arr.length; i++) {
      if(freq == 0) ans = arr[i];
      if(ans == arr[i]) freq++;
      else freq--;
    }
    return ans;
  }
  public static void main(String args[]) {
    int arr[] = {1, 2, 2, 1, 1};
    System.out.println(majorityElement(arr));
  }
}
