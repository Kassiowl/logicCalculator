import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Events 
{
    Button propositionOne = new Button();
    Button propositionTwo = new Button();
    Button propositionThree = new Button();
    Button propositionFour = new Button();

    Button operatorOne = new Button();
    Button operatorTwo = new Button();
    Button operatorThree = new Button();


    Button tButton = new Button();
    Button fButton = new Button();
    Button rButton = new Button();

    Button finish = new Button();

    Events()
    {
        setElement(propositionOne,"P");
        setElement(propositionTwo,"Q");
        setElement(propositionThree,"N");
        setElement(propositionFour,"D");
        setElement(operatorOne,"->");
        setElement(operatorTwo,"^");
        setElement(operatorThree,"v");
      
        tButton.setText("TRUE");
        fButton.setText("FALSE");
        finish.setText("FINISH");
        rButton.setText("Reset");

        propositionOne.setLayoutX(1); propositionOne.setLayoutY(330);
        propositionTwo.setLayoutX(30); propositionTwo.setLayoutY(330);
        propositionThree.setLayoutX(60); propositionThree.setLayoutY(330);
        propositionFour.setLayoutX(90); propositionFour.setLayoutY(330);

        operatorOne.setLayoutX(1); operatorOne.setLayoutY(380);
        operatorTwo.setLayoutX(35); operatorTwo.setLayoutY(380);
        operatorThree.setLayoutX(65); operatorThree.setLayoutY(380);

        tButton.setLayoutX(1); tButton.setLayoutY(500);
        fButton.setLayoutX(1); fButton.setLayoutY(550);
        finish.setLayoutX(1); finish.setLayoutY(580);
        rButton.setLayoutX(355); rButton.setLayoutY(580);


        Text prop1 = new Text();
        prop1.setText("P");
        Text prop2 = new Text();
        prop2.setText("Q");
        Text op1 = new Text();
        op1.setText("->");



    }

    public void setElement(Button buttonElement, String text)
    {
        buttonElement.setText(text);
    }

    public void setElement(Text textElement, String text) 
    {
        textElement.setText(text);
    }

    public void InterFaceDelete(Text interFaceText)
    {
        interFaceText.setText("");
    }

    
    
}
