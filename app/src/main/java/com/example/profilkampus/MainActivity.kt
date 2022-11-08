package com.example.profilkampus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ivAccountIcon : ImageView
    private lateinit var rvListKampus : RecyclerView

    private var list : ArrayList<Universitas> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Perguruan Tinggi"

        rvListKampus = findViewById(R.id.rvListKampus)
        ivAccountIcon = findViewById(R.id.ivAccountIcon)

        rvListKampus.setHasFixedSize(true)
        ivAccountIcon.setOnClickListener(this)

        list.addAll(DataKampus.listKampus)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvListKampus.layoutManager = LinearLayoutManager(this)
        val listKampusAdapter = ListKampusAdapter(list)
        rvListKampus.adapter = listKampusAdapter

        listKampusAdapter.setOnItemClickCallback(object : ListKampusAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Universitas) {
                passingToDetail(data)
            }
        })
    }

    private fun passingToDetail(universitas: Universitas) {
        val intentDataKampus = Intent(this@MainActivity, ShowDetailCampusActivity::class.java)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_NAMA_UNIVERSITAS, universitas.nama)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_FOTO_UNIVERSITAS, universitas.foto)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_LOGO_UNIVERSITAS, universitas.logo)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_LOGO_KOTA_UNIVERSITAS, universitas.logoKota)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_JURUSAN_FAVORIT_1_UNIVERSITAS, universitas.jurusanFavorit1)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_JURUSAN_FAVORIT_2_UNIVERSITAS, universitas.jurusanFavorit2)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_JURUSAN_FAVORIT_3_UNIVERSITAS, universitas.jurusanFavorit3)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_JURUSAN_FAVORIT_4_UNIVERSITAS, universitas.jurusanFavorit4)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_SEBUTAN_UNIVERSITAS, universitas.sebutan)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_ALAMAT_UNIVERSITAS, universitas.alamat)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_TOTAL_MAHASISWA_UNIVERSITAS, universitas.jumlahMahasiswa)
        intentDataKampus.putExtra(ShowDetailCampusActivity.KEY_SEJARAH_UNIVERSITAS, universitas.sejarahKampus)
        startActivity(intentDataKampus)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.ivAccountIcon){
            startActivity(Intent(this@MainActivity, AccountActivity::class.java))
        }
    }
}