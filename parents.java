class parents
{
    public void displayparents()
    {
        System.out.println("Two parents");
    }
}

interface mother
{
    public void show();
}

interface father
{
    public void displayfather();
}

public class child extends parents implements mother, father
{
    public void show()
    {
        System.out.println("Mother and father are parents");
    }

    public void displayfather()
    {
        // Father interface implementation
    }

    public void displaychild()
    {
        System.out.println("Mother and Father have one child");
    }

    public static void main(String args[])
    {
        child obj = new child();

        System.out.println("Implementation of hybrid inheritance in java");

        obj.show();
        obj.displaychild();
    }
}
