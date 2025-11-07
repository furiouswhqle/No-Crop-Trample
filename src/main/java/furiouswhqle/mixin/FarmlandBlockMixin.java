package furiouswhqle.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;

@Mixin(FarmBlock.class)
public class FarmBlockMixin {
	@Redirect (
		method = "fallOn",
		at = @At (
			value = "INVOKE",
			target = "Lnet/minecraft/world/level/block/FarmBlock;turnToDirt(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V"
		)
	)
	private void Cancel(Entity entity, BlockState state, Level level, BlockPos pos) {}
}
