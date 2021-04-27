package modul3;
public class DataMhs extends DataUniv{
    static String Alamat;
    static String Jurusan;

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        DataMhs.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        DataMhs.Jurusan = Jurusan;
    }

}

