/*
 * Title: Java Project Journal
 * Author: Alexander Lorei
 * Date Started: 1/7/23
 */

import java.util.Scanner;

class Main{

    private static Scanner input = new Scanner(System.in);
    private static ProjectBook test = new ProjectBook();
    private static int result = -1;
    public static void main(String[] args) {

        do{
            System.out.println("What would you like to do? \n 0: View Basic Notebook info \n 1: Create notebook \n 4: exit");
            System.out.println("input: ");
            result = Integer.parseInt(input.nextLine());
            mainOptionSelection();
            System.out.println("\n\n");

            journalFormatter(10);
        } while(result != 4);
    clearScreen();
    }

    private static void clearScreen() {  
        System.out.println("\033c");
        System.out.flush();  
    }

    private static void mainOptionSelection() {
        switch(result) {
            case 0:
                System.out.println("notebooks: \n" + test.getTitle() + ": " + test.getDescription());
            case 1: 
        }
    }
    public static void journalFormatter(int entryID) {
        System.out.println(test.getTitle());
        System.out.println("-----------------------------------------------------");
        System.out.println(test.getDescription());
        System.out.println("\n\n");
    }
}
