package sqr.items;

import sqr.core.SQR;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemWebslinger extends Item
{
	public ItemWebslinger()
	{
		super();
		
		final String name = "webslinger";
		setUnlocalizedName(name);
		setTextureName("sqr:" + name);
		setCreativeTab(SQR.getCreativeTab());
		setMaxStackSize(1);
		
		GameRegistry.registerItem(this, name);
	}
}
