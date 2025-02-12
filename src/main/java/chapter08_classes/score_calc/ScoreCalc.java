package chapter08_classes.score_calc;

public class ScoreCalc {
    public double addScores(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

    public double calculateAvg(double totalScore, int numOfSubjects) {
        return totalScore / numOfSubjects;
    }

}
