package learnigstart;
import java.util.*;
class SortbyRoll implements Comparator<Student>{
	public int compare(Student a,Student b)
	{
		return a.roll-b.roll;
	}

}
class Sortbyname implements Comparator<Student>{
	public int compare(Student a,Student b)
	{
		return a.name.compareTo(b.name);
	}
}
