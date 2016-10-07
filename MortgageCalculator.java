package mortgageCalc;

public class MortgageCalculator {
    private double monthlyRate;
    private int loansTerm;
    private int mortgageAmount;
    
    public MortgageCalculator(double apr, int years, int principleAmount, int downPayment)
    {
        monthlyRate = (apr / 12) / 100;
        loansTerm = years * 12;
        mortgageAmount = principleAmount - downPayment;
    }
    
    public double monthlyVal(){
        double numer = monthlyRate * mortgageAmount;
        double denomPart1 = Math.pow((1 + monthlyRate), (loansTerm * -1));
        double denom = 1 - denomPart1;
        double totalMonthVal = numer / denom;
        return (Math.round(totalMonthVal*100) / 100);
    }
    
    public double totalVal(){
        return this.monthlyVal() * loansTerm;
    }
    
    

}
