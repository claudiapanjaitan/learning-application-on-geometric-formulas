package com.pam.belajarrumus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var button_logout = findViewById(R.id.btn_logout) as Button
        var button_hitung_persegi = findViewById(R.id.btnPersegi) as Button
        var button_hitung_segitiga = findViewById(R.id.btnSegitiga) as Button
        var button_trapesium = findViewById(R.id.btnTrapesium) as Button
        var button_kubus = findViewById(R.id.btnKubus) as Button
        var button_bola = findViewById(R.id.btnBola) as Button
        var button_prisma = findViewById(R.id.btnPrisma) as Button

        button_logout.setOnClickListener {
            finish()
        }

        button_hitung_persegi.setOnClickListener {
            var intent = Intent(this, HitungPersegiActivity::class.java)
            startActivity(intent)
        }

        button_hitung_segitiga.setOnClickListener {
            var intent = Intent(this, HitungSegitigaActivity::class.java)
            startActivity(intent)
        }

        button_trapesium.setOnClickListener {
            var intent = Intent(this, HitungTrapesiumActivity::class.java)
            startActivity(intent)
        }

        button_kubus.setOnClickListener {
            var intent = Intent(this, HitungKubusActivity::class.java)
            startActivity(intent)
        }

        button_bola.setOnClickListener {
            var intent = Intent(this, HitungBolaActivity::class.java)
            startActivity(intent)
        }

        button_prisma.setOnClickListener {
            var intent = Intent(this, HitungPrismaActivity::class.java)
            startActivity(intent)
        }
    }
}