public class Runner {
    public static void main (String[] args){

        School berkeleyHigh = new School ("Berkeley High");

        Section math = new Section ("Math");
        Section biology = new Section ("Biology");
        Section compSci = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher mueller = new Teacher("Mueller", "Biology");
        Teacher albrecht = new Teacher("Albrecht", "Math");

        Student me = new Student("Anna", 11);
        Student lyndon = new Student("Lyndon", 9);
        Student finn = new Student("Finn", 12);
        Student zephyr = new Student("Zephyr", 13);
        Student humble = new Student("Humble", 10);
        Student afraz = new Student("Afraz", 4);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(biology);
        berkeleyHigh.addSection(compSci);

        albinson.addTeacher(compSci);
        mueller.addTeacher(biology);
        albrecht.addTeacher(math);

        math.setTeacher(albrecht);
        math.addStudent(me);
        math.addStudent(lyndon);
        math.addStudent(finn);
        math.addStudent(zephyr);
        zephyr.addSection(math);
        me.addSection(math);
        lyndon.addSection(math);
        finn.addSection(math);

        biology.setTeacher(mueller);
        biology.addStudent(me);
        biology.addStudent(lyndon);
        biology.addStudent(finn);
        me.addSection(biology);
        lyndon.addSection(biology);
        finn.addSection(biology);

        compSci.setTeacher(albinson);
        compSci.addStudent(me);
        compSci.addStudent(humble);
        compSci.addStudent(afraz);
        me.addSection(compSci);
        humble.addSection(compSci);
        afraz.addSection(compSci);


        System.out.println(berkeleyHigh.toString());

        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSci.toString());

        System.out.println(albinson.toString());
        System.out.println(mueller.toString());
        System.out.println(albrecht.toString());

        System.out.println(me.toString());
        System.out.println(lyndon.toString());
        System.out.println(finn.toString());
        System.out.println(zephyr.toString());
        System.out.println(lyndon.toString());
        System.out.println(afraz.toString());
    }

}