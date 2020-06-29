package Tes20200603;

public class T2 {

	public static void main(String[] args) {
		int[] loc = {6,7,8,9};
		T1 t = new T1();
		t.setCells(loc);
		String guess = "5";
		String result = t.checkU(guess);
		String tR = "failed";
		if (result.equals("hit")){
			tR = "passed";
		}
		System.out.println(tR);
	}

}
