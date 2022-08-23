package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var mList: MutableList<DataModel>? = null
    private var adapter: ItemAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.main_recyclervie) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(this)

        mList = mutableListOf()

        //list1


        for (i in 1..20){
            val nestedList1: MutableList<DataOfStudent> = ArrayList()
            var dataOfStudent3 = DataOfStudent("Mohit Gupta ${i}","0808CT21102${i}","P")
            nestedList1.add(dataOfStudent3)
            var dataOfStudent = DataOfStudent("ismail${i}","0808CL21102${i}","A")
            nestedList1.add(dataOfStudent)
            var dataOfStudent2 = DataOfStudent("sashank${i}","0808CS21102${i}","P")
            nestedList1.add(dataOfStudent2)
            var dataOfStudent4 = DataOfStudent("sashank${i}","0808CS21102${i}","P")
            nestedList1.add(dataOfStudent4)

            mList!!.add(DataModel(nestedList1, "${i.plus(10)}th july  9:15AM-10:30AM", time = ""))
        }



        adapter = ItemAdapter(mList!!)
        recyclerView!!.setAdapter(adapter)
    }
}