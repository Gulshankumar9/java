/* 
Create a class Flower with the below attributes:
flowerid-int
flowerType-String
state-String
price(per kg)-int

The above attributes should be  private. write getters and setters and parametrised constructors as required.
Create class solution with main method.
implement one static  method-findFlowerTypeByState in solution class.
findFlowerTypeByState method:
This method will take an array flower objects and a string value as input parameters.
The method will return  the type of Flower for the given  producing state(String parameter passed).if there is not Flower that matches with the above condition then the method should return null.
Note : flowerid is unique.
No two flower objects would have same price and state.
search should  be case insensitive.
The above mentioned static methods should be called from the main method.
For findFlowerTypeByState method - The main method should print the returned flowerType as it is ,if the retuned value is not null. if the retuned value is null, then it should print :Given state is not found"
Before calling these static methods in main method,use Scanner object to  read the values of four Flower objects referring attributes in the above mentionned attribute sequence.
Next, read the value for a string parameter for capturing Flower producing state.
Consider below sample input and output:
input1:
999
Yellow Flower
Karnataka
500
888
Red Flower
Andhra
800
666
Blue Flower
Tamilnadu
700
777
Green Flower
Kerala
900
Tamilnadu

Output:
BlueFlower
*/ 

import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Flower[] a=new Flower[4];
        for(int i=0;i<4;i++){
            int flowerid=sc.nextInt();sc.nextLine();
            String flowerType=sc.nextLine();
            String state=sc.nextLine();
            int price=sc.nextInt();
            a[i]=new Flower(flowerid,flowerType,state,price);
        }
        sc.nextLine();
        String stateGiven=sc.nextLine();
        sc.close();
        String type=findFlowerTypeByState(a,stateGiven);
        if(type!=null){
            System.out.println(type);
        }else{
            System.out.println("Given state is not found");

        }


    }
    public static String findFlowerTypeByState(Flower[] fl,String state){
        String ans=null;
        for(int i=0;i<fl.length;i++){
            if(fl[i].getState().equalsIgnoreCase(state)){
                ans=fl[i].getFlowerType();
            }

        }
        return ans;
    }
    
}

class Flower{
    private int flowerid;
    private String flowerType;
    private String state;
    private int price;
    
    public int getFlowerid() {
        return flowerid;
    }

    public void setFlowerid(int flowerid) {
        this.flowerid = flowerid;
    }

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        this.flowerType = flowerType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flower(int flowerid, String flowerType, String state, int price) {
        super();
        this.flowerid = flowerid;
        this.flowerType = flowerType;
        this.state = state;
        this.price = price;
    }
    
}