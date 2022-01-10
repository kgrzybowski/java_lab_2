public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        {
            /* nr indeksu 59931 */
        /*    int i = 1000;
            System.out.println("\n");
            do {
                System.out.print("\nLiczba: " + i);
                if (i % 31 == 0) {
                    System.out.println(" jest podzielna przez 31");
                }
            } while (--i > 0);
        */
        }
        /* 2a
        int[] tab1 = {3, 7, 15, 21, 42};
        int i = 0;
        while (i < 5) {
            System.out.println("i " + i + ": " + tab1[i]);
            ++i;
        } */

        /* 2b
        {
            double[] tab2 = {3.22, 7.65, 15.441, 21.958, 42.874};
            int j = 0;
            while (j < 5) {
                System.out.println("i " + j + ": " + tab2[j]);
                ++j;
            } */

        {
            String[] tab3 = {"Karol", "Mateusz", "Kuba", "Karolina", "Andrzej"};
            int j = 0;
            while (j < 5) {
                System.out.println("i " + j + ": " + tab3[j]);
                ++j;
            }

            while (true) {
                System.out.println("raz");
            }
        }
        /*
            while (false) {
            System.out.println("raz");
        } */
    }
}