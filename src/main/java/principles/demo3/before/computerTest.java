package principles.demo3.before;

public class computerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        HardDisk hardDisk = new HardDisk();
        Cpu cpu = new Cpu();
        Memory memory = new Memory();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.run();
    }
}
