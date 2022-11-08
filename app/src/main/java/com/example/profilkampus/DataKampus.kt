package com.example.profilkampus

object DataKampus {
    private val namaKampus = arrayOf("Universitas Negeri Surabaya",
            "Institut Pertanian Bogor",
            "Institut Teknologi Bandung",
            "Universitas Negeri Yogyakarta",
            "Uiversitas Padjadjaran",
            "Institut Tenologi Sepuluh Nopember",
            "Universitas Negeri Semarang",
            "Universitas Brawijaya",
            "Universitas Negeri Jakarta",
            "Universitas Gajah Mada",
            "Universitas Jember",
            "Universitas Indonesia",
            "Universitas Diponegoro",
            "UIN Sunan Ampel",
            "Universitas Airlangga",
            "Universitas Negeri Malang")

    private val alamatKampus = arrayOf("Jl. Lidah Wetan, Lidah Wetan, Kec. Lakarsantri, Kota SBY, Jawa Timur 60213",
            "Jl. Raya Dramaga, Babakan, Kec. Dramaga, Kota Bogor, Jawa Barat 16680",
            "Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132",
            "Jl. Colombo Yogyakarta No.1, Karang Malang, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Raya Bandung Sumedang KM.21, Hegarmanah, Jatinangor, Kabupaten Sumedang, Jawa Barat 45363",
            "Jl. Teknik Kimia, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111",
            "Sekaran, Gunung Pati, Semarang City, Central Java 50229",
            "Jl. Veteran, Ketawanggede, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145",
            "Jl. R.Mangun Muka Raya, RT.11/RW.14, Rawamangun, Kec. Pulo Gadung, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13220",
            "Bulaksumur, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Kalimantan No.37, Krajan Timur, Sumbersari, Kec. Sumbersari, Kabupaten Jember, Jawa Timur 68121",
            "Jl. Margonda Raya, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
            "Jl. Prof. Sudarto No.13, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah 50275",
            "Jl. Ahmad Yani No.117, Jemur Wonosari, Kec. Wonocolo, Kota SBY, Jawa Timur 60237",
            "Jl. Airlangga No.4 - 6, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60115",
            "Jl. Semarang No.5, Sumbersari, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145")

    private val logoKampus = arrayOf(R.drawable.logo_unesa,
            R.drawable.logo_ipb,
            R.drawable.logo_itb,
            R.drawable.logo_uny,
            R.drawable.logo_unpad,
            R.drawable.logo_its,
            R.drawable.logo_unnes,
            R.drawable.logo_ub,
            R.drawable.logo_unj,
            R.drawable.logo_ugm,
            R.drawable.logo_unej,
            R.drawable.logo_ui,
            R.drawable.logo_undip,
            R.drawable.logo_uinsa,
            R.drawable.logo_unair,
            R.drawable.logo_um)

    private val fotoKampus = arrayOf(R.drawable.unesa,
            R.drawable.ipb,
            R.drawable.itb,
            R.drawable.uny,
            R.drawable.unpad,
            R.drawable.its,
            R.drawable.unnes,
            R.drawable.ub,
            R.drawable.unj,
            R.drawable.ugm,
            R.drawable.unej,
            R.drawable.ui,
            R.drawable.undip,
            R.drawable.uinsa,
            R.drawable.unair,
            R.drawable.um)

    private val logoKotaKampus = arrayOf(R.drawable.logo_surabaya,
            R.drawable.logo_bogor,
            R.drawable.logo_bandung,
            R.drawable.logo_jogja,
            R.drawable.logo_sumedang,
            R.drawable.logo_surabaya,
            R.drawable.logo_semarang,
            R.drawable.logo_malang,
            R.drawable.logo_jakarta,
            R.drawable.logo_jogja,
            R.drawable.logo_jember,
            R.drawable.logo_depok,
            R.drawable.logo_semarang,
            R.drawable.logo_surabaya,
            R.drawable.logo_surabaya,
            R.drawable.logo_malang)

