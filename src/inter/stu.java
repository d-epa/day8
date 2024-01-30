package inter;

public class stu implements mark,extra {
    @Override
    public void printermark() {
        mark.super.printermark();
    }
}