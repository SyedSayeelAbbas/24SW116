public class CustomerMain {
    public static void main(String[] args) {
        Customer c1 =new Customer();
        Customer c2 =new Customer("Check1","M",130.6);
        Customer c3 =new Customer("Check2","F",1300.6);
        //One way of intializing obj array
        Customer[] cArr1={c1,c2,c3};
        //Second way of intializing obj array
        Customer[] cArr2={new Customer(),new Customer("Check4","Male",130.6),new Customer("Check4","Female",130.6)};
        //this Creates three more new obj in cArr2
        //Third way of intializing obj array
        Customer[] cArr3 = new Customer[3]; // Declare array once outside loop
        System.out.println("third Array print ");
        for (int i = 0; i < 3; i++) {
            cArr3[i] = new Customer("Check", "Male", i + 1); // Instantiate objects
            System.out.println("cArr3[" + (i + 1) + "] obj:");
            cArr3[i].display();
            System.out.println("-----------------------");
        }
        for(Customer d1:cArr1)
        {
            d1.display();
        }
        for(Customer d1:cArr2)
        {
            d1.display();
        }
    }
}
