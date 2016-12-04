package omtteam.openmodularturrets.blocks.turretheads;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import omtteam.openmodularturrets.reference.Names;
import omtteam.openmodularturrets.reference.Reference;
import omtteam.openmodularturrets.tileentity.turrets.RocketTurretTileEntity;

public class BlockRocketTurret extends BlockAbstractTurretHead {
    public BlockRocketTurret() {
        super();

        this.setUnlocalizedName(Names.Blocks.rocketTurret);
        this.setRegistryName(Reference.MOD_ID, Names.Blocks.rocketTurret);
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new RocketTurretTileEntity();
    }
}