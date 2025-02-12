package chapter09_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univstudent01 = new UnivStudent();
        univstudent01.setName("김일");
        univstudent01.setGrade(1);
        univstudent01.setScore(3.3);

        UnivStudent univstudent02 = new UnivStudent("김이");
        univstudent02.setGrade(2);
        univstudent02.setScore(4.0);

        UnivStudent univstudent03 = new UnivStudent(3);
        univstudent03.setName("김삼");
        univstudent03.setScore(2.7);

        UnivStudent univstudent04 = new UnivStudent("김사",4);
        univstudent04.setScore(3.8);

        UnivStudent univstudent05 = new UnivStudent("김오",1,1.0);

        univstudent01.showInfo();
        univstudent02.showInfo();
        univstudent03.showInfo();
        univstudent04.showInfo();
        univstudent05.showInfo();
    }
}
