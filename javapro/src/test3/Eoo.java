package test3;

public class Eoo{
	int e;
	public static int x = 0;
	void show() {
		System.out.print("Eoo");
	}

	public static void main(String[] args) {
		int x = 9;
		A a = new A(){
			@Override
			void pain() {
				System.out.println("niha23123");
			}
		};
		a.pain();
	}
}
abstract class A{
	void pain(){
		System.out.println("nihao");
	}
}

