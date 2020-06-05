package Parent;

public class Human {
    String nama;
    int usia;
   public int mata;
   public int kaki;
   public int tangan;

    public void setNama(String nama) {

        this.nama = nama;
    }

    public void setUsia(int usia)
    {
        this.usia = usia;
    }

    public void setMata(int mata) {
        this.mata = mata;
    }


    public void setKaki(int kaki) {
        this.kaki = kaki;
    }


    public void setTangan(int tangan) {
        this.tangan = tangan;
    }

    public void Skill(){

    }
    public void Hobi(){
        System.out.println("Hobi Tidur");
    }
    public void Pendidikan(){
        System.out.println("Pendidikan S1\n");
    }

}
