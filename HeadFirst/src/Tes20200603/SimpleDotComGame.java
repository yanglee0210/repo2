package Tes20200603;

public class SimpleDotComGame {
	public static void main(String[] args) {
		int numofGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDot = new SimpleDotCom();
		int randomNum = (int) (Math.random()*5);
		
		int[] locations = {randomNum,randomNum+1,randomNum+2};
		
		theDot.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number:");
			String result = theDot.checkYourself(guess);
			numofGuesses ++;
			if (result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numofGuesses + "guess");
			}
		}
	}	
}
