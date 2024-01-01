## The Adventure Of The Snake
## 1. Latar Belakang 
-  selain untuk memenuhi tugas kuliah,saya membuat game ini adalah sebagai sarana untuk mempelajari keterampilan baru, terutama dalam bidang pemrograman, desain grafis, atau audio.dan dengan ini untuk pertama kalinya saya akan membuat game tentang petualangan yaitu teh adventure of the snake,game ini akan menciptakan game yang seru dan menarik.
  
## 2. Deskripsi dan Alur Cerita 
-  deskripsi game : Snake Game adalah game seru yang mengajak pemain untuk menjelajahi dunia berwarna penuh petualangan sebagai seekor ular lapar,pemain akan memandu ular mereka untuk mencari makanan yang tersebar di sekitar berbagai lokasi. Setiap item yang dimakan akan membuat ular tumbuh lebih panjang, tetapi pemain harus berhati-hati menghindari rintangan dan bahaya untuk menghindari kekalahan.
-  alur cerita : Di sebuah dunia yang penuh warna, hiduplah seekor ular kecil.ular tersebut adalah bagian dari suku ular yang berpetualang, dan mereka memiliki tradisi untuk menjelajahi dunia untuk menemukan sebuah makanan.Pemain mengendalikan ular melalui berbagai level yang rintangan. Selama perjalanan,ular harus memakan berbagai jenis makanan untuk tumbuh dan mendapatkan kekuatan.lalu Pemain harus memanfaatkan kecepatan dan kelincahan ular untuk menghindari ancaman dan mengumpulkan semua potongan makanan khusus untuk mengaktifkan kekuatan,Dengan setiap level yang berhasil diselesaikan, asep tumbuh menjadi ular yang lebih besar dan lebih kuat.
-  
## 3. Branding dari game
-  Nama / merk game : the adventure of the snake
-  Deskripsi target pengguna : the adventure of the snake dirancang untuk memikat pemain dari berbagai kelompok usia yang mencari pengalaman game yang seru dan menghibur. Target pengguna utamanya adalah mereka yang menyukai tantangan.
-  Genre : Dengan sentuhan aksi, game ini menawarkan kombinasi yang mengasyikkan antara kecepatan bermain dan kemampuan strategi pemain dengan desain yang menarik dan tantangan.
-  
## 4. User Story

Sebagai | Saya bisa | Sehingga | Prioritas
---|---|---|---
Pemain |dapat mengendalikan ular karakter saya dengan mudah menggunakan kontrol yang intuitif |saya bisa fokus pada petualangan dan melewati rintangan di dalam game.  | ⭐⭐⭐⭐⭐
Pemain |saya ingin menghindari rintangan dan musuh di sepanjang perjalanan |saya dapat mencapai akhir level tanpa kehilangan nyawa dan melanjutkan petualangan saya. | ⭐⭐⭐⭐
Pemain | menyelesaikan setiap level dengan cepat dan efisien| saya dapat mencetak skor tinggi dan bersaing dengan pemain lain | ⭐⭐⭐⭐
Pemain | mendapatkan kekuatan tambahan setelah memakan makanan tertentu |menemukan level bonus dan rahasia yang memberikan tantangan ekstra dan reward yang menarik| ⭐⭐⭐⭐
Pemain | menjelajahi cerita yang menarik dan menyelesaikan misi untuk menemukan Sumber Energi Ular|aya merasa terlibat dalam alur cerita yang memotivasi | ⭐⭐⭐⭐⭐
Pemain | menyempurnakan keterampilan mengendalikan ular |saya dapat dengan lebih baik menghadapi level-level yang semakin sulit dan meningkatkan skor saya| ⭐⭐⭐⭐

