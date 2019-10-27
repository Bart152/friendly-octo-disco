package com.calc;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {


        byte start = 10;
        int b1=0;

        System.out.println(

                "Typy działań:\n" +
                        "   1. Dodawanie: kliknij +\n" +
                        "   2. Odejmowanie: kliknij -\n" +
                        "   3. Mnożenie: klinij *\n" +
                        "   4. Dzielenie: kliknij / \n" +
                        "   5. Dzielenie z resztą: kliknij % \n" +
                        "   6. Potęgowanie do kwadratu: kliknij ^\n" +
                        "   7. Równa się: kliknij =\n" +
                        "   8. Zatrzymaj program: kliknij p"



        );

        while(0<start);{


            start--;

            //Pobieranie a
            Scanner a_scan = new Scanner(System.in);
            int a1 = a_scan.nextInt();
            //Pobieranie typu działania
            Scanner f_scan = new Scanner(System.in);
            String f1 = f_scan.nextLine();

            if(a1==3){
                System.out.println("3");
            }


            switch (f1){

                case "+":

                    System.out.println(b1+a1);

                    break;

                case "-":

                    System.out.println(b1-a1);

                    break;

                case "*":

                    System.out.println(b1*a1);

                    break;

                case "/":



                    if(a1==0){
                        System.out.println("Nie można dzielić przez 0!!!");
                        break;

                    }
                    System.out.println(b1/a1);
                    break;

                case "%":

                    System.out.println(b1%a1);

                    break;

                case "=":
                    System.out.println(b1);
                    break;


                default:

                    System.out.println("Nie wybrano działania, wpisz kolejne");
                    start = 0;
                    break;

            }


        }

        Scanner stopscan = new Scanner(System.in);
        String stop = stopscan.nextLine();



    }



    private static int plus(int a, int b){
        return a+b;    }


    private static int minus(int a, int b){
        return b-a;    }


    private static int multiply(int a, int b){
        return a*b;    }


    private static int divide(int a, int b){
        return b/a;    }



    private static int modulo(int a, int b){
        return b%a;    }





}


