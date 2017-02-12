package ru.prog;

public class MyFirstProg {

	public static void main(String[] args) {

		hellow("world");
		hellow("user");
		hellow("Alexey");

		double len = 5;
		System.out.println("Площадь квадрата со стороной " + len + " = " + aria(len));

		double a = 4;
		double b = 6;

		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + aria(a, b));
	}
	public static void hellow ( String sambody) {

		System.out.println("Hellow, " + sambody + "!");
	}

	public static double aria ( double l) {
	return l + l;
	}

	public static double aria ( double a, double b){
		return a * b;
	}
}