package HW.java;

public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num6=10;
		int num7=5;
		System.out.println("num6和num7的各種運算:");
		System.out.println("num6+num7等於"+(num6+num7));
		System.out.println("num6-num7等於"+(num6-num7));
		System.out.println("num6*num7等於"+(num6*num7));
		System.out.println("num6/num7等於"+(num6/num7));
		System.out.println("num6%num7等於"+(num6%num7));
		int a=0;
		int b=0;
		int c=0;
		b=a++;
		c=++a;
		System.out.println("因為是在指定值之後才遞增,所以b的值為"+b);
		System.out.println("因為是在遞增之後才指定值,所以c的值為"+c);
	}

}
