public class Circle implements Shape{
    public String objectType;

    public Circle (String objectType){
        this.objectType = objectType;
        System.out.println(objectType + " is made of Circle.\n");
    }

    @Override
    public void build(String buildShape) {
        System.out.println(objectType + " for " + buildShape + " is created with Circle.\n");
    }
}