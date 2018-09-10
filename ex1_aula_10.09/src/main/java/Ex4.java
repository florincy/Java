
/**
 *
 * @author aluno
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t, ii, i;
        for (i = 2; i <= 10; i++) {
            System.out.println("\n" + "Tabuada do " + i);
            for (ii = 0; ii <= 10; ii++) {
                t = i * ii;
                System.out.println(i + "x" + ii + "=" + t);
            }
        }

    }
}
