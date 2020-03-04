public class Person {
    public String name;
//    public static int NextId;

    public Person(String name /*int id*/){
        this.name = name;
//        this.NextId = id;
//        NextId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getId() {
//        return NextId;
//    }
//
//    public void setId(int id) {
//        this.NextId = id;
//    }
}