    private val jurusanFavorit1 = arrayOf("Manajemen",
            "Manajemen Perikanan Tangkap",
            "Teknik Informatika",
            "Teknik Sipil",
            "Psikologi",
            "Teknik Informatika",
            "Kesehatan Masyarakat",
            "Agroekoteknologi",
            "PGSD",
            "Kedokteran",
            "Pendidikan Dokter",
            "Ilmu Hubungan Internasional",
            "Akuntansi",
            "Manajemen Keuangan Syariah",
            "Kedokteran",
            "Manajemen")

    private val jurusanFavorit2 = arrayOf("PGSD",
            "Manajemen Perikanan Budidaya",
            "Teknik Geofisika",
            "Teknologi Informasi",
            "Farmasi",
            "Teknik Elektro",
            "Pendidikan Matematika",
            "Farmasi",
            "Mamajemen",
            "Farmasi",
            "Farmasi",
            "Ilmu Komunikasi",
            "Antropologi Sosial",
            "Ekonomi Syariah",
            "Kesehatan Masyarakat",
            "PGSD")

    private val jurusanFavorit3 = arrayOf("Psikologi",
            "Teknik Sipil",
            "Teknik Metalurgi",
            "Pendidikan Matematika",
            "Pendidikan Dokter",
            "Sistem Informasi",
            "Teknik Informatika",
            "Kedokteran",
            "Akuntansi",
            "Teknik Sipil",
            "Pendidikan Dokter Gigi",
            "Pendidikan Dokter",
            "Administrasi Bisnis",
            "Berbankan Syariah",
            "Farmasi",
            "Psikologi")

    private val jurusanFavorit4 = arrayOf("Ilmu Komunikasi",
            "Ilmu Komputer",
            "Teknik Pertambangan",
            "Pendidikan Biologi",
            "Ilmu Keperawatan",
            "Teknik Sipil",
            "Gizi",
            "Agrobisnis",
            "Pendidikan Matematika",
            "Kedokterak Gigi",
            "Ilmu Keperawatan",
            "Sastra Inggris",
            "Ilmu Komunikasi",
            "Pendidikan Agama Islam",
            "Kedokteran Gigi",
            "Akuntansi")

    private val sebutan = arrayOf("UNESA",
            "IPB",
            "ITB",
            "UNY",
            "UNPAD",
            "ITS",
            "UNNES",
            "UB",
            "UNJ",
            "UGM",
            "UNEJ",
            "UI",
            "UNDIP",
            "UINSA",
            "UNAIR",
            "UM")

    private val jumlahMahasiswa = arrayOf(31364,
            26609,
            19747,
            26802,
            32931,
            17625,
            31719,
            73133,
            42023,
            56110,
            80000,
            47357,
            38503,
            15000,
            38047,
            11441)

