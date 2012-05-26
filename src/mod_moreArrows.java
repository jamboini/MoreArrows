package net.minecraft.src;

import java.util.Map;

public class mod_moreArrows extends BaseMod {

	public static final Item improvedBow = new ItemImprovedBow(4000).setIconCoord(5, 1).setItemName("improvedBow");
	public static Item poisonArrow = new Item(4001).setIconIndex(ModLoader.addOverride("/gui/items.png", "/arrows/poison.png")).setItemName("poisonArrow");
	public static Item fireArrow = new Item(4002).setIconIndex(ModLoader.addOverride("/gui/items.png", "/arrows/fire.png")).setItemName("fireArrow");
	public static final Item titanBow = new ItemTitanBow(4003).setIconCoord(5, 1).setItemName("improvedBow");
	
	public String getVersion() 
	{
		return "V. 1.0";
	}
	
	public String getName()
	{
		return "More Arrows Mod for Minecraft 1.2.5";
	}

	public void load() 
	{
		ModLoader.addName(improvedBow, "Improved Bow");
		ModLoader.addName(titanBow, "Titan Bow");
		ModLoader.addName(poisonArrow, "Poison Arrow");
		ModLoader.addName(fireArrow, "Fire Arrow");
		ModLoader.addRecipe(new ItemStack(improvedBow, 1), new Object[] {"#~ ", "# ~", "#~ ", Character.valueOf('#'), Item.ingotIron, Character.valueOf('~'), Item.stick});
		ModLoader.addRecipe(new ItemStack(poisonArrow, 4), new Object[] {"#", "~", "4", Character.valueOf('#'), Item.rottenFlesh, Character.valueOf('~'), Item.stick, Character.valueOf('4'), Item.feather});
		ModLoader.addRecipe(new ItemStack(fireArrow, 4), new Object[] {"#", "~", "4", Character.valueOf('#'), Item.blazePowder, Character.valueOf('~'), Item.stick, Character.valueOf('4'), Item.feather});
		ModLoader.addRecipe(new ItemStack(titanBow, 1), new Object[] {"#~ ", "# ~", "#~ ", Character.valueOf('#'), Item.diamond, Character.valueOf('~'), Item.stick});
	}
	
	public void addRenderer(Map map)
    {
        map.put(EntityPoisonArrow.class, new RenderArrow());
        map.put(EntityFireArrow.class, new RenderArrow());
    }

}
