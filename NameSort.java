package arrstrings;

import java.util.Scanner;

public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ns = new Scanner(System.in);
        String names[] = new String[20];
        System.out.println("Enter 20 names:");
        for (int i = 0;  i < names.length; i++) {
            names[i] = ns.nextLine();
        }

        //Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        System.out.println("\nSorted Names");
        for (int i = 0;  i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
	}


