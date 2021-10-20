package arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {
	
	public static List<Integer> rotLeftSol1(List<Integer> a, int d) {   
	    
	    List<Integer> temp = new ArrayList<Integer>();
	    List<Integer> output = new ArrayList<Integer>();
	    
	    for(int i = 0; i < d; i++) {
	        
	        temp.add(a.get(i));
	    }
	    
	    for(int i=0; i< a.size()-d ; i++) {
	        
	        output.add(i, a.get(d+i));
	    }
	    output.addAll(temp);
	    return output;

	    }
	
	 public static List<Integer> rotLeftSol2(List<Integer> a, int d) {   
		    
		    List<Integer> output = new ArrayList<Integer>();
		    
		    for(int i = 0 ; i < a.size(); i++) {
		        
		        if(d+i < a.size()) {
		        output.add(a.get(d+i));
		        
		        } else {
		            
		            output.add(a.get(d+i-a.size()));
		        }
		        
		    }
		        return output;
		        
		    }

}
