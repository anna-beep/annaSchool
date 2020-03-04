public class Student extends Person {
    private Section[] sections = new Section[10];
    private int sectionCount = 0;
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    @Override
    public String toString() {
        return getName() + " is in " + getGrade() + "th grade and is enrolled in the following sections: " + subjects();
    }

    public String subjects(){
        String a ="";
        for (int i=0; i<sectionCount; i++){
            a += sections[i].getSubject() + "(" + sections[i].getCurrentSize() + ")";
        }
        a+=".";
        return a;
    }
}
