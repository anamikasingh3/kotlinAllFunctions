package com.example.kothlinwork

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_androidkot.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.customtoast.*

class androidkot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_androidkot)
        button11.setOnClickListener {
            intent = Intent(applicationContext,viewNav::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            intent = Intent(applicationContext,tabnav::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            intent = Intent(applicationContext,seekbarlay::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            intent = Intent(applicationContext, webView::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            intent = Intent(applicationContext, custmlistView::class.java)
            startActivity(intent)
        }
button6.setOnClickListener {
    intent = Intent(applicationContext, contextMenu::class.java)
    startActivity(intent)
}
        button5.setOnClickListener {
            intent = Intent(applicationContext, prelistView::class.java)
            startActivity(intent)
}

        textView.setOnClickListener {
            var edittex = editText.text.toString()
            Toast.makeText(this, "yes works back to main activity", Toast.LENGTH_LONG).show()
            textView3.setText(edittex).toString()



        }
        val layout = layoutInflater.inflate(R.layout.customtoast,cl)
        button4.setOnClickListener {
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
          //  myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout//setting the view of custom toast layout
            myToast.show()
        }
        button2.setOnClickListener() {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/"))
            startActivity(intent)
        }
        button3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("heyyyy")
            builder.setMessage("hellllooooooooooooooooooooooooooooooooooooooooooo")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("say hey"){dialogInterface, which ->
                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()

            }
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()

        }
        }}
