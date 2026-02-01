package com.wildcodeschool.idetest;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder w1 = new Wilder("Mateusz", true);
		Wilder w2 = new Wilder("Jeremy", false);
		Wilder w3 = new Wilder("Orelia", true);
		
		System.out.println(w1.whoAmI());
		System.out.println(w2.whoAmI());
		System.out.println(w3.whoAmI());

	}

}
