﻿public class Test0422{
	public static void main(String[] args){
		System.out.println("20150422開發流程練習");
		int x=10, y=5;
		new A().minFunc(x, y);
		new B().maxFunc(x, y);
		new C().avgFunc(x, y);
	}
}
<<<<<<< HEAD

class B {
	void maxFunc(int x,int y) {
		if(x>y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}
=======
class C {
	void avgFunc(int x,int y) {
		System.out.println((x+y)/2);
>>>>>>> 67a659ba5da95b24b5f7ce5f748f1c9701ceec79
	}
}