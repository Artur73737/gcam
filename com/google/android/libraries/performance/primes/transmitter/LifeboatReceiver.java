package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver.PendingResult;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public final class LifeboatReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      if (var2.hasExtra("MetricSnapshot") && var2.hasExtra("Transmitters")) {
         byte[] var4 = var2.getByteArrayExtra("MetricSnapshot");
         var4.getClass();

         .nrj var17;
         try {
            .qfc var5 = .qfc.a();
            .qfn var15 = .qfn.Q(.nrj.c, var4, 0, var4.length, var5);
            .qfn.af(var15);
            var17 = (.nrj)var15;
         } catch (.qfz var11) {
            Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", var11);
            return;
         }

         PendingResult var16 = this.goAsync();
         String[] var7 = var2.getStringArrayExtra("Transmitters");
         var7.getClass();
         ArrayList var6 = new ArrayList(var7.length);

         for(int var3 = 0; var3 < var7.length; ++var3) {
            String var14 = var7[var3];

            try {
               Constructor var8 = Class.forName(var14).getDeclaredConstructor();
               var8.setAccessible(true);
               var6.add(((.nrk)var8.newInstance()).a(var1, var17));
            } catch (Throwable var12) {
               Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", var14), var12);
               continue;
            }
         }

         .psd var13 = .osh.aA(var6);
         var16.getClass();
         var13.c(new .nff(var16, 18, (byte[])null), .pre.a);
      }
   }
}
