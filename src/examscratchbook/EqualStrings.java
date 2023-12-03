package examscratchbook;

public class EqualStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        System.out.println("Before str1 = " + System.identityHashCode(str1));
        String [] str2 = {"J","a","v","a"};
        System.out.println("System.identityHashCode(str2[0]) = " + System.identityHashCode(str2[0]));
        System.out.println("Before str2 = " + System.identityHashCode(str2));
        String str3 = "";
        System.out.println("Before str3 = " + System.identityHashCode(str3));
        for (String str : str2) {
            System.out.println("Inside the loop before adding "+str+" to str3 = " + System.identityHashCode(str3));
            str3 = str3 + str;
            System.out.println("Inside the loop after adding "+str+" to str3 = " + System.identityHashCode(str3));
        }
        System.out.println("After str1 = " + System.identityHashCode(str1));
        System.out.println("After str3 = " + System.identityHashCode(str3));
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1==str3);
        System.out.println(b1+", "+b2);
    }
}
