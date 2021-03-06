package me.memeszz.aurora.mixin.mixins;

import org.spongepowered.asm.mixin.Shadow;
import net.minecraft.network.play.client.CPacketPlayer;
import org.spongepowered.asm.mixin.Mixin;
import me.memeszz.aurora.mixin.accessor.ICPacketPlayer;

@Mixin({ CPacketPlayer.class })
public abstract class MixinCPacketPlayer implements ICPacketPlayer
{
    @Shadow
    protected double x;
    @Shadow
    protected double y;
    @Shadow
    protected double z;
    @Shadow
    protected float yaw;
    @Shadow
    protected float pitch;
    @Shadow
    protected boolean onGround;
    
    @Override
    public void setX(final double x) {
        this.x = x;
    }
    
    @Override
    public void setY(final double y) {
        this.y = y;
    }
    
    @Override
    public void setZ(final double z) {
        this.z = z;
    }
    
    @Override
    public void setYaw(final float yaw) {
        this.yaw = yaw;
    }
    
    @Override
    public void setPitch(final float pitch) {
        this.pitch = pitch;
    }
    
    @Override
    public void setOnGround(final boolean onGround) {
        this.onGround = onGround;
    }
}
