package com.example.ronnie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ronnie.swoosh.BaseActivity
import com.example.ronnie.swoosh.Model.Player
import com.example.ronnie.swoosh.R
import com.example.ronnie.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
   lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onSkillFinishClicked (view: View){
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerBtnClicked (view: View){
        ballerBtn.isChecked = false
        player.skill = "beginner"

    }

    fun onBallerBtnClicked (view: View){
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }
}
