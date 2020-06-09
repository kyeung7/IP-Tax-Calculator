// Convert to exe, tax calculator and cost
import java.util.*; 
import java.util.function.Supplier;

class MoneyMe {
   public static boolean flag = false;
   public static List<String> states = new ArrayList<String>();
   
   public static void main(String args[]) {
      System.out.println("****************************** WELCOME TO MoneyMe! ******************************");
      
      // Setup states list
      states.add("Vermont");
      states.add("Massahcusetts");
      
      while(!flag) {
         Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
         
         System.out.println("This program is for investors and newbies looking to calculate commission and " +
         "tax \n costs on their income. To continue setup your profile by entering necessiary information. Then " +
         "select the option to calculate your tax expenses! \n" +
         "1) Change your residing state \n" +
         "2) Calculate income tax (and stock profits) \n" +
         "3) Calculate stock transaction expenses (profit - (taxes + commission rates)) \n");
         
         String userInput = scannerObj.nextLine();  // Read user input
         
         System.out.println("Detected user input: " + userInput);  // Output user input
         
         if (userInput.equals("quit") || userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {
            if (userInput.equals("quit")) {
               System.out.println("Goodbye!");
               flag = true;
            }
            if (userInput.equals("1")) {
               System.out.println("Enter the state where your taxes are done. \n " + 
               "1) Vermont \n 2) Massahcusetts \n 3) INVALID PLACEHOLDER");
             
               String inputState = scannerObj.nextLine();  // Read user input
               System.out.println("Detected user input: " + inputState);  // Output user input
            }
            if (userInput.equals("2")) {
               System.out.println("Enter your total annual income: ");
             
               String inputIncome = scannerObj.nextLine();  // Read user input
               System.out.println("Detected user input: " + inputIncome);  // Output user input
            }
            if (userInput.equals("3")) {
               System.out.println("Enter the profit from your stock transaction (Exit Value - Initial Value): ");
             
               String inputStockProfit = scannerObj.nextLine();  // Read user input
               System.out.println("Detected user input: " + inputStockProfit);  // Output user input
            }
         } else {
            System.out.println("Invalid input, please reread the prompt and try again. \n");
         }
      }
   }

}