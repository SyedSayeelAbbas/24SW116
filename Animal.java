public class Animal {

    void move()
    {
        System.out.println("Animals are moving");
    }

    public static void main(String[] args) {
        dog d1=new dog();
        Fish f1=new Fish();
        d1.move();
        f1.move();
    }
}
class dog extends Animal
{

}
class Fish extends Animal
{
    void move()
    {
        System.out.println("Fish is override");
    }
}
