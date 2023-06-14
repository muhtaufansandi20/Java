1. config --> MyConfig.java
merupakan konfigurasi untuk mengatur koneksi ke database MySQL menggunakan JDBC (Java Database Connectivity). Dengan menggunakan konfigurasi ini, kelas lain dalam proyek Java dapat menggunakan koneksi ke database dengan memanggil MyConfig.connection() untuk membuat koneksi dan kemudian menggunakan objek koneksi tersebut untuk menjalankan query SQL atau operasi database lainnya.


2. controller --> MyController.java
berfungsi untuk mengelola operasi-operasi yang terkait dengan basis data pada tabel "tb_produk". Misalnya mengambil data, mencari produk, memasukkan data, mengupdate data, dana menghapus data dari tabel dan menampilkannya berupa nama produk, harga, dan jumlah.


3. Layout --> Delete.java
Kelas ini bertanggung jawab untuk menampilkan tampilan penghapusan data produk dari tabel "tb_produk" dan melakukan operasi penghapusan tersebut. Dengan menggunakan kelas Delete, pengguna dapat melihat data produk yang ada, memilih produk yang ingin dihapus berdasarkan nama, dan melihat hasil dari operasi penghapusan tersebut.


4. Layout --> Edit.java
menampilkan tampilan untuk memilih data produk yang akan diedit. Pengguna dapat memilih menu update nama, harga, atau jumlah. Metode ini juga memanggil metode-metode showEditNama(String nama), showEditHarga(String nama), atau showEditJumlah(String nama) tergantung pada pilihan pengguna. Pada setiap metode, tampilan yang dihasilkan memberikan informasi tentang langkah-langkah yang harus diikuti oleh pengguna untuk melakukan pengeditan data produk. Setelah pengeditan selesai, tampilan akan kembali ke menu utama dengan memanggil metode Menu.showMenu()


5. Layout --> Insert.java
Kelas Insert memiliki satu metode yaitu showInsertData(). Metode ini digunakan untuk menampilkan tampilan untuk memasukkan data produk baru ke dalam tabel "tb_produk". Pada tampilan yang ditampilkan, pengguna diminta untuk memasukkan nama produk, harga, dan jumlah stok melalui input dari Scanner. Setelah nilai-nilai tersebut dimasukkan, metode MyController.insertData(name, harga, stok) dipanggil untuk memasukkan data produk baru ke dalam tabel "tb_produk". Metode ini mengembalikan nilai true jika penambahan data berhasil dilakukan, dan false jika gagal. Hasil penambahan data akan ditampilkan ke layar, dengan pesan "Berhasil Insert Data" jika penambahan berhasil, atau "Gagal Insert Data" jika gagal. Setelah tampilan hasil ditampilkan, metode Menu.showMenu() dipanggil untuk kembali ke menu utama.


6. Layout --> Menu.java
digunakan untuk menampilkan tampilan menu utama ke layar. Pada tampilan ini, pengguna diberikan opsi untuk membaca data, memasukkan data, mengedit data, menghapus data, atau keluar dari program.
Setelah tampilan menu ditampilkan, metode selectMenu() dipanggil. Metode ini digunakan untuk membaca pilihan menu yang dimasukkan oleh pengguna melalui input dari Scanner. Berdasarkan pilihan yang dimasukkan, metode selectMenu() akan memanggil metode yang sesuai dari kelas-kelas lain untuk menampilkan data dari tabel, memasukkan data baru ke dalam tabel, memilih dan mengedit data yang ada di dalam tabel. memanggil untuk memilih dan menghapus data yang ada di dalam tabel, program akan dihentikan dengan menampilkan pesan "Terima Kasih...". Jika pilihan tidak valid, pesan kesalahan akan ditampilkan, dan metode showMenu() akan dipanggil kembali untuk menampilkan menu utama.


7. Read --> Read.java
implementasi kelas Read pada package layout. Kelas ini bertanggung jawab untuk menampilkan data produk dari tabel, memberikan opsi menu kepada pengguna, dan mengarahkan ke menu utama atau keluar dari program. Digunakan untuk menampilkan data produk dari tabel ke layar. Setelah data produk ditampilkan, pengguna diberikan opsi untuk memilih:
Jika pilihan adalah 1, metode Menu.showMenu() dipanggil untuk menampilkan menu utama.
Jika pilihan adalah 2, program akan dihentikan dengan menampilkan pesan "Terima Kasih...".
Jika pilihan tidak valid, pesan kesalahan akan ditampilkan, metode Menu.showMenu() akan dipanggil untuk menampilkan menu utama, dan program akan dihentikan. Dengan menggunakan kelas Read, pengguna dapat melihat data produk yang ada dalam tabel dan kemudian memilih untuk kembali ke menu utama atau keluar dari program.