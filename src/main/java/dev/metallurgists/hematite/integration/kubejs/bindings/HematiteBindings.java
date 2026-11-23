package dev.metallurgists.hematite.integration.kubejs.bindings;

import dev.latvian.mods.kubejs.typings.Info;

public interface HematiteBindings {
    @Info("Miscellaneous Hematite ingredient helpers")
    static IngredientBindings ingredient() {
        return IngredientBindings.INSTANCE;
    }

    @Info("Miscellaneous Block Growth helpers")
    static BlockGrowthBindings blockGrowth() {
        return BlockGrowthBindings.INSTANCE;
    }
}
