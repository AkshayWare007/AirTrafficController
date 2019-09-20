import java.util.Scanner;

public class Controller {
    public static int fuelforlanding;
    public static int fuelperunitdistance;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fuel cost for landing an aircraft : ");
        fuelforlanding = sc.nextInt();
        System.out.println("Enter Fuel cost per Distance unit : ");
        fuelperunitdistance = sc.nextInt();

    }

    // Read Json and set Aircraft object and ATC object here
}
