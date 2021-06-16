package kg.dzaparovap.mylificyclefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(INFO_TAG,"onCreate()")
//        addFragment(FragmentA())
        setup()
    }
    private fun setup(){
        val btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            addFragment(FragmentA())
        }
        val btn2=findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            addFragment(FragmentB())
        }
    }
    private fun addFragment(fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.i(INFO_TAG,"onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(INFO_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(INFO_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(INFO_TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(INFO_TAG, "onDestroy()")
    }
    companion object{
        const val INFO_TAG="MainActivity"
    }
}