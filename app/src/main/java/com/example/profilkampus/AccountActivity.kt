package com.example.profilkampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AccountActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ivFotoAkun : ImageView
    private lateinit var ivBackAK : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        ivFotoAkun = findViewById(R.id.ivFotoAkun)
        ivBackAK = findViewById(R.id.ivBackAK)
        ivBackAK.setOnClickListener(this)

        Glide.with(this)
                .load(R.drawable.foto_akun_sample)
                .apply(RequestOptions.circleCropTransform())
                .into(ivFotoAkun)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.ivBackAK){
            finish()
        }
    }
}