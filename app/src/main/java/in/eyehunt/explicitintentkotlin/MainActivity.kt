package `in`.eyehunt.explicitintentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View){
        val intent = Intent(this@MainActivity,SecondActivity::class.java).apply {
            putExtra("name",ed_name.text.toString())
        }
        startActivity(intent)
    }
}
