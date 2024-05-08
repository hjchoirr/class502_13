package hakwon03;

public class A {
    public void paint() {
        System.out.print("A");
    }
    public void draw() {
        System.out.print("B");
        draw();
    }
}
