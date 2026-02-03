import java.util.List;
import java.util.ArrayList;

/**
 * Represents an academic course section.
 * Manages course information including name, time, location, instructor, prerequisites, and enrolled students.
 */
public class Class {
    /* Course name */
    private String name;

    /* Scheduled class time */
    private String time;

    /* Prerequisites for the class */
    private List<Class> prerequisites;

    /* Lecture hall location*/
    private LectureHall location;

    /* Lecture instructor/professor */
    private Instructor instructor;

    /* Roster of enrolled students */
    private List<Student> roster;

    /**
     * Constructs a new Class.
     * @param name The name of the course
     * @param time The scheduled time for the class
     */
    public Class(String name, String time) {
        this.name = name;
        this.time = time;
        this.prerequisites = new ArrayList<>();
        this.roster = new ArrayList<>();
    }

    /**
     * Gets the class name.
     * @return The name of the class
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the class time.
     * @return The scheduled time
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the time for the class.
     * @param time The new scheduled time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Assigns a lecture hall to the class.
     * @param location The lecture hall where the class will be held
     */
    public void setLocation(LectureHall location) {
        this.location = location;
    }

    /**
     * Gets the lecture hall for the class.
     * @return The assigned lecture hall
     */
    public LectureHall getLocation() {
        return location;
    }

    /**
     * Assigns an instructor to teach the class.
     * @param instructor The instructor who will teach the class
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * Gets the instructor for the class.
     * @return The assigned instructor
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Adds a prerequisite class.
     * @param prereq The prerequisite class to add
     */
    public void addPrerequisite(Class prereq) {}

    /**
     * Gets the list of prerequisite classes.
     * @return The list of prerequisites
     */
    public List<Class> getPrerequisites() {
        return prerequisites;
    }

    /**
     * Adds a student to the class roster.
     * @param student The student to be added
     */
    public void addStudent(Student student) {}

    /**
     * Removes a student from the class roster.
     * @param student The student to be removed
     */
    public void removeStudent(Student student) {}

    /**
     * Generates a formatted roster listing the class details.
     * @return The formatted roster string
     */
    public String generateRoster() {
        return "";
    }
}