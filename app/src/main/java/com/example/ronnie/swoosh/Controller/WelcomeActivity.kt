package com.example.ronnie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.ronnie.swoosh.BaseActivity
import com.example.ronnie.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)


        }


    }
}
