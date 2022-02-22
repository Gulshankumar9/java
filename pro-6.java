import java.util.*;
class bike {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String c="" ;
        sc.close();
        for(int i=0;i<word.length();i+=2) {
            c=c+word.charAt(i);
        }
        System.out.println(c);
    }
}
