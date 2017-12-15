package ocp;
import java.util.*;

public class colectiondemo {

	public static void main(String[] args) {
		List<Integer> demo =new ArrayList<Integer>()
				{
			{
				//instansioation
				add(90);
				add(88);
				add(66);
			}
				};
	
		Comparator<Integer> com=(o1,o2) -> {
			if(o1%10>o2%10)
				return 1;
			return -1;
		};
		Collections.sort(demo,com  );
		//Collections.reverse(demo);
		for(Integer i:demo)
		{
			System.out.println(i);
		}

	}

}
