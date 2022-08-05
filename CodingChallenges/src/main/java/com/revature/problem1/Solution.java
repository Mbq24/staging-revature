package main.java.com.revature.problem1;

public class Solution {
    /*
    * Create a function that takes an array and a number and selectively reverse the order of the array based on the number
    * you're given (second argument). If you're given the arguments [1,2,3,4,5,6] and 2, you would return the array [2,1, 4,3, 6,5].*/
    void hello() {
        System.out.println("hello");
    }
    public int[] reverse(int[] arr, int n) {
        // if length is zero, return arr
        if(arr.length < 1) return arr;

        // if length exceeds arr length, reverse everything
        int[] reversedArr = new int[arr.length];
        if(n > arr.length) {
            int j=0;
            for(int i=arr.length-1; i>=0; i--){
                reversedArr[j] = arr[i];
                j++;
            }
        }
        else {
            int i =0;
            while(i<arr.length){
                int stepper = i+n;
                if(stepper >= arr.length) { // check if stepper outside array bounds
                    stepper = arr.length;
                }

                // loop that does reverse
                for(int j=0; j<n; j++) {
                    if(i+j > arr.length-1) break; // exceeds array length, have to break out

                    reversedArr[j+i] = arr[stepper-j-1]; // replaces first element of rev arr with last elem of arr
                }
                i++;
                i += n-1;
            }
        }
        return reversedArr;

    }
}
