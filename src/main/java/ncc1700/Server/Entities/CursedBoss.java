package ncc1700.Server.Entities;

import net.kyori.adventure.text.Component;
import net.minestom.server.entity.*;
import net.minestom.server.entity.ai.goal.MeleeAttackGoal;
import net.minestom.server.entity.ai.goal.RandomLookAroundGoal;
import net.minestom.server.entity.ai.goal.RandomStrollGoal;
import net.minestom.server.entity.ai.target.ClosestEntityTarget;
import net.minestom.server.entity.ai.target.LastEntityDamagerTarget;
import net.minestom.server.entity.metadata.avatar.MannequinMeta;
import net.minestom.server.network.player.ResolvableProfile;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class CursedBoss extends EntityCreature {
    public CursedBoss() {
        super(EntityType.END_CRYSTAL);

        addAIGroup(List.of(
                new MeleeAttackGoal(this, 4, Duration.ofMillis(100)),
                new RandomStrollGoal(this, 10),
                new RandomLookAroundGoal(this, 1)
        ), List.of(
                new LastEntityDamagerTarget(this, 32),
                new ClosestEntityTarget(this, 32, entity -> entity instanceof Player)
        ));
        this.setGlowing(true);
        this.setPose(EntityPose.SITTING);
    }
}
