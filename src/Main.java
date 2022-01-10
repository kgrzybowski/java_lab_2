import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */



        /* zad 1 */

        /* for (int i = 100; i >= 0; i--) {
            System.out.print("\nliczba: " + i);
            if (i % 1 == 0) {
                System.out.print(" - podzielna przez 1");
            }
        } */

        /* zad 2 */

        Scanner in = new Scanner(System.in);
        System.out.println("\nPodaj pięć liczb.");
        int[] liczba = new int[5];
        for(int i=0;i<5;i++){
            liczba[i] = in.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(liczba[i]);
        }
        for (int x : liczba) {
            System.out.println(x + 11);
        }
    }
}
