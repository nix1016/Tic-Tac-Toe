import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfCompanies = scanner.nextInt();
        double[] companyIncome = new double[noOfCompanies];
        double[] companyTax = new double[noOfCompanies];
        int mostTax = 0;

        for (int i = 0; i < noOfCompanies; i++) {
            companyIncome[i] = scanner.nextInt();
        }

        for (int i = 0; i < noOfCompanies; i++) {
            companyTax[i] = companyIncome[i] * scanner.nextInt() / 100;

            if (i != 0 && companyTax[i] > companyTax[i - 1]) {
                mostTax = i;
            }
        }

        System.out.println(mostTax + 1);

    }
}