package com.example.profilkampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class ShowDetailCampusActivity : AppCompatActivity() {

    companion object{
        const val KEY_NAMA_UNIVERSITAS = "namaUniversitas"
        const val KEY_FOTO_UNIVERSITAS = "foto_Universitas"
        const val KEY_LOGO_UNIVERSITAS = "logoUniversitas"
        const val KEY_LOGO_KOTA_UNIVERSITAS = "logoKotasUniversitas"
        const val KEY_JURUSAN_FAVORIT_1_UNIVERSITAS = "jurusanFavorit1"
        const val KEY_JURUSAN_FAVORIT_2_UNIVERSITAS = "jurusanFavorit2"
        const val KEY_JURUSAN_FAVORIT_3_UNIVERSITAS = "jurusanFavorit3"
        const val KEY_JURUSAN_FAVORIT_4_UNIVERSITAS = "jurusanFavorit4"
        const val KEY_SEBUTAN_UNIVERSITAS = "sebutanUniversitas"
        const val KEY_ALAMAT_UNIVERSITAS = "alamatUniversitas"
        const val KEY_TOTAL_MAHASISWA_UNIVERSITAS = "jumlahMahasiswaUniversitas"
        const val KEY_SEJARAH_UNIVERSITAS = "sejarahUniversitas"
    }

    private lateinit var ivMainImage : ImageView
    private lateinit var tvNamaKampus : TextView
    private lateinit var ivLogoKampus : ImageView
    private lateinit var ivLogoKota : ImageView
    private lateinit var tvFavorit1 : TextView
    private lateinit var tvFavorit2 : TextView
    private lateinit var tvFavorit3 : TextView
    private lateinit var tvFavorit4 : TextView
    private lateinit var tvSebutan : TextView
    private lateinit var tvAlamat : TextView
    private lateinit var tvTotalMahasiswa : TextView
    private lateinit var tvSejarah : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail_campus)

        ivMainImage = findViewById(R.id.ivMainImage)
        tvNamaKampus = findViewById(R.id.tvNamaKampus)
        ivLogoKampus = findViewById(R.id.ivLogoKampus)
        ivLogoKota = findViewById(R.id.ivLogoKota)
        tvFavorit1 = findViewById(R.id.tvFavorit1)
        tvFavorit2 = findViewById(R.id.tvFavorit2)
        tvFavorit3 = findViewById(R.id.tvFavorit3)
        tvFavorit4 = findViewById(R.id.tvFavorit4)
        tvSebutan = findViewById(R.id.tvSebutan)
        tvAlamat = findViewById(R.id.tvAlamat)
        tvTotalMahasiswa = findViewById(R.id.tvTotalMahasiswa)
        tvSejarah = findViewById(R.id.tvSejarah)

        tvNamaKampus.text = intent.getStringExtra(KEY_NAMA_UNIVERSITAS)
        tvFavorit1.text = intent.getStringExtra(KEY_JURUSAN_FAVORIT_1_UNIVERSITAS)
        tvFavorit2.text = intent.getStringExtra(KEY_JURUSAN_FAVORIT_2_UNIVERSITAS)
        tvFavorit3.text = intent.getStringExtra(KEY_JURUSAN_FAVORIT_3_UNIVERSITAS)
        tvFavorit4.text = intent.getStringExtra(KEY_JURUSAN_FAVORIT_4_UNIVERSITAS)
        tvSebutan.text = intent.getStringExtra(KEY_SEBUTAN_UNIVERSITAS)
        tvAlamat.text = intent.getStringExtra(KEY_ALAMAT_UNIVERSITAS)
        tvTotalMahasiswa.text = intent.getIntExtra(KEY_TOTAL_MAHASISWA_UNIVERSITAS, 0).toString()
        tvSejarah.text = intent.getStringExtra(KEY_SEJARAH_UNIVERSITAS)

        Glide.with(this)
                .load(intent.getIntExtra(KEY_FOTO_UNIVERSITAS, R.drawable.unesa))
                .into(ivMainImage)

        Glide.with(this)
                .load(intent.getIntExtra(KEY_LOGO_UNIVERSITAS, R.drawable.unesa))
                .into(ivLogoKampus)

        Glide.with(this)
                .load(intent.getIntExtra(KEY_LOGO_KOTA_UNIVERSITAS, R.drawable.unesa))
                .into(ivLogoKota)
    }
}