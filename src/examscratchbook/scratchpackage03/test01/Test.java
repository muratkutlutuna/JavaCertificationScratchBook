package examscratchbook.scratchpackage03.test01;

public class Test {
    Test(Integer I)
    {
        System.out.print(0);
    }
    Test(int... i)
    {
        System.out.print(1);
    }
    Test(double d)
    {
        System.out.print(2);
    }
    Test(Object o)
    {
        System.out.print(3);
    }
    public static void main(String[] args)
    {
        new Test('a');
        new Test(10);
        new Test(10.5);
    }
}
class Parent
{
    private void m1()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    private void m1()
    {
        System.out.println("Child");
    }
    public static void main(String[] args)
    {
        Child c = new Child();
        c.m1();
    }
}
