public class UserMain {
    public static void main(String[] args) {
        User s1=new User();
        System.out.println("Without Parameter");
        System.out.println();
        System.out.println("Value of empty or default Constructor");
        System.out.println();
        s1.display();
        System.out.println();
        User s2 =new User("Syed Sayeel Abbas");
        System.out.println("With User Name Parameter");
        System.out.println();
        System.out.println("Value of User Name in Parameter and default values in Constructor ");
        System.out.println();
        s2.display();
        System.out.println();
        User s3 =new User("Ahmed Ali","Ahmedali@gmail.com");
        System.out.println("With User Name & User Id Parameter");
        System.out.println();
        System.out.println("Value of User Name & User Id in Parameter and default values in Constructor ");
        System.out.println();
        s3.display();
        System.out.println();
        User s4 =new User("Ahmed Ali","Ahmedali@gmail.com",12345678);
        System.out.println("With User Name,User Id & User Password Parameter");
        System.out.println();
        System.out.println("Value of User Name,User Id & User Password in Parameter and default No values in Constructor ");
        s4.display();
    }
}
