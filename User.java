public class User {
    String userName;
    String userId;
    long userPassword;

    User()
    {
        this.userName="Unknow";
        this.userId="UnknownId";
        this.userPassword=00000000000;
    }
    User(String name)
    {
        this.userName=userName;
        this.userId="UnknownId";
        this.userPassword=00000000000;
    }
    User(String userName,String userId)
    {
        this.userName=userName;
        this.userId=userId;
        this.userPassword=00000000000;
    }
    User(String userName,String userId,long userPassword)
    {
        this.userName=userName;
        this.userId=userId;
        this.userPassword=userPassword;
    }
    void display()
    {
        System.out.println("USER NAME :"+userName+"\nUSER ID :"+userId+"\nUSER PASSWORD :"+userPassword);
    }
}
