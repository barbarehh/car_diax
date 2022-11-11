package com.example.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    private lateinit var num1:EditText
    private lateinit var abc:EditText
    private lateinit var num2:EditText
    private lateinit var piradi:EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1=findViewById(R.id.num1)
        abc=findViewById(R.id.abc)
        num2=findViewById(R.id.num2)
        piradi=findViewById(R.id.piradi)
        button=findViewById(R.id.button)
        button.setOnClickListener { 
            if (!num1.text.toString().isDigitsOnly() || num1.text.toString().length!=2 || num1.text.toString() == "" 
                || !num2.text.toString().isDigitsOnly() || num2.text.toString().length!=2 || num2.text.toString() == ""
                || abc.text.toString().length!=3 || abc.text.toString()=="") {
                Toast.makeText(this, "მანქანის ნომერი არასწორია", Toast.LENGTH_SHORT).show()
                
            }else if (!piradi.text.toString().isDigitsOnly() || piradi.text.toString().length!=11 || piradi.text.toString()=="") {
                Toast.makeText(this, "პირადი ნომერი არასწორია", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "ოპერაცია წარმატებით დასრულდა, ქვინურად!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
}