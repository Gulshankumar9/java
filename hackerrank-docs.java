/*Find the smallest letter from the string*/
import java.util.*;

class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int i=0;
        char max='z';
        sc.close();
        for(i=0;i<word.length();i++){
            if(word.charAt(i)<max){
                max=word.charAt(i);
            }
        }
        System.out.println(max);
    }
}