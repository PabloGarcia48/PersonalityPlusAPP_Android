package com.garcia.pablo.personalityplus.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.garcia.pablo.personalityplus.databinding.ActivityExamBinding
import com.garcia.pablo.personalityplus.viewmodel.ExamViewModel

class ExamActivity : AppCompatActivity() {
    private val examViewModel: ExamViewModel = ExamViewModel()
    private val exam = examViewModel.getExam()

    private var _binding: ActivityExamBinding? = null
    private val binding: ActivityExamBinding get() = _binding!!

    private val onOptionChangedListener = object : OnOptionChangedListener {
        override fun onChanged(stepPosition: Int, radioButtonPosition: Int) {
            examViewModel.onRadioButtonSelected(stepPosition, radioButtonPosition)
//            Log.d("Pablo", "Posição do STEP: $stepPosition, Posição do radioButton: $radioButtonPosition")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityExamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()

        binding.btFinish.setOnClickListener {
            examViewModel.testFinished()
        }
    }

    fun setUpRecyclerView() {
        binding.rvExamList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvExamList.adapter = ExamAdapter(exam, onOptionChangedListener)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}

// encapsulamento fun nomeDaFuncao(o que ela recebe): o que ela retorna

// encapsulamento fun nomeDaFuncao(nomeDaVariavel: TipoDaVariavel): Tipo
