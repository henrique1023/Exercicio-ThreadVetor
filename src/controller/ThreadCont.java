package controller;

public class ThreadCont extends Thread {
	private int op,resp, vetor[];
	
	public ThreadCont(int op, int [] vetor) {
		this.resp = resp;
		this.vetor = vetor;
		this.op = op;
	}
	@Override
	public void run() {
		vetor(op, vetor);
	}
	private void vetor(int op, int[] vet) {
		long comeco = System.nanoTime();
		int res = 0;
		String operacao ="";
		if(op%2 == 0) {
			resp = 1;
		}else {
			resp = 2;
		}
		switch (resp) {
		case 1:
			for (int i = 0 ; i < vet.length; i++) {
				int x = 0;
				x += vet[i];
			}
			break;

		case 2:
			for (int item : vet) {
				int soma = 0;
				soma += item;
			}
			break;
		}
		long fim = System.nanoTime();
		float tempo = ((fim-comeco)/10^9);
		System.out.println("Os segundos para percorrer foram de: " + tempo + "s");
	}
}
