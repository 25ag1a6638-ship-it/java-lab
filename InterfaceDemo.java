interface X
{
    void Test();
}

interface A
{
    void display();
}

class B implements A, X
{
    public void display()
    {
        System.out.println("Hello");
    }

    public void Test()
    {
        System.out.println("I'm from Interface X");
    }
}

class InterfaceDemo
{
    public static void main(String[] args)
    {
        B obj = new B();

        obj.display();
        obj.Test();

        System.out.println("All");
    }
}
