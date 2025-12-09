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

public class CursedPlayer extends EntityCreature {
    public CursedPlayer() {
        super(EntityType.MANNEQUIN);
        ResolvableProfile profile = new ResolvableProfile(Objects.requireNonNull(PlayerSkin.fromUsername("KiSystemService")));
        MannequinMeta meta = (MannequinMeta)this.getEntityMeta();
        meta.setProfile(profile);
        meta.setDescription(Component.text("PLEASE DO NOT DISTURB"));
        meta.setCustomName(Component.text("ARTIFICIAL PLAYER"));
        meta.setOnFire(true);
        meta.setCustomNameVisible(false);
        meta.setCustomNameVisible(true);
        addAIGroup(List.of(
                //new MeleeAttackGoal(this, 4, Duration.ofMillis(100)),
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
