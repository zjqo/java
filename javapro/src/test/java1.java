package test;
import java.util.Random;//Ëæ»úÊý
class stuts{
	String name;
	int age;
	char sex;
	stuts(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	void cs(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	void xx() {
		System.out.print(name+"ÄãºÃ\n");
	}
	stuts(){
		
	}
}
abstract class init {
	 public static int get(int x,int y) {
	  return x>y?x:y;
	 }
}
class init2 extends init{
	void he() {
	}
}