package conditional;

public class ChallengeIR {
    public static void main(String[] args) {

        double salario = 3300.0;
        String text = "";

        if (salario >= 1900.0 && salario <= 2800.0) {
            text = "O seu IR é 7.5% e você pode deduzir R$142";
        }
        if (salario >= 2800.0 && salario <= 3751.0) {
            text = "O seu IR é 15% e você pode deduzir R$350";
        }
        if (salario >= 3751.0 && salario <= 4664.00) {
            text = "O seu IR é 22.5% e você pode deduzir R$636";
        }

        System.out.println(text);
    }
}