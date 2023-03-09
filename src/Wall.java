import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall extends CompositeBlock implements Structure  {

    protected String color;
    protected String material;

    public Wall(List<Block> blocks, String color, String material) {
        super(blocks);
        this.color = color;
        this.material = material;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for (Block block: this.getBlocks()) {
            if (color.equals(block.getColor())) {
                return Optional.of(block);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        ArrayList<Block> listToBeReturned = new ArrayList<Block>();
        for (Block block: this.getBlocks()) {
            if (material.equals(block.getMaterial())) {
                listToBeReturned.add(block);
            }
        }

        return listToBeReturned;
    }

    public int count() {
        return getBlocks().size();
    }

    public String getColor() {
        return this.color;
    };

    public String getMaterial() {
        return this.material;
    };

}
