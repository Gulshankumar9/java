import java.util.*;
class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a,b=0,temp=x;
        sc.close();
        while(temp>0) {
            a=temp%10;
            b+=a;
            temp=temp/10;

        
        }
        if(b%3==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}