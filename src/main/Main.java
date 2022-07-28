package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

       //2 - Printati rezultatul sumei a doua numere(orice numere)
        Scanner input = new Scanner (System.in);
        System.out.print("First number: ");
        int number1 = input.nextInt();
        System.out.print("Second number: ");
        int number2 = input.nextInt();
        int total = number1 + number2;
        System.out.println();

        //3 - Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.print("First number: ");
        float n1 = input.nextInt();
        System.out.print("Second number: ");
        float n2 = input.nextInt();
        float divide = (n1/n2);
        System.out.println();

        // 4 - Printati rezultatul urmatoarelor operatiuni:
        float a = -5 + 8 * 6;
        float b = (55+9) % 9;
        float c = 20 + -3*5 / 8;
        float d = 5 + 15 / 3 * 2 - 8 % 3;

        //1 - Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello" + "\n" + "Andreea");
        System.out.println(1+50);
        System.out.println("Total: "+ total);
        System.out.println("Total: "+ divide);
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

    }
}

