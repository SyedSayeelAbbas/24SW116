public class PencilBox {
    static int noOfPencils=10;

    PencilBox(){
        noOfPencils--;
    }

    static int gainPencil()
    {
        return noOfPencils++;
    }

    void display()
    {
        System.out.println("You currently have "+noOfPencils+" out of 10");
    }
}
