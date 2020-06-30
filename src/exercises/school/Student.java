package school;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    private String GradeLevel;
    private char grade;
    int gradeScore;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student() {

    }

    public double addGrade(int courseCredits, double grade) {

        if (grade == 'A') {
            gradeScore = 4;
            gpa = (courseCredits * gradeScore)/numberOfCredits;
        } else  if( grade =='B') {
            gradeScore = 3;

            gpa = (courseCredits * gradeScore) / numberOfCredits;

        }
        return gpa;
    }
    public String getGradeLevel() {
        if (numberOfCredits <= 29) {
            GradeLevel = "Freshman";
        } else if ((numberOfCredits >= 30) && (numberOfCredits <= 59)) {
            GradeLevel = "Sophomore";
        } else if ((numberOfCredits >= 60) && (numberOfCredits <= 89)) {
            GradeLevel = "Junior";

        } else if ((numberOfCredits >= 90)) {
            GradeLevel = "Senior";

        }
        return GradeLevel;
    }


    public void getStudentId() {
        System.out.println(this.studentId);
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int setNumberOfCredits(int numberOfCredits) {
        return this.numberOfCredits = numberOfCredits;
    }

    public double getGpa(double gpa) {
     return this.gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public char setGrade(char grade) {
        return this.grade = grade;
    }

    public int getNumberOfCredits() {

        return numberOfCredits;
    }

    public double getGpa() {
        return gpa ;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa + " GradeLevel: "+ this.getGradeLevel());
    }
}
    //public void addGrade(int courseCredits, double grade) {




            // Update the appropriate fields: numberOfCredits, gpa







