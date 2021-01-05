import java.util.Scanner;

public class Main{
	public static void buildHouse(){
		Shape buildRoof = new Triangle("Roof");
        Shape buildWalls = new Square("Walls");
        Shape buildWindows = new Square("Windows");
        Shape buildDoors = new Rectangle("Doors");

        Building houseBuilding = new Building();
        houseBuilding.add(buildRoof);
        houseBuilding.add(buildWalls);
        houseBuilding.add(buildWindows);
        houseBuilding.add(buildDoors);

        houseBuilding.build("House");
	}

	public static void buildTree()
    {
        Shape buildStem = new Rectangle("Stem");
        Shape buildLeaf = new Circle("Leaf");

        Building treeBuilding = new Building();
        treeBuilding.add(buildStem);
        treeBuilding.add(buildLeaf);

        treeBuilding.build("Tree");
    }

    public static void buildWaterSource()
    {
        Shape buildPond = new Circle("Pond");
        Shape buildBubble = new Circle("Bubble");

        Building waterSourceBuilding = new Building();
        waterSourceBuilding.add(buildPond);
        waterSourceBuilding.add(buildBubble);

        waterSourceBuilding.build("Water Source");
    }

	public static void main(String[] args) {
        System.out.println("Welcome to Age of Villagers.\n");
        System.out.println("Please enter 1 to build House, \n 2 to build Tree,\n 3 to build Water Source.\n Enter 0 to exit.");

        
        Scanner input = new Scanner(System.in);
        int userChoice;
        while ((userChoice = input.nextInt()) != 0){
            if(userChoice==1){
                 buildHouse();
    
            }
            else if(userChoice==2){
                buildTree();
    
            }
            else if(userChoice==3){
                buildWaterSource();
    
            }
            else{
                System.out.println("Invalid Input. Please type 1, 2 or 3 to build and 0 to exit.");
            }
        }
    }
}