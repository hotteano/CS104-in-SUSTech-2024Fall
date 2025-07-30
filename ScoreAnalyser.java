import java.util.Arrays;

public class ScoreAnalyser {
    public static boolean isValid(double score)
    {
        return score>=0 && score <=100;
    }
    public static boolean isValid(double score,int min, int max) {
        return score>=min && score<=max;
    }
    public static double[] filterInvalidScores(double[] scores){
        double[] score = new double[scores.length];
        int top=0;
        for(int i=0;i<scores.length;i++){
            if(isValid(scores[i])){
                score[top]=scores[i];
                top++;
            }
        }
        double[] s=new double[top];
        for(int i=0;i<top;i++){
           s[i]=score[i];
        }
        return s;
    }
    public static double findMaxScore(double[] score){
        double max=score[0];
        for(int i=0;i<score.length;i++){
            max=Math.max(max,score[i]);
        }
        return max;
    }
    public static double findMinScore(double[] score){
        double min=score[0];
        for(int i=0;i<score.length;i++){
            min=Math.min(min,score[i]);
        }
        return min;
    }
    public static double calculateFinalAverage(double[] score){
        double sum=0;
        double[] s=filterInvalidScores(score);
        double MAX=findMaxScore(s);
        double MIN=findMinScore(s);
        for(int i=0;i<s.length;i++){
            if(s[i]!=MAX && s[i]!=MIN)
            {
                sum+=s[i];
            }
        }
        return sum/(s.length-2);
    }
    public static void main(String[] args) {
        double[] scores = {-5, 89.5, 67.3, 22.4, 67.8, 90.2, 75.5, -1, 99};
        double[] validScores = filterInvalidScores(scores);
        System.out.println(Arrays.toString(validScores));
        System.out.println("max in valid scores = " +
                findMaxScore(validScores));
        System.out.println("min in valid scores = " +
                findMinScore(validScores));
        System.out.println("max in all scores = " + findMaxScore(scores));
        System.out.println("min in all scores = " + findMinScore(scores));
        System.out.println("Average = "+ calculateFinalAverage(scores));
        System.out.println(isValid(90));
        System.out.println(isValid(110));
        System.out.println(isValid(90,10,80));
        System.out.println(isValid(105,0,120));
    }
}
