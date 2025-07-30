public class GradeSystem {
    public static void generateStudentGroupSize(Student[] students) {
        int[] size = new int[26];
        for(Student s: students)
        {
            size[s.getGroupNumber()-'A']+=1;
        }
        for(Student s: students)
        {
            s.setGroupSize(size[s.getGroupNumber()-'A']);
        }
    }
    public static void standardizedScores(Student[] students)
    {
        for(Student s: students)
        {
            for(Student m:students)
            {
                if(s.getGroupNumber()==m.getGroupNumber() && s.getGroupScore()!=m.getGroupScore())
                {
                    s.setGroupScore(60);
                    m.setGroupScore(60);
                }
            }
        }
    }
    public static void generatePersonalScore(Student[] students)
    {
        for(Student s:students)
        {
            s.updatePersonalScore();
        }
    }
}
