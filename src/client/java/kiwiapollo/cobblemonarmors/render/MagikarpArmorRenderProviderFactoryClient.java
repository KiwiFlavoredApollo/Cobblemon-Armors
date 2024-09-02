package kiwiapollo.cobblemonarmors.render;

import kiwiapollo.cobblemonarmors.CobblemonArmors;
import kiwiapollo.cobblemonarmors.armors.MagikarpArmorItem;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MagikarpArmorRenderProviderFactoryClient implements RenderProviderFactory {
    @Override
    public RenderProvider create() {
        return new RenderProvider() {
            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(
                    LivingEntity livingEntity, ItemStack itemStack,
                    EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original
            ) {
                GeoArmorRenderer<MagikarpArmorItem> renderer = new GeoArmorRenderer<>(
                        new DefaultedItemGeoModel<>(Identifier.of(CobblemonArmors.NAMESPACE, "magikarp_armor"))
                );
                renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return renderer;
            }
        };
    }
}
