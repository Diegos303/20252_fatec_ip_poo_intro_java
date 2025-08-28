import java.util.Scanner;
public class IOLinhaDeComando {
  public static void main (String... args) {
    //declaração de variaveis 
    int a, b;
    int resultado;
    Scanner leitor = new Scanner(System.in);

    //entrada
    System.out.println("Digite o primeiro valor");
    leitor.nextInt();
    a = leitor.nextInt();   
    System.out.println("Digite o segundo valor");
    b =leitor.nextInt();
    //procesamento
    resultado = a + b;

  

    //saida
    System.out.printf("%d + %d = %d\n",a,b,resultado);
  }

}