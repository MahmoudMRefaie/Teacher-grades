package com.example.teachergrades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_students_grades.*
import kotlinx.android.synthetic.main.fragment_class_a.*

class StudentsGradesActivity : AppCompatActivity()/*,OnClickListener*/ {

    lateinit var classAFrag : ClassAFragment
    lateinit var classBFrag : ClassBFragment
    lateinit var classCFrag : ClassCFragment

    var teacherName:String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_grades)
        //classA.setOnClickListener(this)
        //classB.setOnClickListener(this)
        //classC.setOnClickListener(this)

        teacherName=getIntent().getStringExtra("Name")
        hello.setText("Hello $teacherName")

        bottomNavigation.setOnNavigationItemSelectedListener {item->
            when(item.itemId)  {
                R.id.classA -> {
                    classAFrag = ClassAFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentLayout , classAFrag ,"CLASS A FRAGMENT")
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                    hintToPutClass.text=""
                }
                R.id.classB -> {
                    classBFrag = ClassBFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentLayout , classBFrag ,"CLASS B FRAGMENT")
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                    hintToPutClass.text=""
                }
                R.id.classC -> {
                    classCFrag = ClassCFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentLayout , classCFrag ,"CLASS C FRAGMENT")
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                    hintToPutClass.text=""
                }
            }
            true
        }
    }

    /*override fun onClick(v: View) {
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
    }*/

}