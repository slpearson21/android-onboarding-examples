package com.slpearson21.onboardingexamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.amlcurran.showcaseview.targets.ActionViewTarget
import com.github.amlcurran.showcaseview.ShowcaseView
import com.github.amlcurran.showcaseview.targets.ViewTarget


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerButton = findViewById<Button>(R.id.view_pager_button)
        viewPagerButton.setOnClickListener {  }

        val showcase1 = findViewById<Button>(R.id.showcase1)
        showcase1.setOnClickListener {
            ShowcaseView.Builder(this)
                    .setTarget(ViewTarget(showcase1))
                    .setContentTitle("Showcase 1")
                    .setContentText("This is highlighting the Home button")
                    .hideOnTouchOutside()
                    .build()
        }

        val showcase2 = findViewById<Button>(R.id.showcase2)
        showcase2.setOnClickListener {  }

        val showcase3 = findViewById<Button>(R.id.showcase3)
        showcase3.setOnClickListener {  }
    }
}
