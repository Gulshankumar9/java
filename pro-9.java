/* Create a Class Player with below attributes:

id - int
country - String
side - String
price - double

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - searchPlayerForMatch in Solution class.

This method will take a String parameter along with the other parameter as 
array of Player objects. The method will return array of Player where the 
String parameter appears 
in the side attribute (with case insensitive search).

This method should be called from main method and display the id of 
returned objects in ascending order. 

Before calling this method(searchPlayerForMatch) in the main method, 
use Scanner object to read values for four Player objects referring the 
attributes in the above sequence. 
then, read the value for search parameter. 
Next call the method searchPlayerForMatch, write the logic to sort the 
id in ascending order (in main method) and display the result. 

Consider below sample input and output:

Input:
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting

Output:
1
2 
*/

import java.util.*;
class Solution
{
    public static void main(String[] args){
        Player[] play = new Player[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            int a =sc.nextInt();sc.nextLine();
            String b =sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble();sc.nextLine();
            play[i]=new Player(a,b,c,d);
        }
        String search=sc.nextLine();
        sc.close();
        Player[] output = searchPlayerForMatch(search,play);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i].getId());
        }
    }
    public static Player[] searchPlayerForMatch(String input, Player[] players)
    {
        Player[] help = new Player[0];
        for(int i=0;i<players.length;i++){
            if(players[i].side.equalsIgnoreCase(input)){
                help=Arrays.copyOf(help,help.length+1);
                help[help.length-1]=players[i];
            }
        }
        for(int i=0;i<help.length-1;i++){
            for(int j=0;j<help.length-i-1;j++){
                if(help[j].id>help[j+1].id){
                    Player temp=help[j];
                    help[j]=help[j+1];
                    help[j+1]=temp;
                }

            }
        }
        if(help.length>0){
            return help;
        }
        return null;
    }
}


class Player{
     int id ;
     String country ;
     String side ;
     double price ;
    
    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}