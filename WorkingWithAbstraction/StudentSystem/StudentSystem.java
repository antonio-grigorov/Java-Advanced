package src.WorkingWithAbstraction.StudentSystem;

public class StudentSystem {
    private StudentRepository repo;

    public StudentSystem(StudentRepository repo) {
        this.repo = repo;
    }


    public String studentInformationFor(String name) {
        if (repo.containsStudentWith(name)) {
            Student student = repo.findBy(name);
            return student.studentInformation();
        }
        return null;
    }

    public void persistUniqueStudent(Student student) {

        if (!repo.containsStudentWith(student.getName())) {
            repo.save(student);
        }
    }


}
