public class Datatypes {
    public static void main(String[] args) {
        //numbers char fractional
        // int long -> Integer and Long
        // float double -> Float and Double
        // char -> Character
        // bool -> Boolean

        int sumitMore = 10,a,b =20;
        a = 10;
        long d1 = 199L;
        float c = 10.00f,m;
        double d = 10.9898729;
        char d2 ='\u2660' ,d3 = 'A';

        System.out.println(a);
        System.out.println(a + b);
        System.out.println("Add " + (a + b));
        System.out.println(d2 + " " + d3);

        m = (float) a / b; // typecasting
        System.out.println(m);
        Integer a1 =10;

        m = a1.floatValue() / b;
        System.out.println(m);
    }
}
