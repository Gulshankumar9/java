import java.util.Scanner;

class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.close();
        int rem,rev=0,temp=x;
        while(temp>0){ 
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(rev);

    }


}