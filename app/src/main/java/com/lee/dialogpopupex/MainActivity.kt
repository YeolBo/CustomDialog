package com.lee.dialogpopupex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), MyDialogInterface {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDialogBtnClicked(view: View){
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")

        val myDialog = MyDialog(this, this)

        myDialog.show()

    }

    override fun helloBtnClick() {
        Log.d(TAG, "MainActivity - helloBtnClick() called")
        Toast.makeText(this,"aa", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Hello::class.java)
        startActivity(intent)
    }

    override fun btnClick() {
        Log.d(TAG, "MainActivity - btnClick() called")
        Toast.makeText(this,"dd", Toast.LENGTH_SHORT).show()
    }

}