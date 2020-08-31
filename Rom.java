public class Rom {
	static boolean printer = false;
	static boolean keyboard = false;
	static boolean mouse = false;
	static boolean cdRom = false;
	static boolean hardDrive = false;

	public boolean bios() throws InterruptedException {

		boolean[] hardware = { printer, keyboard, mouse, cdRom, hardDrive };
		System.out.println("Initalizing POST...");
		Thread.sleep(3000);
		if (printer == true && keyboard == true && mouse == true && cdRom == true && hardDrive == true) {
			System.out.println("POST successful");
		} else {
			// verify if any device is set to false
			System.out.print("BEEP\nHardware failure(s) detected! Please fix: \n");
			for (int i = 0; i < hardware.length; i++) {
				if (hardware[i] == false) {
					switch (i) {
					case 0:
						System.out.println("printer");
						break;
					case 1:
						System.out.println("keyboard");
						break;
					case 2:
						System.out.println("mouse");
						break;
					case 3:
						System.out.println("cd-rom");
						break;
					case 4:
						System.out.println("hard drive");
						break;
					}
					return false;
				}
			}
		}
		return true;
	}

	public void bootLoader() throws InterruptedException {
		System.out.println("Bootloader loading into ram...");
		Thread.sleep(1000);
		Ram ram = new Ram();
		ram.setBoot(true);
		ram.bootStrap();
	}
}
