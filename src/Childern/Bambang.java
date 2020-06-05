package Childern;

import Parent.Human;
import org.w3c.dom.ls.LSOutput;

public class Bambang extends Human {

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
        System.out.println("\nNama : Bambang");
    }

    @Override
    public void setUsia(int usia) {
        super.setUsia(usia);
        System.out.printf("Usia Bambang : 21 Tahun\n");
    }

    @Override
    public void setMata(int mata) {
        super.setMata(mata);
        System.out.printf("\nBambang memiliki %d mata",mata);
    }

    @Override
    public void setKaki(int kaki) {
        super.setKaki(kaki);
        System.out.printf("\nBambang memiliki %d kaki",kaki);
    }

    @Override
    public void setTangan(int tangan) {
        super.setTangan(tangan);
        System.out.printf("\nBambang memiliki %d tangan\n",tangan);
    }

    @Override
    public void Skill() {
        super.Skill();
        System.out.println("Bambang bisa menari");
    }

    @Override
    public void Hobi() {
        System.out.println("Hobi Makan");
    }
}
