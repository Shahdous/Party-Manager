/**
 * Represents a location and hourly rate of a Venue to host a party.
 */
public class PartyVenue {
    private String location;
    private double hourlyRate;

    public PartyVenue(String location, double hourlyRate) {
        this.location = location;
        this.hourlyRate = hourlyRate;
    }

    public String getLocation() {
        return location;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double newHourlyRate) {
        hourlyRate = newHourlyRate;
    }
}
