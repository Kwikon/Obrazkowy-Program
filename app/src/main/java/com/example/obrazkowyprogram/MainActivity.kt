package com.example.obrazkowyprogram

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)//
        setContentView(R.layout.activity_main)

        var CheckBox = findViewById(R.id.checkBox1) as CheckBox
        var nastepne = findViewById(R.id.nastepne) as ImageButton
        var poprzednie = findViewById(R.id.poprzednie) as ImageButton
        var Zdjecie = findViewById(R.id.Zdjecie) as ImageView
        var Rotate = findViewById(R.id.Rotate) as Button
        var RotateText = findViewById(R.id.RotateText) as TextView
        var Resize = findViewById(R.id.Resize) as Button
        var ResizeText = findViewById(R.id.ResizeText) as TextView
        //ez
        lateinit var mYourBitmap: Bitmap

        var rotateint: Int = 0
        var zdjecie: Int = 0
        var terazObraz: Int = 0

            CheckBox.setOnClickListener{
            //val checkBoxState: Boolean = CheckBox.isChecked()
            if(CheckBox.isChecked()){
                //val toast = Toast.makeText(applicationContext, "jest", Toast.LENGTH_SHORT)
                //toast.show()

                Zdjecie.setVisibility(View.VISIBLE)
            }else{
                //val toast = Toast.makeText(applicationContext, "nie ma", Toast.LENGTH_SHORT)
                //toast.show()
                Zdjecie.setVisibility(View.INVISIBLE)
            }

        }
        nastepne.setOnClickListener{
        terazObraz = zdjecie
            if(terazObraz == 0){
                Zdjecie.setImageResource(R.drawable.img2)
                zdjecie = 1
            }
            if(terazObraz == 1){
                Zdjecie.setImageResource(R.drawable.img3)
                zdjecie = 2
            }
            if(terazObraz == 2){
                Zdjecie.setImageResource(R.drawable.img4)
                zdjecie = 3
            }
            if(terazObraz == 3){
                Zdjecie.setImageResource(R.drawable.img1)
                zdjecie = 0
            }

        }
        poprzednie.setOnClickListener {
        terazObraz = zdjecie
            if(terazObraz == 0){
                Zdjecie.setImageResource(R.drawable.img4)
                zdjecie = 3
            }
            if(terazObraz == 3){
                Zdjecie.setImageResource(R.drawable.img3)
                zdjecie = 2
            }
            if(terazObraz == 2){
                Zdjecie.setImageResource(R.drawable.img2)
                zdjecie = 1
            }
            if(terazObraz == 1){
                Zdjecie.setImageResource(R.drawable.img1)
                zdjecie = 0
            }
        }
        Rotate.setOnClickListener{

            var x = Integer.parseInt(RotateText.getText().toString());
                Zdjecie.setRotation(x.toFloat())
        }
        Resize.setOnClickListener {
            var y = Integer.parseInt(ResizeText.getText().toString());
                Zdjecie.setScaleY (y.toFloat())
                Zdjecie.setScaleX (y.toFloat())
        }
    }
}