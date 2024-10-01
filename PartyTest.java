/**
 * Driver Program
 * Demonstrates how to create & use objects.
 */
import java.text.NumberFormat;

public class PartyTest {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getCurrencyInstance();

        // Create PartyVenue instances
        PartyVenue ballroom = new PartyVenue("Hotel Ballroom", 125.50);
        PartyVenue church = new PartyVenue("Church Basement", 10.00);
        PartyVenue hall = new PartyVenue("Community Hall", 65.00);

        // Create Party instances
        Party bobsRetirement = new Party("Nov 5, 2010", "6 pm", 3, hall, 20);
        Party andrewsBookLaunch = new Party("Sept 16, 2011", "7 pm", 4, ballroom, 250);

        // Create ChildBirthdayParty instances
        ChildBirthdayParty chelseasParty = new ChildBirthdayParty("Dec 18, 2010", "2 pm", 2, church, 9, "Chelsea", 8, "Princess Tea Party");
        ChildBirthdayParty tommiesParty = new ChildBirthdayParty("Nov 30, 2010", "8 pm", 3, hall, 18, "Tommy", 14, "Guitar Hero Mania");

        // Test venue methods
        System.out.println("Current Venue Status:");
        System.out.println("=====================");
        System.out.println(ballroom.getLocation() + ": Hourly Rate: " + f.format(ballroom.getHourlyRate()));
        System.out.println(church.getLocation() + ": Hourly Rate: " + f.format(church.getHourlyRate()));
        System.out.println(hall.getLocation() + ": Hourly Rate: " + f.format(hall.getHourlyRate()));

        hall.setHourlyRate(75.00);
        System.out.println("\nAfter changing the rate:");
        System.out.println("========================");
        System.out.println(hall.getLocation() + ": Hourly Rate: " + f.format(hall.getHourlyRate()));

        // Test party details
        System.out.println("\nCurrent Party Status:");
        System.out.println("=====================");
        System.out.println("Bob's Retirement:");
        System.out.println(bobsRetirement.getDate());
        System.out.println(bobsRetirement.getTime());
        System.out.println(bobsRetirement.getLength() + " hours long");
        System.out.println(bobsRetirement.getVenue().getLocation());
        System.out.println(bobsRetirement.getNumAttending() + " attendees");
        System.out.println("Cost: " + f.format(bobsRetirement.getTotalCost()));

        System.out.println("\n...and after adding 10 more guests:");
        bobsRetirement.setNumAttending(bobsRetirement.getNumAttending() + 10);
        System.out.println("Cost: " + f.format(bobsRetirement.getTotalCost()));

        // Test child birthday party details
        System.out.println("\nCurrent Birthday Party Status:");
        System.out.println("==============================");
        System.out.println("Birthday party for: " + chelseasParty.getGuestOfHonour());
        System.out.println(chelseasParty.getDate());
        System.out.println(chelseasParty.getTime());
        System.out.println(chelseasParty.getLength() + " hours long");
        System.out.println(chelseasParty.getVenue().getLocation());
        System.out.println(chelseasParty.getNumAttending() + " attendees");
        System.out.println(chelseasParty.getAge() + " years old");
        System.out.println("Theme: " + chelseasParty.getTheme());
        System.out.println("Cost: " + f.format(chelseasParty.getTotalCost()));

        System.out.println("\n...and after 2 guests were unable to attend:");
        chelseasParty.setNumAttending(chelseasParty.getNumAttending() - 2);
        System.out.println("Cost: " + f.format(chelseasParty.getTotalCost()));
    }
}
