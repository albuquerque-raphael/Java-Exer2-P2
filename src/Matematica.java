public class Matematica{
    private double resultado;

    public void calcular(double x, double y, int escolha){
        resultado = 0;

        switch (escolha){
            case 1:
                resultado = x + y;
                System.out.println("O resultado da soma foi " + resultado);
                break;
            case 2:
                resultado = x - y;
                System.out.println("O resultado da subtração foi " + resultado);
                break;
            case 3:
                resultado = x / y;
                System.out.println("O resultado da divisão foi "+ resultado);
                break;
            case 4:
                resultado = x * y;
                System.out.println("O resultado da mutiplicação foi " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    public double getResultado(){
        return resultado;
    }
}