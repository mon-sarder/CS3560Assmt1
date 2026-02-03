/**
 * Represents a lecture instructor.
 * Manages class assignments and student grading.
 */
public class Instructor {
    /* Instructor's full name. */
    private String name;

    /* Instructor's ID */
    private int id;

    /**
     * Constructs a new Instructor.
     * @param name The instructor's full name
     * @param id The instructor's unique identifier
     */
    public Instructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Gets the instructor's name.
     * @return The instructor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the instructor's ID.
     * @return The instructor's ID number
     */
    public int getId() {
        return id;
    }

    /**
     * Assigns a grade to a student.
     * @param student The student receiving the grade
     * @param c The class for which the grade is assigned
     * @param grade The grade value
     */
    public void assignGrade(Student student, Class c, String grade) {}

    /**
     * Generates a formatted schedule.
     * @return The formatted schedule string
     */
    public String generateSchedule() {
        return "";
    }
}