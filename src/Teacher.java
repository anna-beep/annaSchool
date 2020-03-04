public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private int sectionCount = 0;
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() { return sections; }

    public void addTeacher(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    @Override
    public String toString() {
        return getName() + "is taught by " + subject + "and has " + getSectionCount() + "students" +sectionExtension();
    }
    public String sectionExtension() {
        String o = "";
        for (int i=0; i<getSectionCount(); i++) {
            o += sections[i].getSubject();
            o+= "("+ this.sectionCount + ")";
        }
        o+=".";
        return o;
    }

}

