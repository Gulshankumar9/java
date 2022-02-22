/*
Write a main method in the solution class.
In the main method, read five values for an integer array and on integer value. The main method should print the  number of occureances of the 
specified integer value in the integer array only if it is a odd number, else it should print "NA".for example, if the array of integers is 3,2,3,4,1 
and the integer value passed is 3  then,the 3 occurs twice and 3 is also an odd number so output should be printed as 2.the output should be in the 
format as shown in the sample output.
sample input1:
3
2
3
4
1
3
output:
2
Smaple input2:
2
2
3
4
1
2
output:
NA
*/ 
import java.util.Scanner;

class makar {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();

        }
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0)
            if(array[i]==num){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println(count);

        }else{
            System.out.println("NA");
        }
        sc.close();
    }
    
}
