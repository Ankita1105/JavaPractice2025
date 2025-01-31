public class Challenge1IfChallenge {
    public static void main(String[] args) {

        boolean gameOver=true;
        int score=10000;
        int levelCompleted=5;
        int bonus=200;
        calcluateScore1(true, 10000, 8, 200);
        calcluateScore1(true, 800, 5, 100);
        System.out.println((calcluateScore(gameOver,score,levelCompleted,bonus)));
    }

    public static void calcluateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final Score  " + finalScore);
        }
    }

    public static int calcluateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;

    }


}