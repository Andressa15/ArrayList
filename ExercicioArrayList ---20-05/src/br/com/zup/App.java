package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> aleatorio1 = new ArrayList<Integer>();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Dig um numero");
			aleatorio1.add(scan.nextInt());
		}
		System.out.println(aleatorio1);

	}

}
