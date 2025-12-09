package ncc1700.Server;

import net.minestom.server.coordinate.Point;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.generator.GenerationUnit;
import net.minestom.server.instance.generator.Generator;
import net.minestom.server.world.biome.Biome;

import static java.lang.Math.*;

public class ChunkGen implements Generator {

    @Override
    public void generate(GenerationUnit unit) {
        unit.modifier().fillBiome(Biome.THE_END);
        unit.modifier().fillHeight(0, 1, Block.BARRIER);



    }
}
