package java;

/**
 * Created with IntelliJ IDEA.
 * User: jldalton
 * Date: 6/21/12
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Shorty {

    public static void main(String[] args) {
        Integer i = new Integer(32767);
        Short s = i.shortValue();
        System.out.println(s); // same

        i = new Integer(32768);
        s = i.shortValue();
        System.out.println(s); // -32768

        i = new Integer(32769);
        s = i.shortValue();
        System.out.println(s); // -32767

        i = new Integer(64000);
        s = i.shortValue();
        System.out.println(s);

        i = new Integer(65535);
        s = i.shortValue();
        System.out.println(s); // -1

        i = new Integer(65536);
        s = i.shortValue();
        System.out.println(s); // 0

        i = new Integer(65537);
        s = i.shortValue();
        System.out.println(s); // 1

        i = new Integer(65536+32767);
        s = i.shortValue();
        System.out.println(s); // 32767

        i = new Integer(65536+32768);
        s = i.shortValue();
        System.out.println(s); // -32768

        i = new Integer(65536+32769);
        s = i.shortValue();
        System.out.println(s); // -32767

    }
}
