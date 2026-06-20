import java.util.Scanner;
class Solution{
    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        int original = x;
        int reverse = 0;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x = x/10;
        }
        return original == reverse;
    }
}

public class ans1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        Solution obj = new Solution();
        System.out.println("Output: " + obj.isPalindrome(x));
        sc.close();
    }
}