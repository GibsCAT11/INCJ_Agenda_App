package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Inicio : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_inicio)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/1v817678_expires_30_days.png").into(findViewById(R.id.rove5jod2h4))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/divuw0ae_expires_30_days.png").into(findViewById(R.id.r47l5ghh5g5z))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/ltxyslkb_expires_30_days.png").into(findViewById(R.id.rcnc3byppyng))
	}
}