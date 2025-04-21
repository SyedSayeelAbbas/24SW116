public class PencilBoxMain {
    public static void main(String[] args) {
        PencilBox p1=new PencilBox();
        p1.display();
        PencilBox p2=new PencilBox();
        p2.display();
        PencilBox p3=new PencilBox();
        p3.display();
        PencilBox p4=new PencilBox();
        p4.display();

        PencilBox.gainPencil();
        System.out.println("After gaining");
        p1.display();
    }
}
