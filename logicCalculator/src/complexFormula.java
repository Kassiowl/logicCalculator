
public class complexFormula 
{

    int nOperations;

    complexFormula(int nOperations)
    {
        this.nOperations = nOperations;
    }

    boolean callFormula(Boolean[] propositions, char[] operators)
    {
        boolean result = propositions[0];
        int opN = 0;
        while(opN<nOperations)
        {
            boolean secondProposition = propositions[opN+1];
            System.out.println("First proposition:"+ result);
            System.out.println("Second proposition:"+ secondProposition);
            System.out.println("Operator:"+operators[opN]);
            char operator = operators[opN]; 
            Formula fo = new Formula(result, secondProposition,operator);
            result = fo.formulaValue();
            System.out.println("result:" + result);
            opN++;
        }
        return result;
    }
 
    
}
