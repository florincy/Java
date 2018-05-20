
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Tabuada
public class C1 {

  
    public static void main(String[] args) throws IOException {
     int a,i,b;
     BufferedReader inteiro = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Olá, usuário! Este progama faz tabuadas de inteiros"
     + "Digite um inteiro\n");
     a = Integer.parseInt(inteiro.readLine());
     for (i=0;i<=10;i++){
     b = a*i;
     System.out.println(+a+"x"+i+"="+b);
     }
    }
    
}
