
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomaFloat {

    //Soma de Floats
    public static void main(String[] args) throws IOException {
    float a,b=0;
    int c,i=0;
        System.out.println("Este código faz somas de floats.\n"
                + "Quantos números você quer somar?");
        BufferedReader z = new BufferedReader(new
        InputStreamReader(System.in));
        c = Integer.parseInt(z.readLine());
        while (i<c){
        System.out.println("Digite um número.\n");
        a = Float.parseFloat(z.readLine());
        b = b+a; 
        i++;
        }
        System.out.println("O valor da soma é "+b);
    }
    
}
