package com.google.firebase.quickstart.database

import android.content.Intent
import com.firebase.example.internal.BaseEntryChoiceActivity
import com.firebase.example.internal.Choice
import com.google.firebase.quickstart.database.java.MainActivity

class EntryChoiceActivity : BaseEntryChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return kotlin.collections.listOf(
                Choice(
                        "Java",
                        "Run the Firebase Cloud Messaging quickstart written in Java.",
                        Intent(this, MainActivity::class.java)),
                Choice(
                        "Kotlin",
                        "Run the Firebase Cloud Messaging written in Kotlin.",
                        Intent(this, com.google.firebase.quickstart.database.kotlin.MainActivity::class.java))
        )
    }
}