package anonymousQuesSet;

import java.util.Stack;

/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Input: digits = [1,2,3]
Output: [1,2,4

Input: digits = [4,3,2,1]
Output: [4,3,2,2]

Input: digits = [9,9]
Output: [1,0,0]
 */
class PlusOne {
    public int[] plusOne(int[] digits) {

        if(digits[digits.length-1] < 9){
            digits[digits.length-1]++;
            return digits;
        }

        else{
            Stack<Integer> stack=new Stack();
            int carry=1;
            for(int i=digits.length-1 ;i>=0; i--){
                stack.push((digits[i]+carry)%10);
                carry= (digits[i]+carry)/10;
            }
            if (carry !=0)
                stack.push(carry);

            int newSize=stack.size();
            int[] newDigits= new int[newSize];

            for(int i=0;i<newSize;i++){
                newDigits[i]=stack.pop();
            }
            return newDigits;
        }
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1,2,3};
        int[] result = plusOne.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}