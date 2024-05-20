package com.enesakin.vkhesaplama

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val channelId = "channel_id"
        val notificationId = 1

        // Bildirim kanalı oluştur
        createNotificationChannel(context, channelId)

        // Bildirim oluştur
        val builder = NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.baseline_notifications_24)
            .setContentTitle("Unutma!")
            .setContentText("Diyetinize devam etmek için uygulamayı açın.")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        // İzin kontrolü yap
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (context.checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                // İzin verilmemişse bildirimi gösterme
                return
            }
        }

        // İzin verildiyse bildirimi gönder
        with(NotificationManagerCompat.from(context)) {
            notify(notificationId, builder.build())
        }
    }

    private fun createNotificationChannel(context: Context, channelId: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelName = "Channel Name"
            val channelDescription = "Channel Description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channelId, channelName, importance).apply {
                description = channelDescription
            }

            // NotificationManager kullanarak kanalı oluştur
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    companion object {
        private const val PERMISSION_REQUEST_CODE = 1001
    }
}