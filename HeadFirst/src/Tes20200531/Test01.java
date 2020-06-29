package Tes20200531;

public class Test01 {
	double area;
	int height;
	int length;
	public static void main(String[] args) {
		int x = 0;
		Test01[] t = new Test01[4];
		while (x<4){
			t[x] = new Test01();
			t[x].height = (x+1)*2;
			t[x].length= x + 4;
			t[x].setArea();
//			System.out.println(t[x].area);
			System.out.print("triangle " + x + ", area");
			System.out.println(" = " + t[x].area);
			System.out.println("x="+x);
			x = x+1;
		}
		int y = x;
		Test01 t5 = t[2];
		t[2].area = 343;
		System.out.print("y= " + y);
		System.out.println(", t5 area = " + t5.area);
	}
	void setArea(){
		area = (height*length)/2;
	}

}
