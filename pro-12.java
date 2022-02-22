/* Create a class called Student with the below attributes:

rollNo - int
name - String
branch - String
score – double
dayScholar - boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods -findCountOfDayscholarStudents  and findStudentwithSecondHighestScore in Solution class.

findCountOfDayscholarStudents:

This method will take an array of Student objects as an input parameter . This method will calculate and return the count of Students whose score is greater than 80 and who are all from dayScholar.

If no Student scored greater than 80 and from dayScholar are present in the array of Student objects, then the method should return 0.

findStudentwithSecondHighestScore:

This method will take an array of Student objects as an input parameter. This method will return the object of the second highest score student from the array of Student objects who are not from the dayScholar.

If no Student is a dayScholar  in the array of Student objects, then the method should return null.

Note : All the searches should be case insensitive.

           The combination of dayScholar and score for each student is always unique.

The above mentioned static methods should be called from the main method.

For findCountOfDayscholarStudents method - The main method should print the returned count as it is if the returned value is greater than 0, else it should print "There are no such dayscholar student".

For findStudentwithSecondHighestScore method - The main method should print the rollNo, name and score in the below format from the returned object if the retuned value is not null.

rollNo#name#score

If the returned value is null, then it should print There are no student from non day scholar

Before calling these static methods in main, use Scanner object to read the values of four Student objects referring attributes in the above mentioned attribute sequence. 
Consider below sample input and output:

Input:

1001
Ashwa
IT
85
true
1002
Preeti
IT
70
false
1003
Uma
ECE
85
false
1004
Akash
EEE
90
true


Output:
2
1002#Preeti#70.0
--------------------------------------------------
Sample code snippet for reference:
Please use below code to build your solution.
--------------------------------------------------

import java.util.Scanner;
public class Solution
{
public static void main(String[] args)
{
//code to read values
//code to call required method
//code to display the result
}
public static int findCountOfDayscholarStudents( required parameters to be added )
{

//method logic

}

public static Student findStudentwithSecondHighestScore( required parameters to be added )

{

//method logic

}

}

class Student

{

//code to build the class

}
-------------------------------------------------
Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
1001
Savings

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value Savings.Instead it may be "".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

*/



import java.util.Arrays;
import java.util.Scanner;
class art
    {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] obj=new Student[4];
        for (int i=0; i<obj.length; i++){
            int rollNo=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            String branch=sc.nextLine();
            double score=sc.nextDouble();sc.nextLine();
            boolean dayScholar=sc.nextBoolean();
            obj[i]=new Student(rollNo, name,branch,score,dayScholar);
        }
        sc.close();
        int res=findCountOfDayscholarStudents(obj);
        if(res==0){
            System.out.println("There are no such dayscholar student");
        }
        else{
            System.out.println(res);

        }
        Student ans2 = findStudentwithSecondHighestScore(obj);

        if(ans2==null)

        {

            System.out.println("There are no student from non day scholar");

        }

        else

        {

            System.out.println(ans2.getRollNo()+"#"+ans2.getName()+"#"+ans2.getScore());

        }
    }
    public static int findCountOfDayscholarStudents(Student[] student)
    {
        int count=0;
        for(int i=0;i<student.length;i++){
            if(student[i].getScore()>80 && student[i].isDayScholar()){ 
                count++;
            }
        }
        return count;
    }

    public static Student findStudentwithSecondHighestScore(Student[] student )

    {
        
        double[] arr=new double[0];
        for (int i = 0; i <student.length ; i++) {
            if(student[i].isDayScholar()==false)
            {
               arr= Arrays.copyOf(arr,arr.length+1);
               arr[arr.length-1]=student[i].getScore();
            }
        }
        Arrays.sort(arr);
      double shs= arr[arr.length-2];
        for (int i = 0; i <student.length ; i++) {
           if(student[i].getScore()==shs)
           {
               return student[i];
           }
        }
        return null;
    }
    
}

class Student{

    int rollNo;
    String name;
    String branch;
    double score;
    boolean dayScholar;
    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public boolean isDayScholar() {
        return dayScholar;
    }
    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }  
}