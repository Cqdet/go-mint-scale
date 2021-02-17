package io.cqdet.test_plugin;

import io.gomint.plugin.Plugin;
import io.gomint.plugin.PluginName;
import io.gomint.plugin.Version;
import io.cqdet.test_plugin.ScaleCommand;

@PluginName("TestPlugin")
@Version(major = 1, minor = 0)
public class TestPlugin extends Plugin {
    @Override
    public void onInstall() {
        logger().info("Loaded Plugin!");
        registerCommand(new ScaleCommand());
    }
}