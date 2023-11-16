public class Sample3
{
    public static void main(String[] args)
    {
    Car3 car1;
    car1 = new Car3();
    
    car1.num = 1234;
    car1.gas = 20.5;
    
    Car3 Car3;
    Car3 = new Car3();
    
    Car3.num = 2345;
    Car3.gas = 30.5;
    
    System.out.println("car1車號是"+ car1.num);
    System.out.println("car1油量是" + car1.gas );

    System.out.println("car2車號是" + Car3.num);
    System.out.println("car2油量是" + Car3.gas);
    }
}

class Car3
{
    int num;
    double gas;
}
    