# ☕ Aplikasi Pemrograman Mobile: Kopi dan Nyemil

Aplikasi mobile berbasis Android untuk pemesanan makanan dan minuman online di toko **Kopi dan Nyemil**. Aplikasi ini mengimplementasikan alur navigasi lengkap dari autentikasi hingga konfirmasi pesanan dengan antarmuka yang bersih dan modern.

---

## 🛠️ Fitur & Alur Aplikasi

1. **Splash Screen**: Layar pembuka aplikasi dengan tombol *Start Now*.
2. **Sign Up**: Halaman awal autentikasi untuk memilih alur *Register* atau *Login*.
3. **Login User**: Form autentikasi username & password untuk pengguna terdaftar.
4. **Register**: Form pendaftaran akun baru (Nama Lengkap, Username, Password).
5. **Home Menu**: Katalog daftar menu makanan & minuman menggunakan `RecyclerView` (minimal 5 item) dilengkapi Bottom Navigation.
6. **Profile**: Halaman pengaturan profil pengguna (Nama Lengkap & tombol Save).
7. **Alamat Pengiriman (Order)**: Form pengisian data lokasi pengiriman pesanan (Nama, Alamat, Patokan Detail).
8. **Konfirmasi Pesanan**: Layar status pesanan berhasil beserta ucapan terima kasih.

---

## 🧰 Teknologi yang Digunakan

* **Bahasa Pemrograman**: Kotlin
* **UI Layout**: XML (ConstraintLayout, Material Components, CardView)
* **Komponen List**: RecyclerView & ShapeableImageView (Rounded Corner Image)
* **Navigasi Data**: Intent & Intent Extras (Pengiriman Nama/Username antar-halaman)
* **Minimum SDK**: Android 7.0 (API Level 24)

---

## 🚀 Cara Menjalankan Aplikasi

1. *Clone* repository ini ke komputer kamu:
   ```bash
   git clone [https://github.com/Arikatameika/Kopi-dan-Nyemil.git](https://github.com/Arikatameika/Kopi-dan-Nyemil.git)
