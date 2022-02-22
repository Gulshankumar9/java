import java.util.*;
class cid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hotel[] hotel=new Hotel[4];
        for(int i=0;i<hotel.length;i++){
            int hotelid=sc.nextInt();sc.nextLine();
            String hotelName=sc.nextLine();
            String date=sc.nextLine();
            int noOfRoomsBooked=sc.nextInt();sc.nextLine();
            String wifi=sc.nextLine();
            double bill=sc.nextDouble();sc.nextLine();
            hotel[i]=new Hotel(hotelid,date,hotelName,noOfRoomsBooked, wifi,bill);
        }
        String mon=sc.nextLine();
        String wifi=sc.nextLine();
        sc.close();
        int nos=noOfRoomsBookedInGivenMonth(hotel, mon);
        if(nos>0){
            System.out.println(nos);
        }else{
            System.out.println("No rooms booked in the given month");
        }
        Hotel r=searchHotelByWifiOption(hotel,wifi);
        if(r!=null){
            System.out.println(r.getHotelid());
        }else{
            System.out.println("No such option available");
        }

    }
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotel,String month){
        int r=0;
        for(Hotel re:hotel){
            if(re.getDateOfBooking().substring(3,6).equalsIgnoreCase(month)){
                r=r+re.getNoOfRoomsBooked();
            }
        }
        return r;

    }
    public static Hotel searchHotelByWifiOption(Hotel[] hotel,String wifi){
        int c=0,j=0;
        for(Hotel h:hotel){
            if(h.getWifiFacility().equalsIgnoreCase(wifi)){
                c=c+1;
            }
        }
        Hotel[] newHt= new Hotel[c];
        for(int i=0;i<hotel.length;i++){
            if(hotel[i].getWifiFacility().equalsIgnoreCase(wifi)){
                newHt[j]=hotel[i];
                j++;
            }
        }
        Hotel temp;
        for(int i=0;i<newHt.length;i++){
            for(int k=i+1;k<newHt.length;k++){
                if(newHt[i].getTotalbill()<newHt[k].getTotalbill()){
                    temp=newHt[i];
                    newHt[i]=newHt[k];
                    newHt[k]=temp;
                }
            }
        }
        if(c==0){
            return null;
        }else{
            return newHt[1];
        }

    }

}

class Hotel{
    int hotelid;
    String dateOfBooking;
    String hotelName;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalbill;
    public Hotel(int hotelid, String dateOfBooking, String hotelName, int noOfRoomsBooked, String wifiFacility,
            double totalbill) {
        this.hotelid = hotelid;
        this.dateOfBooking = dateOfBooking;
        this.hotelName = hotelName;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalbill = totalbill;
    }
    public int getHotelid() {
        return hotelid;
    }
    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }
    public String getDateOfBooking() {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public String getWifiFacility() {
        return wifiFacility;
    }
    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }
    public double getTotalbill() {
        return totalbill;
    }
    public void setTotalbill(double totalbill) {
        this.totalbill = totalbill;
    }
    
}