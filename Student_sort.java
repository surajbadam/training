import java.util.Arrays;
import java.util.Objects;
public class Student_sort {

    public static void main(String args[]) throws Exception{
        Student student1 = new Student("c1","suraj",new String[]{"Java", "C"},new String[]{"10:00-02:00", "3:00-6:00"});
        Student student2 = new Student("c1","Rishi",new String[]{"Java", "angular"},new String[]{"10:00-02:00", "3:00-6:00"});
        Student student3 = new Student("c2","rishi1",new String[]{"C++", "React"},new String[]{"10:00-02:00", "3:00-6:00"});
        Student student4 = new Student("c3","rishi2",new String[]{"Java", "React"},new String[]{"10:00-02:00", "3:00-6:00"});
        Student[] s = new Student[4];
        s[0] = student1;
        s[1] = student2;
        s[2] = student3;
        s[3] = student4;
        for (int i=0; i< s.length-1; i++) {
            for (int j=i+1; j< s.length; j++) 
            {
                StringBuilder sb = new StringBuilder();
                if (Arrays.equals(s[i].getSubjects(), s[j].getSubjects())) {
                    getInfo(s, i, j, sb);
                    sb.append(Arrays.toString(s[i].getSubjects())).append(" ").append(Arrays.toString(s[i].getTimings()));
                    System.out.println(sb);
                } else {
                    for (int k = 0; k < s[i].getSubjects().length; k++) {
                        if (Objects.equals(s[i].getSubjects()[k], s[j].getSubjects()[k])) {
                            getInfo(s, i, j, sb);
                            sb.append(s[i].getSubjects()[k]).append(" ").append(s[i].getTimings()[k]);
                            System.out.println(sb);
                        }
                    }
                }
            }
        }
    }

    private static void getInfo(Student[] students, int i, int j, StringBuilder sb) {
        sb.append(students[i].getName()).append(" ").append(students[j].getName()).append(" ");
        if (students[i].getBatch().equals(students[j].getBatch())) {
            sb.append(students[j].getBatch()).append(" ");
        } else {
            sb.append(students[i].getBatch()).append(" ").append(students[j].getBatch()).append(" ");
        }
    }
}