package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Mision_Y_Valor : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_mision_y_valor)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/b1ar68gm_expires_30_days.png").into(findViewById(R.id.rcaps9pvw8nv))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/i15km6tn_expires_30_days.png").into(findViewById(R.id.rjz187d8ah1e))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/d4eduweq_expires_30_days.png").into(findViewById(R.id.rr8n22ik9yb))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/opq6oya9_expires_30_days.png").into(findViewById(R.id.rho03gkclhbq))
		val button1: View = findViewById(R.id.rudedz041org)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}