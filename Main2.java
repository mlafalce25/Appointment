import java.util.*;
/**
 * Keep a list of heterogeneous appointments
 * 
 * @author  Professor K
 * @revised
 * @version 19Nov2015
 */
public class Main2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { 
        ArrayList<Appointment> a = new ArrayList();

        // Add to the list of a appointments at least 8 appointments of various types
        a.add(new appointment())
        

        int m, d, y;
        do {
            System.out.print("Enter month: ");
            m = input.nextInt();
            System.out.print("Enter day: ");
            d = input.nextInt();
            System.out.print("Enter year: ");
            y = input.nextInt();
            
            // Write the code that checks the list of appointments to see if the
            // input date occurs on any of our appointments

        } while (m != -1);
        System.out.println("Bye!!");
    }

}
