public class circle{
    public static void main(String[] args){
        Area a1 = new Area();
        circumfrenceCalculator c1  = new circumfrenceCalculator();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }


}

class Area implements Runnable{

    @Override
    public void run() {
        System.out.println("Area is "+Area(4));
    }

    public double Area(int radius){
        return 3.14*radius*radius;
    }
}

class circumfrenceCalculator implements Runnable{

    @Override
    public void run() {
        System.out.println("circumference is "+Circumfrence(4));
    }

    public double Circumfrence(int radius){
        return 2*3.14*radius;
    }

}
