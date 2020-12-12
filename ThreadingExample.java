class Exthread extends Thread{

    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<100;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("Even sum is in thread1 "+ sum);
    }
}
class Exthread2 extends Thread{
    @Override
    public void run() {
        int s=0;
        for (int i=1;i<100;i++)
        {
            if(i%2==1)
            {
                s+=i;
            }
        }
        System.out.println("Odd sum in thread2 " + s);
    }
}
public class ThreadingExample {
    //defining two different function
    //even sum function
    public void addsum(int start,int end)
    {
        int sum=0;
        for (int i=start;i<end;i++)
        {
            if (i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("even sum is "+ sum);
    }
    //odd sum function
    public void addOddSum(int start ,int end)
    {
        int sum=0;
        for (int i=start;i<end;i++)
        {
            if (i%2==1)
            {
                sum+=i;
            }
        }
        System.out.println("odd sum is "+ sum);
    }

    public static void main(String[] args) throws InterruptedException {
        //calling funtion withoud using thread
        ThreadingExample obj=new ThreadingExample();
        long start=System.nanoTime();
        obj.addOddSum(1,100);
        obj.addsum(1,100);
        long end=System.nanoTime();
        System.out.println("time without using thread " + (end-start)/1000000 );
        long start1=System.nanoTime();
        Exthread th1=new Exthread();
        Exthread2 th2=new Exthread2();
        th1.start();
        th2.start();
        //th1.join();
        //th2.join();
        long end2=System.nanoTime();
        System.out.println("thread time " + (end2-start1)/1000000);
    }
}
