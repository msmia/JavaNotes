package sweetwater;

enum Flavor {
	LEMONADE, 
	MANGO,
	PEACH,
	WATERMELON,
	CUCUMBER,
	STRAWBERRY,
	NONE;
}

enum WaterType {
	STILL,
	SPARKLING,
}

enum FlavorStrength {
	LOW,
	MIDIUM,
	HIGH,
	NONE;
}

enum PlainWater {
	PLAIN_WATER;
}


public class PrepareWater {

	private WaterType waterType;
	private Flavor flavor;
	private FlavorStrength flavorStrength;
	private PlainWater plainWater;
	
	public PrepareWater(PlainWater plainWater, WaterType waterType, Flavor flavor, FlavorStrength flavorStrength) {
		this.plainWater = plainWater;
		this.waterType = waterType;
		this.flavor = flavor;
		this.flavorStrength = flavorStrength;
	}
	
	/**
	 * To get plain water
	 */
	public PrepareWater() {
		this(PlainWater.PLAIN_WATER, WaterType.STILL, Flavor.NONE, FlavorStrength.NONE);
		System.out.println("Dispensing palin water.");
	}

	/**
	 * To get flavored water
	 * @param waterType
	 * @param flavor
	 * @param flavorStrength
	 */
	public PrepareWater(WaterType waterType, Flavor flavor, FlavorStrength flavorStrength) {
		this(null, waterType, flavor, flavorStrength);
		System.out.println("Dispensing flavored water.");
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public FlavorStrength getFlavorStrength() {
		return flavorStrength;
	}

	public void setFlavorStrength(FlavorStrength flavorStrength) {
		this.flavorStrength = flavorStrength;
	}

	public PlainWater getPlainWater() {
		return plainWater;
	}
	
	
}
