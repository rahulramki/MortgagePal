/**
 * 
 */
package mortgageCalc;

/**
 * @author Rahul
 *
 */
public class MonthlyExpenses {
    
    private double incomeAnnual;
    private String chosenVal;
    private double moneySpent;
    
    public MonthlyExpenses(double householdIncome, String selection, double moneySpent){
        incomeAnnual = householdIncome;
        chosenVal = selection;
        moneySpent = this.moneySpent;
    }
    
    public double monthlyExpense(){
        double mE =  this.monthlyRev() - moneySpent;
        return Math.round(mE*100)/100;
    }
    
    public double monthlyRev(){
        if (chosenVal.equalsIgnoreCase("A"))
        {
            return this.incomeAfterTaxesSF()/12;            
        }
        else if (chosenVal.equalsIgnoreCase("B"))
        {
            return this.incomeAfterTaxesMFS()/12;
        }
        else if (chosenVal.equalsIgnoreCase("C"))
        {
            return this.incomeAfterTaxesWidOrJoint()/12;
        }
        else if (chosenVal.equalsIgnoreCase("D"))
        {
            return this.incomeAfterTaxesHeadOfHouse()/12;
        }
        else
        {
            return 0;
        }
    }
    
    private double incomeAfterTaxesSF(){
        double tax = 0;
        if (incomeAnnual <= 9275)
        {
            tax = incomeAnnual * 0.10;
        }
        else if ((incomeAnnual >= 9276) && (incomeAnnual <= 37650))
        {
            tax = incomeAnnual * 0.15;
        }
        else if ((incomeAnnual >= 37651) && (incomeAnnual <= 91150))
        {
            tax = incomeAnnual * 0.25;
        }
        else if ((incomeAnnual >= 91151) && (incomeAnnual <= 190150))
        {
            tax = incomeAnnual * 0.28;
        }
        else if ((incomeAnnual >= 190151) && (incomeAnnual <= 413350))
        {
            tax = incomeAnnual * 0.33;
        }
        else if ((incomeAnnual >= 413351) && (incomeAnnual <= 415050))
        {
            tax = incomeAnnual * 0.35;
        }
        else if (incomeAnnual >= 415051)
        {
            tax = incomeAnnual * 0.396;
        }
        
        return incomeAnnual - tax;
        
    }
    
    private double incomeAfterTaxesMFS(){
        double tax = 0;
        if (incomeAnnual <= 9275)
        {
            tax = incomeAnnual * 0.10;
        }
        else if ((incomeAnnual >= 9276) && (incomeAnnual <= 37650))
        {
            tax = incomeAnnual * 0.15;
        }
        else if ((incomeAnnual >= 37651) && (incomeAnnual <= 75950))
        {
            tax = incomeAnnual * 0.25;
        }
        else if ((incomeAnnual >= 75951) && (incomeAnnual <= 115725))
        {
            tax = incomeAnnual * 0.28;
        }
        else if ((incomeAnnual >= 115726) && (incomeAnnual <= 206675))
        {
            tax = incomeAnnual * 0.33;
        }
        else if ((incomeAnnual >= 206676) && (incomeAnnual <= 233475))
        {
            tax = incomeAnnual * 0.35;
        }
        else if (incomeAnnual >= 233476)
        {
            tax = incomeAnnual * 0.396;
        }
        
        return incomeAnnual - tax;
        
    }
    
    private double incomeAfterTaxesWidOrJoint(){
        double tax = 0;
        if (incomeAnnual <= 18550)
        {
            tax = incomeAnnual * 0.10;
        }
        else if ((incomeAnnual >= 18551) && (incomeAnnual <= 75300))
        {
            tax = incomeAnnual * 0.15;
        }
        else if ((incomeAnnual >= 75301) && (incomeAnnual <= 151900))
        {
            tax = incomeAnnual * 0.25;
        }
        else if ((incomeAnnual >= 151901) && (incomeAnnual <= 231450))
        {
            tax = incomeAnnual * 0.28;
        }
        else if ((incomeAnnual >= 2321451) && (incomeAnnual <= 413350))
        {
            tax = incomeAnnual * 0.33;
        }
        else if ((incomeAnnual >= 413351) && (incomeAnnual <= 466950))
        {
            tax = incomeAnnual * 0.35;
        }
        else if (incomeAnnual >= 466951)
        {
            tax = incomeAnnual * 0.396;
        }
        
        return incomeAnnual - tax;
        
    }
    
    private double incomeAfterTaxesHeadOfHouse(){
        double tax = 0;
        if (incomeAnnual <= 13250)
        {
            tax = incomeAnnual * 0.10;
        }
        else if ((incomeAnnual >= 13251) && (incomeAnnual <= 50400))
        {
            tax = incomeAnnual * 0.15;
        }
        else if ((incomeAnnual >= 50401) && (incomeAnnual <= 130150))
        {
            tax = incomeAnnual * 0.25;
        }
        else if ((incomeAnnual >= 130151) && (incomeAnnual <= 210800))
        {
            tax = incomeAnnual * 0.28;
        }
        else if ((incomeAnnual >= 210801) && (incomeAnnual <= 413350))
        {
            tax = incomeAnnual * 0.33;
        }
        else if ((incomeAnnual >= 413351) && (incomeAnnual <= 414000))
        {
            tax = incomeAnnual * 0.15;
        }
        else if (incomeAnnual >= 414001)
        {
            tax = incomeAnnual * 0.15;
        }
        
        return incomeAnnual - tax;
        
    }

}
