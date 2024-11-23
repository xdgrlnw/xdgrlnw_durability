package me.xdgrlnw;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import java.util.List;
@Environment(EnvType.CLIENT)
public class xdgrlnwSimpleDurabilityClient implements ClientModInitializer {
	public static Text durabilityText(ItemStack stack) {
		int max = stack.getMaxDamage();
		int cur = max - stack.getDamage();
		return Text.translatable("item.durability", cur, max);

	}

	@Override
	public void onInitializeClient() {
		ItemTooltipCallback.EVENT.register((ItemStack stack, Item.TooltipContext context, TooltipType type, List<Text> lines) -> {
			if (stack.getMaxDamage() == 0) {
				return;
			}
			lines.add(Text.empty());
			lines.add(durabilityText(stack));
		});
	}
}
