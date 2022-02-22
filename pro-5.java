import java.util.*;
class sol
{
  public static void main(String[] args)
  {
    Scanner ab=new Scanner(System.in);
    
    String word=ab.nextLine();
    int i=0;
    
    char smaller='u';
    ab.close();
    for(i=0;i<word.length();i++)
    {
      char ch=word.charAt(i);
      
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        if(ch<=smaller)
        {
          
          smaller=ch;
        }
      }
    }
    
    System.out.print(smaller);
    
    
  }
}