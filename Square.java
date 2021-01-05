public class Square implements Shape{
    public String objectType;

    public Square (String objectType){
        this.objectType = objectType;
        System.out.println(objectType + " is made of Square.\n");
    }

    @Override
    public void build(String buildShape) {
        System.out.println(objectType + " for "+ buildShape +" is created with Square.\n");
    }
}