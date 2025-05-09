package com.phantazap.isofix.mixin;

import net.minecraft.client.C_5664496;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(C_5664496.class) // C_5664496 = MinecraftClient
public class ExampleMixin {
	@Inject(method = "run", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GameGui;<init>(Lnet/minecraft/client/C_5664496;)V"))
	private void init(CallbackInfo ci) {
		// This code is injected after GameGui has been initialized in MinecraftClient.run()V
		System.out.println("BAZINGA");
	}
}