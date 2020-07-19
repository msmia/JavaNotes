package sweetwater;

public class Main {

	public static void main(String[] args) {

		PrepareWater pw1 = new PrepareWater(WaterType.SPARKLING, Flavor.LEMONADE, FlavorStrength.HIGH);
		System.out.println("Flavor: " + pw1.getFlavor());
		System.out.println("Water Type: " + pw1.getWaterType());
		System.out.println("Flavor strength: " + pw1.getFlavorStrength());
		pw1.setFlavor(Flavor.MANGO);
		System.out.println("Flavor: " + pw1.getFlavor());
		System.out.println("===");
		
		
		PrepareWater pw2 = new PrepareWater();
		System.out.println("Flavor: " + pw2.getFlavor());
		pw2.setFlavor(Flavor.LEMONADE);


	}

}
