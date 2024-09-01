package kiwiapollo.cobblemonarmors;

import kiwiapollo.cobblemonarmors.render.MythrilArmorRenderProviderFactoryClient;
import kiwiapollo.cobblemonarmors.render.MythrilArmorRenderProviderFactoryProxy;
import kiwiapollo.cobblemonarmors.render.TestArmorRenderProviderFactoryClient;
import kiwiapollo.cobblemonarmors.render.TestArmorRenderProviderFactoryProxy;
import net.fabricmc.api.ClientModInitializer;

public class CobblemonArmorsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MythrilArmorRenderProviderFactoryProxy.setRenderProviderFactory(new MythrilArmorRenderProviderFactoryClient());
		TestArmorRenderProviderFactoryProxy.setRenderProviderFactory(new TestArmorRenderProviderFactoryClient());
	}
}