package ru.prog;

public class MyFirstProg {

	public static void main(String[] args) {

		hellow("world");
		hellow("user");
		hellow("Alexey");

		Square s = new Square(5);

		System.out.println("Площадь квадрата со стороной " + s.l + " = " + aria(s));

		Rectangle r = new Rectangle(4, 6);


		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + aria(r));
	}
	public static void hellow ( String sambody) {

		System.out.println("Hellow, " + sambody + "!");
	}

	public static double aria ( Square s) {
	return s.l + s.l;
	}

	public static double aria (Rectangle r){
		return r.a * r.b ;
	}
}