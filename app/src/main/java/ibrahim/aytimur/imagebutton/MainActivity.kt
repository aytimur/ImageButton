package ibrahim.aytimur.imagebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton.setOnClickListener {
            imageButton.setBackgroundResource(R.color.colorPrimary)
            Toast.makeText(applicationContext,"Msi workstation",Toast.LENGTH_SHORT).show()
        }
    }
}
