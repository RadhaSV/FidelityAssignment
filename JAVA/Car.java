package small.example;

class Car{
    public Car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}
class Nano extends Car{
    public Nano()
    {
        System.out.println("Class Nano");
    }
    public void brand()
    {
        System.out.println("Brand: Nano");
    }
    public void speed()
    {
        System.out.println("Max: 100Kmph");
    }
}
class NanoXE extends Nano{

    public NanoXE()
    {
        System.out.println("Nano Model: XE");
    }
    public void speed()
    {
        System.out.println("Max: 120Kmph");
    }
    public static void main(String args[])
    {
        NanoXE obj=new NanoXE();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