## 5. Desain user interface
![WhatsApp Image 2023-12-25 at 16 29 40_71726a78](https://github.com/gunggpermanaa/uts-praktikum-dasar-pemograman/assets/144643400/9b79635c-893b-48df-83fa-4299ba810447)
![map ular](https://github.com/gunggpermanaa/uts-praktikum-dasar-pemograman/assets/144643400/6b6eb56e-0f6a-4373-9a01-30a9d9288dda)


## 6. Flow chart dari algoritma buatan sendiri yang digunakan pada game

 ```mermaid
flowchart TD;
    A[Mulai] --> B[Pemain Memulai Permainan];
    B --> C[Game Loop];
    C --> D[Ular Makan Makanan];
    D --> E[rintangan];
    E --> F[Ular Menyelesaikan Level];
    F --> G[Game Over];
    G --> H[Keluar];
```
## 7.Link Demo Game
-  (https://youtu.be/cSjCbkqqa4w)
## 8.Link Folder Code Game
- https://github.com/gunggpermanaa/projects-game

## 9.Prinsip Dasar Pemograman

-  a.Variabel digunakan untuk menyimpan informasi penting tentang game, seperti dimensi layar, ukuran ular, dan lokasi makanan.
-  b.Data Type yang berbeda digunakan untuk menyimpan jenis data yang berbeda, seperti bilangan bulat, bilangan desimal, dan nilai boolean.
-  c.Operator digunakan untuk melakukan perhitungan dan perbandingan, seperti aritmatika, peningkatan/penurunan, dan perbandingan nilai.
-  d.Boolean digunakan untuk membuat keputusan berdasarkan kondisi, seperti apakah ular telah memakan makanan atau apakah ular telah menabrak dirinya sendiri.
-  e.Condition (If/else/switch):Mengontrol aliran program: Pernyataan kondisional mengarahkan perilaku game
-  f.Looping/while/for digunakan untuk mengulangi tindakan, seperti pembaruan game yang berkelanjutan atau iterasi melalui array.
-  g.Array digunakan untuk menyimpan koleksi elemen, seperti bagian tubuh ular atau status tombol keyboard.
-  h.Method digunakan untuk mengatur kode menjadi blok yang dapat digunakan kembali, seperti logika game atau rendering visual.
-  i.class digunakan untuk mendefinisikan cetak biru untuk objek, seperti ular, makanan, dan layar.

  ## Bagaimana konsep variable, data type dan operator pada bahasa pemrograman digunakan dalam pembuatan game ini
-  Konsep Variabel:
Instance Variables:

Dalam kelas Constants, terdapat variabel statis (static) yang menyimpan nilai-nilai konstan seperti lebar layar (SCREEN_WIDTH), tinggi layar (SCREEN_HEIGHT), dan lain-lain.
Object Variables:

Variabel-variabel seperti background, foreground, snake, dan food pada kelas GameScene menyimpan objek-objek yang digunakan dalam permainan.
Local Variables:

Variabel lokal digunakan dalam metode-metode untuk menyimpan nilai sementara, seperti randX dan randY dalam metode spawn di kelas Food.
-  Konsep Data Type : primitive

int digunakan untuk menyimpan nilai-nilai integer seperti lebar dan tinggi layar.
float digunakan untuk TILE_WIDTH yang merupakan bilangan pecahan.
double digunakan untuk menyimpan nilai waktu dan delta waktu.
Object Data Types:

Tipe data objek seperti Rect digunakan untuk merepresentasikan objek-objek dalam permainan.
Enum:

Enum Direction digunakan untuk menyimpan arah gerakan ular (RIGHT, LEFT, UP, DOWN).
-  Konsep Operator:
Aritmatika:

Operator aritmatika seperti +, -, *, dan / digunakan dalam berbagai tempat, seperti perhitungan koordinat dan ukuran objek.
Relasional:

Operator relasional seperti == digunakan untuk memeriksa kondisi, seperti saat mengecek apakah dua objek bertabrakan.
Logika:

Operator logika (&&, ||, !) digunakan dalam logika permainan, seperti kondisi spawn makanan dan arah gerakan ular.
Assignment:

Operator assignment (=) digunakan untuk memberikan nilai pada variabel.
Increment/Decrement:

Operator increment (++) dan decrement (--) digunakan dalam perulangan dan manipulasi indeks array.  
## Bagaimana konsep boolean dan conditions pada bahasa pemrograman digunakan dalam pembuatan game ini 
-  konsep boolean dan condition,dapat mengontrol alur logika permainan dan membuat keputusan yang sesuai berdasarkan situasi tertentu. Ini membantu dalam mengimplementasikan perilaku dinamis dan responsif pada game
## Bagaimana konsep looping dan array pada bahasa pemrograman digunakan dalam pembuatan game ini
-  looping dan array untuk mengelola dan memanipulasi data dengan efisien, memungkinkan struktur data yang fleksibel dan iterasi yang mudah diimplementasikan. Ini membantu dalam memelihara dan mengelola elemen-elemen permainan dengan cara yang efisien dan terstruktur
## Bagaimana konsep method pada bahasa pemrograman digunakan dalam pembuatan game ini 
-   konsep metode membantu dalam menyusun dan mengorganisir logika program secara terstruktur, membuatnya lebih mudah untuk dipahami, dikembangkan, dan dipelihara.
## Bagaimana konsep class pada bahasa pemrograman digunakan dalam pembuatan game ini 
-   konsep kelas membantu dalam mengorganisir kode, meningkatkan keterbacaan, dan memfasilitasi pengembangan lebih lanjut. Ini juga memungkinkan para pengembang untuk berpikir secara objektif tentang entitas dan interaksi di dalam game.
## Jelaskan algoritma buatan sendiri yang digunakan pada pembuatan game ini
-  disini saya akan menjelaskan pengembangan algoritma yang saya buat pada game kali ini yg pertama ada perancangan,dalam perancangan saya membuat atau menentukan fitur fitur yang akan ada pada game sayaa yaitu Ular yang dapat bergerak ke atas, bawah, kiri, atau kanan,Makanan yang dapat dimakan oleh ular untuk menambah ukurannya,dan Game over jika ular menabrak dirinya sendiri atau batas layar.
-  kedua ada pemodelan disini saya akan  menentukan bagaimana fitur tersebut diterapkan,pemodelan dilakukan dengan array,looping,condition,dan class
-  ketiga ada implementasi yaitu untuk mewujudkan pemodelan yang saya sudah buat,kode ini diplementasikan menggunakan java swing
-  keempat pengujian untuk bagian ini adalah memastikan bahwa game berfungsi dengan baik,misalnya menguji apakah ular dapat bergerak dengan benar dan dilakukan manual dengan menggerakan ular dengan keyboard
-terakhir ada pemeliharaan untuk memperbaiki bug dan menambahkan fitur fitur yang baru.
