package exam03;

public class Student {
    public int id = 10;
    public String name = "hjchoi";

    @Override
    public String toString() {
        return super.toString() + " : " + this.id + " : " + this.name;
    }
}
