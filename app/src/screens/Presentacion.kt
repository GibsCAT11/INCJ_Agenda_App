package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Presentacion : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_presentacion)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/bw3z5vv6_expires_30_days.png").into(findViewById(R.id.rn1yyf56lbw))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/jcbhpg7l_expires_30_days.png").into(findViewById(R.id.rfj9p6tdu65i))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/c8bk613w_expires_30_days.png").into(findViewById(R.id.rw5skm1asp2))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/tcr3u249_expires_30_days.png").into(findViewById(R.id.rogpu00p0tio))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/jquyunkb_expires_30_days.png").into(findViewById(R.id.rl1j14lud40j))
		val button1: View = findViewById(R.id.rjo1xhwl7jpr)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}