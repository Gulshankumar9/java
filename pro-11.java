import java.util.Arrays;
import java.util.Scanner;

class sevage
{

    public static void main(String[] args)
        {
        //code to read values
        //code to call required method
        //code to display the results
        Scanner s = new Scanner(System.in);
        Inventory[] obj1=new Inventory[4];
        for(int i=0;i<obj1.length;i++){
            String inventoryId =s.nextLine();
            int maximumQuantity =s.nextInt(); s.nextLine();
            int currentQuantity =s.nextInt(); s.nextLine();
            int threshold =s.nextInt();s.nextLine();
            obj1[i]=new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }
        int lim=s.nextInt();
        s.close();
        Inventory[] results=replenish(lim,obj1);
        for(int i=0;i<results.length;i++){
            if(results[i].getThreshold()>=75){
                System.out.println(results[i].getInventoryId() + " Critical Filling");
            
            }else if(results[i].getThreshold()>=50&&results[i].getThreshold()<=74){
                System.out.println(results[i].getInventoryId() + " Moderate Filling");
            }else{
                System.out.println(results[i].getInventoryId() + " Non-Critical Filling");
            }
        }
    }

    public static Inventory[] replenish(int limit, Inventory[] inventory)
        {
        //method logic
        Inventory[] temp=new Inventory[0];
        for(int i=0;i<inventory.length;i++){
            if(inventory[i].getThreshold()<=limit){
                temp=Arrays.copyOf(temp, temp.length+1);
                temp[temp.length-1]=inventory[i];
            }

        }
        return temp;
    }
}

class Inventory
    {
    //code to build Inventory class
    String inventoryId ;
    int maximumQuantity ; 
    int currentQuantity ; 
    int threshold ;
    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
    public String getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(String inventoryId) {
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