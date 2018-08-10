package com.slpearson21.onboardingexamples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.getkeepsafe.taptargetview.TapTargetView
import android.graphics.drawable.Drawable
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import com.getkeepsafe.taptargetview.TapTarget



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerButton = findViewById<Button>(R.id.view_pager_button)
        viewPagerButton.setOnClickListener {
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
        }

        val showcase1 = findViewById<Button>(R.id.showcase1)
        showcase1.setOnClickListener {
            TapTargetView.showFor(this, // `this` is an Activity
                    TapTarget.forView(showcase1, "This is a target", "We have the best targets, believe me")
                            // All options below are optional
                            .outerCircleColor(R.color.colorPrimary)      // Specify a color for the outer circle
                            .outerCircleAlpha(0.96f)            // Specify the alpha amount for the outer circle
                            .targetCircleColor(R.color.colorAccent)   // Specify a color for the target circle
                            .titleTextSize(20)                  // Specify the size (in sp) of the title text
                            .titleTextColor(R.color.colorAccent)      // Specify the color of the title text
                            .descriptionTextSize(10)            // Specify the size (in sp) of the description text
                            .descriptionTextColor(R.color.colorPrimary)  // Specify the color of the description text
                            .textColor(R.color.colorPrimaryDark)            // Specify a color for both the title and description text
                            .textTypeface(Typeface.SANS_SERIF)  // Specify a typeface for the text
                            .dimColor(R.color.colorPrimaryDark)            // If set, will dim behind the view with 30% opacity of the given color
                            .drawShadow(true)                   // Whether to draw a drop shadow or not
                            .cancelable(false)                  // Whether tapping outside the outer circle dismisses the view
                            .tintTarget(true)                   // Whether to tint the target view's color
                            .transparentTarget(true)           // Specify whether the target is transparent (displays the content underneath)
                            //.icon(ResourcesCompat.getDrawable(resources, R.drawable.abc_ic_star_black_48dp, null))        // Specify a custom drawable to draw as the target
                            .targetRadius(100), // Specify the target radius (in dp)
                    object : TapTargetView.Listener() {          // The listener can listen for regular clicks, long clicks or cancels
                        override fun onTargetClick(view: TapTargetView) {
                            super.onTargetClick(view)      // This call is optional
                            //doSomething()
                        }
                    })
        }

        val showcase2 = findViewById<Button>(R.id.showcase2)
        showcase2.setOnClickListener {  }

        val showcase3 = findViewById<Button>(R.id.showcase3)
        showcase3.setOnClickListener {  }
    }
}
