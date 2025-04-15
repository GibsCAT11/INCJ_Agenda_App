package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.bumptech.glide.Glide
class Agregar_Evento : AppCompatActivity() {
	private var editTextValue1: String = ""
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_agregar_evento)
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/xa0df7kk_expires_30_days.png").into(findViewById(R.id.rt2ehgr0u68))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/rrhncvkx_expires_30_days.png").into(findViewById(R.id.robwt7lhdli))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/oiv0dnfw_expires_30_days.png").into(findViewById(R.id.rstugnx1hmka))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/dhyo0lmm_expires_30_days.png").into(findViewById(R.id.r0n3vwivhsrfl))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/dpvzryl3_expires_30_days.png").into(findViewById(R.id.rinbeyxn3xdq))
		Glide.with(this).load("https://storage.googleapis.com/tagjs-prod.appspot.com/v1/q8v6UjCva3/693baith_expires_30_days.png").into(findViewById(R.id.rucxc3wkmdv))
		val editText1: EditText = findViewById(R.id.r0q7htcbv9sed)
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
		val button1: View = findViewById(R.id.rfz7w2bbnkl)
		button1.setOnClickListener {
			println("Pressed")
		}
	}
}