package InterviewPractice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        
        int n;
        int sum = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
