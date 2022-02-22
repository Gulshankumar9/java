import java.util.Arrays;
import java.util.Scanner;

class sea
{

    public static void main(String[] args)
    {
        Sim[] cards = new Sim[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            int simId = sc.nextInt();sc.nextLine();
            String customerName = sc.nextLine();
            double balance = sc.nextDouble();
            double ratePerSecond = sc.nextDouble();sc.nextLine();
            String circle = sc.nextLine();

            cards[i] = new Sim(simId,customerName, balance,ratePerSecond, circle);
        }

        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();
        sc.close();

        Sim[] result = transferCustomerCircle(cards, circle1, circle2);

        for(Sim s: result)
        System.out.println(s.getSimId()+" "+s.getCustomerName()+" "
        +s.getCircle() + " " + s.getRatePerSecond());

    }

    public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2)
    {
    //method logic
        Sim[] refined = new Sim[0];
        for(int i=0;i<5;i++){
            if(cards[i].getCircle().equals(circle1)){//if the frst sim circle is equals 1 circle 
                refined=Arrays.copyOf(refined,refined.length+1);//make space
                refined[refined.length-1]=cards[i];
                refined[refined.length-1].setCircle(circle2);
            }
        }
        for(int i=0;i<refined.length-1;i++){
        for(int j=0;j<refined.length-1-i;j++){
            if(refined[j].getRatePerSecond()<refined[j+1].getRatePerSecond())
            {
                Sim temp=refined[j];
                refined[j]=refined[j+1];
                refined[j+1]=temp; 
            }             
        }
        }
        return refined;

    }
}

class Sim
{
//code to build Sim class
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;
    public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
        this.simId = simId;
        this.customerName = customerName;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public int getSimId() {
        return simId;
    }
    public void setSimId(int simId) {
        this.simId = simId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getRatePerSecond() {
        return ratePerSecond;
    }
    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }
    

}
