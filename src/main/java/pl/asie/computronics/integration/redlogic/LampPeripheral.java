package pl.asie.computronics.integration.redlogic;

import dan200.computercraft.api.lua.ILuaContext;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.peripheral.IComputerAccess;
import dan200.computercraft.api.peripheral.IPeripheral;
import mods.immibis.redlogic.api.misc.ILampBlock;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import pl.asie.computronics.integration.CCTilePeripheral;

public class LampPeripheral extends CCTilePeripheral<ILampBlock> {

	public LampPeripheral() {
	}

	public LampPeripheral(ILampBlock block, World world, int x, int y, int z) {
		super(block, "lamp", world, x, y, z);
	}

	@Override
	public IPeripheral getPeripheral(World world, int x, int y, int z, int side) {
		Block block = world.getBlock(x, y, z);
		if(block instanceof ILampBlock) {
			return new LampPeripheral((ILampBlock) block, world, x, y, z);
		}
		return null;
	}

	@Override
	public String[] getMethodNames() {
		return new String[] { "getLampColour", "isLampPowered", "getLampType" };
	}

	@Override
	public Object[] callMethod(IComputerAccess computer, ILuaContext context,
		int method, Object[] arguments) throws LuaException,
		InterruptedException {
		switch(method){
			case 0:
				return new Object[] { tile.getColourRGB(w, x, y, z) };
			case 1:
				return new Object[] { tile.isPowered() };
			case 2:
				return new Object[] { tile.getType().name() };
		}
		return null;
	}
}
