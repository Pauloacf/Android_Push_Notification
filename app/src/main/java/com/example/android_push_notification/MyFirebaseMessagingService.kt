package com.example.android_push_notification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage) {
        Log.d("FIREBASE", p0.toString())
    }

    override fun onNewToken(p0: String) {
        Log.d("FIREBASE", "New Token: $p0")
    }
}