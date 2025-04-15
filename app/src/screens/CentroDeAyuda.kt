package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class CentroDeAyuda : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_centro_de_ayuda)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/q5kc3lxk_expires_30_days.png").into(findViewById(R.id.r7g5kdua7uaw))
	}
}