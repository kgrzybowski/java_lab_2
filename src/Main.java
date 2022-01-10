public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        /* a) */
        for (int i = 0; i <= 25; i++) {
            if (i == 13)
                break;
            System.out.print(i + " ");
        }
        /* b) */
        for (int i = 0; i <= 10; i++) {
            if (i % 8 == 0)
                continue;
            System.out.print(i + " ");
        }
        /* c) */
        for (int i = 0; i <= 100; i++) {
            if (i == 33)
                return;
            System.out.print(i + " ");
        }

    }
}
