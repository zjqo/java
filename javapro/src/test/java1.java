package test;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stuts zs = new stuts("ÀîËÄ",19,'ÄĞ');
		System.out.print(zs.name);
	}

}
class stuts{
	String name;
	int age;
	char sex;
	stuts(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}