package com.enesakin.vkhesaplama

import android.app.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.SystemClock
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        sendNotification(context)
    }

    private fun sendNotification(context: Context) {
        // Bildirim oluştur
        val channelId = "channel_id"
        val notificationId = 1

        val builder = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.baseline_notifications_24)
            .setContentTitle("Unutma!")
            .setContentText("Diyetinize devam etmek için uygulamayı açın.")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        // Bildirimi gönder
        with(NotificationManagerCompat.from(context)) {
            notify(notificationId, builder.build())
        }
    }
}