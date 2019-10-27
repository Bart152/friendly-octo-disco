package com.mycalc;
import java.util.Scanner;

public class OldCalc {




    public static void main(String[] args) {


        byte start = 0;

        System.out.println(

                "Typy działań:\n" +
                        "   1. Dodawanie: kliknij +\n" +
                        "   2. Odejmowanie: kliknij -\n" +
                        "   3. Mnożenie: klinij *\n" +
                        "   4. Dzielenie: kliknij / \n" +
                        "   5. Dzielenie z resztą: kliknij % \n" +
                        "   6. Potęgowanie do kwadratu: kliknij ^\n"



        );

        while (start == 0){

            start++;
            //Pobieranie a
            Scanner a_scan = new Scanner(System.in);
            int a1 = a_scan.nextInt();
            //Pobieranie typu działania
            Scanner f_scan = new Scanner(System.in);
            String f1 = f_scan.nextLine();

            //Pobieranie b
            Scanner b_scan = new Scanner(System.in);
            int b1 = b_scan.nextInt();



            switch (f1){

                case "+":
                    System.out.println(a1 +"" + f1 + "" + b1 + "=" + plus(a1, b1) );
                    break;

                    case "-":
                    System.out.println(a1 +"" + f1 + "" + b1 + "=" + minus(a1, b1) );
                    break;

                    case "*":
                    System.out.println(a1 +"" + f1 + "" + b1 + "=" + multiply(a1, b1) );
                    break;

                    case "/":
                    System.out.println(a1 +"" + f1 + "" + b1 + "=" + divide(a1, b1) );
                    if(b1==0){
                        start=0;
                    }
                    break;

                    case "%":
                    System.out.println(a1 +"" + f1 + "" + b1 + "=" + modulo(a1, b1) );
                    break;



                default:

                    System.out.println("Nie wybrano działania, wpisz kolejne");
                    start=0;

            }

            Scanner stopscan = new Scanner(System.in);
            System.out.println("Jeżeli chcesz przerwać, kliknij klawisz p, jeśli chcesz wpisać kolejne działanie to naciśnij ENTER");
            String stop = stopscan.nextLine();

            if (stop!="p"){

                start = 0;
            }



        }


    }



    private static int plus(int a, int b){
        return a+b;    }


 private static int minus(int a, int b){
        return a-b;    }


 private static int multiply(int a, int b){
        return a*b;    }


 private static int divide(int a, int b){
        return a/b;    }



 private static int modulo(int a, int b){
        return a%b;    }





}


