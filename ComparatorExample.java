package learnigstart;
import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student> arr=new ArrayList<>();
       arr.add(new Student(101,"vibhi","Darbhanga"));
       arr.add(new Student(102,"Guddu","Darbhanga"));
       arr.add(new Student(34,"Abhi","Samastipur"));
       arr.add(new Student(45,"RanuG","Khagaria"));
       System.out.println("unsorted object ");
       for(int i=0;i<arr.size();i++)
       {
    	   System.out.println(arr.get(i));
       }
       //now sorting by roll number
       Collections.sort(arr,new SortbyRoll());
       System.out.println("sorted by roll number ");
       for(int i=0;i<arr.size();i++)
       {
    	   System.out.println(arr.get(i));
       }
       Collections.sort(arr,new Sortbyname());
       System.out.println("sorted by name ");
       for(int i=0;i<arr.size();i++)
       {
    	   System.out.println(arr.get(i));
       }
	}

}
