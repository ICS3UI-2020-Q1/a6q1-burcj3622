import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

    System.out.println("How many heights would you like to enter");
   
    //asks user for number
    int NUM_A = input.nextInt();
    // number of slots
    double [] hights = new double [NUM_A];
    
    for(int i = 0; i < hights.length;i++){
    System.out.println("Please enter the heights on separate lines " + (i+1));
    hights[i] = input.nextDouble();
    }
    
    // create a variable to store
    double sum = 0;

    // use a for loop to go through the array 
    for (int i = 0; i < hights.length; i++){
    sum = sum + hights[i];
    }

     double average = sum /hights.length;

    // let the user know
    System.out.println("The average height is " + average);

    for (int i = 0; i < hights.length; i++){
    if(average<hights[i]){System.out.println("the heights above average are " + hights[i]);
    }
    }

  }
}
