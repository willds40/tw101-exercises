package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        int numberOfmatches =0;
        for (int i =0; i<books.length; i++){

            if (books[i].contains(partialBookTitle)){
                System.out.println(books[i]);
                numberOfmatches++;
            }else{

            }
        }
        if (numberOfmatches ==0){
            System.out.println("There is no match");
        }
    }
}
