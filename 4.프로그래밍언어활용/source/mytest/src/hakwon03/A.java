package hakwon03;

public class A {
    public void paint() {
        System.out.println("A paint");

    }
    public void draw() {
        System.out.println("A draw");
        this.draw();
    }
}
