/**
 * Representative of an academic course section.
 * Knows the name, time, location, and participants.
 */
public class Class {
    private String name;
    private String time;
    private List<Class> prerequisites;
    private LectureHall location;
    private Instructor instructor;
    private List<Student> roster;

    /* @param student The student to be added. */
    public void addStudent(Student student) {}

    /* @return The formatted roster. */
    public String generateRoster() { return ""; }
}