public class Student extends Person{
    private int level;
    private int id;

    public Student(String firstname, String lastname, int age, int phone, String address, int level, int id) {
        super(firstname, lastname, phone, age, address);
        this.level = level;
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "level=" + level +
                ", id=" + id +
                '}';
    }
}