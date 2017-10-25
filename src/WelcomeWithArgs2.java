/** better version of program to show the use of the args array
 * Before clicking 'run', you need to supply two run-time arguments:
 * your first name, and your favorite place of entertainment 
 * Within the Java IDE, select run-arguments to enter these values
 */
public class WelcomeWithArgs2 {
  /** 
   *@param args your name and your fav. place of entertainment
   *@return nothing
    */
  public static void main (String [] args) {
    // check that the user supplied at least two run-time arguments
    if (args.length >= 2) {
       System.out.println("Nice to meet you, " + args[0]);
       System.out.println("I hope you will enjoy this course.\n" +
         " and that you won't spend too much time in " + args[1]);
    }
    else
       System.out.println("You forgot to supply 2 runtime arguments");
  }
}