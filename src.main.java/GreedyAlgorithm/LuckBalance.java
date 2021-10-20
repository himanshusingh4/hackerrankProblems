package GreedyAlgorithm;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LuckBalance {

	public static int luckBalance(int k, List<List<Integer>> contests) {
		
		int unimportantGamesLuck = contests.stream().filter(l -> l.get(1) == 0).mapToInt(l -> l.get(0)).sum();
		int luckBalance = 0;
		
		List<Integer> importantGamesLuck = contests.stream()
				.filter(l -> l.get(1) == 1).mapToInt(l -> l.get(0)).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		for(int i = 0 ; i < importantGamesLuck.size(); i++) {
			
			if( k > 0) {
				
				luckBalance = luckBalance + importantGamesLuck.get(i);
				k--;
				
			} else {
				
				luckBalance = luckBalance - importantGamesLuck.get(i);
				
			}
			
		}
        
			return unimportantGamesLuck+luckBalance;
    }

}
