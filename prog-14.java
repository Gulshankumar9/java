/*
Define two functions as given below.

1. validateScore: This function will validate a given number whether it is less than or equal to 100 and greater than 0. If these conditions are matched, function will return True, otherwise return False

2. findValidScores : This function will take a list of scores (numbers ) as input,and return a list of scores from the input list after validation . Use the method validateScore to validate scores in the input list. If the input list does not contain any valid score, function should return None.

Define the main section for the following:

1. Create a list of positive doubleegers by taking user inputs
To create the list, do the following:
a. First read the number of elements (doubleeger) you want to store in the list as input from user
b. Read a number as input and add to the list. Repeat this step for the number of elements to be stored in the list (considered in the first line of input)


2. Call the method findValidScores by passing the list created in podouble #1 as argument.

3. Prdouble a message Valid Scores = (excluding the quotes) followed by the list returned by the method findValidScores in the same line. If the method returns None, prdouble the message No valid score found. (excluding the quotes).


You can use/refer to the below sample input and output to verify your solution using ' Test against Custom Input ' option in Hackerrank. 

Sample Input description:
The first input is the number of elements to be added to the list.

The next set of inputs are the numbers to be added to the list one after another and is repeated for the number of elements given in the first line of input.
 
Check the sample input and output below.


Sample Input 1:
For example, if you want to create a list of 5 positive numbers with values 10,20 ,101,90 and 0
then the input should be read/given as follows:

5
10
20
101
90
0

And the output for the above set of input will be:

Valid Scores = [10, 20, 90]

Sample Input 2:
8
-100
101
0
.80
101
120
-75
0.78

Output:
No valid score found.

*/

import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double arr[]=new double[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextDouble();
        }
        sc.close();
        double [] res=findValidScores(arr,num);
        System.out.println("Valid Scores=");
        for(int i=0;i<res.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static boolean validateScore(double score){
        
        if(score>0&&score<100){
            
            return true;

        }
        return false;
    }
    public static double[] findValidScores(double[] arr,int leng){
        double valid[]=new double[leng];
        int j=0;
        for(int i=0;i<leng;i++){
            if(validateScore(arr[i])){
                valid[j]=arr[i];
                j++;

            }else{
                continue;
            }
        }
        return valid;
    }
}