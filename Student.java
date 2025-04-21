public class Student {
    String name;
    double gpa;
    String rollNo;
    boolean isEnrolled=false;

    Student(boolean isEnrolled,double gpa,String name,String rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.gpa=gpa;
        this.isEnrolled=isEnrolled;
    }

    Student()
    {

    }

    void study ()
    {
        System.out.println(this.name+" is Studing");
    }
}
