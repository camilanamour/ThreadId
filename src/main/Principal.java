package main;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {

		//criar 5 threads
		for(int t=0; t<5; t++){
			Thread threadId = new ThreadId();
			threadId.start();
		}
	}

}
