package corejavaL1;

class Parent
{
    
}

class Child extends Parent
{
}
public class TypeCastDemo
{
    public static void main(String[] args)
    {
        Parent[] arrParent;
        Child[] arrChild;
        arrParent = new Parent[10];
        arrChild = new Child[20];
        arrParent = arrChild;
        arrChild = (Child[])arrParent;
        arrParent = new Parent[10];
        arrChild = (Child[])arrParent;
    }
}
