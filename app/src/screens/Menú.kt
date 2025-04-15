package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Menú : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_menú)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/yrk025i9_expires_30_days.png").into(findViewById(R.id.r88uuab64rkc))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/zddz0wzx_expires_30_days.png").into(findViewById(R.id.rx385d1ecxw))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/peo0igze_expires_30_days.png").into(findViewById(R.id.rphe7qcrsh8))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/te0hiv1x_expires_30_days.png").into(findViewById(R.id.r51bbsa1syi6))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/kz2sbi8j_expires_30_days.png").into(findViewById(R.id.rt92u17jjcmj))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/fe437q99_expires_30_days.png").into(findViewById(R.id.r67hk4mzjs7p))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/nty9iisz_expires_30_days.png").into(findViewById(R.id.r32e484gmgqe))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/g4g68pfc_expires_30_days.png").into(findViewById(R.id.ruvs7o48i6co))
		val button1: View = findViewById(R.id.r7n04dgp3n2v)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}