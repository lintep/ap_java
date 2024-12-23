package src.ir.znu.ap.section12;

public class TestClass {

    @Override
    public String toString() {
        System.out.println("print");
        return super.toString();
    }

    public void print(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        TestClass s = new TestClass();
        s.print();
    }
}
