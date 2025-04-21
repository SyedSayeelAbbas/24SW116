public class Customer
{
    String name;
    String gender;
    double amountOfbuy;

    Customer()
    {
        this.name="NoOne";
        this.gender="unknown";
        this.amountOfbuy=0.0;
    }

    Customer(String name,String gender,double amountOfbuy)
    {
        this.name=name;
        this.gender=gender;
        this.amountOfbuy=amountOfbuy;
    }

    void display()
    {
        System.out.println("Customer Name :"+this.name+"\nCustomer Gender :"+this.gender+"\nAmount of Purchase :"+amountOfbuy);
    }
}
