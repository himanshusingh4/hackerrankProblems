package GreedyAlgorithm;

import java.util.Collections;
import java.util.List;

public class MaxMin {
	
	public static int maxMin(int k, List<Integer> arr) {
	    
	    
        int maxMin = Integer.MAX_VALUE;
        
        Collections.sort(arr);
        
        for(int i = 0; i+k-1 < arr.size(); i++) {
        	
        	int diff = arr.get(i+k-1) - arr.get(i);
        	
        	if(diff < maxMin) {
        		
        		maxMin = diff;
        	}
        	
        }
        
        return maxMin;

    }

}
