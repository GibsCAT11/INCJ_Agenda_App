package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.bumptech.glide.Glide
class Log_In : AppCompatActivity() {
	private var editTextValue1: String = ""
	private var editTextValue2: String = ""
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_log_in)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/sasdx2sg_expires_30_days.png").into(findViewById(R.id.rundefined))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/72xv8g3a_expires_30_days.png").into(findViewById(R.id.rek0bygp5wu))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/zsqkolls_expires_30_days.png").into(findViewById(R.id.rfn94snts89o))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/hoqg7hk1_expires_30_days.png").into(findViewById(R.id.riepkow3ur3))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/s12o4jy9_expires_30_days.png").into(findViewById(R.id.rqc6u1d5yoad))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/jjds16f1_expires_30_days.png").into(findViewById(R.id.r7balh49ilsh))
		val editText1: EditText = findViewById(R.id.rovaesq84cy)
		editText1.addTextChangedListener(object : TextWatcher {
			override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
				// before Text Changed
			}
			override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
				editTextValue1 = s.toString()  // on Text Changed
			}
			override fun afterTextChanged(s: Editable?) {
				// after Text Changed
			}
		})
		val editText2: EditText = findViewById(R.id.rrn7jeo3omva)
		editText2.addTextChangedListener(object : TextWatcher {
			override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
				// before Text Changed
			}
			override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
				editTextValue2 = s.toString()  // on Text Changed
			}
			override fun afterTextChanged(s: Editable?) {
				// after Text Changed
			}
		})
		val button1: View = findViewById(R.id.rjyd58gei4u)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}