import java.awt.*;  
import java.awt.event.*;  


public class LabActivity4EmpInfoSystemGUI extends Frame{

//Labels    
public Label lFName ;
public Label lLName ; 
public Label lAge ; 
public Label lHWorked;
public Label lHWage;
public Label lOutput;


//textfield
public TextField tFName;
public TextField tLName;
public TextField tAge;
public TextField tHWorked;
public TextField tHWage;
public TextArea AOutput;

public Button submit;

// Panels
public Panel FPanel;
public Panel SPanel;
public Panel TPanel;






 public LabActivity4EmpInfoSystemGUI(){
     
     addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
    });
     
     
// Labels 
     FPanel = new Panel(new GridLayout(8,2)); 
     lFName = new Label("First Name");
     FPanel.add(lFName);                    
     
     tFName = new TextField();
     FPanel.add(tFName);
     
     lLName = new Label("Last Name");
     FPanel.add(lLName);  
     
     tLName = new TextField();
     FPanel.add(tLName);
    
     lAge = new Label("Age");
     FPanel.add(lAge); 
     
     tAge = new TextField();
     FPanel.add(tAge);
    
     lHWorked = new Label("Hours Worked");
     FPanel.add(lHWorked);    
     
     tHWorked = new TextField();
     FPanel.add(tHWorked);
     
     lHWage = new Label("Hourly Rate");
     FPanel.add(lHWage);   
     
     tHWage= new TextField();
     FPanel.add(tHWage);
     
     
     SPanel = new Panel(new FlowLayout()); 
     submit = new Button ("Submit");
     submitActionListener listener = new submitActionListener();
     submit.addActionListener(listener);
     SPanel.add(submit);
     
     
     
     TPanel = new Panel(new GridLayout(2,2)); 
     lOutput = new Label("Output:");
     TPanel.add(lOutput);   
  
     AOutput = new TextArea();
     AOutput.setEditable(false);
     TPanel.add(AOutput);
     
     add(FPanel);
     add(SPanel);
     add(TPanel);
     
    
   
     setTitle("EmployeeInformationSystem");
     setSize(800, 800);   
     setVisible(true);
     setLayout(new GridLayout(3,2));
     

 }
  private class submitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            String FName = tFName.getText();
            String LName = tLName.getText();

            if (FName.isEmpty() || LName.isEmpty()) {
                 AOutput.setText("Error : All fields must be filled out.");
                 return;
              }
            
         int age;
           try {
              age = Integer.parseInt(tAge.getText());
              if (age <= 0) {
              AOutput.setText("Error : Age must be a Valid Integer");
              return;
             }
           } catch (NumberFormatException ex) {
             AOutput.setText("Error : Age must be a Valid Integer");
              return;
            }

         double workedHours = 0;
         double hourlyWage = 0;
        
         try {
           workedHours = Double.parseDouble(tHWorked.getText());
           hourlyWage = Double.parseDouble(tHWage.getText());

         if (workedHours < 0 || hourlyWage < 0) {
            AOutput.setText("Error : Hours worked and Hourly rate must be valid numbers");
            return;
        }
        
        } catch (NumberFormatException ex) {
           AOutput.setText("Error : Hours worked and Hourly rate must be valid numbers");
           return;
        }

        String fullName = FName + " " + LName;
        double salary = workedHours * hourlyWage;

    AOutput.setText("Name: " + fullName + "\nAge: " + age + " years old" + "\nDaily Salary: PHP " + String.format("%.2f", salary));
    } catch (Exception ex) {
    AOutput.setText("Unexpected error occurred.");
    }

    }
}

        public static void main(String[] args) {
        LabActivity4EmpInfoSystemGUI app =  new LabActivity4EmpInfoSystemGUI();
    }
 }
