package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.apps.lightcycle.panorama.vSAD.IUDuAuCIaH;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.atomic.AtomicInteger;

public class ControllerServiceBridge implements ServiceConnection {
   public static final int h = 0;
   private static final AtomicInteger i = new AtomicInteger(-1);
   public final Context a;
   public final Handler b;
   final String c;
   public final SparseArray d;
   public boolean e;
   public .qoz f;
   public .nuc g;
   private final int j;
   private final .lwt k;

   public ControllerServiceBridge(Context var1, ControllerServiceBridge$Callbacks var2, int var3) {
      .qos var6 = new .qos(var3);
      super();
      SparseArray var5 = new SparseArray();
      this.d = var5;
      this.a = var1.getApplicationContext();
      byte var4 = 0;
      .nuc var9 = new .nuc(var2, var6, 0);
      this.g = var9;
      var5.put(var9.b, var9);
      this.b = new Handler(Looper.getMainLooper());
      this.k = new .lwt(this, 3);

      try {
         var3 = VrCoreUtils.getVrCoreClientApiVersion(var1);
      } catch (.qog var7) {
         var3 = var4;
      }

      this.j = var3;
      var3 = i.incrementAndGet();
      StringBuilder var8 = new StringBuilder();
      var8.append("VrCtl.ServiceBridge");
      var8.append(var3);
      this.c = var8.toString();
   }

   public static final void d() {
      if (Looper.myLooper() != Looper.getMainLooper()) {
         throw new IllegalStateException("This should be running on the main thread.");
      }
   }

   private final boolean e(int var1, .nuc var2) {
      boolean var3;
      try {
         .qoz var5 = this.f;
         String var6 = this.c;
         .lwt var4 = new .lwt(var2, 2);
         Parcel var8 = var5.a();
         var8.writeInt(var1);
         var8.writeString(var6);
         .edy.d(var8, var4);
         var8 = var5.y(5, var8);
         var3 = .edy.e(var8);
         var8.recycle();
      } catch (RemoteException var7) {
         Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", var7);
         return false;
      }

      if (var3) {
         return true;
      } else {
         return false;
      }
   }

   public final void a() {
      d();
      if (this.e) {
         d();
         .qoz var2 = this.f;
         Parcel var3;
         Parcel var9;
         if (var2 != null) {
            try {
               String var4 = this.c;
               var3 = var2.a();
               var3.writeString(var4);
               var9 = var2.y(6, var3);
               .edy.e(var9);
               var9.recycle();
            } catch (RemoteException var5) {
               Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", var5);
            }
         }

         if (this.j >= 21) {
            label42: {
               RemoteException var10000;
               label49: {
                  .qoz var12;
                  boolean var10001;
                  try {
                     var12 = this.f;
                  } catch (RemoteException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label49;
                  }

                  if (var12 == null) {
                     break label42;
                  }

                  boolean var1;
                  try {
                     .lwt var10 = this.k;
                     var3 = var12.a();
                     .edy.d(var3, var10);
                     var9 = var12.y(9, var3);
                     var1 = .edy.e(var9);
                     var9.recycle();
                  } catch (RemoteException var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label49;
                  }

                  if (var1) {
                     break label42;
                  }

                  try {
                     Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                     break label42;
                  } catch (RemoteException var6) {
                     var10000 = var6;
                     var10001 = false;
                  }
               }

               RemoteException var11 = var10000;
               Log.w("VrCtl.ServiceBridge", "Exception while unregistering remote service listener: ".concat(var11.toString()));
            }
         }

         this.a.unbindService(this);
         this.f = null;
         this.e = false;
      } else {
         Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
      }
   }

   public final void b() {
      ((ControllerServiceBridge$Callbacks)this.g.c).i();
      .nuc var1 = this.g;
      if (!this.e(var1.b, var1)) {
         Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
         ((ControllerServiceBridge$Callbacks)this.g.c).f();
         this.a();
      } else {
         SparseArray var2 = this.d;
         var1 = this.g;
         var2.put(var1.b, var1);
      }
   }

