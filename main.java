public class Main {

	public static void main(String[] args) throws InterruptedException {
		boolean AC = true;
		
		// power on CPU
		Cpu cpu = new Cpu();
		
		// set the state of devices
		Rom.printer = true;
		Rom.keyboard = true;
		Rom.mouse = true;
		Rom.cdRom = true;
		Rom.hardDrive = true;
		
		// send AC current into CPU power supply
		cpu.powerSupply(AC);
	}

}
