public class School {
    private String SchoolName;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;

    public School(String SchoolName){
        this.SchoolName = SchoolName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }
    private Section[] getSections() {
        return sections;
    }

    @Override
    public String toString() {
        String o ="The school " + getSchoolName() + " has " + sectionCount + " sections: ";
        for (int i=0; i<this.sectionCount; i++){
            o += sections[i].getSubject();
            o += " , ";
        }
       o+=".";
        return o;
    }
}
