import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        s.close();
        int vowelCount = 0, consonantCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                    vowelCount += 1;
                else
                    consonantCount += 1;
            }
        }
        System.out.println("Vowels count - "+vowelCount);
        System.out.println("Consonant Count - "+consonantCount);
    }
}