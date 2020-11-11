class base{
    int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void display()
    {
        System.out.println("in base class");
    }


}
class derived extends base{
    int v;

    public void setV(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }
    public void print()
    {
        System.out.println("in derived class");
    }
}
public class JavaInharitnace {
    public static void main(String[] args) {
       base b=new base();
       b.setX(4);
       b.display();
      // b.print();it givers error
       derived d=new derived();
       d.display();
       d.print();
       //derived d1=new base();//Reference of derived class can't contain super class object
        base b1=new derived();
        b1.display();
       // b1.print() it shows error we can't access method of derived class with base class object
        base b2=new derived();//reference of super class can contain object of child class
        //but reference of child class can't contain object of parant class.
        b2.display();//it can access method of base class
       // b2.print();  It can't acces of method of derived class.
        //derived d2=new base(); error



    }
}
