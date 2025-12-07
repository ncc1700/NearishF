package ncc1700.Server.Entities;

import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.EntityPose;
import net.minestom.server.entity.EntityType;

public class CursedAllay extends EntityCreature {
    public CursedAllay() {
        super(EntityType.ALLAY);
        this.setGlowing(true);
        this.setPose(EntityPose.SITTING);
    }
}
