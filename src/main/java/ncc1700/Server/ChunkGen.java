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
        Point start = unit.absoluteStart();
        for(int x = 0; x < unit.size().x(); x++){
            for(int z = 0; z < unit.size().z(); z++){
                Point bottom = start.add(x, 0, z);
                double h = sin(sqrt(bottom.x() - bottom.z()) * 2) * 10;
                unit.modifier().fill(bottom, bottom.add(1, 0, 1).withY(h), Block.BEDROCK);
                unit.modifier().setRelative(14, (int)(64 + bottom.y()), 14, Block.END_GATEWAY);
            }
        }



    }
}
