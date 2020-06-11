package composition;

public class Hello {

	public static void main(String[] args) {
		laptop laapy = new laptop();
		System.out.println(laapy.getGraphicsCard().getBrand());
		System.out.println(laapy.getProcessor().getBrand());
		
		Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6MB"
				+ "", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		
		laptop gamingLaptop = new laptop(17f, processor,
				"DDR4", "2TB", graphicsCard, null, "backlit");
		
		System.out.println(gamingLaptop.setGamingmode());
		
		System.out.println(processor.getFrequency());
	}

}
