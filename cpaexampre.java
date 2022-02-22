/*Create a Class Inventory with below attributes
inventoryId - int 
maximumQuantity - int 
currentQuantity - int 
threshold - int 
Write getters, setters and parameterized constructor as required.
Create class Solution with main method. 

Implement static method - replenish in Solution class. 
This method will take an int parameter named limit along with the other 
parameter as array of Inventory objects. The method will return array of 
Inventory where the threshold attribute is less than or equal to the int 
parameter passed. 
This method should be called from main method and display the id of 
returned objects along with Filling status. 

if the threshold is greater than or equal to 75 then it should print
"Critical Filling" as Filling Status. If the threshold is between 74 to 50
then Filling status should be "Moderate filling". 
Before calling this method(replenish) in the main method, use Scanner 
object to read values for four Inventory objects referring the attributes 
in the above sequence. 

then, read the value for limit parameter. 
Next call the method replenish and display the result. 
Consider below sample input and output: 
Input:
1
100
50
40
2
100
50
50
*/

import java.util.*;
class sol{
    public static void main(String[] args) {
        Inventory[] inventory=new Inventory[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<inventory.length;i++){
            int inventoryId=sc.nextInt();
            sc.nextLine();
            int maximumQuantity=sc.nextInt();
            int currentQuantity=sc.nextInt();
            int threshold=sc.nextInt();
            sc.nextLine();
            inventory[i]=new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }
        int limit=sc.nextInt();
        sc.close();
        Inventory[] newinventory=replenish(inventory,limit);
        for(int i=0;i<newinventory.length;i++){
            if(newinventory[i].getThreshold()>=75){
                System.out.println(newinventory[i].getinventoryId()+"Critical filling");

            }else if(newinventory[i].getThreshold()<=74&&newinventory[i].getThreshold()>=50){
                System.out.println(newinventory[i].getThreshold()+"Moderate Filling");


            }else{
                System.out.println(newinventory[i].getThreshold()+"High Filling");
            }
        }
    }
    public static Inventory[] replenish(Inventory[] inventory, int limit){
        int count=0;
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                count++;
            }
        }
        int index=0;
        Inventory[] newinventory=new Inventory[count];
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                newinventory[index]=inventory[i];
                index++;
            }
        }
        return newinventory;
    }
}
class Inventory{
    private int inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;
    public Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
    public int getinventoryId() {
        return inventoryId;
    }
    public void setinventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    public int getMaximumQuantity() {
        return maximumQuantity;
    }
    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }
    public int getCurrentQuantity() {
        return currentQuantity;
    }
    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
    public int getThreshold() {
        return threshold;
    }
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

