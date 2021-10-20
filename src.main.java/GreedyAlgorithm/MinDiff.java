package GreedyAlgorithm;

import java.util.Collections;
import java.util.List;

public class MinDiff {

	 public static int minimumAbsoluteDifference(List<Integer> arr) {
	        
	        Collections.sort(arr);
	        int min = Integer.MAX_VALUE;
	        
	        for(int i = 0; i+1 < arr.size() ; i++) {
	            
	            int diff = arr.get(i+1) - arr.get(i);
	            
	            if(diff < min) {
	                min = diff;
	            }
	        }
	        
	        return min;
	    }
}
