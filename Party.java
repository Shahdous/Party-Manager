/**
 * Represents a Party with its description and Venue.
 */
public class Party extends PartyVenue {
    private String date;
    private String time;
    private int length;
    private int numAttending;
    private PartyVenue venue;

    public Party(String date, String time, int length, PartyVenue venue, int numAttending) {
        super(venue.getLocation(), venue.getHourlyRate());
        this.date = date;
        this.time = time;
        this.length = length;
        this.numAttending = numAttending;
        this.venue = venue;
    }

    public int getLength() {
        return length;
    }

    public double venueRentalFee() {
        return length * super.getHourlyRate();
    }

    public PartyVenue getVenue() {
        return venue;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getNumAttending() {
        return numAttending;
    }

    public void setNumAttending(int newNumAttending) {
        numAttending = newNumAttending;
    }

    public double getTotalCost() {
        int feePerGuest = 0;
        if (numAttending >= 500) {
            feePerGuest = 25;
        } else if (numAttending >= 250 && numAttending < 500) {
            feePerGuest = 30;
        } else if (numAttending >= 50 && numAttending < 250) {
            feePerGuest = 35;
        } else if (numAttending >= 0 && numAttending < 50) {
            feePerGuest = 40;
        }
        return venueRentalFee() + (numAttending * feePerGuest);
    }
}
