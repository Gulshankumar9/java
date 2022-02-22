import java.util.Scanner;
import java.util.Arrays;
    class soln1 {
    public static void main(String[] args) {
    Medicine[] medicine = new Medicine[4];
    String search;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < medicine.length; i++) {
        String medicineName = sc.nextLine();
        String batchNo = sc.nextLine();
        String disease = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        medicine[i] = new Medicine(medicineName, batchNo, disease, price);

    }

    search = sc.nextLine();
    sc.close();
    Integer[] price = medicinePriceForGivenDisease(medicine, search);

    for(int i=0;i<price.length;i++) {
        System.out.println(price[i]);
    }
    }
    public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
    {
    //method logic
    //code to find price, sort and return the sorted array.
        Integer[] result = new Integer[0];
        for(int i=0;i<medicine.length;i++) {
            if(medicine[i].getDisease().equalsIgnoreCase(disease)) {
                result = Arrays.copyOf(result, result.length+1);//extra space created in array result 
                result[result.length-1] = medicine[i].getPrice();//Just before one space in the array 
                //the elements are stored in location-1 place
            }
            Arrays.sort(result);//sorting it in ascending order 
        }
        return result;
    }

}

class Medicine
{
//code to build Medicine class
    String medicineName;
    String batchNo;
    String disease;
    int price; 
    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batchNo = batch;
        this.disease = disease;
        this.price = price;
    }
    public String getDisease() {
        return disease;
    }
    public int getPrice() {
        return price;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getBatchNo() {
        return batchNo;
    }
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    

    
}
