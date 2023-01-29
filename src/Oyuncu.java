import java.util.Random;

public abstract class Oyuncu {

            private String ad;
            private double boy;
            private int ziplama;
            private int sut;
            private int dayaniklilik;
            private int formaNo;



            private Random random=new Random();


    public Oyuncu(String ad, double boy, int formaNo) {
        this.ad = ad;
        this.boy = boy;
        this.formaNo = formaNo;
        this.ziplama = 50+random.nextInt(51) ;
        this.sut = 50+random.nextInt(51);
        this.dayaniklilik = 50+ random.nextInt(51);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public int getZiplama() {
        return ziplama;
    }

    public void setZiplama(int ziplama) {
        this.ziplama = ziplama;
    }

    public int getSut() {
        return sut;
    }

    public void setSut(int sut) {
        this.sut = sut;
    }

    public int getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(int dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public int getFormaNo() {
        return formaNo;
    }

    public void setFormaNo(int formaNo) {
        this.formaNo = formaNo;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "Oyuncu{" +
                "ad='" + ad + '\'' +
                ", boy=" + boy +
                ", ziplama=" + ziplama +
                ", sut=" + sut +
                ", dayaniklilik=" + dayaniklilik +
                ", formaNo= " + formaNo +" "+
                getClass().getSimpleName()+
               '}';
    }
}