   public final void c(int var1, .qov var2) {
      d();
      .qoz var4 = this.f;
      if (var4 != null) {
         try {
            Parcel var3 = var4.a();
            var3.writeInt(var1);
            .edy.c(var3, var2);
            var4.z(11, var3);
         } catch (RemoteException var5) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", var5);
         }
      } else {
         Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
      }
   }

   public void controllerHapticsEffect(int var1, int var2, int var3) {
      .qfi var4 = .qpc.d.O();
      .qfi var5 = .qpa.d.O();
      if (!var5.b.ad()) {
         var5.p();
      }

      .qfn var6 = var5.b;
      .qpa var7 = (.qpa)var6;
      var7.a |= 1;
      var7.b = var2;
      if (!var6.ad()) {
         var5.p();
      }

      .qpa var11 = (.qpa)var5.b;
      var11.a |= 2;
      var11.c = var3;
      .qpa var9 = (.qpa)var5.i();
      if (!var4.b.ad()) {
         var4.p();
      }

      .qpc var12 = (.qpc)var4.b;
      var9.getClass();
      var12.c = var9;
      var12.a |= 2;
      .qpc var10 = (.qpc)var4.i();
      .qov var8 = new .qov();
      var8.a(var10);
      this.b.post(new .qow(this, var1, var8));
   }

   public boolean createAndConnectController(int var1, ControllerServiceBridge$Callbacks var2, int var3) {
      .qos var5 = new .qos(var3);
      d();
      .qoz var6 = this.f;
      boolean var4 = false;
      if (var6 != null) {
         .nuc var7 = new .nuc(var2, var5, var1);
         if (this.e(var7.b, var7)) {
            if (var7.b == 0) {
               this.g = var7;
            }

            this.d.put(var1, var7);
            var4 = true;
         } else {
            var3 = var1;
            if (var1 == 0) {
               Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
               var3 = 0;
            }

            this.d.remove(var3);
         }
      }

      return var4;
   }

   public final void onServiceConnected(ComponentName var1, IBinder var2) {
      d();
      if (this.e) {
         .qoz var9;
         if (var2 == null) {
            var9 = null;
         } else {
            IInterface var10 = var2.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
            if (var10 instanceof .qoz) {
               var9 = (.qoz)var10;
            } else {
               var9 = new .qoz(var2);
            }
         }

         this.f = var9;

         int var3;
         Parcel var11;
         Parcel var12;
         try {
            var11 = var9.a();
            var11.writeInt(25);
            var12 = var9.y(1, var11);
            var3 = var12.readInt();
            var12.recycle();
         } catch (RemoteException var6) {
            Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", var6);
            ((ControllerServiceBridge$Callbacks)this.g.c).f();
            this.a();
            return;
         }

         if (var3 != 0) {
            String var14;
            switch(var3) {
            case 0:
               var14 = IUDuAuCIaH.fpDfYf;
               break;
            case 1:
               var14 = "FAILED_UNSUPPORTED";
               break;
            case 2:
               var14 = "FAILED_NOT_AUTHORIZED";
               break;
            case 3:
               var14 = "FAILED_CLIENT_OBSOLETE";
               break;
            default:
               var14 = .c.aK(var3, "[UNKNOWN CONTROLLER INIT RESULT: ", "]");
            }

            Log.e("VrCtl.ServiceBridge", "initialize() returned error: ".concat(var14));
            ((ControllerServiceBridge$Callbacks)this.g.c).g(var3);
            this.a();
         } else {
            if (this.j >= 21) {
               label53: {
                  RemoteException var10000;
                  label60: {
                     boolean var4;
                     boolean var10001;
                     try {
                        var9 = this.f;
                        .lwt var5 = this.k;
                        var11 = var9.a();
                        .edy.d(var11, var5);
                        var12 = var9.y(8, var11);
                        var4 = .edy.e(var12);
                        var12.recycle();
                     } catch (RemoteException var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label60;
                     }

                     if (var4) {
                        break label53;
                     }

                     try {
                        Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                        ((ControllerServiceBridge$Callbacks)this.g.c).g(0);
                        this.a();
                        return;
                     } catch (RemoteException var7) {
                        var10000 = var7;
                        var10001 = false;
                     }
                  }

                  RemoteException var13 = var10000;
                  Log.w("VrCtl.ServiceBridge", "Exception while registering remote service listener: ".concat(var13.toString()));
               }
            }

            this.b();
         }
      }
   }

   public final void onServiceDisconnected(ComponentName var1) {
      d();
      this.f = null;
      ((ControllerServiceBridge$Callbacks)this.g.c).e();
   }

   public void requestBind() {
      this.b.post(new .nub(this, 15));
   }

   public void requestUnbind() {
      this.b.post(new .nub(this, 14));
   }

   public void vibrateController(int var1, int var2, int var3, int var4) {
      .qfi var5 = .qpc.d.O();
      .qfi var6 = .qpb.e.O();
      if (!var6.b.ad()) {
         var6.p();
      }

      .qfn var8 = var6.b;
      .qpb var7 = (.qpb)var8;
      var7.a |= 1;
      var7.b = var2;
      if (!var8.ad()) {
         var6.p();
      }

      .qfn var12 = var6.b;
      .qpb var14 = (.qpb)var12;
      var14.a |= 2;
      var14.c = var3;
      if (!var12.ad()) {
         var6.p();
      }

      var7 = (.qpb)var6.b;
      var7.a |= 4;
      var7.d = var4;
      .qpb var10 = (.qpb)var6.i();
      if (!var5.b.ad()) {
         var5.p();
      }

      .qpc var13 = (.qpc)var5.b;
      var10.getClass();
      var13.b = var10;
      var13.a |= 1;
      .qpc var11 = (.qpc)var5.i();
      .qov var9 = new .qov();
      var9.a(var11);
      this.b.post(new .on(this, var1, var9, 20, (char[])null));
   }
}
