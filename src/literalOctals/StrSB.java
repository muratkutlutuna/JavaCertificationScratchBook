package literalOctals;

public class StrSB {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("This ");
        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));
        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        StringBuilder b = a.append("Java ");
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b.append("is").append(" so ").append("Cool");
        System.out.println("System.identityHashCode(a) = " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b) = " + System.identityHashCode(b));

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String str = "Hello";
        String str2 = new String(str);
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("str = " + str);
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("str2 = " + str2);
        System.out.println("str==str2 = " + (str == str2));
        System.out.println("\"Hello\".equals(str) = " + "Hello".equals(str));
        System.out.println("System.identityHashCode(\"Hello\") = " + System.identityHashCode("Hello"));
        System.out.println("\"Hello\"==str = " + ("Hello"==str));
        System.out.println("\"Hello\"==str2 = " + ("Hello"==str2));
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("sb = " + sb);
        System.out.println("System.identityHashCode(sb) = " + System.identityHashCode(sb));
        str.equals(sb);
        sb.append(3);
        System.out.println("sb = " + sb);
        sb.deleteCharAt(3);
        System.out.println("sb = " + sb);
        sb.delete(3, b.length() - 1);
        System.out.println("sb = " + sb);
//        StringBuilder sb5 = "rumble";
    }
}
