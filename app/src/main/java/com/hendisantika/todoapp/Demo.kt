package com.hendisantika.todoapp

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by hendisantika on 28/10/18  06.31.
 * email -> hendisantika@gmail.com
 * telegram --> @hendisantika34
 */
class Demo : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        return verticalLayout {
            imageView(R.drawable.Anko_logo).lparams(width = matchParent) {
                padding = dip(20)
                margin = dip(15)
            }
            button("Tap to Like") {
                onClick { toast("Thanks for the love!") }
            }
        }
    }
}