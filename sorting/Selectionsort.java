public class Selectionsort {
  public static void main(String[] arr) {


    // get the minimum element in the unsorted array and
    // swap it with the first element of the unsorted array. 
    // Repeat this process for the remaining unsorted array until the entire array is sorted.

    // Step 1: 13,46,24,52,20,9  find minimum element 9 and swap it with 13
    // Step 2: 9, 46,24,52,20,13  find minimum element 13 and swap it with 46
    // Step 3: 9,13, 24,52,20,46  find minimum element 20 and swap it with 24
    // Step 4: 9,13,20, 52,24,46  find minimum element 24 and swap it with 52   
    // Step 5: 9,13,20,24, 52,46  find minimum element 46 and swap it with 52


    int[] nums = {13,46,24,52,20,9};

    for(int i=0;i<nums.length-1;i++){
      int min = i;
      for(int j=i;j<nums.length;j++){
        if(nums[j] < nums[min]){
          min = j;
        }
      }
      // Swap the found minimum element with the first element
      int temp = nums[min];
      nums[min] = nums[i];
      nums[i] = temp;
    }
    
    System.out.println("Sorted array: ");
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }


    // Time Complexity: Best, Avg, & Worst Case: O(n^2)  where n is the number of elements in the array

    // when outer loop 0 inner loope runs n times
    // when outer loop is 1 inner loop runs n-1 times
    // when outer loop is 2 inner loop runs n-2 times
    // when outer loop is 3 inner loop runs n-3 times
    // ..... 
    // when outer loop is n-1 inner loop runs 1 times

    // n+(n-1)+(n-2)+(n-3)+...+1 = n(n-1)/2 = O(n^2)

  }
}