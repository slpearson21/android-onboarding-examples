package com.slpearson21.onboardingexamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ramotion.paperonboarding.PaperOnboardingPage
import android.graphics.Color
import android.support.v4.content.res.ResourcesCompat
import com.ramotion.paperonboarding.PaperOnboardingFragment


class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_activity)

        startOnboarding()
    }

    private fun startOnboarding() {
        val scr1 = PaperOnboardingPage("Hotels",
                "All hotels and hostels are sorted by hospitality rating",
                ResourcesCompat.getColor(resources, R.color.colorAccent, null), R.drawable.abc_ic_star_black_48dp, R.drawable.abc_ic_star_black_48dp)
        val scr2 = PaperOnboardingPage("Banks",
                "We carefully verify all banks before add them into the app",
                ResourcesCompat.getColor(resources, R.color.colorPrimary, null), R.drawable.abc_ic_star_black_48dp, R.drawable.abc_ic_star_black_48dp)
        val scr3 = PaperOnboardingPage("Stores",
                "All local stores are categorized for your convenience",
                ResourcesCompat.getColor(resources, R.color.colorPrimaryDark, null), R.drawable.abc_ic_star_black_48dp, R.drawable.abc_ic_star_black_48dp)

        val elements = ArrayList<PaperOnboardingPage>()
        elements.add(scr1)
        elements.add(scr2)
        elements.add(scr3)

        val onBoardingFragment = PaperOnboardingFragment.newInstance(elements)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, onBoardingFragment)
        fragmentTransaction.commit()
    }
}
