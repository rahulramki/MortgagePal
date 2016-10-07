/**
 * 
 */
package mortgageCalc;
import java.util.Scanner;
/**
 * @author Rahul
 *
 */
public class MortgageCalcMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the APR: ");
        double apr = scanner.nextDouble();
        System.out.println("Enter the amount of years: ");
        int years = scanner.nextInt();
        System.out.println("Enter the amount of the loan: ");
        int principleAmount = scanner.nextInt();
        System.out.println("Enter the initial downPayment: ");
        int downPayment = scanner.nextInt();
        
        MortgageCalculator mortCalc = new MortgageCalculator(apr, years, principleAmount, downPayment);
        System.out.println("Your monthly payment is: $" + mortCalc.monthlyVal());
        System.out.println("In total, you will be paying: $" + mortCalc.totalVal());
        
        System.out.println("Enter your annual income:");
        double householdIncome = scanner.nextDouble();
        System.out.println("How do you file your taxes: ");
        System.out.println("(A) Single filer: ");
        System.out.println("(B) Married, filing jointly or qualifying widow/widower: ");
        System.out.println("(C) Married, filing seperately: ");
        System.out.println("(D) Head of household: ");
        String selection = scanner.next();
        System.out.println("Enter monthly expenses: ");
        double moneySpent = scanner.nextDouble();
        MonthlyExpenses montE = new MonthlyExpenses(householdIncome, selection, moneySpent);
        System.out.println("After taxes, you have " + montE.monthlyExpense() + " remaining per month" );
        int continueVal = 0;
        if (mortCalc.monthlyVal() + 50 >= montE.monthlyExpense())
        {
            System.out.println("");
            System.out.println("Look at other options or find ways to save money");
            continueVal++;
        }
        else
        {
            System.out.println("");
            System.out.println("Your finances look good");
        }
        
        if (continueVal == 0)
        {
        System.out.println(" ");
        System.out.println("Traditionally, approximately 35% of pretax income is considered");
        System.out.println("a good amount to use for housing");
        double percentageDirty = ((mortCalc.monthlyVal() * 12)/householdIncome) * 100;
        double percentage = Math.round(percentageDirty * 10)/10;
        if (percentage <= 35)
        {
            System.out.println("At " + percentage + "% you are in the clear");
        }
        else
        {
            System.out.println("At " + percentage + "% you are above this threshold");
        }
        }
        
                

    }

}