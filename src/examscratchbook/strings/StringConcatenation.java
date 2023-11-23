package examscratchbook.strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String fName = "James";
        System.out.println("final String fName = \"James\" ===> " + System.identityHashCode(fName));
        String lName = "Gosling";
        System.out.println("String lName = \"Gosling\" ===> " + System.identityHashCode(lName));
        String name1 = fName + lName;
        System.out.println("String name1 = fName + lName ===> " + System.identityHashCode(name1));
        String name2 = fName + "Gosling";
        System.out.println("String name2 = fName + \"Gosling\" ===> " + System.identityHashCode(name2));
        String name3 = "James" + "Gosling";
        System.out.println("String name3 = \"James\" + \"Gosling\" ===> " + System.identityHashCode(name3));
        System.out.println("name1 == name2 ===> "+(name1 == name2));
        System.out.println("name2 == name3 ===> "+(name2 == name3));
    }
}
