import java.util.Queue;

public class ATC {
    int atc_id;
    int runways;
    int takeoff_limit;
    int landing_limit;
    Queue<Aircraft> takeoffq;
    Queue<Aircraft> landingq;

    public ATC(int atc_id, int runways, int takeoff_limit, int landing_limit, Queue<Aircraft> takeoffq, Queue<Aircraft> landingq) {
        this.atc_id = atc_id;
        this.runways = runways;
        this.takeoff_limit = takeoff_limit;
        this.landing_limit = landing_limit;
        this.takeoffq = takeoffq;
        this.landingq = landingq;
    }

    public int getAtc_id() {
        return atc_id;
    }

    public void setAtc_id(int atc_id) {
        this.atc_id = atc_id;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
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
}
