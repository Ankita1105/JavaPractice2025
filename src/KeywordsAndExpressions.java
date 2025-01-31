public class KeywordsAndExpressions {
    public static void main(String[] args) {

       double kilometer =(100*1.60); // expression = kilometer =(100*1.60) & Statement = double kilometer =(100*1.60);
       int highScore =50;
       if(highScore>25)
       {
           highScore = 1000+highScore;

       }
       int health=100;
       if((health<25) && (highScore>1000))
    {
        highScore=highScore-1000;
    }

        System.out.println("HighScore :" +highScore);
    }

}
