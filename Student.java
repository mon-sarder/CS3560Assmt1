import java.util.Map;
import java.util.HashMap;

/**
 * Represents a student in the school.
 * Tracks student information, enrollment, and grades.
 */
public class Student {
    /* Student's full name */
    private String name;

    /* Student's ID */
    private int id;

    /* Maps each enrolled Class to the student's grade */
    private Map<Class, String> grades;

    /**
     * Constructs a new Student.
     * @param name The student's full name
     * @param id The student's unique identifier
     */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    /**
     * Gets the student's name.
     * @return The student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the student's ID.
     * @return The student's ID number
     */
    public int getId() {
        return id;
    }

    /**
     * Enrolls the student in a class.
     * @param c The class to add
     */
    public void addClass(Class c) {}

    /**
     * Drops the student from a class.
     * @param c The class to drop
     */
    public void dropClass(Class c) {}

    /**
     * Records a grade.
     * @param c The class for which the grade is assigned
     * @param grade The grade value
     */
    public void setGrade(Class c, String grade) {}

    /**
     * Generates a formatted report card.
     * @return The formatted report card string
     */
    public String generateReportCard() {
        return "";
    }

    /**
     * Generates a formatted schedule.
     * @return The formatted schedule string
     */
    public String generateSchedule() {
        return "";
    }
}