package com.alpha.stoki.data

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext

interface PreferenceStorage {
    var bookmarks: Set<String>

    // Add more preferences if needed
}

class SharedPreferenceStorage(@ApplicationContext context: Context) : PreferenceStorage {
    private val sharedPreferences = context.getSharedPreferences("MyAppPrefs", Context.MODE_PRIVATE)

    override var bookmarks: Set<String>
        get() = sharedPreferences.getStringSet("bookmarks", emptySet()) ?: emptySet()
        set(value) = sharedPreferences.edit().putStringSet("bookmarks", value).apply()

    // Implement other preferences
}