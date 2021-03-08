package view;

import java.util.Random;

import controller.ThreadCont;

public class Principal {

	public static void main(String[] args) {
		Random item = new Random();
		int vetor []= new int[1000];
		for(int i = 0 ; i<1000; i++) {
			vetor[i] += (int) Math.ceil(item.nextInt(100)+1);
		}
		for(int op = 1; op <= 2; op++ ) {
			ThreadCont tNano = new ThreadCont(op, vetor);
			tNano.start();
		}
		
	}

}
