public class Variabel {
    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe data yang sesuai
        String namaLengkap = "Raka Resi Wahyu";
        String tempatLahir = "Bogor";
        String tanggalLahir = "27 November 2007";
        char jenisKelamin = 'L'; // L = Laki-laki, P = Perempuan
        String alamat = "Kp. Gembrong, Bogor, Jawa Barat";
        String noHp = "089630491677"; // String agar angka 0 di depan tidak hilang
        long penghasilan = 5000000L;  // long untuk bilangan besar (Rupiah)

        // Menampilkan output
        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.println("Nama Lengkap            : " + namaLengkap);
        System.out.println("Tempat & Tanggal Lahir  : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin           : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Alamat Lengkap          : " + alamat);
        System.out.println("No Hp                   : " + noHp);
        System.out.println("Penghasilan Sebulan     : Rp" + penghasilan);
    }
}