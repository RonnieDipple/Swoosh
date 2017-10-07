package com.example.ronnie.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var selectedLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerBtnClicked (view: View){
        ballerBtn.isChecked = false
        selectedLevel = "beginner"

    }

    fun onBallerBtnClicked (view: View){
        beginnerBtn.isChecked = false
        selectedLevel = "baller"
    }
}
