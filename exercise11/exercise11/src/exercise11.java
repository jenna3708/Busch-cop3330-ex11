import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("How many euros are you exchanging?");
        String euros = input.next();
        int convEuros = Integer.parseInt(euros);

        Scanner input2 = new Scanner (System.in);
        System.out.println("What is the exchange rate?");
        String rate = input2.next();
        double convRate = Double.parseDouble(rate);

        double dollars = convEuros * convRate;

        System.out.println(convEuros+" euros at an exchange rate of "+convRate+" is\n"+String.format("%.2f",dollars)+" U.S. dollars." );


    }
}
