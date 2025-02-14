package subaraki.hangman.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import subaraki.hangman.entity.CameraDummy;
import subaraki.hangman.entity.HangEntityDummy;
import subaraki.hangman.mod.HangMan;

public class HangManEntity {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, HangMan.MODID);

    public static final RegistryObject<EntityType<CameraDummy>> CAMERA = ENTITIES.register("camera",
            () -> EntityType.Builder.<CameraDummy>of(CameraDummy::new, MobCategory.MISC)
                    .setTrackingRange(256).setUpdateInterval(20).noSave().noSummon().sized(0.001F, 0.001F).build(HangMan.MODID + ":camera"));

    public static final RegistryObject<EntityType<HangEntityDummy>> HANG_DUMMY = ENTITIES.register("hang_dummy",
            () -> EntityType.Builder.<HangEntityDummy>of(HangEntityDummy::new, MobCategory.MISC)
                    .setTrackingRange(256).setUpdateInterval(20).noSummon().sized(0.001F, 0.001F).build(HangMan.MODID + ":hang_dummy"));


}
