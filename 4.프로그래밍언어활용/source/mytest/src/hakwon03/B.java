package hakwon03;

public class B extends A{
    public void paint() {
        super.draw();
        System.out.print("C");
        this.draw();
    }

    public void draw() {
        System.out.print("D");
    }
}
