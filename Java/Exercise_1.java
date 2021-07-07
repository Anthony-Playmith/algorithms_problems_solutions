/*
Given an array of integers, write a function to move all 0's to the end while maintaining the relative order of the other elements
Example

Input: [0,1,0,3,12]

Expected output: [1,3,12,0,0]
*/


import java.util.Arrays;


class Exercise_1
{
    public static void reorder(int[] A) {

        int k = 0;

        for (int i: A){
            if (i != 0) {
                A[k++] = i;
            }
        }

        for (int i = k; i < A.length; i++) {
            A[i] = 0;
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 6, 6, 0, 2, 3, 0, 4, 0, 0, 4, 6, 21, 3 };

        reorder(A);
        System.out.println(Arrays.toString(A));
    }
}