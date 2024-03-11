package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;
        
        Scanner sc = new Scanner(System.in);
        while (continuar){
         double n1,n2 = 0;
         int operacao = 0;
          

        System.out.println("Digite a Operação que deseja realizar: "
        +                             "\n1 para soma"
        +                             "\n2 para subtração"
        +                             "\n3 para divisão"
        +                             "\n4 para multiplicação"
        +                             "\nou 0 para finalizar o programa"
        );

        operacao = sc.nextInt();

        if (operacao == 0){
        continuar = false;
        System.out.println("Programa Finalizado!");
        return;
        }

        System.out.println("Informe o Primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Informe o Segundo número: ");
        n2 = sc.nextDouble();


       switch (operacao) {

        case 1:
         imprimeCalculadora(operacao, n.soma(n1, n2), n1, n2);
         break;

         case 2:
         imprimeCalculadora(operacao, n.subtração(n1, n2), n1, n2);
         break;

         case 3:
         imprimeCalculadora(operacao, n.divisão(n1, n2), n1, n2);
         break;

         case 4:
         imprimeCalculadora(operacao, n.multiplicação(n1, n2), n1, n2);
         break;

         default:
         break;
         }

        }
      

        sc.close();

    }

        static void imprimeCalculadora(int operacao, double resultado, double n1, double n2){
            HashMap <Integer,String>mapOperacao = new HashMap<>();
            mapOperacao.put(1, " somado");
            mapOperacao.put(2, " subtraido");
            mapOperacao.put(3, " dividido");
            mapOperacao.put(4, " multiplicado"); 

            System.out.println("\n O resultado de "+ n1 + mapOperacao.get(operacao) + " por " + n2 + " é igual a: " + resultado + "\n");
         


  }

}



