import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class App extends Application
{
   

    Boolean[] prop = new Boolean[10];
    int propNumber = 0;

    Boolean firstEntry = true;

    char operator;

    char[] operators = new char[10];
    int opNumber = 0;

   

    public static void main(String[] args) throws Exception {
        
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {



        Events bEvt = new Events();


        
     
     
        


        bEvt.tButton.setLayoutX(1); bEvt.tButton.setLayoutY(500);
        bEvt.fButton.setLayoutX(1); bEvt.fButton.setLayoutY(550);
        bEvt.finish.setLayoutX(1); bEvt.finish.setLayoutY(580);


        Text prop1 = new Text();
        Text prop2 = new Text();
        Text prop3 = new Text();
        Text prop4 = new Text();

        Text op1 = new Text();
        Text op2 = new Text();
        Text op3 = new Text();

        Text propositionT = new Text();
        propositionT.setText("Propositions");

        Text operatorsT = new Text();
        operatorsT.setText("Operators");


        propositionT.setX(1); propositionT.setY(320);
        operatorsT.setX(1); operatorsT.setY(370);

        prop1.setX(70); prop1.setY(30); 
        op1.setX(80); op1.setY(30);
        prop2.setX(90); prop2.setY(30);
        op2.setX(100); op2.setY(30);
        prop3.setX(110); prop3.setY(30);
        op3.setX(120); op3.setY(30);    
        prop4.setX(130); prop4.setY(30);

        Pane root = new Pane(); 
        root.getChildren().add(bEvt.propositionOne);
        root.getChildren().add(bEvt.propositionTwo);
        root.getChildren().add(bEvt.propositionThree);
        root.getChildren().add(bEvt.propositionFour);
        root.getChildren().add(operatorsT);
        root.getChildren().add(propositionT);
        root.getChildren().add(bEvt.operatorOne);
        root.getChildren().add(bEvt.operatorTwo);
        root.getChildren().add(bEvt.operatorThree);

        root.getChildren().add(bEvt.tButton);
        root.getChildren().add(bEvt.fButton);
        root.getChildren().add(bEvt.finish);
        root.getChildren().add(bEvt.rButton);


      
  

        bEvt.propositionOne.setOnAction(event ->
        {
        
            if(propNumber==0)
            {
                bEvt.setElement(prop1,"P");
            }
            else if(propNumber==1)
            {
                bEvt.setElement(prop2,"P");
            }
            else if(propNumber==2)
            {
                bEvt.setElement(prop3,"P");
            }
            else
            {
                bEvt.setElement(prop4,"P");
            }
      
    
        });

        bEvt.propositionTwo.setOnAction(event->
        {

            if(propNumber==0)
            {
                bEvt.setElement(prop1,"Q");
            }
            else if(propNumber==1)
            {
                bEvt.setElement(prop2,"Q");
            }
            else if(propNumber==2)
            {
                bEvt.setElement(prop3,"Q");
            }
            else
            {
                bEvt.setElement(prop4,"Q");
            }
   
        });


        bEvt.propositionThree.setOnAction(event->
        {

            if(propNumber==0)
            {
                bEvt.setElement(prop1,"N");
            }
            else if(propNumber==1)
            {
                bEvt.setElement(prop2,"N");
            }
            else if(propNumber==2)
            {
                bEvt.setElement(prop3,"N");
            }
            else
            {
                bEvt.setElement(prop4,"N");
            }
        
          
        });

        bEvt.propositionFour.setOnAction(event->
        {

            if(propNumber==0)
            {
                bEvt.setElement(prop4,"D");
            }
            else if(propNumber==1)
            {
                bEvt.setElement(prop4,"D");
            }
            else if(propNumber==2)
            {
                bEvt.setElement(prop4,"D");
            }
            else
            {
                bEvt.setElement(prop4,"D");
            }
      
          
        });


        bEvt.operatorOne.setOnAction(event->
        {

           if(opNumber==0)
           {
                bEvt.setElement(op1,">");
    
           }
           else if(opNumber==1)
           {
                bEvt.setElement(op2,">");
               
           }
           else
           {
                bEvt.setElement(op3,">");
           }
           operators[opNumber] = '>';
           opNumber++;
        });

        bEvt.operatorTwo.setOnAction(event->
        {

            if(opNumber==0)
            {
                 bEvt.setElement(op1,"^");
            }
            else if(opNumber==1)
            {
                 bEvt.setElement(op2,"^");
            }
            else
            {
                bEvt.setElement(op3,"^");
            }

            operators[opNumber] = '^';
            opNumber++;


        });

        bEvt.operatorThree.setOnAction(event->
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

        });

        bEvt.tButton.setOnAction(event->
        {
            
            prop[propNumber] = true;
            propNumber++;
    
        });

        bEvt.fButton.setOnAction(event->
        {
           prop[propNumber] = false;
           propNumber++;
        
        });


        Text propValue = new Text();
        bEvt.finish.setOnAction(event->
        {
            complexFormula cfo = new complexFormula(opNumber);
            boolean result = cfo.callFormula(prop,operators);
            System.out.println("result:" + result);
            if(result==true)
            {
                propValue.setText("True");
            }
            else
            {
                propValue.setText("False");
            }
          
          
        });

        bEvt.rButton.setOnAction(event->
        {
            
            opNumber = 0;
            propNumber = 0;


            bEvt.InterFaceDelete(prop1);
            bEvt.InterFaceDelete(prop2);
            bEvt.InterFaceDelete(prop3);
            bEvt.InterFaceDelete(prop4);


            bEvt.InterFaceDelete(op1);
            bEvt.InterFaceDelete(op2);
            bEvt.InterFaceDelete(op3);
            bEvt.InterFaceDelete(propValue);
          

        });

        propValue.setX(276); propValue.setY(169);

        root.getChildren().add(prop1);
        root.getChildren().add(prop2);
        root.getChildren().add(prop3);
        root.getChildren().add(prop4);
        root.getChildren().add(op1);
        root.getChildren().add(op2);
        root.getChildren().add(op3);


        root.getChildren().add(propValue);

        stage.getIcons().add(new Image("file:icon.jpg"));
        stage.setTitle("ogic calculator");
        stage.setScene(new Scene((root),400,600));
        stage.show();
    }

  
}
