package Model;

import Interfaces.ContohInterfaces;

public class Perhitungan implements ContohInterfaces{
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        _hasil = 0;
        this.a = _a;
        this.b = _b;
        this.hasil = _hasil;
        printJudulClass("Print Judul Dalam Class Perhitungan ");
    }
    
    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interfaces");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;
        // TODO Auto-generated method stub
        
    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;
        // TODO Auto-generated method stub
        
    }

    public int tambah(int _a, int _b){
        HitungTambah();
        return hasil;
    }

    public int kali(int _a, int _b){
        HitungKali();
        return hasil;
    }
}
