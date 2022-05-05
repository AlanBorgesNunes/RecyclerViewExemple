package com.app.recyclerviewexemple

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.recyclerviewexemple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){

        val rvS = binding.recyclerView2
        rvS.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL,
            false)
        rvS.adapter = AdapterRecycler2(titlesList)
        postList1()

        val rvs2 = binding.recyclerView
        rvs2.layoutManager = GridLayoutManager(this, 2)
        rvs2.adapter = AdapterRecycler1(imageList)
        postList2()

    }
    private fun addToList2(image: Int){
        imageList.add(image)

    }

    private fun postList2(){
        addToList2(R.drawable.aa)
        addToList2(R.drawable.bb)
        addToList2(R.drawable.cc)
        addToList2(R.drawable.dd)
        addToList2(R.drawable.ee)
        addToList2(R.drawable.ff)
        addToList2(R.drawable.gg)
    }

    private fun addTolist1(title: String){
        titlesList.add(title)
    }

    private fun postList1(){

        addTolist1("Animais")
        addTolist1("Pessoas")
        addTolist1("Cidades")
        addTolist1("Continentes")
        addTolist1("Estados")
        addTolist1("Capitais")

    }

}