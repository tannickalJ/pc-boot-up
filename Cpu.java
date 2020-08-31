public class Cpu {

	private boolean voltage = true;

	public void powerSupply(boolean DC) throws InterruptedException {

		// incoming AC current converted to DC current
		voltage = DC;
		if (voltage == true) {
			Rom rom = new Rom();

			// BIOS initiated from ROM initiates POST
			if (rom.bios()) {
				System.out.println("No errors were found.");

				// load bootstrap loader into RAM if no errors
				rom.bootLoader();
			} else {
				System.out.println("Fix error(s) before proceeding or call manufacturer!");
			}
		} else {
			// CPU fails to power other devices without any currents
			System.out.println("Power Supply failure!");
		}
	}
}
