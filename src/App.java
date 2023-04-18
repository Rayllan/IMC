import java.util.Scanner;
import java.security.Principal;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Locale.setDefault(Locale.US);
         
        System.out.println("Sistema de Diagnóstico de IMC ");
        System.out.println("");
        
        // Entrada
       
        System.out.print("Informe seu nome:");
        String nome = keyboard.nextLine();
        System.out.println("");
        System.out.print("Informe sua altura:");
        double altura = keyboard.nextDouble();
        System.out.println("");
        System.out.print("Informe seu peso:");
        double peso = keyboard.nextDouble();
        System.out.println("");

        // Processamento

        double imc = (peso/Math.pow(altura, 2));
        String classificacao = "";
        int grauObesidade = 0;

        if (imc < 18.5){
            classificacao = "MAGREZA";
            grauObesidade = 0;
        }
        else if (imc >= 18.5 && imc < 25){
            classificacao = "NORMAL";
            grauObesidade = 0;
        }
        else if (imc >= 25 && imc < 30){
            classificacao = "SOBREPESO";
            grauObesidade = 1;
        }
        else if (imc >= 30 && imc < 40){
            classificacao = "OBESIDADE";
            grauObesidade = 2;
        }
        else{
            classificacao = "OBESIDADE GRAVE";
            grauObesidade = 3;
        }
        
        // Saida
        System.out.printf("O Funcionario %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f com Diagnostico %s %d %n", nome, altura, peso, imc, classificacao, grauObesidade);

    keyboard.close();
    }
}