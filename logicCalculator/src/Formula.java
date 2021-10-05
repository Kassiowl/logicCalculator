
public class Formula extends Operations
{

    Formula(boolean firstProposition, boolean secondProposition, char operator) {
        super(firstProposition, secondProposition, operator);
        
    }
        
  

    public boolean formulaValue()
    {
        switch(operator)
        {
            case '^':
                return firstProposition && secondProposition;
            case 'v':
                return firstProposition || secondProposition;
     
            case '>':
                if(firstProposition==false)
                {
                 
                    return true;
                }
                else if(secondProposition==false)
                {
               
                    return false;
             
                }
                return true;
       
        }
        return true;

    }






 
   

}



