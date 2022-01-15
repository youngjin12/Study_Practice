package io2.run;

import io2.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
	}

	
}
