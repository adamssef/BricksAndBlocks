import java.util.List;

public abstract class CompositeBlock implements Block {

    private List<Block> blocks;


    public CompositeBlock(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block block) {
         this.getBlocks().add(block);
    }

    public void removeBlockByMaterialName(String material) {
        for (Block block: this.getBlocks()) {
            if (material.equals(block.getMaterial())) {
                this.getBlocks().remove(block);
            }
        }
    }

    public void removeBlockByColorName(String color) {
        for (Block block: this.getBlocks()) {
            if (color.equals(block.getColor())) {
                this.getBlocks().remove(block);
            }
        }
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }
}
