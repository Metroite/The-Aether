package com.aether.items.tools;

import com.aether.items.AetherItemGroups;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Parachute extends Item {

    public Parachute(int maxDamage) {
        super(new Settings().maxCount(1).maxDamage(maxDamage).group(AetherItemGroups.Misc));
    }

    public Parachute() {
        super(new Settings().maxCount(1).group(AetherItemGroups.Misc));
    }

    @Override
    public TypedActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {

        //TODO: Implement parachute logic

        return super.use(worldIn, playerIn, handIn);
    }
}