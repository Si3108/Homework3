
public class Sample22
{
	public static void main(String[] args) 
	{
		System.out.println("宣告carl");
		Car22 car1;
		car1 =  new Car22();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Car22 car2;
		
		System.out.println("將carl指定給car2");
		car2 = car1;
		
		System.out.println("carl的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變carl的相關資料");
		car1.setCar(2345,30.5);
		
		System.out.println("carl的");
		car1.show();
	
		System.out.println("car2的");
		car2.show();
	}
}
    class Car22 
    {
        private int num;
        private double gas;
        
        
        public Car22()
        {
            num = 0;
            gas = 0.0;
            System.out.println("生產了車子");
        }
        
        public void setCar(int n, double g)
        {
            num = n;
            gas = g;
            System.out.println("將車號設為"+num+",汽油量設為"+gas);
        }
        public void show()
        {
            System.out.println("車號是"+num);
            System.out.println("汽油量是"+gas);
        }
    
    }
