package com.example.teachergrades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_students_grades.*

class StudentsGradesActivity : AppCompatActivity(), OnClickListener  {

    var classAFrag = ClassAFragment()
    var classBFrag = ClassBFragment()
    var classCFrag = ClassCFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_grades)
        classA.setOnClickListener(this)
        classB.setOnClickListener(this)
        classC.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.classA -> {
                var transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentLayout , classAFrag , "CLASS A FRAGMENT")
                transaction.commit()
                hintToPutClass.text=""
            }
            R.id.classB -> {
                var transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentLayout , classBFrag , "CLASS B FRAGMENT")
                transaction.commit()
                hintToPutClass.text=""
            }
            R.id.classC -> {
                var transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentLayout , classCFrag , "CLASS C FRAGMENT")
                transaction.commit()
                hintToPutClass.text=""
            }
        }
    }
}