    private val SejarahKampus = arrayOf("Sejarah Unesa tidak dapat dipisahkan dari IKIP Surabaya yang dimulai sekitar tahun 1950. Berawal dari kursus B-I dan B-II bidang Ilmu Kimia dan Ilmu Pasti yang memanfaatkan sarana dan prasarana berupa ruang kelas dan laboratorium milik Belanda, Hoogere Burger Schol (HBS). Kursus-kursus tersebut diselenggarakan di Surabaya untuk memenuhi kebutuhan tenaga guru setingkat SLTP dan SLTA. Kursus-kursus tersebut meliputi: (a) B-I dan B-II Kimia, (b) B-I dan BII Ilmu Pasti, (c) B-I Bahasa Inggris, (d) B-I Bahasa Jerman, (e) B-I Teknik, (f) B-I Pendidikan Jasmani, (g) B-I Ekonomi, (h) B-I Perniagaan, dan (i) B-I Ilmu Pesawat. Pada tahun 1957, kursus-kursus B-I dikelompokkan menjadi dua, yaitu (1) Kursus B-I Umum, yang meliputi Bahasa Inggris dan bahasa Jerman, dan (2) Kursus B-I Kejuruan, yang meliputi Kimia, Ilmu Pasti, Ekonomi, Perniagaan, Teknik, Pendidikan Jasmani, dan Ilmu Pesawat. Kursus-kursus tersebut berlangsung sampai tahun 1960. Unesa didirikan pada 19 Desember 1964. Unesa memiliki 7 fakultas; 4 fakultas berada di kompleks Kampus Ketintang: Fakultas Teknik, Fakultas Ekonomi, Fakultas Matematika dan Ilmu Pengetahuan Alam, serta Fakultas Ilmu Sosial. Sementara 3 fakultas berada di kompleks Kampus Lidah Wetan: Fakultas Ilmu Keolahragaan, Fakultas Ilmu Pendidikan juga Fakultas Bahasa dan Seni.",
            "Cikal bakal IPB dimulai sejak tahun 76 tahun lalu, sejak pendidikan tinggi pertanian pertama kali diselenggarakan di tanah air pada tahun 1940. IPB dibentuk secara resmi sejak 1 September 1963 berdasarkan Surat Keputusan Menteri Perguruan Tinggi dan Ilmu Pengetahuan No. 91 Tahun 1963 dan disahkan oleh Keputusan Presiden Republik Indonesia No. 279 Tahun 1965. Sejarah kelahiran IPB dimulai dari berdirinya Fakultas Ilmu Pengetahuan Pertanian, Universitas Indonesia di Bogor. Pendirian fakultas tersebut merupakan cikal bakal IPB sekaligus menandai babak baru pendidikan tinggi pertanian di Indonesia. Sejarah pendirian pendidikan tinggi pertanian di Indonesia sangat kental dengan nuansa perjuangan untuk memandirikan bangsa melalui pembangunan pertanian guna memenuhi kebutuhan pangan dan kesejahteraan bangsa.",
            "Sejarah Pendidikan Tinggi Teknik di Indonesia berawal pada abad ke-20, ketika pemerintah kolonial Belanda mendirikan de Techniche Hoogeschool te Bandung (TH) pada 3 Juli 1920 di lahan seluas 30 hektar di Bandung. Saat itu hanya terdapat satu fakultas yaitu de Faculteit van Technische Wetenschap dan hanya satu jurusan yaitu de afdeeling der We gen Waterbouw. Pendirian perguruan tinggi ini dimaksudkan untuk memenuhi kebutuhan tenaga teknik yang semakin terbatas pada masa kolonial Belanda akibat pecahnya Perang Dunia pertama. Sejak resmi dibuka untuk tahun kuliah 1920-1921, terdaftar 28 orang mahasiswa TH dengan hanya ada 2 orang Indonesia. Sementara itu, jumlah dosen pada permulaan tahun 1922 terdapat 12 orang Guru Besar. Empat tahun kemudian, pada tanggal 4 Juli 1924 dilepaslah insinyur yang pertama dari TH berjumlah 12 orang. Status TH dari saat pembukaan sampai tahun 1924 adalah bijzondere school yang kemudian berganti statusnya dari swasta menjadi instansi pemerintah.",
            "Sejarah IKIP Yogyakarta tidak dapat dilepaskan dengan keberadaan Fakultas Pedagogik (FP) Universitas Gajah Mada yang didirikan pada tanggal 19 September !955. pada waktu itu FP UGM  memiliki dua bagian, yaitu Bagian Pendidikan dan Bagian Pendidikan Jasmani. Pada tanggal 2 Februari 1962, Fakultas Pedagogik dipecah menjadi tiga fakultas, yaitu Fakultas Ilmu Pendidikan (FIP), Fakultas Pendidikan Djasmani (FPD),  dan  Fakultas Keguruan dan ilmu Pendidikan (FKIP). Namun pada 1963 FPD dimasukan kedalam lingkungan Departemen Olahraga dan dijadikan Sekolah Tinggi Olahraga (STO). Pada masa itu tuntutan terhadap dunia pendidikan semakin tinggi sehingga permintaan tenaga pengajar juga tinggi. FKIP UGM begitu digemari sehingga jumlah mahasiswa pada tahun 1962 mencapai 1469 orang. Untuk mengatasi hal itu maka kemudian muncul Surat Keputusan Menteri Pendidikan dan Kebudayaan No. 92 th 1962 tentang didirikannya Institut Pendidikan Guru (IPG).",
            "Universitas Padjadjaran atau dikenal dengan singkatan Unpad merupakan salah satu perguruan tinggi negeri yang ada di Indonesia. Unpad berdiri pada 11 September 1957, dengan lokasi kampus di Bandung. Saat ini, Unpad berstatus sebagai Perguruan Tinggi Negeri Badan Hukum. Peraturan Pemerintah Nomor 80 Tahun 2014 tentang Penetapan Unpad sebagai Perguruan Tinggi Negeri Badan Hukum ditandatangani Presiden RI, Susilo Bambang Yudhoyono, pada 17 Oktober 2014. Setelah itu, Peraturan Pemerintah Nomor 51 Tahun 2015 tentang Statuta Universitas Padjadjaran ditandatangani Presiden RI, Joko Widodo, pada 22 Juli 2015. Pada tahun 1950-an, di Bandung sebenarnya telah ada perguruan tinggi seperti Fakultas Teknik dan Fakultas MIPA yang merupakan bagian dari Universitas Indonesia (UI) dan Perguruan Tinggi Pendidikan Guru (PTPG). Namun, masyarakat menghendaki sebuah universitas negeri yang menyelenggarakan pendidikan dari berbagai disiplin ilmu. Perhatian pemerintah daerah dan pemerintah pusat sangat besar terhadap perlu adanya universitas negeri di Bandung, terutama setelah Bandung dipilih sebagai kota penyelenggaraan Konferensi Asia-Afrika pada tahun 1955.",
            "Gagasan pendirian Institut Teknologi Sepuluh Nopember (ITS) dicetuskan oleh Ir. Soendjasmono (wakil PII Jawa Timur) pada 1954. Ide untuk mendirikan perguruan teknik di Jawa Timur disampaikan pada KONFERENSI PII di Bogor. Setelah itu, pada 3 November 1960 terjadi perubahan nama dan berganti menjadi Institut Teknologi Sepuluh November (ITS). ITS berstatus Perguruan Tinggi Negeri berdasar SK Menteri Pendidikan Pengajaran dan Kebudayaan No. 93367/UU. Kemudian sesuai dengan SK Menteri no. 72 tahun 1961, Institut Teknologi Sepuluh Nopember (ITS) resmi menjadi Perguruan Tinggi. Diesnatalis pertama berdasar SK Menteri no. 9 tahun 1961 jatuh pada tanggal 10 November. Setelah perubahan status, ITS menambah fakultasnya menjadi lima fakultas, yaitu Teknik Sipil, Teknik Mesin, Teknik Kimia, Teknik Elektro, dan Teknik Perkapalan. Setelah mempunyai lima fakultas, ITS juga melakukan penambahan kembali pada 1965, yaitu Teknik Arsitektur dan Fakultas Ilmu Pasti dan Alam sesuai dengan SK Mendikbud n0. 72 tahun 1965. Kemudian pada 1972, Fakultas Teknik Arsitektur, Fakultas Ilmu Pasti dan Alam, dan Kantor Pusat ITS berpindah ke kampus baru di Jalan Cokroaminoto 12A, Surabaya.",
            "Universitas Negeri Semarang (UNNES) adalah perguruan tinggi negeri yang diselenggarakan oleh Kementerian Riset, Teknologi, dan Pendidikan Tinggi (Kemristekdikti) Republik Indonesia untuk melaksanakan pendidikan akademik dan profesional dalam sejumlah disiplin ilmu, teknologi, olahraga, seni, dan budaya. Cikal bakal UNNES sudah ada sejak masa Pemerintah Kolonial Belanda. Pada saat itu Pemerintah Kolonial Belanda menyelenggarakan sekolah guru di atas SMA. Setelah Indonesia merdeka, kursus MO-A dan MO-B diselenggarakan di Semarang sampai dengan tahun 1950. Dengan Peraturan Pemerintah No. 41/1950, Kursus MO-A dijadikan Kursus B-I dan Kursus MO-B dijadikan Kursus B-II yang diselenggarakan sampai dengan tahun 1960. Tanggal 1 Januari 1961 dengan Keputusan Sekretaris Jenderal Departemen Pendidikan, Pengajaran dab Kebudayaan No. 108487/S tanggal 27 Desember 1960, Kursus B-I dan Kursus B-II diintegrasikan ke dalam Universitas Diponegoro menjadi sebuah Fakultas Keguruan dan Ilmu Pendidikan (FKIP).",
            "Universitas ini semula berstatus swasta, dengan embrio sejak tahun 1957, yaitu berupa Fakultas Hukum dan Fakultas Ekonomi yang merupakan cabang Universitas Swasta Sawerigading, Makasar. Sebagai langkah awal, didirikan sebuah yayasan bernama Yayasan Perguruan Tinggi Malang (YPTM) dengan akta notaris nomor 48 tahun tertanggal 28 Mei 1957. Yayasan ini kemudian membuka Perguruan Tinggi Hukum dan Pengetahuan Masyarakat (PTHPM), pada 1 Juli 1957. Tercatat sebanyak 104 mahasiswa perguruan tinggi ini, dan menggunakan ruang sidang Balaikota Malang sebagai tempat perkuliahannya. Sementara itu, atas inisiatif beberapa tokoh masyarakat yang lain dibentuk pula Yayasan Perguruan Tinggi Ekonomi Malang (YPTEM) dengan akta notaris nomor 26 tertanggal 15 Agustus 1957 yang kemudian mendirikan Perguruan Tinggi Ekonomi Malang (PTEM). Tak jauh berbeda dengan pendahulunya, aktivitas perkuliahan PTEM juga menumpan di Balai Kota Malang. Secara resmi PTHPM diakui sebagai milik Kotaparaja Malang dengan keputusan DPRD,19 Juni 1958. Pada dies natalis ketiga PTHPM, 1 Juli 1960, diumumkan penggunaan nama Universitas Kotapraja Malang bagi perguruan tinggi itu. Selain itu diumumkan pula rencana membuka dua fakultas baru. Rencana itu menjadi kenyataan, 15 September 1960, berdiri Fakultas Administrasi Niaga (FAN). Disusul kemudian oleh Fakultas Pertanian (FP) pada 10 November 1960.",
            "Setelah Indonesia merdeka, pemerintah Indonesia merasakan kurangnya tenaga kependidikan di semua jenjang dan jenis lembaga pendidikan. Untuk mengatasi masalah ini pemerintah mendirikan berbagai kursus pendidikan guru. Sekitar tahun 1950-an, pada jenjang di atas pendidikan menengah didirikan B-I, B-II, dan PGSLP yang bertugas menyiapkan guru-guru untuk sekolah lanjutan. Usaha-usaha untuk meningkatkan mutu dan jumlah guru terus dilakukan melalui pendirian Perguruan Tinggi Pendidikan Guru (PTPG) oleh pemerintah melalui Keputusan Menteri P dan K No. 382/Kab tahun 1954. PTPG ini didirikan di empat kota yakni Batusangkar, Manado, Bandung, dan Malang. Dengan demikian terdapat dua macam lembaga pendidikan yang menghasilkan tenaga guru, yaitu Kursus B-I/B-II/PGSLP dan PTPG. Kedua lembaga ini kemudian diintegrasikan menjadi satu lembaga pendidikan melalui berbagai tahap. Pada tahun 1957, PTPG diintegrasikan ke dalam Fakultas Keguruan dan Ilmu Pendidikan pada universitas terdekat. Berdasarkan PP No. 51 tahun 1958 Fakultas Pedagogik diintegrasikan ke dalam FKIP. Pada tahun 1963, oleh Kementerian Pendidikan Dasar didirikan Institut Pendidikan Guru (IPG) untuk menghasilkan guru sekolah menengah; sementara berdasarkan Keputusan Menteri P dan K No. 6 dan 7, tanggal 8 Pebruari 1961 Kursus B-I dan B-II diintegrasikan ke dalam FKIP (Fakultas Keguruan dan Ilmu Pendidikan) di bawah Kementerian Pendidikan Tinggi yang juga menghasilkan guru sekolah menengah. Dualisme ini dirasakan kurang efektif dan mengganggu manajemen pendidikan guru. Untuk mengatasi ini maka kursus B-I dan B-II di Jakarta diintegrasikan ke dalam FKIP Universitas Indonesia.",
            "Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia. Didirikan pada periode awal kemerdekaan, UGM didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan bagi penyelenggaraan pendidikan tinggi nasional. Berdiri dengan nama “Universitas Negeri Gadjah Mada”, perguruan tinggi ini merupakan gabungan dari beberapa sekolah tinggi yang telah lebih dulu didirikan, di antaranya Balai Perguruan Tinggi Gadjah Mada, Sekolah Tinggi Teknik, dan Akademi Ilmu Politik yang terletak di Yogyakarta, Balai Pendidikan Ahli Hukum di Solo, serta Perguruan Tinggi Kedokteran Bagian Praklinis di Klaten, yang disahkan dengan Peraturan Pemerintah No. 23 Tahun 1949 tentang Peraturan Penggabungan Perguruan Tinggi menjadi Universiteit. Nama Gadjah Mada juga memiliki makna tersendiri, mengandung semangat serta teladan Mahapatih Gadjah Mada yang berhasil mempersatukan nusantara. Teladan ini diterjemahkan ke dalam rumusan jati diri UGM sebagai universitas nasional, universitas perjuangan, universitas Pancasila, universitas kerakyatan dan universitas pusat kebudayaan, Pada awal pendiriannya, UGM memiliki 6 fakultas, yaitu Fakultas Kedokteran, Fakultas Hukum, Fakultas Teknik, Fakultas Sastra dan Filsafat, Fakultas Pertanian, Fakultas Kedokteran Hewan. Kegiatan perkuliahan masa itu dilakukan di Sitinggil dan Pagelaran, dengan memanfaatkan ruangan-ruangan kamar dan fasilitas di lingkungan Kraton Yogyakarta.",
            "Cikal bakal Universitas Jember berasal dari gagasan dr. R. Achmad bersama-sama dengan R. Th. Soengedi dan R. M. Soerachman yang bercita-cita mendirikan perguruan tinggi di Jember. Untuk mewujudkan cita-cita tersebut pada tanggal 1 April 1957, ketiganya membentuk panitia yang diberi nama Panitia Triumviraat dengan komposisi Ketua dr. R. Achmad; Penulis R. Th. Soengedi, dan Bendahara R. M. Soerachman. Selanjutnya Panitia Triumviraat ini pada tanggal 5 Oktober 1957 membentuk yayasan dengan nama Yayasan Universitas Tawang Alun (disahkan dengan Akta Notaris tanggal 8 Maret 1958 Nomor 13 di Jember). Yayasan Universitas Tawang Alun inilah yang kemudian mendirikan universitas swasta di Jember dengan nama Universitas Tawang Alun yang kemudian disingkat UNITA. Dalam perjalanannya, ketiga tokoh tersebut mendapatkan dukungan penuh Bupati Jember saat itu, R. Soedjarwo. Berdasarkan Surat Keputusan Menteri PTIP No. 151 Tahun 1964 tanggal 9 Nopember 1964, tentang didirikannya Universitas Negeri di Jember. Usaha tanpa kenal lelah sejak tahun 1957 itu akhirnya berhasil menjadi kenyataan, Universitas Negeri Djember berdiri ! Pada awal berdirinya pada tahun 1964, Universitas Negeri Djember yang disingkat UNED, memiliki lima fakultas, terdiri dari Fakultas Hukum di Jember, dengan cabangnya di Banyuwangi, Fakultas Sosial dan Politik dan Fakultas Pertanian di Jember, Fakultas Ekonomi dan Fakultas Sastra di Banyuwangi. Dengan rektor pertama dijabat oleh dr. R. Achmad. Kepemimpinan dr. R. Achmad dilanjutkan oleh Letkol. R. Winoto (1966-1967), Letkol Soedi Harjohoedojo (1967-1969), Letkol. Soetardjo, SH (1969-1978) dan Kol. Drs. H. R. Warsito (1978-1986). Baru semenjak tahun 1986, rektor Universitas Jember dijabat oleh sivitas akademika-nya sendiri, yakni oleh Prof. Dr. Simanhadi Widyaprakosa (1986-1995), Prof. Dr. Kabul Santoso, MS (1995-2003), Dr. Ir. T. Sutikto, MSc (2003-2011), Drs. Moh. Hasan, Msc Ph.D. (2012-2020) dan Dr. Ir. Iwan Taruna, M.Eng.",
            "Sebelum kampus Universitas Indonesia di Depok dibangun pada 1987, Universitas Indonesia memiliki tiga lokasi kampus yaitu di Salemba, Pegangsaan Timur dan Rawamangun. Setelah kampus baru  didirikan di lahan seluas 320 hektare di Depok, kampus Rawamangun yang mencakup beberapa fakultas dipindah, sementara kampus Salemba masih dipertahankan untuk Fakultas Kedokteran, Fakultas Kedokteran Gigi dan Program Pascasarjana. Tidak lama setelah tahun 2000, Universitas Indonesia menjadi satu dari beberapa universitas yang mempunyai status  Badan Hukum Milik Negara di Indonesia. Perubahan status ini membawa perubahan yang signifikan untuk Universitas Indonesia yaitu otonomi yang lebih besar dalam pengembangan akademis dan pengelolaan keuangan. Dari perspektif sejarah ini, Universitas Indonesia telah tumbuh secara progresif menjadi sebuah institusi yang mengarah menjadi pemimpin di bidang kemanusiaan dan peradaban dengan menyeimbangkan nilai-nilai akademis, moralitas dan seni. Melalui kelebihan-kelebihan ini, Universitas Indonesia berniat untuk menghasilkan bangsa Indonesia menjadi masyarakat yang lebih makmur dan demokratis, dengan berfokus pada perdamaian, keadilan dan nilai-nilai peduli lingkungan yang kuat.",
            "Pendirian Universitas Diponegoro dirintis mulai pertengahan tahun 1956 ditandai dengan pendirian Yayasan Universitas Semarang. Adapun tokoh-tokoh yang memprakarsai berdirinya Universitas Semarang ialah Mr. Imam Bardjo, Mr. Soedarto, Mr. Dan Sulaiman, dan Mr. Soesanto Kartoatmojo. Secara resmi Universitas Semarang dibuka pada tanggal 9 Januari 1957. Mengingat usia yang masih sangat muda dengan prasarana pendidikan yang masih sangat terbatas maka saat itu baru dapat dibuka Akademi Administrasi Negara dengan Dekan pertama Mr. Goenawan Goetomo, Akademi Tata Niaga dengan Dekan pertama Drs. Tjioe Sien Kiong, Akademi Teknik yang kemudian menjadi Fakultas dengan Dekan pertama Prof. Ir. Soemarman. Pada upacara Dies Natalis ketiga Universitas Semarang pada tanggal 9 Januari 1960 Presiden RI, Ir. Soekarno mengganti nama Universitas Semarang menjadi UNIVERSITAS DIPONEGORO, sebagai penghargaan atas prestasi dalam pembinaan bidang pendidikan tinggi di Jawa Tengah. Universitas (swasta) Diponegoro dinyatakan sebagai Universitas Negeri, terhitung mulai tanggal 15 Oktober 1960. Tanggal inilah yang kemudian ditetapkan sebagai hari jadi Universitas Diponegoro.",
            "Universitas Islam Negeri Sunan Ampel disingkat UIN Sunan Ampel atau UINSA adalah salah satu perguruan tinggi negeri di Surabaya yang menyelenggarakan pendidikan tinggi dengan paradigma keilmuan model menara kembar tersambung (integrated twin-towers). Paradigma ini menerapkan pendekatan Islamisasi nalar yang dibutuhkan demi terciptanya tata keilmuan yang saling melengkapi antara ilmu-ilmu keislaman, sosial-humaniora, serta sains dan teknologi. Kata Sunan Ampel pada UIN tersebut merupakan nama salah seorang Walisongo, tokoh penyebar Islam di Indonesia. Pada akhir dekade 1950, beberapa tokoh masyarakat Muslim Jawa Timur mengajukan gagasan untuk mendirikan perguruan tinggi agama Islam yang bernaung pada Departemen Agama. Untuk mewujudkan gagasan tersebut, mereka menyelenggarakan pertemuan di Jombang pada tahun 1961. Dalam pertemuan itu, Profesor Soenarjo, yang pada masa selanjutnya menjadi rektor Universitas Islam Negeri Sunan Kalijaga, hadir sebagai narasumber untuk menyampaikan pokok-pokok pikiran yang diperlukan sebagai landasan berdirinya perguruan tinggi yang dibahas. Pada tanggal 28 Oktober 1961, Menteri Agama menerbitkan SK No. 17/1961, untuk mengesahkan pendirian Fakultas Syariah di Surabaya dan Fakultas Tarbiyah di Malang. Kemudian pada tanggal 1 Oktober 1964, Fakultas Ushuluddin di Kediri diresmikan berdasarkan SK Menteri Agama No. 66/1964.",
            "Sejarah Universitas Airlangga berawal dari cikal-bakal lembaga pendidikan Nederlands Indische Artsen School (NIAS) dan School Tot Opleiding van Indische Tandartsen (STOVIT), masing-masing didirikan oleh pemerintah Hindia Belanda pada tahun 1913 dan 1928. Setelah masa pergolakan kemerdekaan sempat terganggu kelancarannya, pada tahun 1948 pemerintah pendudukan Belanda mendirikan Tandheelkunding Instituut yang merupakan cabang Universiteit van Indonesie Jakarta dan membuka kembali NIAS dengan nama Faculteit der Geneeskunde yang juga sebagai cabang Universiteit van Indonesie Jakarta. Pemerintah Republik Indonesia baru resmi membuka Universitas Airlangga Surabaya yang merupakan lembaga pendidikan tinggi pertama di kawasan timur Indonesia – pada tahun 1954. Peresmian Universitas Airlangga dilakukan oleh Presiden RI pertama, Dr. Ir. Soekarno, yang bertepatan dengan peringatan hari Pahlawan yang ke-9, tanggal 10 November 1954. Secara legal pendiriannya ditetapkan dengan Peraturan Pemerintah No. 57/1954.",
            "Cikal bakal Universitas Negeri Malang adalah Perguruan Tinggi Pendidikan Guru (PTPG) di Malang yang diresmikan oleh Menteri Pendidikan, Pengajaran, dan Kebudayaan Republik Indonesia, Prof. Mr. Mohammad Yamin, pada tanggal 18 Oktober 1954 berdasarkan SK Nomor 38742/Kab tanggal 1 September 1954. Bersamaan dengan itu pula, Prof. Sutan Adam Bachtiar ditugaskan sebagai Rektor PTPG Malang. Pada awal pendiriannya, PTPG Malang mempunyai lima jurusan perintis, yaitu Jurusan Bahasa dan Sastra Indonesia, Bahasa dan Sastra Inggris, Sejarah dan Budaya, Ilmu Ekonomi, serta Ilmu Pasti Alam. Adapun, perkuliahan diselenggarakan di gedung SMA Tugu (sekarang SMA Negeri 1, SMA Negeri 3, dan SMA Negeri 4 Malang). Setahun kemudian, tepatnya sejak tanggal 20 Juni 1955, PTPG memiliki gedung sendiri di bekas Hotel Splendid yang terletak di Jalan Tumapel 1, Malang. Pada tanggal 10 November 1954, didirikan suatu universitas baru di Jawa Timur, yaitu Universitas Airlangga (Unair) yang terletak di Surabaya. Sebagai konsekuensinya, berdasarkan PP Nomor 71/1958, PTPG secara formal berubah status menjadi Fakultas Keguruan dan Ilmu Pendidikan (FKIP) Unair. Pada tahun 1958, atas jasa Wali Kota Malang saat itu, Sarjono, lembaga ini mendapatkan sebidang tanah untuk membangun kompleks kampus yang terletak di Jalan Semarang 5, Malang.")

    val listKampus : ArrayList<Universitas>
        get(){
            val list = arrayListOf<Universitas>()
            for (position in namaKampus.indices){
                val kampus = Universitas()
                kampus.nama = namaKampus[position]
                kampus.alamat = alamatKampus[position]
                kampus.logo = logoKampus[position]
                kampus.foto = fotoKampus[position]
                kampus.logoKota = logoKotaKampus[position]
                kampus.jurusanFavorit1 = jurusanFavorit1[position]
                kampus.jurusanFavorit2 = jurusanFavorit2[position]
                kampus.jurusanFavorit3 = jurusanFavorit3[position]
                kampus.jurusanFavorit4 = jurusanFavorit4[position]
                kampus.sebutan = sebutan[position]
                kampus.jumlahMahasiswa = jumlahMahasiswa[position]
                kampus.sejarahKampus = SejarahKampus[position]

                list.add(kampus)
            }
            return list
        }
}