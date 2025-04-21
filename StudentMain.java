public class StudentMain {
    public static void main(String[] args) {
        System.out.println("Using Empty Constructor");
        System.out.println();
        Student s1= new Student();
        s1.isEnrolled=true;
        s1.rollNo="24SWw116";
        s1.gpa=3.59;
        s1.name="Syed Sayeel Abbas";

        if(s1.isEnrolled==true)
        {
            System.out.println("if in Empty Constructor Enrolled is sepratelty True");
            System.out.println();
            System.out.println(s1.name+" is Enrolled in Muet\nHis Roll No :"+s1.rollNo+"\nHis Gpa :"+s1.gpa);
        }

        s1.isEnrolled=false;

        if(s1.isEnrolled==false)
        {
            System.out.println();
            System.out.println("if in Empty Constructor Enrolled is sepratelty false");
            System.out.println();
            System.out.println(s1.name+" is Not Enrolled in Muet");
        }
        System.out.println();
        System.out.println("Using Parameterized Constructor");

        Student s2=new Student(true,3.4,"Sayeel","24Sw116");
        if(s2.isEnrolled==true)
        {
            System.out.println();
            System.out.println("if in Parameterized Constructor Enrolled is Sepratelty OR in Constructor True");
            System.out.println();
            System.out.println(s2.name+" is Enrolled in Muet\nHis Roll No :"+s2.rollNo+"\nHis Gpa :"+s2.gpa);
        }
        s2.isEnrolled=false;
        if(s2.isEnrolled==false)
        {
            System.out.println();
            System.out.println("if in Parameterized Constructor Enrolled is Sepratily OR in Constructor False");
            System.out.println();
            System.out.println(s2.name+" is Not Enrolled in Muet");
        }
        s1.study();
        s2.study();

    }
}
