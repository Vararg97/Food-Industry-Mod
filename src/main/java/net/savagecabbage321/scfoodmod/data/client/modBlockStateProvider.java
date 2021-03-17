package net.savagecabbage321.scfoodmod.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.savagecabbage321.scfoodmod.Main;
import net.savagecabbage321.scfoodmod.setup.modBlocks;

public class modBlockStateProvider extends BlockStateProvider {
    public modBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(modBlocks.COPPER_BLOCK.get());
        simpleBlock(modBlocks.COPPER_ORE.get());
    }
}
