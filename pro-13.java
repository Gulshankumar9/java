


import java.util.Scanner;
class arse
    {
    public static void main(String[] args)
    {
    //code to read values

    //code to call required method

    //code to display the result
    Scanner s = new Scanner(System.in);
    Bill[] obj = new Bill[4];
    for (int i = 0; i <obj.length; i++){
        int billNo=s.nextInt();s.nextLine();
        String name=s.nextLine();
        String typeofConnection=s.nextLine();
        double billAmount=s.nextDouble();s.nextLine();
        boolean status=s.nextBoolean();
        obj[i]=new Bill(billNo, name, typeofConnection, billAmount, status);
    }
    s.close();
    /*String typeofC=s.nextLine();
    boolean status=s.nextBoolean();
    s.close();
*/



    }

    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] obj,boolean status) {

    //method logic
        Bill[] temp=null;
        int billamt=0;
        for(int i=0; i<obj.length;i++){
            if(obj[i].getBillAmount()>billamt){
                
            }
        }
        return temp;
    }
    public static int getCountWithTypeOfConnection(Bill[] obj,String typeofC) {

    //method logic
    return 0;
    }
}
class Bill
    {
    //code to build the class
    private int billNo;
    private String name;
    private String typeofConnection;
    private double billAmount;
    private boolean status;
    
    public Bill(int billNo, String name, String typeofConnection, double billAmount, boolean status) {
        this.billNo = billNo;
        this.name = name;
        this.typeofConnection = typeofConnection;
        this.billAmount = billAmount;
        this.status = status;
    }
    public int getBillNo() {
        return billNo;
    }
    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypeofConnection() {
        return typeofConnection;
    }
    public void setTypeofConnection(String typeofConnection) {
        this.typeofConnection = typeofConnection;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    


}