package ba.unsa.etf.rpr;

public class MobitelBuilder {
    private String kamera,ram,procesor,brend, ekran;
    public Mobitel build(){
        return new Mobitel(ekran,kamera,procesor,ram,brend);
    }

    public MobitelBuilder setKamera(String kamera) {
        this.kamera = kamera;
        return this;
    }

    public MobitelBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public MobitelBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public MobitelBuilder setBrend(String brend) {
        this.brend = brend;
        return this;
    }

    public MobitelBuilder setEkran(String ekran) {
        this.ekran = ekran;
        return this;
    }
}
