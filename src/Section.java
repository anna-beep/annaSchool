public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String subject;
    private int currentSize = 0;

    public Section(String subject){
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString(){
        String b = subject + " is taught by " + teacher.getSubject() + " and has size " + currentSize + " students. ";
        for (int i=0; i<this.currentSize; i++){
            b += students[i].getName();
            b += " , ";
        }
        b+=".";
        return b;
    }
}
