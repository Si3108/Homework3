public class Sample2
{
    public static void main(String[] args)
    {
    Car2 Car2;
    Car2 = new Car2();

    Car2.num = 1234;
    Car2.gas = 20.5;
    System.out.println("車號是"+ Car2.num);
    System.out.println("汽油量是"+ Car2.gas);
    }
}

class Car2
{
    int num;
    double gas;
}
    