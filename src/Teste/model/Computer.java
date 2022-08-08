package Teste.model;

public class Computer {

    private int ram;
    private int hd;
    private static int contador;

    public Computer(int ram, int hd) {
        super();
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("contador: " + contador);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return hd;
    }

    public void setDisco(int hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", hd=" + hd + "]";
    }
}
