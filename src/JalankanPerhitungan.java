import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan a = new Perhitungan(4, 6, 0);
        a.PrintJudul();
        System.out.println("Hasil Tambah Adalah : "+ a.tambah(4, 6));
        System.out.println("Hasil Kali Adalah : "+ a.kali(4, 6));
    }
    
}
