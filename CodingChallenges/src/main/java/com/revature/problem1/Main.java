package main.java.com.revature.problem1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
//        s.hello();
        // [1,2,3,4,5,6]
        int[] arr = {2,4,6,8,10,12,14,16};
        int n = 3;
        System.out.println(Arrays.toString(s.reverse(arr,n)));
    }
}
