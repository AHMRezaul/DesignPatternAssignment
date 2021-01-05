public class Rectangle implements Shape{
    public String objectType;

    public Rectangle (String objectType){
        this.objectType = objectType;
        System.out.println(objectType + " is made of Rectangle.\n");
    }

    @Override
    public void build(String buildShape) {
        System.out.println(objectType + " for "+ buildShape+" is created with Rectangle.\n");
    }
}