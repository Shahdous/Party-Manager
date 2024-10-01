/**
 * Represents a Party for a Child with its description and Venue.
 */
public class ChildBirthdayParty extends Party {
    private String guestOfHonour;
    private int age;
    private String theme;

    public ChildBirthdayParty(String date, String startTime, int hours, PartyVenue venue, int numberOfGuests, String guestOfHonour, int age, String theme) {
        super(date, startTime, hours, venue, numberOfGuests);
        this.guestOfHonour = guestOfHonour;
        this.age = age;
        this.theme = theme;
    }

    public String getGuestOfHonour() {
        return guestOfHonour;
    }

    public int getAge() {
        return age;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public double getTotalCost() {
        int feePerGuest = 15;
        return venueRentalFee() + (getNumAttending() * feePerGuest);
    }
}
