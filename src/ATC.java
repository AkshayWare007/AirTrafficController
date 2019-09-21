import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ATC {
    private int atc_id;
    private LinkedList<Boolean> runway = new LinkedList<>();
    private int runway_capacity;
    private int takeoff_limit;
    private int landing_limit;
    private Queue<Aircraft> takeoffq;
    private Queue<Aircraft> landingq;

    public ATC(int atc_id, LinkedList<Boolean> list, int runway_capacity, int takeoff_limit, int landing_limit, Queue<Aircraft> takeoffq, Queue<Aircraft> landingq) {
        this.atc_id = atc_id;
        this.runway = list;
        this.runway_capacity = runway_capacity;
        this.takeoff_limit = takeoff_limit;
        this.landing_limit = landing_limit;
        this.takeoffq = takeoffq;
        this.landingq = landingq;
    }

    private ATC(int rc) {
        this.runway_capacity = rc;
    }

    public int getAtc_id() {
        return atc_id;
    }

    public void setAtc_id(int atc_id) {
        this.atc_id = atc_id;
    }

    public LinkedList<Boolean> getList() {
        return runway;
    }

    public void setList(LinkedList<Boolean> list) {
        this.runway = list;
    }

    public int getRunway_capacity() {
        return runway_capacity;
    }

    public void setRunway_capacity(int runway_capacity) {
        this.runway_capacity = runway_capacity;
    }

    public int getTakeoff_limit() {
        return takeoff_limit;
    }

    public void setTakeoff_limit(int takeoff_limit) {
        this.takeoff_limit = takeoff_limit;
    }

    public int getLanding_limit() {
        return landing_limit;
    }

    public void setLanding_limit(int landing_limit) {
        this.landing_limit = landing_limit;
    }

    public Queue<Aircraft> getTakeoffq() {
        return takeoffq;
    }

    public void setTakeoffq(Queue<Aircraft> takeoffq) {
        this.takeoffq = takeoffq;
    }

    public Queue<Aircraft> getLandingq() {
        return landingq;
    }

    public void setLandingq(Queue<Aircraft> landingq) {
        this.landingq = landingq;
    }

    //synchronize takeOff and landing

    private void executeCommand(String command) throws InterruptedException{
        synchronized (this){
            while(runway.size() == runway_capacity)
                wait();

            System.out.println("Runway has become empty now .......\nReady to " +command);
            runway.add(true);

            Thread.sleep(10000);
            runway.removeFirst();
            System.out.println(command + " successfull ");
        }
    }

    private Thread createThread(String cmd){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    executeCommand(cmd);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return t1;
    }

    public static void main(String[] args) throws InterruptedException {
        final ATC atc = new ATC(2);
        Scanner sc = new Scanner(System.in);
        String cmd;
        do {
            cmd = sc.nextLine();
            atc.createThread(cmd).start();
        }while (!cmd.equals("exit"));

    }
}

