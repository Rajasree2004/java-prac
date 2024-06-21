class palind{
    public static void main(String args[]){
        int r, sum = 0, temp;
        int n = 454;

        temp = n;
        while(n > 0){
            r % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if(temp == sum)
            System.out.println(temp + " is a palindrome");
        else
            System.out.println(temp + " is not a palindrome");
    }
}

//another way

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        String ori, rev = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        ori = in.nextLine();
        int len = ori.length();
        for(int i = len - 1; i >= 0; i--){
            rev = rev + ori.charAt(i);
        }
        if(ori.equals(reverse)){
            System.out.println(ori + " is a palindrome");
        }
        else{
            System.out.println(ori + " is not a palindrome");
        }
    }
}