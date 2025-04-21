public class Car {
    String Model="Mustang";
    int TotalSpeed=125;
    boolean CarStart=false;

    void start()
    {   CarStart=true;
        System.out.println(Model+" car has been Started");
    }
    void stop()
    {   CarStart=false;
        System.out.println(Model+" car has been Stop");
    }
}
