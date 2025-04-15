package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Principal : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_principal)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/5r21liib_expires_30_days.png").into(findViewById(R.id.rx00uh79414))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/0h0ln8zi_expires_30_days.png").into(findViewById(R.id.r0cdpf297gq6))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/9w5onr8e_expires_30_days.png").into(findViewById(R.id.rxs1flkfpr4f))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/gxth4lfm_expires_30_days.png").into(findViewById(R.id.r9xbxrbd3mvl))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/nqvl59tc_expires_30_days.png").into(findViewById(R.id.rmho4i7t10xm))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/pm8nqo6b_expires_30_days.png").into(findViewById(R.id.r3vos8kwob1l))
	}
}