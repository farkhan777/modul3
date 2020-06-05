package Childern;

import Parent.Human;

public class Udin extends Human {
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
        System.out.println("\nNama : Udin");
    }

    @Override
    public void setUsia(int usia) {
        super.setUsia(usia);
        System.out.println("Usia Udin : 30 Tahun");
    }

    @Override
    public void setMata(int mata) {
        super.setMata(mata);
        System.out.printf("Udin memiliki %d mata",mata);
    }

    @Override
    public void setKaki(int kaki) {
        super.setKaki(kaki);
        System.out.printf("\nUdin memiliki %d kaki",kaki);
    }

    @Override
    public void setTangan(int tangan) {
        super.setTangan(tangan);
        System.out.printf("\nUdin memiliki %d tangan\n",tangan);
    }

    @Override
    public void Skill() {
        super.Skill();
        System.out.println("Udin dapat berlari cepat");
    }

}