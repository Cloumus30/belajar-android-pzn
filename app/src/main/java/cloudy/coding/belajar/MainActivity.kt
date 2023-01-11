package cloudy.coding.belajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloTextView.text = resources.getString(R.string.app_name)

        sayHelloButton.setOnClickListener{
//            Log.v("PZN", "Ini Verbose")
            Log.d("PZN","Klik Button")
//            Log.i("PZN", "Ini Info")
//            Log.w("PZN", "Ini Warning")
//            Log.e("PZN", "Ini Error")
            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.say_hello_text_view,name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("Array", it)
            }
        }
    }
}