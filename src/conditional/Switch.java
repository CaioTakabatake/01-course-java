package conditional;

public class Switch {
    public static void main(String[] args) {
        int monthNumber = 7;
        String monthString = "";

        switch (monthNumber) {
            case 1:
                monthString = "Janeiro";
                break;
            case 2:
                monthString = "Fevereiro";
                break;
            case 3:
                monthString = "Março";
                break;
            case 4:
                monthString = "Abril";
                break;
            case 5:
                monthString = "Maio";
                break;
            case 6:
                monthString = "Junho";
                break;
            case 7:
                monthString = "Julho";
                break;
            case 8:
                monthString = "Agosto";
                break;
            case 9:
                monthString = "Setembro";
                break;
            case 10:
                monthString = "Outubro";
                break;
            case 11:
                monthString = "Novembro";
                break;
            case 12:
                monthString = "Dezembro";
                break;
            default:
                monthString = "Inválido";
        }

        System.out.println("O mês é " + monthString);
    }
}
