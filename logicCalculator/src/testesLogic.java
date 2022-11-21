import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class testesLogic {
    @Test
    public void formulaValuesTrue()
    {

        char[] operators = {'^', 'v', '>'};

        //Todos verdades
        for (int i = 0; i < operators.length; i++) {
            Formula formula1 =  new Formula(true,true, operators[i]);
        
            assertEquals(true, formula1.formulaValue());

        }



    }

    @Test
    public void formulaValuesFalse()
    {
        Formula formula_imp1 =  new Formula(true,false, '>');
        assertEquals(false, formula_imp1.formulaValue());

        Formula formula_and =  new Formula(false,true, '^');
        assertEquals(false, formula_and.formulaValue());
        Formula formula_and2 = new Formula(true,false, '^');
        assertEquals(false, formula_and2.formulaValue());
        Formula formula_and3 = new Formula(false,false, '^');
        assertEquals(false, formula_and3.formulaValue());
        Formula formula_or = new Formula(false,false, 'v');
        assertEquals(false, formula_or.formulaValue());
    }
    
    @Test
    public void implication()
    {
        Formula formula_impl_true = new Formula(false, true,'>');

        Formula formula_impl_false = new Formula(true, false, '>');

        Formula formula_impl_true2 = new Formula(true, true, '>');

        assertEquals(true, formula_impl_true.formulaValue());
        assertEquals(false, formula_impl_false.formulaValue());
        assertEquals(true, formula_impl_true2.formulaValue());
    }

    @Test
    public void complexFormula()
    {
        
        Boolean[] Prop = new Boolean[3];

        Arrays.fill(Prop, true);
        Arrays.fill(Prop, false);
        Arrays.fill(Prop, true);
        Arrays.fill(Prop, false);

        //(T ^ F) v T) > F  // False

        char[] operatorsT = {'^', 'v', '>'};

        complexFormula formula1 = new complexFormula(operatorsT.length-1);
        assertEquals(false,formula1.callFormula(Prop, operatorsT));


        Boolean[] Prop2 = new Boolean[3];

        Arrays.fill(Prop2, false);
        Arrays.fill(Prop2, false);
        Arrays.fill(Prop2, true);
        Arrays.fill(Prop2, true);

        //(F ^ F) v T) > T  // TRUE
        complexFormula formula2 = new complexFormula(operatorsT.length-1);
        assertEquals(true, formula2.callFormula(Prop2, operatorsT));

    }

}
