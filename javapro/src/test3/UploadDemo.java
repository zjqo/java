package test3;

import java.util.Scanner;

public class UploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eoo x = new Eoo();
		Foo x1 = new Foo();
		Eoo x2 = new Foo();

		System.out.print(Eoo.x);
		asd o = new asd();
		x1.show();
		new UploadDemo().test();
		 Eoo x5 = new Eoo(){
		 	void show(){
				System.out.println("hello");
			}
		 };

	}
	void test2() {
		test();
	}
	void test() {
		System.out.print("hello");
	}
}
class asd{
	void show() {
		Eoo.x++;
	}
	static {//静态块，在加载类的时候自动执行,因为静态只被执行一次，所以静态块只被执行一次
		
	}
}