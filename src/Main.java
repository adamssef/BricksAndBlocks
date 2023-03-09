import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Block> blockList = new ArrayList<>();
        Wall wall = new Wall(blockList, "red", "brick");
        Block brick = new BrickBlock();
        Block airBrick = new AirBrick();

        wall.addBlock(brick);
        wall.addBlock(airBrick);

        Wall wall2 = new Wall(blockList, "mixed", "wall of mixed materials");

        wall2.addBlock(new BrickBlock());
        wall.addBlock(wall2);

        for (int i = 0; i < wall.count(); i++) {
            System.out.println(wall.getBlocks().get(i).getColor() + " " + wall.getBlocks().get(i).getMaterial());
        }


    }
}
