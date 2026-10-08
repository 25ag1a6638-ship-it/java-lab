class Student
{
    void study()
    {
        System.out.println("We are studying");
    }
}

class Teacher extends Student
{
    void study()
    {
        super.study();
        System.out.println("Teachers are delivering lectures.");
    }
}

class Override
{
    public static void main(String args[])
    {
        Teacher t = new Teacher();
        t.study();
    }
}
