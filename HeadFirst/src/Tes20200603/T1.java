package Tes20200603;

public class T1 {
	int[] locations;
	int numofHits;
	public void setCells(int[] locs){
		locations = locs;
	}
	public String checkU(String sGuess){
		int guess = Integer.parseInt(sGuess);
		String result = "miss";
		for(int cell: locations){
			if (guess == cell){
				result = "hit";
				numofHits ++;
				break;
			}
		}
		if (numofHits == locations.length){
			result ="kill";
		}
		System.out.println(result);
		return result;
	}
}
