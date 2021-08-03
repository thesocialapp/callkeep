package com.github.cloudwebrtc.flutter_callkeep_example;

import android.os.Bundle;

import androidx.annotation.CallSuper;

import io.flutter.app.FlutterApplication;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
import io.flutter.plugins.GeneratedPluginRegistrant;
import com.github.cloudwebrtc.flutter_callkeep.FlutterCallkeepPlugin;

public class Application extends FlutterApplication implements PluginRegistrantCallback {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void registerWith(PluginRegistry pluginRegistry) {
        FlutterCallkeepPlugin.registerWith(pluginRegistry.registrarFor("com.github.cloudwebrtc.flutter_callkeep.FlutterCallkeepPlugin"));
    }
}