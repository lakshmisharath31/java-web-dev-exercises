package school;

import school.Student;

public class StudentRunner {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Sam");
        student1.getName();
        student1.setStudentId(1);
        student1.getStudentId();
        student1.setNumberOfCredits(4);
        student1.getNumberOfCredits();
        student1.setGrade('A');
        System.out.println(student1.addGrade(student1.getNumberOfCredits(),student1.getGrade()));
        //System.out.println("Student name:"+student1.getName()+"  GPA: "+student1.getGpa()+ " Grade Level: "+student1.getGradeLevel());

        System.out.println(student1.studentInfo());
        student2.setName("Tiger");
        student2.getName();
        student2.setStudentId(2);
        student2.getStudentId();
        student2.setNumberOfCredits(35);
        student2.getNumberOfCredits();
        student2.setGrade('B');
        System.out.println(student2.addGrade(student2.getNumberOfCredits(),student2.getGrade()));
        //System.out.println("Student name:"+student1.getName()+"  GPA: "+student1.getGpa()+ " Grade Level: "+student1.getGradeLevel());

        System.out.println(student2.studentInfo());


    }
}
