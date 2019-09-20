public class Aircraft {
    int aircraft_id;
    int remaining_fuel;

    public void setAircraft_id(int aircraft_id) {
        this.aircraft_id = aircraft_id;
    }

    public void setRemaining_fuel(int remaining_fuel) {
        this.remaining_fuel = remaining_fuel;
    }

    public int getAircraft_id() {

        return aircraft_id;
    }

    public int getRemaining_fuel() {
        return remaining_fuel;
    }

    public Aircraft(int aircraft_id, int remaining_fuel) {

        this.aircraft_id = aircraft_id;
        this.remaining_fuel = remaining_fuel;
    }
}
