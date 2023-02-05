package com.example.thelastofuspagemobile

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import org.eazegraph.lib.models.PieModel


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        ChartAprocao.addPieSlice(PieModel(97f,Color.parseColor("#509856")))
        ChartAprocao.addPieSlice(PieModel(3f, Color.parseColor("#bfbfbf")))
        ChartAprocao.startAnimation()


        ChartCritica.addPieSlice(PieModel(95f,Color.parseColor("#509856")))
        ChartCritica.addPieSlice(PieModel(5f, Color.parseColor("#bfbfbf")))
        ChartCritica.startAnimation()

        ChartAudiencia.addPieSlice(PieModel(93f,Color.parseColor("#509856")))
        ChartAudiencia.addPieSlice(PieModel(7f, Color.parseColor("#bfbfbf")))
        ChartAudiencia.startAnimation()

    }
}