import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite um Número entre 1 e 100");
        int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Você Digitou o Número: " + N);
        if(N<1 || N>100){
            System.out.println("Você Digitou o Número FORA DA FAIXA PERMITIDA.");
        }
            else{
                if (N%2==0){
                            
                    if(N>=2 && N<=5){
                        System.out.println(N + "   Is Not Weird");
                    }
                    if (N>=6 && N<=20){
                        System.out.println(N + "   = Weid");
                    }
                    if(N>20){
                            System.out.println(N + "Is Not Weird");
                    }
                    
                }
                else {            
                    
                    System.out.println(N + "   = Weid");
                }
            }
        scanner.close();
        }
}
