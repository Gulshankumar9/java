///dec5 ipa 
import java.util.Scanner;
class sul{
    public static void main(String[] args) {
        Laptop[] laptops=new Laptop[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<laptops.length;i++){
            int laptopid=sc.nextInt();
            sc.nextLine();
            String brand=sc.nextLine();
            String osType=sc.nextLine();
            double price=sc.nextDouble();
            int rating=sc.nextInt();
            sc.nextLine();
            laptops[i]=new Laptop(laptopid,brand, osType, price,rating);
        }
        String brand =sc.nextLine();
        String os=sc.nextLine();
        sc.close();
        int count=countofLaptopsByBrand(laptops,brand);
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("The given brand is not available");
        }
        Laptop[] lptp=searchLaptopsByOsType(laptops,os);
        if(lptp!=null){
            for(int i=0;i<lptp.length;i++){
                if(lptp!=null){
                    System.out.println(lptp[i].getLaptopid());
                    System.out.println(lptp[i].getRating());
                }

            }
        }else{
            System.out.println("The given os is not available");

        }
    }
    public static int countofLaptopsByBrand(Laptop[] laptops,String brand){
        int count=0;
        int flag=0;
        for(int i=0;i<laptops.length;i++){
            if(laptops[i].getBrand().equalsIgnoreCase(brand)&&laptops[i].getRating()>3){
                count++;
                flag=1;

            }
        }
        if(flag==1){
            return count;

        }
        return 0;
    }
    public static Laptop[] searchLaptopsByOsType(Laptop[] laptops,String os){
        Laptop[] laptoparr=null;
        Laptop tmpArr=null;
        int count=0;
        for(Laptop d1:laptops){
            if(d1.getOsType().toLowerCase().contains(os.toLowerCase())){
                count++;
            }

            if(count>0){
                laptoparr=new Laptop[count];
                count=0;
                for(Laptop d:laptops){
                    if(d.getOsType().toLowerCase().contains(os.toLowerCase())){
                        laptoparr[count++]=d;
                    }
                }
                for(int i=0;i<laptoparr.length-1;i++){
                    for(int j=i+1;j<laptoparr.length;j++){
                        tmpArr=laptoparr[i];
                        laptoparr[i]=laptoparr[j];
                        laptoparr[j]=tmpArr;
                    }
                }
            }
        }
        return laptoparr;
    }
}
class Laptop{
    private int laptopid;
    private String brand;
    private String osType;
    private double price;
    private int rating;
    public int getLaptopid() {
        return laptopid;
    }
    public void setLaptopid(int laptopid) {
        this.laptopid = laptopid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getOsType() {
        return osType;
    }
    public void setOsType(String osType) {
        this.osType = osType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public Laptop(int laptopid, String brand, String osType, double price, int rating) {
        this.laptopid = laptopid;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }
    
}