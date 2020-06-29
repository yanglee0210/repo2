package Tes20200603;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.go();

	}
	public void go(){
		int y = 7;
		for (int x=1;x<8;x++){
			y++;
			if (x>4){
				System.out.println(++y+" ");
			}
			if (y>14){
				System.out.println("x=" + x);
				break;
			}
		}
	}

}
