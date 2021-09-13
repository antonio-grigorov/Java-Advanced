package src.WorkingWithAbstraction.StudentSystem;

public interface StudentRepository {
    /**
     * Check whether the repository contains a student with the given name
     *
     * @param name of the student to look for
     * @return true if student is found, false otherwise
     */
    boolean containsStudentWith(String name);

    /**
     * given a student name, return the
     * student from the repo
     * @param name of the student to fetch
     * @return the student with the given name if found
     * null if not present
     *
     */
    Student findBy(String name);

    /**
     * add student to the repo
     * @param student to be persisted.
     */
    void save(Student student);




}
