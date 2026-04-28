public class CPU {

    float price;

    class Processor {
        int cores;
        String manufacturer;

        static class RAM {
            int memory;
            String manufacturer;
        }
    }

    public static void main(String[] args) {

        CPU c = new CPU();
        c.price = 25000.0f;

        CPU.Processor p = c.new Processor();
        p.cores = 8;
        p.manufacturer = "Intel";

        CPU.Processor.RAM r = new CPU.Processor.RAM();
        r.memory = 16;
        r.manufacturer = "Corsair";

        System.out.println("CPU Price: " + c.price);
        System.out.println("Processor Cores: " + p.cores);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Memory: " + r.memory + " GB");
        System.out.println("RAM Manufacturer: " + r.manufacturer);
    }
}


