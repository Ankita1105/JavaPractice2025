public class MethodOverloading {

    public static void main(String[] args) {
        calculateScore("tim",500);
        int score = calculateScore("tim" , 500);
        System.out.println("new score is "+score);
        System.out.println(calculateScore(10));
        calculateScore(75);
        calculateScore();
    }


    public static int calculateScore(String playerName,int score){
        System.out.println("Player " +playerName + " Scored " + score);
        return score*1000;
    }

    public static int calculateScore(int score){
        //System.out.println("Unknown Player "  + " Scored " + score);
        return calculateScore("Anonymous Player score" , score);
    }

    public static int calculateScore()
    {
        System.out.println("Unknown Player no player name");
        return 0;
    }

}
