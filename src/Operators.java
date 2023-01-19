public class Operators {
    public static void main(String[] args) {
        int a =10, b  = 3,c ;
        // arithmetic
        c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        c = a/b;
        System.out.println(c);
        c = a%b;
        System.out.println(c);

        // increment - decrement
        a++; //post a = a + 1
        System.out.println(a);
        ++a; // pre a = a + 1
        System.out.println(a);
        a = 10;
        System.out.println(a++ + ++a);
        a =10;
        System.out.println(a++ + a++);
        System.out.println(a);
        a = 10;
        a--; //post a = a - 1
        System.out.println(a);
        --a; // pre a = a - 1
        System.out.println(a);
        a = 10;
        System.out.println(a-- + --a);
        a =10;
        System.out.println(a-- + a--);
        System.out.println(a);

        // relational > < >= <= != ==
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // logical && || ! ^
        System.out.println((a > b) && (a > 0));
        System.out.println((a > b) || (a > 0));
        System.out.println(!((a > b) && !(a > 0)));
        System.out.println((a > b) ^ !(a > 0));

        // ternary
        c = a > b? a : b;
        System.out.println(c);
        c = 90;
        System.out.println((100>=c)&&(c>=80)?'A':'-');

        a = 10;

        a += 10; // a = a+10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);



    }
}
