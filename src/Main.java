//  class UserBirthday
public class Main {
    //   main()
    public static void main(String[] args) {

        //output “What is your birth Month? (1 – 12): “
        System.out.println("What is your birth month?: ");
        //num birthMonth
        int birthMonth = 13;
        // simulated birth month input
        System.out.println("Simulated birth month input: " + birthMonth);
//        input birthMonth

        //  if birthMonth > 12 AND birthMonth < 1
        if(birthMonth > 12) {
            // output “You entered an incorrect month value:” + birthMonth
            System.out.println("You entered an incorrect month value: " + birthMonth);
        } else if (birthMonth < 1) {
            // output “You entered an incorrect month value:” + birthMonth
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
        //else
        else{
            // output “Your birth month is:” + birthMonth
            System.out.println("Your birth month is: " + birthMonth);
        }
        //  endif

    }// return
}// end class