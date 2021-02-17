package io.cqdet.test_plugin;

import io.gomint.command.Command;
import io.gomint.command.CommandOutput;
import io.gomint.command.CommandSender;
import io.gomint.command.annotation.Description;
import io.gomint.command.annotation.Name;
import io.gomint.command.annotation.Overload;
import io.gomint.command.annotation.Parameter;
import io.gomint.command.validator.IntegerValidator;
import io.gomint.entity.EntityPlayer;
import java.util.Map;

@Overload({
        @Parameter(name = "scale", validator = IntegerValidator.class, optional = false)
})
@Name("scale")
@Description("A command to change the scale of the player")
public class ScaleCommand extends Command {

    @Override
    public CommandOutput execute(CommandSender<?> commandSender, String s, Map<String, Object> args) {
        if(commandSender instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) commandSender;
            Object scale = args.get("scale");
            player.scale((int) scale);
            return new CommandOutput().success("Set scale of " + player.name() + " to " + scale.toString());
        } else {
            return new CommandOutput().fail("Must run this command in-game");
        }
    }
}
