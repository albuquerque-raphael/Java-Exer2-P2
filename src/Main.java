//Defina um sistema onde o usuário informe (na classe principal, através do teclado) qual
//opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois números. Caso informe
//2, vai ver a subtração, 3 divisão e 4 multiplicação. Observação: Estas operações deverão
//ser realizadas em uma classe chamada Matemática.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Matematica m = new Matematica();

        int escolha;
        do{
            System.out.println("Escolha as Opções: \n"+
            "1. Soma \n"+
                    "2. Subtração \n"+
                    "3. Divisão \n"+
                    "4. Mutiplicação \n"+
                    "0. Sair");

            escolha = sc.nextInt();

            if (escolha >= 1 && escolha <= 4){
                System.out.println("Digite o primeiro número: ");
                double x = sc.nextDouble();

                System.out.println("Digite o segundo número: ");
                double y = sc.nextDouble();

                m.calcular(x, y, escolha);

            }else if (escolha != 0){
                System.out.println("Opção inválida. Tente novamente");
            }
            System.out.println("Resultado: " + m.getResultado());

        }while (escolha != 0);
    }
}