/*SINGLETON METHOD*/
public class Design
{
    public static final Design design=new Design();
    private Design()
    {}
    public static Design DesignInstance()
    {
        return design;
    }
    public static void main(String args[])
    {
        Drawing d=new Drawing();
        Color c=new Color();
        //BRIDGE METHOD
        d.draw(c.color());
        M2 obj=new M2(10);
        obj.print();
    }
}
