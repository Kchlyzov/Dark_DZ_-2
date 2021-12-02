package com.example.dark_6

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
const val string_1  = "  Ты видел деву на скале"
const val string_2  = "  В одежде белой над волнами"
const val string_3  = "  Когда, бушуя в бурной мгле,"
const val string_4  = "  Играло море с берегами,"
const val string_5  = "  Когда луч молний озарял"
const val string_6  = "  Ее всечасно блеском алым"
const val string_7  = "  И ветер бился и летал"
const val string_8  = "  С ее летучим покрывалом?"
const val string_9  = "  Прекрасно море в бурной мгле"
const val string_10 = "  И небо в блесках без лазури;"
const val string_11 = "  Но верь мне: дева на скале"
const val string_12 = "  Прекрасней волн, небес и бури."
const val string_13 = ""

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Log.d(TAG, "onCreate")
        Log.d(TAG, "onCreate() returned: $string_1")
        Log.d(TAG, "onCreate() returned: $string_2")

    }


    override fun onStart() {
        super.onStart()
       // Log.d(TAG, "onStart")
        Log.d(TAG, "onCreate() returned: $string_3")
        Log.d(TAG, "onCreate() returned: $string_4")


    }

    override fun onResume() {
        super.onResume()
       // Log.d(TAG, "onResume")
        Log.d(TAG, "onCreate() returned: $string_5")
        Log.d(TAG, "onCreate() returned: $string_6")
    }

    override fun onPause() {
        super.onPause()
        //Log.d(TAG, "onPause")
        Log.d(TAG, "onCreate() returned: $string_7")
        Log.d(TAG, "onCreate() returned: $string_8")
    }

    override fun onStop() {
        super.onStop()
        //Log.d(TAG, "onStop")
        Log.d(TAG, "onCreate() returned: $string_9")
        Log.d(TAG, "onCreate() returned: $string_10")
    }

    override fun onRestart() {
        super.onRestart()
        //Log.d(TAG, "onRestart")
        // Log.d(TAG, "onCreate() returned: $string_1")
        // Log.d(TAG, "onCreate() returned: $string_2")
        // Log.d(TAG, "onCreate() returned: $string_3")
        // Log.d(TAG, "onCreate() returned: $string_4")
        // Log.d(TAG, "onCreate() returned: $string_5")
        // Log.d(TAG, "onCreate() returned: $string_6")
        // Log.d(TAG, "onCreate() returned: $string_7")
        // Log.d(TAG, "onCreate() returned: $string_8")
        // Log.d(TAG, "onCreate() returned: $string_9")
        // Log.d(TAG, "onCreate() returned: $string_10")
        // Log.d(TAG, "onCreate() returned: $string_11")
        // Log.d(TAG, "onCreate() returned: $string_12")

    }

    override fun onDestroy() {
        super.onDestroy()
        //Log.d(TAG, "onDestroy")
        Log.d(TAG, "onCreate() returned: $string_11")
        Log.d(TAG, "onCreate() returned: $string_12")
        Log.d(TAG, "onCreate() returned: $string_13")
    }
}