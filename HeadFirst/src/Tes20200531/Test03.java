package Tes20200531;

public class Test03 {
	int id = 0;

	public static void main(String[] args) {
		int x = 0;
		Test03[] hq = new Test03[5];
		while(x<3){
			hq[x] = new Test03();
			hq[x].id = x;
			x = x+1;
		}
		hq[3]=hq[1];
		hq[4]=hq[1];
		hq[3]=null;
		hq[4]=hq[0];
		System.out.println("0" + hq[0]);
		hq[0]=hq[3];	// 0ÊÇnull
		hq[3]=hq[2];
		System.out.println("2" + hq[2]);
		hq[2]=hq[0];	// 2ÊÇnull
		System.out.println(hq[0]);
		System.out.println(hq[1]);
		System.out.println(hq[2]);
		System.out.println(hq[3]);
		System.out.println(hq[4]);
	}

}
