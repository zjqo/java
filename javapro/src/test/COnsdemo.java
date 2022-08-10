package test;
import test2.hello;
public class COnsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stuts zs = new stuts("李四",25,'男');
		zs.xx();
		hello ls = new hello();

		stuts [] a = new stuts[5];
		String str = "张三";
		int age = 15;
		char sex = '男';
		a[0].cs(str, age, sex);
		a[0].xx();
//		a[0] = new stuts("李四",25,'男');
		System.out.print(a[0].name+a[0].age+a[0].sex);
	}

}
