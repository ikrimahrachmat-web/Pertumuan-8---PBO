# Praktikum 8 - Pemrograman Berorientasi Objek
## Topik: Polymorphism, Abstract Class, dan Interface (Java) Package: com.praktikum8
### Tujuan
1. Memahami polymorphism runtime (method overriding).
2. Merancang abstract class dan abstract method sebagai kerangka hierarki kelas.
3. Mengimplementasikan interface sebagai kontrak dan menyimulasikan multiple inheritance.
#### Kegiatan 1: Polymorphism (Method Overriding)
File: Hewan.java, Kucing.java, Anjing.java, PoliTester.java
Penjelasan:
- Hewan adalah superclass dengan method bersuara() yang isinya umum.
- Kucing dan Anjing adalah subclass (extends Hewan). Keduanya meng-override bersuara() agar suaranya sesuai hewan masing-masing. Anotasi @Override opsional, tapi berguna supaya compiler memberi error kalau nama method salah ketik.
- Di PoliTester, dibuat array bertipe Hewan[] yang diisi objek Hewan, Kucing, dan Anjing. Memasukkan objek subclass ke variabel tipe superclass disebut upcasting.
- Saat h.bersuara() dipanggil di dalam loop, Java memilih method berdasarkan objek aslinya, bukan tipe variabelnya. Ini disebut dynamic binding (polimorfisme runtime). Hasilnya, satu pemanggilan method yang sama menghasilkan output yang berbeda.

Output :
```
Hewan ini mengeluarkan suara yang tidak spesifik.
Kucing: Meow meow!
Anjing: Guk guk!
```
#### Kegiatan 2: Abstract Class
File: BangunDatar.java, Lingkaran.java
Penjelasan:
- BangunDatar dideklarasikan dengan kata kunci abstract, sehingga tidak bisa dibuat objeknya dengan new. Fungsinya sebagai kerangka dasar untuk subclass.
- hitungLuas() adalah abstract method: hanya punya tanda tangan tanpa isi. Setiap subclass wajib meng-override-nya. Kalau tidak, IDE/compiler akan menampilkan error.
- cetakWarna() adalah concrete method (punya isi), jadi bisa langsung dipakai semua subclass tanpa ditulis ulang.
- Lingkaran mewarisi BangunDatar, memanggil super(warna) untuk mengisi atribut warna dari parent, lalu mengimplementasikan hitungLuas() dengan rumus π × r².

#### Kegiatan 3: Interface (Multiple Implementation)
File: AlatElektronik.java, Kamera.java, Smartphone.java
Penjelasan:
- Interface adalah kontrak murni: hanya berisi tanda tangan method (tanpa isi). AlatElektronik mendefinisikan nyalakan() dan matikan(), sedangkan Kamera mendefinisikan ambilFoto().
- Di Java, sebuah class hanya bisa extends satu class, tapi bisa implements banyak interface. Inilah cara Java menyimulasikan multiple inheritance.
- Smartphone implements AlatElektronik, Kamera sehingga wajib mengimplementasikan ketiga method tersebut (nyalakan, matikan, ambilFoto).
