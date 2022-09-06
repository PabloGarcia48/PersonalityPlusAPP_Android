package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.garcia.pablo.personalityplus.R
import com.garcia.pablo.personalityplus.viewmodel.ExamViewModel

class ExamActivity : AppCompatActivity() {
    private val examViewModel: ExamViewModel = ExamViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)


    }


}