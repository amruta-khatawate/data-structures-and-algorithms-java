package sorting;

public class Bubblesort {
  public static void main(String[] arr) {

    // push the largest element to the end of the array by comparing adjacent elements 

    int[] nums = {13,46,24,52,20,9};

    for(int i=nums.length-1;i>=1;i--){
      boolean swapped = false;
      for(int j=0;j<i;j++){
        if(nums[j] > nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];  
          nums[j+1] = temp;
          swapped = true;
        }
      }
      if(!swapped) {
        break;      
      }
    }
    System.out.println("Sorted array: ");
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }

    // Time complexity: O(n^2) in Worst case and O(n) in Avg case
    // in Best case: O(n) let say i have sorted array 1,2,3,4,5,6 so in 1st iteration id no swapping happens then we can break the loop and return the sorted array.
  }
}
