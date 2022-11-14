package ba.unsa.etf.rpr;

public class Mobitel {
    private String ekran,ram, kamera, procesor, brend;

    public Mobitel(String ekran, String kamera, String procesor, String ram, String brend) {
        this.ekran = ekran;
        this.ram = ram;
        this.kamera = kamera;
        this.procesor = procesor;
        this.brend = brend;
    }

    public String getEkran() {
        return ekran;
    }

    public void setEkran(String ekran) {
        this.ekran = ekran;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }
}
