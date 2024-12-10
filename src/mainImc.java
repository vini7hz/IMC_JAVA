import java.util.Scanner;

public class mainImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = 0.0, altura = 0.0, imc = 0.0;
        String resultado = " ", nome = "";

        System.out.println(" Programa para calcular o IMC do paciente ");
        System.out.println(" Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.println(" Digite o peso do paciente: ");
        peso = sc.nextDouble();
        System.out.println("Digite a altura do paciente: ");
        altura = sc.nextDouble();

        imc = Imc.CalcularImc(peso,altura);
        resultado = Imc.classiificarImc(imc);

        System.out.printf("O paciente %s tem um IMC = %.2f \n ",nome,imc);
        System.out.printf("A classificação do IMC é: %s \n ",resultado);


        sc.close();
    }
}
