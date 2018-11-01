public class main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Square q1 = new Square(5);
        Rectangle r1 = new Rectangle(3, 5);

        System.out.println(c1.toString());
        System.out.println(q1.toString());
        System.out.println(r1.toString());

        c1.resize(1.5);
        q1.resize(1.5);
        r1.resize(1.5);

        System.out.println(c1.toString());
        System.out.println(q1.toString());
        System.out.println(r1.toString());

    }
}
