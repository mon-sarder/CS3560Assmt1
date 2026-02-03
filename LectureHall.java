/**
 * Represents a physical location where classes are held.
 * Tracks the location and maintains scheduling information.
 */
public class LectureHall {
    /* Location */
    private String location;

    /**
     * Constructs a new LectureHall.
     * @param location The physical location identifier
     */
    public LectureHall(String location) {
        this.location = location;
    }

    /**
     * Gets the lecture hall's location.
     * @return The location identifier
     */
    public String getLocation() {
        return location;
    }

    /**
     * Generates a formatted schedule.
     * @return The formatted schedule string
     */
    public String generateSchedule() {
        return "";
    }
}