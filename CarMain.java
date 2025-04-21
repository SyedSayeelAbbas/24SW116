public class CarMain {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println("Your Car model is :"+c1.Model);
        System.out.println("Your Car MAx Speed is :"+c1.TotalSpeed);
        System.out.println("Before start is car On:"+c1.CarStart);
        c1.start();
        System.out.println("After start is car On:"+c1.CarStart);
        c1.stop();
        System.out.println("After Break is car On:"+c1.CarStart);
    }
}
