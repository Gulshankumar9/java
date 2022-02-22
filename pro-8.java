import java.util.*;
class sev
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int target;
        Player[] player=new Player[4];
        for(int i=0;i<player.length;i++){
            int playerId=sc.nextInt();
            String playerName=sc.next();
            int iccRank=sc.nextInt();
            int noOfMatchesPlayed=sc.nextInt();
            int totalRunsScored=sc.nextInt();
            sc.nextLine();
            player[i]= new Player(playerId,playerName,iccRank,noOfMatchesPlayed,totalRunsScored);

        }
        target=sc.nextInt();
        sc.close();
        double [] averageRunRate = findAverageScoreOfPlayers(player,target);

            for(int i = 0;i < averageRunRate.length;i++){
                if(averageRunRate[i] >= 80 )
                    System.out.println("Grade A Player");
                else if(averageRunRate[i] >= 50 && averageRunRate[i] <= 79)
                    System.out.println("Grade B Player");
                else
                    System.out.println("Grade C Player");
            }

    }

    private static double[] findAverageScoreOfPlayers(Player[] player, int totalMatches) {
        double averageRunRate[]= new double[0];
        for(int i = 0;i < player.length;i++){
            if(player[i].getMatchesPlayed() >= totalMatches){
                averageRunRate = Arrays.copyOf(averageRunRate, averageRunRate.length+1);
                averageRunRate[averageRunRate.length-1] = (double)(player[i].getRunsScored()/player[i].getMatchesPlayed());
            }
        }
        return averageRunRate;
    }

    }


class Player
{
    //code to build player class
        int playerId;
        String playerName;
        int iccRank;
        int noOfMatchesPlayed;
        int totalRunsScored;
        public Player(int playerId,String playerName,int iccRank,int noOfMatchesPlayed,int totalRunsScored){
            this.playerId = playerId;
            this.playerName = playerName;
            this.iccRank = iccRank;
            this.noOfMatchesPlayed = noOfMatchesPlayed;
            this.totalRunsScored = totalRunsScored;
        }
        public int getMatchesPlayed(){
            return noOfMatchesPlayed;
        }
        public int getRunsScored(){
            return totalRunsScored;
        }
        public int getPlayerId() {
            return playerId;
        }
        public void setPlayerId(int playerId) {
            this.playerId = playerId;
        }
        public String getPlayerName() {
            return playerName;
        }
        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }
        public int getIccRank() {
            return iccRank;
        }
        public void setIccRank(int iccRank) {
            this.iccRank = iccRank;
        }
        public int getNoOfMatchesPlayed() {
            return noOfMatchesPlayed;
        }
        public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
            this.noOfMatchesPlayed = noOfMatchesPlayed;
        }
        public int getTotalRunsScored() {
            return totalRunsScored;
        }
        public void setTotalRunsScored(int totalRunsScored) {
            this.totalRunsScored = totalRunsScored;
        }
}