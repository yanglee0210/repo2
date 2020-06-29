package Tes20200531;

public class Test05 {

	public static void main(String[] args) {
		int a = cA(7,12);
		System.out.println("a= "+a);
		short c=7;
		
		System.out.println("b= "+cA(c,15));
		
		System.out.println("c= "+cA(2,3));
		
		long t = 42;
//		int f = cA(t,17);	需要强制类型转换
		int f = cA((int) t,17);
//		byte h = cA(4,20);	需要强转
		byte h = (byte) cA(4,20);
	}
	public static int cA(int h,int w){
		return h*w;
	}

}
