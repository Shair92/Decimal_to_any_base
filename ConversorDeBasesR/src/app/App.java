package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Bases B = new Bases();

		System.out.println("++++++++++ Metodo de decimal a cualquier base ++++++++++");
		System.out.println("++++++++++ Intoduzca la cantidad a convertir ++++++++++ ");
		int d = Scan.nextInt();
		System.out.println("++++++++++ Introduzca la base a convertir ++++++++++ ");
		int e = Scan.nextInt();

		System.out.println(B.cambioBase(d, e));
	}
}
