import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        met2(met1());
        String a[]=new String[6];
        met3(a);
        met4(a);
        met5("Karol");
        met5("Karol", "Grzybowski");
        met5("Karol", "Grzybowski",25);
        int zmiennaA = (met6(6,7));
        int zmiennaB = (met6(3,2,1));
        System.out.println("wynik: "+(met6(6,7))+ "wynik: "+met6(3,2,1));
    }
    public  static int [] met1 () {
        int[] a = {40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20};


        return a;
    }
    public static void met2 (int[]a) {
        for (int number : a) {
            System.out.println("This is: " + number);
        }
    }
    public static void  met3  (String[] a){
        Scanner in = new Scanner(System.in);
        int i=0;
        for (String element :a ){
            System.out.println("\nPodaj " + (i + 1) + " element  tablicy: ");
            a [i]=in.nextLine();
            i++;
        }
    }
    public static void met4(String []a){
        System.out.print("Wywolujemy elementy tablicy od ostatniego elementu \n");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);

        }
    }
    public static void met5(String imie){
        System.out.println("Imię "+imie);

    }
    public static void met5(String imie, String nazwisko){
        System.out.println("Imię "+imie+" Nazwisko "+nazwisko);

    }
    public static void met5(String imie,String nazwisko, int wiek){

        System.out.println("Imię "+imie+" Nazwisko "+nazwisko+" wiek "+wiek);
    }

    public static int met6(int a , int b){
        return a+b;
    }
    public static int met6(int a,int b,int c){
        return a+b+c;

    }

}
