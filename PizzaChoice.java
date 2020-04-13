
package pizzachoice;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.List;
public class PizzaChoice {
public static  String [] whatSize = { "S","M","L","X"};
public static String size;
public static double[] sizePrice = {6.99, 8.99, 12.50, 15.00};
public static int s;
public static String answer;
    public static void main(String[] args) throws Exception {
        
        String tryAgain = "Y";
        
        //Continue the do while statement and let the code run as long as tryAgain is = "Y".
        //do{
        do{
            
        pizza();
        
        
        JOptionPane.showConfirmDialog(null,"Do You Want To Try Again?","",JOptionPane.YES_NO_OPTION);
        }while(tryAgain.equals("Y"));
                
        //while()
   }
    public static void pizza(){
        
        //GOAL: If size is included to array list, continue statements
        //GOAL: BUT, If size is not included to array list. Continue with running a JOptionPane Dialogue that says invalid input.
        //if(){
        
        size = JOptionPane.showInputDialog("Enter Pizza Size  \n S = Small \n M = Medium \n L = Large \n X = Extra Large");
        size = size.toUpperCase();
        
        //START IF HERE
        List <String> list = Arrays.asList(whatSize);
        if(list.contains(size)){
        for(s = 0; s < whatSize.length; s++){
           
           if (size.equals(whatSize[s])){
               JOptionPane.showMessageDialog(null,"Your Pizza Price is $" +sizePrice[s]);
      
           }
       }
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Input!");
        }
        //END IF HERE
        //}
    }
}
    

    