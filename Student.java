public class Student {
    private static int count=0;
    private int studentId;
    private int groupSize;
    private char groupNumber;
    private int groupScore;
    private double personalScore;
    private int rate;
    public Student(int groupScore, int rate, char groupNumber) {
        this.groupScore = groupScore;
        this.rate = rate;
        this.groupNumber = groupNumber;
        count++;
        this.studentId = count;
    }
    public Student(int groupScore, int rate, int groupSize) {
        this.groupScore=groupScore;
        this.rate = rate;
        this.groupSize = groupSize;
        count++;
        this.studentId = count;
    }
    public static double calculatePersonalScore(int groupScore,int rate, int groupSize)
    {
        switch(groupSize) {
            case 2:
                if(rate>=0&&rate<=5) {
                    return groupScore*0.2;
                }
                else if(rate>5&&rate<=10) {
                    double lrate=(rate-5)*4+20;
                    return groupScore*lrate/100;
                }
                else if(rate>10&&rate<=30) {
                    double lrate=(rate-10)*2+40;
                    return groupScore*lrate/100;
                }
                else if(rate>30&&rate<=50) {
                    double lrate=(rate-30)+80;
                    return groupScore*lrate/100;
                }
                else if(rate>50&&rate<=90) {
                    double lrate=((double)rate-50)*25/40+100;
                    return groupScore*lrate/100;
                }
                else if(rate>90&&rate<=100) {
                    return groupScore*1.25;
                }
            case 3:
                if(rate>=0&&rate<=5) {
                    return groupScore*0.15;
                }
                else if(rate>5&&rate<=18) {
                    double lrate=((double)rate-5)*65/13+15;
                    return groupScore*lrate/100;
                }
                else if(rate>18&&rate<=33) {
                    double lrate=((double)rate-18)*20/15+80;
                    return groupScore*lrate/100;
                }
                else if(rate>33&&rate<=75) {
                    double lrate=((double)rate-33)*22/42+100;
                    return groupScore*lrate/100;
                }
                else if(rate>75&&rate<=100) {
                    return groupScore*1.22;
                }
            default:
                return 0;
        }
    }
    public void updatePersonalScore()
    {
        this.personalScore = calculatePersonalScore(groupScore,rate,groupSize);
    }
    public String toString() {
        return String.format("%s group:%d personal:%d rate:%d", studentId, groupScore, Math.round(personalScore), rate);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getGroupSize() {
        return groupSize;
    }
    public void setGroupSize(int groupSize) {
        Math.sqrt(groupSize);
        this.groupSize = groupSize;
    }
    public char getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(char groupNumber) {
        this.groupNumber = groupNumber;
    }
    public int getGroupScore() {
        return groupScore;
    }
    public void setGroupScore(int groupScore) {
        this.groupScore = groupScore;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
}
