public class Imc {
    public static double CalcularImc(double peso, double altura){
        double imc = 0.0;

        imc = peso / (altura * altura);

        return imc;
    }

    public static String classiificarImc(double imc){

        if ((imc > 0) && (imc < 18.5)){
            return  "Baixo peso";
        }else if ((imc >= 18.5) && (imc < 25.0)){
            return "peso Normal";
        }else if ((imc >= 25.0 ) && (imc < 30.0 )){
            return "Sobrepeso";
        }else if ((imc >= 30.0 ) && (imc < 35.0 )){
            return "Obesidade grau I";
        }else if ((imc >= 35.0) && (imc < 40.0)){
            return "obesidade grau II";
        }else if (imc >= 40.0){
            return "Obesidade grau III";
        }
        return "Não foi possivel classificar";
    }
}
