package algorithms.methods;

import java.util.ArrayList;

public class KmControll {
	
	public int kmCalculation(ArrayList<Integer> speed , ArrayList<Integer> time) {
		int total=0;
		for( int i=0 ; i<speed.size(); i++) {
			total+=speed.get(i)*time.get(i);
		}
		return total;
	}

}
