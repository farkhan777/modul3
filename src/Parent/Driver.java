package Parent;

import Childern.Bambang;
import Childern.Ucup;
import Childern.Udin;

public class Driver {
    public static void main(String[] args)throws Exception {
        Bambang bambang = new Bambang();
        Udin udin = new Udin();
        Ucup ucup = new Ucup();
        Human[] samuel = new Human[4];

        bambang.setNama("Bambang");
        bambang.setUsia(21);

        udin.setNama("Udin");
        udin.setUsia(30);

        ucup.setNama("Ucup");
        ucup.setUsia(3);

        samuel[0]= bambang;
        samuel[1]= udin;
        samuel[2]= ucup;

        for(int i = 0;i < 3 ;i++){
            samuel[i].setMata(2);
            samuel[i].setKaki(2);
            samuel[i].setTangan(2);
            samuel[i].Skill();
            samuel[i].Hobi();
            samuel[i].Pendidikan();
        }
    }
}
