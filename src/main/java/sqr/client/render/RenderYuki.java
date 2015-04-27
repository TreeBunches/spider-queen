package sqr.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import sqr.client.model.ModelYuki;

public class RenderYuki extends RenderLiving
{
	
	public RenderYuki()
	{
		super(new ModelYuki(), 1.0F);
		this.setRenderPassModel(new ModelYuki());
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}