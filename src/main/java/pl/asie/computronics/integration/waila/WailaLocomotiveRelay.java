package pl.asie.computronics.integration.waila;

import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;

import java.util.List;

/**
 * @author Vexatos
 */
public class WailaLocomotiveRelay extends WailaComputronics {

	@Override
	public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor,
		IWailaConfigHandler config) {

		if(!ConfigValues.RelayBound.getConfig(config)) {
			return currenttip;
		}

		NBTTagCompound nbt = accessor.getNBTData();
		String boundKey = "tooltip.computronics.waila.relay." + (nbt.getBoolean("bound") ? "bound" : "notbound");
		currenttip.add(StatCollector.translateToLocal(boundKey));
		return currenttip;
	}
}
