import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;




public class logicCalculatorController extends App{



    Events setElement = new Events();

    @FXML
    private Text prop1, prop2, prop3, prop4;

    @FXML
    private Text op1, op2, op3;

    @FXML
    private Label propValue;

    @FXML
    private Button fButton;

    @FXML
    private Button operatorOne;

    @FXML
    private Button operatorThree;

    @FXML
    private Button operatorTwo;

    @FXML Button propositionFour;

    @FXML Button propositionOne;

    @FXML Button propositionThree;

    @FXML Button propositionTwo;

    @FXML
    private Button rButton;

    @FXML
    private Button rButton1;

    @FXML
    private Button tButton;

    @FXML
    void fButtonEvent(ActionEvent event) 
    {
        prop[propNumber] = false;
        System.out.println("prop[propNumber]="+ prop[propNumber]);
        propNumber++;
        System.out.println("propNumber=" +propNumber);

    }

    @FXML
    void tButtonEvent(ActionEvent event) 
    {
        System.out.println("True");
        prop[propNumber] = true;
        System.out.println("prop[propNumber]="+ prop[propNumber]);
        propNumber++;
        System.out.println("propNumber=" +propNumber);

    }
    
    @FXML
    void negateEvent(ActionEvent event) 
    {
        if(prop[propNumber-1]==true)
        {
            prop[propNumber-1] = false;
        }
        else
        {
            prop[propNumber-1] = true;
        }

        String proposition;
        switch(propNumber){
            case 1:
                proposition = prop1.getText();
                prop1.setText("¬" + proposition);
            break;
            case 2:
                proposition = prop2.getText();
                prop2.setText("¬" + proposition);
            break;
            case 3:
                proposition = prop3.getText();
                prop3.setText("¬" + proposition);
            case 4:
                proposition = prop4.getText();
                prop4.setText("¬" + proposition);
            break;
        }

    }

    @FXML
    void operatorOneEvent(ActionEvent event) 
    {

        if(opNumber==0)
        {
             op1.setText("->");
        }
        else if(opNumber==1)
        {
             op2.setText("->");
        }
        else
        {
            op3.setText("->");
        }

        System.out.println("->");
        operators[opNumber] = '>';
        opNumber++;
        System.out.println("opNumber"+opNumber);
    }

    @FXML
    void operatorThreeEvent(ActionEvent event) 
    {
        if(opNumber==0)
        {
             op1.setText("v");
        }
        else if(opNumber==1)
        {
             op2.setText("v");
        }
        else
        {
            op3.setText("v");
        }
     
        operators[opNumber] = 'v';
        opNumber++;
        System.out.println("opNumber"+opNumber);

    }

    @FXML
    void operatorTwoEvent(ActionEvent event) 
    {
        if(opNumber==0)
        {
             op1.setText("^");
        }
        else if(opNumber==1)
        {
             op2.setText("^");
        }
        else
        {
            op3.setText("^");
        }

        operators[opNumber] = '^';
        opNumber++;
        System.out.println("opNumber"+opNumber);
    }

    @FXML
    void propositionFourEvent(ActionEvent event) 
    {
        if(propNumber==0)
        {
            prop1.setText("D");
        }
        else if(propNumber==1)
        {
            prop2.setText("D");
        }
        else if(propNumber==2)
        {
        
            prop3.setText("D");
        }
        else
        {
     
            prop4.setText("D");
        }

    }

    @FXML
    void propositionOneEvent(ActionEvent event) 
    {
                

        if(propNumber==0)
        {
            prop1.setText("P");
        }
        else if(propNumber==1)
        {
            prop2.setText("P");
        }
        else if(propNumber==2)
        {
   
            prop3.setText("P");
        }
        else
        {
  
            prop4.setText("P");
        }
  

    }

    @FXML
    void propositionThreeEvent(ActionEvent event) 
    {
        if(propNumber==0)
        {
            prop1.setText("N");

        }
        else if(propNumber==1)
        {
            prop2.setText("N");
        }
        else if(propNumber==2)
        {
    
            prop3.setText("N");
        }
        else
        {
  
            prop4.setText("N");
        }
    

    }

    @FXML
    void propositionTwoEvent(ActionEvent event) 
    {
        
        if(propNumber==0)
        {
            prop1.setText("Q");
        }
        else if(propNumber==1)
        {
            prop2.setText("Q");
        }
        else if(propNumber==2)
        {
       
            prop3.setText("Q");
        }
        else
        {
  
            prop4.setText("Q");
        }

    }

    @FXML
    void resetEvent(ActionEvent event) 
    {
                
        System.out.println("RESET");
        opNumber = 0;
        propNumber = 0;
        propValue.setText("");
        prop1.setText("");
        prop2.setText("");
        prop3.setText("");
        prop4.setText("");

        op1.setText("");
        op2.setText("");
        op3.setText("");


    }

    @FXML
    void finishEvent(ActionEvent event) 
    {
        System.out.println("opNumber"+opNumber);
        complexFormula cfo = new complexFormula(opNumber);
        boolean result = cfo.callFormula(prop,operators);
  
        if(result==true)
        {
         
            propValue.setText("True");
        }
        else
        {
            propValue.setText("False");
        }
      
    }

}
