package InterviewPractice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
int rem=0,rev=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbrer");
        int n=sc.nextInt();
int n1= n;
while(n>0){
    rem=n%10;
    rev=rem+10*rev;
    n=n/10;
}
if(rev==n1){
    System.out.println("number is [laindromw");
}else{
    System.out.println("no");
}
    }
}
