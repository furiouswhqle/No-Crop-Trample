package furiouswhqle.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FarmlandBlock.class)
public abstract class NoCropTrampleMixin extends Block {
	public NoCropTrampleMixin(Settings settings) {
		super(settings);
	}
	@Inject(method = "onLandedUpon", at = @At("HEAD"), cancellable = true)
	public void NoCropTrample(World world, BlockState state, BlockPos pos, Entity entity, double fallDistance, CallbackInfo ci) {
		entity.handleFallDamage(fallDistance, 1f, world.getDamageSources().fall());
		ci.cancel();
	}
}