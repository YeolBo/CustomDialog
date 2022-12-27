package com.lee.dialogpopupex

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.customdialog.*

class MyDialog(context: Context,
                     MyDialogInterface: MyDialogInterface)
    : Dialog(context), View.OnClickListener {

    val TAG: String = "로그"

    private var MyDialogInterface: MyDialogInterface? = null

    // 인터페이스 연결
    init{
        this.MyDialogInterface = MyDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.customdialog)

        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")
        // 배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        hello_btn.setOnClickListener(this)
        btn_Click.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view){
            hello_btn -> {
                Log.d(TAG, "hello btn click")
                this.MyDialogInterface?.helloBtnClick()
            }
            btn_Click -> {
                Log.d(TAG, "btnClick btn click")
                this.MyDialogInterface?.btnClick()
            }
        }
    }

}