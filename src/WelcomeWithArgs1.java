/** program to show the use of the args array
 * Before clicking 'run', you need to supply two run-time arguments:
 * your first name, and your favorite place of entertainment 
 * Within the Java IDE, select run-arguments to enter these values
 * From the command line, put them after the program name before pressing 'enter'
 */
public class WelcomeWithArgs1 {
  public static void main (String [] args) {
    System.out.println("Nice to meet you, " + args[0]);
    System.out.println("I hope you will enjoy this course.\n" +
    " and that you won't spend too much time in " + args[1]);
  }
}