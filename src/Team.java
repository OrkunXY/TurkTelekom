import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {

    private String takimIsmi;
    private List<Oyuncu> oyuncuList;





    public Team(String takimIsmi){

        oyuncuList=new ArrayList<>();
        this.takimIsmi=takimIsmi;


        guardOlustur();
        pivotOlustur();
        centerOlustur();

    }
    public String getTakimIsmi(){
        return takimIsmi;
    }
    public List<Oyuncu> getOyuncuList() {
        return oyuncuList;
    }

    public void guardOlustur(){
        PointGuard pointGuard=new PointGuard("Taylor II",186,22);
        oyuncuList.add(pointGuard);
        ShootingGuard shootingGuard=new ShootingGuard("Grant",198,21);
        oyuncuList.add(shootingGuard);
        ShootingGuard shootingGuard1=new ShootingGuard("Bouteille",178,33);
        oyuncuList.add(shootingGuard1);
    }

    public void pivotOlustur(){
        Pivot pivot=new Pivot("Sesstina",205,77);
        oyuncuList.add(pivot);
    }

    public void centerOlustur(){
        Center center=new Center("Taylor",212,88);
        oyuncuList.add(center);
    }
    public void setOyuncuList(List<Oyuncu> oyuncuList) {
        this.oyuncuList = oyuncuList;
    }

    @Override
    public String toString() {
        return "Takim{" +
                "takimIsmi='" + takimIsmi + '\'' +
                ", oyuncuList=" + oyuncuList +
                '}';
    }



}
