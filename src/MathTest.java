public class MathTest {
public static int a = 10;
public static int b = 7;
public static int c;
public static int d;
public static double k;
    public static void main(String[] args) {

    c = a + b;
    d = 4 + b;
        System.out.println(c);
        System.out.println(d);

    c = a - b;
    d = 4 - b;
        System.out.println(c);
        System.out.println(d);

    c = a * b;
    d = b * 5;
        System.out.println(c);
        System.out.println(d);

    c = a / b;
    d = (int)( 22.5 / 4.5);
    k = 22.5 / 4.5;
        System.out.println(c);
        System.out.println(d);
        System.out.println(k);

    k = 10 / 4;
        System.out.println(k);

    k = 10.0 / 4;
        System.out.println(k);

    a = 33;
    b = 5;
    c = a % b;
    d = 22 % 4;
        System.out.println(c);
        System.out.println(d);

    a = 8;
    b = ++a;
        System.out.println(a);
        System.out.println(b);

    a = 8;
    b = a++;
        System.out.println(a);
        System.out.println(b);

    a = 8;
    b = --a;
        System.out.println(a);
        System.out.println(b);

    a = 8;
    b = a--;
        System.out.println(a);
        System.out.println(b);

    a = 8;
    b = 7;
    c = a + 5 * ++b;
        System.out.println(c);
        System.out.println(b);

    a = 8;
    b = 7;
    c = (a + 5) * ++b;
        System.out.println(c);
        System.out.println(b);

    c = 10 / 5 * 2;
        System.out.println(c);

    k = 2.0 - 1.1;
        System.out.println(k);
    }
}
