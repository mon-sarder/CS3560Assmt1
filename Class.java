import java.util.List;
import java.util.ArrayList;

/**
 * Represents the college system.
 * Manages the complete ecosystem of instructors, students, classes, and lecture halls.
 */
public class School {
    /* List of all classes */
    private List<Class> classes;

    /* List of all instructors */
    private List<Instructor> instructors;

    /* List of all students */
    private List<Student> students;

    /* List of all lecture halls */
    private List<LectureHall> halls;

    /*Constructs a new School with empty lists. */
    public School() {
        this.classes = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.students = new ArrayList<>();
        this.halls = new ArrayList<>();
    }

    /**
     * Creates a new class.
     * @param name
     * @param time
     * @return The newly created Class
     */
    public Class createClass(String name, String time) {
        return null;
    }

    /**
     * Deletes a class.
     * @param c The class to be deleted
     */
    public void deleteClass(Class c) {}

    /**
     * Creates a new lecture hall.
     * @param location
     * @return The newly created LectureHall
     */
    public LectureHall createLectureHall(String location) {
        return null;
    }

    /**
     * Deletes a lecture hall.
     * @param hall The lecture hall to be deleted
     */
    public void deleteLectureHall(LectureHall hall) {}

    /**
     * Hires a new instructor.
     * @param name The instructor's name
     * @param id The instructor's ID number
     * @return The newly hired Instructor
     */
    public Instructor hireInstructor(String name, int id) {
        return null;
    }

    /**
     * Terminates an instructor's employment.
     * @param instructor The instructor to be terminated
     */
    public void terminateInstructor(Instructor instructor) {}

    /**
     * Admits a new student.
     * @param name The student's name
     * @param id The student's ID number
     * @return The newly admitted Student
     */
    public Student admitStudent(String name, int id) {
        return null;
    }

    /**
     * Releases a student.
     * @param student The student to be released
     */
    public void releaseStudent(Student student) {}

    /**
     * Generates a formatted course catalog.
     * Lists each class with its prerequisites, times, locations, and instructors.
     * @return The formatted course catalog string
     */
    public String generateCourseCatalog() {
        return "";
    }

    /**
     * Gets the list of all classes.
     * @return The list of classes
     */
    public List<Class> getClasses() {
        return classes;
    }

    /**
     * Gets the list of all instructors.
     * @return The list of instructors
     */
    public List<Instructor> getInstructors() {
        return instructors;
    }

    /**
     * Gets the list of all students.
     * @return The list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Gets the list of all lecture halls.
     * @return The list of lecture halls
     */
    public List<LectureHall> getHalls() {
        return halls;
    }
}