/*class hello{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}*/
class Sample
{
    void sum(int a,int b)
    {
        int c=a+b;
        System.out.println("The sum of two numbers is "+c);
    }
    void sum(int a,double b)
    {
        int c=a+b;
        System.out.println("The sum of two numbers is "+c);
    }
    void sum(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("THe sum of three numbers is "+d);
    }
}
class MethodOver
{
    public static void main(String args[])
    {
        Sample obj=new Sample();
        obj.sum(10,20.55);
    }
}