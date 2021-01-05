public class Triangle implements Shape{
    public String objectType;

    public Triangle (String objectType){
        this.objectType = objectType;
        System.out.println(objectType + " is made of Triangle.\n");
    }

    @Override
    public void build(String buildShape) {
        System.out.println(objectType + " for "+ buildShape +" is created with Triangle.\n");
    }
}