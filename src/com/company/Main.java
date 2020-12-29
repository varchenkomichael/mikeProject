package com.company;

public class Main {
    public static void main(String[] args)
            throws java.io.IOException{
        char choice, ignore;
        for ( ; ; ) {

        do {

        System.out.println("справка:");
        System.out.println("1. switch");
        System.out.println("2. if");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break ");
        System.out.println("7. continue\n ");
        System.out.println("choose q - exit");

        choice = (char) System.in.read();
        if (choice == 'q') break;
        do {
            ignore = (char)System.in.read();
        }while (ignore!='\n');
    } while (choice< '1' | choice>'7');
            if (choice =='q') break;
            System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("оператор if:\n ");
                System.out.println("if(условие) оператор; ");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("оператор switch: \n");
                System.out.println("switch(выражение){");
                System.out.println("case константа:");
                System.out.println("последовательность операторов");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("оператор for:\n");
                System.out.println("for (    инициализация; условие; итерация) ");
                System.out.println("оператор;");
                break;
            case '4':
                System.out.println("оператор while:\n");
                System.out.println("while(условие);");
                break;
            case '5':
                System.out.println("оператор do-while:\n");
                System.out.println("do { ");
                System.out.println("оператор;");
                System.out.println("} while(условие);");
            case '6':
                System.out.println("оператор break:\n");
                System.out.println("break или break-метка");
                break;
            case '7':
                System.out.println("оператор continue\n");
                System.out.println("continue или continue-метка");
                break;
        }
        System.out.println();
    }
   }
}
