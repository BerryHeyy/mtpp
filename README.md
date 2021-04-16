# More Tools++

## About

Yet another mod that adds tools, but this time with a twist ;).
This mod features powerful tools, which are easy to craft.
Every added tool has its own consequences when you use it to balance them.

## Content

- Magma Tools
    - Destroys broken blocks
    - Instantly breaks blocks
    - Puts hit entities on fire
    - Puts user on fire whenever used in any way
    - Low durability
- Lapis Tools
    - Multiplies block drops with current experience level of the player
    - Extremely low durability
    - The higher the multiplication, the higher the chance that the player will accidentally open a rift to an alternate
      dimension where experience originates from. Also, the strength of the creatures that pour out of this rift is also
      related to the level of multiplication, so is their number
- Quartz Tools
    - Converts broken blocks into experience
- **_More tools will be added in future updates_**

**Note:** *All aspects of every tool can be configured in the config file. Even how much exp every block drops when you break it with a Quartz Tool. 
For more information, please read the [Configurations section](#Configurations).*

## Configurations

*Everything* in this mod is configurable. (Mainly because I suck at balancing things.) Configurations can be set in the `mtpp.properties` file in the `config` directory. Things you can configure range from how much durability a tool has, to the size of interdimensional rifts. Below is a comprehensive list of all configuration keys and their usage. To add a configuration key to the config file, just paste it on a new line and immediately afterwards place an equal sign, like this: `item.durability.toolX=10`, and not like this: `item.durability.toolX = 10`.

### Tools

**Tool material keys**  
A tool material determines shared values between all tools of a given type. For example, all Quartz tool have the same durability.

`toolmaterial.<type>.durability`  
*The durability of all of the tools with the specified material. See vanilla durability values [here](https://minecraft.fandom.com/wiki/Pickaxe#Mining).*

`toolmaterial.<type>.mining_speed`  
*The mining speed of all of the tools with the specified material. See vanilla mining speed values [here](https://minecraft.fandom.com/wiki/Breaking#Speed).*

`toolmaterial.<type>.mining_level`  
*The mining level of all of the tools with the specified material. Vanilla values, wood: 0, stone: 1, iron: 2, diamond: 3, gold: 0, netherite: 4.*

`toolmaterial.<type>.enchantability`  
*Determines how good all of the tools with the specified material can be enchanted. Higher values results in better enchantments. See vanilla enchantability values [here](https://minecraft.fandom.com/wiki/Enchanting_mechanics#Enchantability).*

**Note:** `<type>` is the type of tool, for example `magma`.

****

**Tool specific keys**  
These are specific to each tool, for example you can have the Quartz Axe have an attack of 50 and the shovel an attack of 60.

`item.<toolID>.attack`  
*The attack damage of the given tool. See vanilla attack damage values [here](https://minecraft.fandom.com/wiki/Damage#Dealing_damage).*

`item.<toolID>.attack_speed`  
*How long you have to wait for your attack to do full damage. For more information and vanilla values, see [here](https://minecraft.fandom.com/wiki/Damage#Attack_cooldown).*

**Note:** `<toolID>` is the ID of the item of a given tool. For example `mtpp:lapis_pickaxe`. You can see these by pressing F3 + Q to show advanced tooltips. Then hover over the item in your inventory and you'll see the ID. 



## License

The mod is available under the [CC0 1.0 license](https://creativecommons.org/publicdomain/zero/1.0/deed.en). Meaning you can do absolutely anything you want with it.