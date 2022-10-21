public class PersonBeraksi{
    public static void main(String[] args) {
    
    Person Anton  = new Person ();
    
    /* memanggil atribut dan memberi nilai */
    
    Anton.Nama = "Anton";
    Anton.JenisKelamin = "Pria";
    Anton.Umur = 23;
    System.out.println("Nama : " + Anton.Nama);
    System.out.println("JenisKelamin : " + Anton.JenisKelamin);
    System.out.println("Umur : " + Anton.Umur);
    
    
    Person Riko = new Person ();
    Riko.Nama = "Riko";
    Riko.JenisKelamin = "Pria";
    Riko.Umur = 27 ;
    System.out.println("Nama : " + Riko.Nama);
    System.out.println("JenisKelamin : " + Riko.JenisKelamin);
    System.out.println("Umur : " + Riko.Umur);
    
    
    
    }
    }