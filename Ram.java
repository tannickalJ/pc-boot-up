public class Ram {
	private boolean boot = false;

	public Ram() {
		System.out.print("Boot loader loaded into ram successfully.\n");
	}

	public void bootStrap() throws InterruptedException {
		if (boot == true) {
			System.out.println("Boot loader loading OS into ram..");
			Thread.sleep(2000);
			OS();
		} else {

			// OS cannot be loaded into RAM without boot loader
			System.out.println("Boot loader not found");
		}
	}

	public void setBoot(boolean boot) {
		this.boot = boot;
	}

	public void OS() {

		// Computer is now on and ready to be used
		System.out.print("OS loaded successfully");
		System.out.print("\n***Welcome Guest***");
	}
}
