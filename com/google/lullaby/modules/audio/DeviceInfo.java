package com.google.lullaby.modules.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;

public class DeviceInfo {
   public final long a;
   private final Context b;
   private final BroadcastReceiver c;

   private DeviceInfo(long var1, Context var3) {
      this.a = var1;
      this.b = var3;
      this.c = new .qdk(this);
   }

   private static DeviceInfo createAudioDeviceInfo(long var0, Context var2) {
      return new DeviceInfo(var0, var2);
   }

   private int getSystemBufferSize() {
      String var1 = ((AudioManager)this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
      if (var1 == null) {
         Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
         return 256;
      } else {
         return Integer.parseInt(var1);
      }
   }

   private int getSystemSampleRate() {
      String var1 = ((AudioManager)this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
      if (var1 == null) {
         Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
         return 48000;
      } else {
         return Integer.parseInt(var1);
      }
   }

   private boolean isBluetoothAudioDevicePluggedIn() {
      AudioDeviceInfo[] var3 = ((AudioManager)this.b.getSystemService("audio")).getDevices(2);
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         if (var3[var1].getType() == 8) {
            return true;
         }
      }

      return false;
   }

   private boolean isHeadphonePluggedIn() {
      AudioDeviceInfo[] var3 = ((AudioManager)this.b.getSystemService("audio")).getDevices(2);
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         AudioDeviceInfo var4 = var3[var1];
         if (var4.getType() == 4 || var4.getType() == 3 || var4.getType() == 22) {
            return true;
         }
      }

      return false;
   }

   private void registerHandlers() {
      IntentFilter var1 = new IntentFilter("android.intent.action.HEADSET_PLUG");
      this.b.registerReceiver(this.c, var1);
   }

   private void unregisterHandlers() {
      this.b.unregisterReceiver(this.c);
   }

   public native void nativeUpdateHeadphoneStateChange(long var1, int var3);
}
