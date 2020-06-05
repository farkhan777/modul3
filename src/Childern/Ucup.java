package Childern;

import Parent.Human;

public class Ucup extends Human {
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
        System.out.println("\nNama : Ucup");
    }

    @Override
    public void setUsia(int usia) {
        super.setUsia(usia);
        System.out.println("Usia Ucup : 3 Tahun");
    }

    @Override
    public void setMata(int mata) {
        super.setMata(mata);
        System.out.printf("Ucup memiliki %d mata",mata);
    }

    @Override
    public void setKaki(int kaki) {
        super.setKaki(kaki);
        System.out.printf("\nUcup memiliki %d kaki",kaki);
    }

    @Override
    public void setTangan(int tangan) {
        super.setTangan(tangan);
        System.out.printf("\nUcup memiliki %d tangan\n",tangan);
    }

    @Override
    public void Pendidikan() {
        System.out.println("S3 Informatika");
    }
}
