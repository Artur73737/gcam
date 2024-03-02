import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.CamcorderProfile;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Range;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.wear.ambient.AmbientMode.AmbientController;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class ve {
   public static ve d;
   public final Object a;
   public final Object b;
   public final Object c;

   public ve() {
      this((gxz)null, (hfx)null, (hdp)null, (egc)null);
   }

   public ve(Context var1, LocationManager var2) {
      this.c = new fl();
      this.a = var1;
      this.b = var2;
   }

   public ve(Context var1, Executor var2) {
      var1.getClass();
      var2.getClass();
      super();
      this.c = var1;
      this.b = var2;
      Context var3 = (Context)var1;
      this.a = lxl.b(var1);
   }

   public ve(Context var1, mdq var2, jqs var3, flx var4) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
      if (!(Boolean)var2.eZ()) {
         flz var5 = flu.a;
         var4.e();
         C(var1);
      }

   }

   public ve(SensorManager var1, Executor var2) {
      this.c = var1;
      this.b = var2;
      Iterator var4 = var1.getSensorList(-1).iterator();

      Sensor var3;
      do {
         if (!var4.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (Sensor)var4.next();
      } while(!"com.google.sensor.double_twist".equals(var3.getStringType()) || !"Google".equals(var3.getVendor()));

      this.a = var3;
   }

   public ve(ayy var1, qvi var2) {
      this.a = var1;
      this.c = var2;
      this.b = new LinkedHashMap();
   }

   public ve(bwc var1, qr var2, ws var3, lmk var4) {
      var1.getClass();
      var4.getClass();
      super();
      this.a = var2;
      this.c = var3;
      this.b = var4;
   }

   public ve(bzg var1) {
      this.a = new ArrayList();
      this.c = new bzn();
      this.b = var1;
   }

   public ve(dsu var1, dth var2) {
      List var3 = Collections.emptyList();
      super();
      fjn.aq(var1);
      this.c = var1;
      fjn.aq(var3);
      this.a = var3;
      fjn.aq(var2);
      this.b = var2;
   }

   public ve(gfv var1, hhj var2, Executor var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public ve(gxz var1, hfx var2, hdp var3, egc var4) {
      var2.getClass();
      var3.getClass();
      var4.getClass();
      this.b = var1;
      this.c = var2;
      this.a = var4;
   }

   public ve(Class var1, Class var2, dxs var3) {
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   public ve(ClassLoader var1, cyd var2) {
      this.b = var1;
      this.a = var2;
      this.c = new gfv(var1, (byte[])null);
   }

   public ve(Object var1, Object var2, Object var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public ve(Object var1, Object var2, Object var3, byte[] var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public ve(Object var1, Object var2, Object var3, char[] var4) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public ve(Runnable var1) {
      this.a = new CopyOnWriteArrayList();
      this.c = new HashMap();
      this.b = var1;
   }

   public ve(jbq var1) {
      this.c = new Object();
      this.a = new ArrayList();
      this.b = var1;
   }

   public ve(jhd var1, mnb var2, flx var3) {
      this.c = var1;
      this.b = var2;
      this.a = var3;
   }

   public ve(jqs var1, mdh var2, eth var3) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   public ve(mdq var1, mdh var2, flx var3) {
      this.a = var3;
      this.b = var1;
      this.c = var2;
   }

   public ve(meo var1, msr var2) {
      this.b = new HashMap();
      this.a = var1;
      this.c = var2;
   }

   public ve(mic var1, min var2, Context var3) {
      this.b = var1.a("HexagonEnv");
      this.a = var3;
      this.c = var2;
   }

   public ve(qrz var1, qrz var2, qrz var3) {
      var1.getClass();
      this.a = var1;
      var2.getClass();
      this.b = var2;
      var3.getClass();
      this.c = var3;
   }

   public ve(qrz var1, qrz var2, qrz var3, qrz var4) {
      var1.getClass();
      this.c = var1;
      this.a = var2;
      this.b = var3;
      var4.getClass();
   }

   public ve(qrz var1, qrz var2, qrz var3, byte[] var4) {
      var1.getClass();
      this.c = var1;
      var2.getClass();
      this.b = var2;
      var3.getClass();
      this.a = var3;
   }

   public ve(qrz var1, qrz var2, qrz var3, byte[] var4, byte[] var5) {
      var1.getClass();
      this.b = var1;
      var2.getClass();
      this.c = var2;
      var3.getClass();
      this.a = var3;
   }

   public static void C(Context var0) {
      (new File(String.valueOf(String.valueOf(var0.getNoBackupFilesDir())).concat(yGCWWDnsImN.KeXqbbPNeXazir))).delete();
      File var1 = new File(String.valueOf(String.valueOf(var0.getNoBackupFilesDir())).concat("/ff.pb_tmp"));
      if (var1.exists()) {
         var1.delete();
      }

   }

   private final boolean E() {
      StringBuilder var1 = new StringBuilder();
      var1.append("WindowLayoutComponent#addWindowLayoutInfoListener(");
      var1.append(Activity.class.getName());
      var1.append(", java.util.function.Consumer) is not valid");
      return cwm.b(var1.toString(), new bmc(this, 20));
   }

   private final List F(msg var1, mei var2) {
      LinkedList var6 = new LinkedList();
      mey[] var7 = mey.values();
      int var4 = var7.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         mey var8 = var7[var3];
         mek var5 = var8.n;
         if (CamcorderProfile.hasProfile(Integer.parseInt(var1.a), var8.m)) {
            mfb var9 = mzx.bs(var1, var8);
            if (((meo)this.a).e(var9, var2, var5)) {
               var6.addFirst(var5);
            }
         }
      }

      return var6;
   }

   private static gnv G(Context var0) {
      if (var0 instanceof gnu) {
         return ((gnu)var0).d();
      } else if (var0 instanceof ContextWrapper) {
         return G(((ContextWrapper)var0).getBaseContext());
      } else {
         throw new IllegalArgumentException("Context does not provide a Hexagon path.");
      }
   }

   public static final Intent f(Intent var0, ResultReceiver var1, String var2, String var3) {
      Intent var4 = new Intent("com.google.android.wearable.intent.action.REMOTE_INTENT");
      var4.putExtra("com.google.android.wearable.intent.extra.INTENT", var0);
      Parcel var5 = Parcel.obtain();
      var5.getClass();
      var1.writeToParcel(var5, 0);
      var5.setDataPosition(0);
      var1 = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(var5);
      var5.recycle();
      var1.getClass();
      var4.putExtra("com.google.android.wearable.intent.extra.RESULT_RECEIVER", var1);
      if (var2 != null) {
         var4.putExtra("com.google.android.wearable.intent.extra.NODE_ID", var2);
      }

      var4.setPackage(var3);
      return var4;
   }

   public static final void y(mvx var0, mho var1) {
      var0.getClass();
      boolean var5;
      if (var0.a() == 35) {
         var5 = true;
      } else {
         var5 = false;
      }

      onk.w(var5);
      System.currentTimeMillis();
      var5 = jbc.c(var1);
      ByteBuffer var8 = ((mvw)var0.g().get(0)).getBuffer();
      int var4 = ((mvw)var0.g().get(0)).getRowStride();
      ByteBuffer var7 = ((mvw)var0.g().get(1)).getBuffer();
      int var3 = ((mvw)var0.g().get(1)).getRowStride();
      ByteBuffer var6 = ((mvw)var0.g().get(2)).getBuffer();
      int var2 = ((mvw)var0.g().get(2)).getRowStride();
      FrameUtilNative.mirrorYUV420888(var8, var4, var7, var3, var6, var2, var8, var4, var7, var3, var6, var2, var0.c(), var0.b(), var5);
      System.currentTimeMillis();
   }

   public final itn A() {
      flx var1 = (flx)((qrz)this.c).get();
      var1.getClass();
      return new itn(var1, ((ksl)this.a).a(), ((idw)this.b).a());
   }

   public final void B() {
      Exception var10000;
      label53: {
         boolean var10001;
         label50: {
            UnsatisfiedLinkError var2;
            try {
               try {
                  ((mic)this.b).f("Loading libhalide_hexagon_host.so.");
                  System.loadLibrary("halide_hexagon_host");
                  break label50;
               } catch (UnsatisfiedLinkError var10) {
                  var2 = var10;
               }
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label53;
            }

            try {
               ((mic)this.b).i("Failed to load Hexagon library", var2);
               return;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label53;
            }
         }

         InputStream var3;
         FileOutputStream var13;
         byte[] var15;
         try {
            String var12 = G((Context)this.a).a;
            ((min)this.c).e("HexagonEnvironment#copyHexagonRemoteToDisk");
            String var4 = String.valueOf(var12).concat("/libhalide_hexagon_remote_skel.so");
            ((mic)this.b).f("Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ".concat(var4));
            var3 = ((Context)this.a).getAssets().open("libhalide_hexagon_remote_skel_signed_by_testsig.so");
            var13 = new FileOutputStream(var4);
            var15 = new byte[1024];
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label53;
         }

         while(true) {
            int var1;
            try {
               var1 = var3.read(var15);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            if (var1 == -1) {
               try {
                  var13.flush();
                  var3.close();
                  var13.close();
                  ((min)this.c).f();
                  return;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            try {
               var13.write(var15, 0, var1);
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }
         }
      }

      Exception var14 = var10000;
      ((mic)this.b).i("Error initializing Hexagon", var14);
   }

   public final gtz D(msg var1) {
      if (((Map)this.b).containsKey(var1)) {
         return (gtz)((Map)this.b).get(var1);
      } else {
         ich var4 = ((msr)this.c).f(var1);
         HashMap var5 = new HashMap();
         var5.put(mei.c, this.F(var1, mei.c));
         mei var6 = mei.d;
         var5.put(var6, this.F(var1, var6));
         var6 = mei.a;
         var5.put(var6, this.F(var1, var6));
         var6 = mei.b;
         var5.put(var6, this.F(var1, var6));
         var6 = mei.f;
         var5.put(var6, this.F(var1, var6));
         var6 = mei.e;
         var5.put(var6, this.F(var1, var6));
         HashMap var17 = new HashMap();
         Iterator var7 = mei.d().iterator();

         while(var7.hasNext()) {
            var17.put((mei)var7.next(), new ArrayList());
         }

         if (var4.L()) {
            ArrayList var16 = new ArrayList();
            Iterator var8 = var4.w().iterator();

            mek var21;
            while(var8.hasNext()) {
               mhs var9 = (mhs)var8.next();
               var21 = (mek)mek.o.get(var9);
               if (var21 != null) {
                  var16.add(var21);
               }
            }

            var8 = var16.iterator();

            label86:
            while(true) {
               mew var18;
               do {
                  do {
                     if (!var8.hasNext()) {
                        mew[] var20 = mew.values();
                        int var3 = var20.length;

                        for(int var2 = 0; var2 < var3; ++var2) {
                           var18 = var20[var2];
                           if (mzx.bq(var1, var18) && mzx.br(var1, var18).l == 240) {
                              break label86;
                           }
                        }

                        var17.put(mei.h, new ArrayList());
                        break label86;
                     }

                     var21 = (mek)var8.next();
                     var18 = mew.a(var21);
                  } while(var18 == null);
               } while(!mzx.bq(var1, var18));

               List var10 = var4.v(var21.b());
               Iterator var11 = mei.d().iterator();

               while(true) {
                  while(true) {
                     mei var12;
                     mfb var13;
                     do {
                        do {
                           if (!var11.hasNext()) {
                              continue label86;
                           }

                           var12 = (mei)var11.next();
                        } while(!mzx.bq(var1, var18));

                        var13 = mzx.br(var1, var18);
                     } while(!((meo)this.a).e(var13, var12, var21));

                     Iterator var23 = var10.iterator();

                     while(var23.hasNext()) {
                        Range var14 = (Range)var23.next();
                        if (var12.k == (Integer)var14.getUpper()) {
                           List var22 = (List)var17.get(var12);
                           var22.getClass();
                           var22.add(var21);
                           break;
                        }
                     }
                  }
               }
            }
         }

         var5.putAll(var17);
         Iterator var19 = var5.keySet().iterator();

         while(var19.hasNext()) {
            Collections.sort((List)var5.get((mei)var19.next()), new bce(14));
         }

         gtz var15 = new gtz(var4, var5);
         ((Map)this.b).put(var1, var15);
         return var15;
      }
   }

   public final qvx a(int var1, Object var2) {
      akk var3 = (akk)((Map)this.b).get(var2);
      qvx var4;
      if (var3 != null && var3.b == var1 && c.E((Object)null, (Object)null)) {
         var4 = var3.a();
      } else {
         var3 = new akk(this, var1, var2);
         ((Map)this.b).put(var2, var3);
         var4 = var3.a();
      }

      return var4;
   }

   public final void b(Object var1) {
      if (var1 != null) {
         if ((akk)((Map)this.b).get(var1) == null) {
            aji var3 = (aji)((qvi)this.c).a();
            int var2 = var3.a(var1);
            if (var2 != -1) {
               var3.e(var2);
               return;
            }
         }

      }
   }

   public final Location c(String var1) {
      try {
         if (((LocationManager)this.b).isProviderEnabled(var1)) {
            Location var3 = ((LocationManager)this.b).getLastKnownLocation(var1);
            return var3;
         }
      } catch (Exception var2) {
      }

      return null;
   }

   public final WindowLayoutComponent d() {
      boolean var2 = ((gfv)this.c).v();
      Object var4 = null;
      WindowLayoutComponent var3 = null;
      if (var2) {
         var2 = false;
         if (cwm.b("WindowExtensions#getWindowLayoutComponent is not valid", new cyq(this, 0)) && cwm.b("FoldingFeature class is not valid", new bmc(this, 19))) {
            int var1 = cye.a;
            var1 = cye.a();
            if (var1 == 1) {
               var2 = this.E();
            } else if (var1 >= 2 && this.E()) {
               StringBuilder var5 = new StringBuilder();
               var5.append("WindowLayoutComponent#addWindowLayoutInfoListener(");
               var5.append(Context.class.getName());
               var5.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
               if (cwm.b(var5.toString(), new cyq(this, 1))) {
                  var2 = true;
               }
            }

            if (!var2) {
               return var3;
            }

            try {
               var3 = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
               return var3;
            } catch (UnsupportedOperationException var6) {
            }
         }
      }

      var3 = (WindowLayoutComponent)var4;
      return var3;
   }

   public final Class e() {
      Class var1 = ((ClassLoader)this.b).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
      var1.getClass();
      return var1;
   }

   public final void g(Menu var1, MenuInflater var2) {
      Iterator var3 = ((CopyOnWriteArrayList)this.a).iterator();

      while(var3.hasNext()) {
         ((cp)((AmbientController)var3.next()).a).P(var1, var2);
      }

   }

   public final void h(Menu var1) {
      Iterator var2 = ((CopyOnWriteArrayList)this.a).iterator();

      while(var2.hasNext()) {
         ((cp)((AmbientController)var2.next()).a).R(var1);
      }

   }

   public final boolean i(MenuItem var1) {
      Iterator var2 = ((CopyOnWriteArrayList)this.a).iterator();

      do {
         if (!var2.hasNext()) {
            return false;
         }
      } while(!((cp)((AmbientController)var2.next()).a).Q(var1));

      return true;
   }

   public final void j(bzg var1) {
      ((ArrayList)this.a).clear();
      int var3 = var1.aK.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         bzf var4 = (bzf)var1.aK.get(var2);
         if (var4.O() == 3 || var4.P() == 3) {
            ((ArrayList)this.a).add(var4);
         }
      }

      var1.U();
   }

   public final boolean k(cae var1, bzf var2, int var3) {
      Object var5 = this.c;
      int var4 = var2.O();
      ((bzn)var5).i = var4;
      var5 = this.c;
      var4 = var2.P();
      ((bzn)var5).j = var4;
      var5 = this.c;
      var4 = var2.j();
      ((bzn)var5).a = var4;
      var5 = this.c;
      var4 = var2.h();
      ((bzn)var5).b = var4;
      bzn var9 = (bzn)this.c;
      var9.g = false;
      var9.h = var3;
      var3 = var9.i;
      var4 = var9.j;
      boolean var7;
      if (var3 == 3 && var2.Y > 0.0F) {
         var7 = true;
      } else {
         var7 = false;
      }

      boolean var8;
      if (var4 == 3 && var2.Y > 0.0F) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (var7 && var2.v[0] == 4) {
         var9.i = 1;
      }

      if (var8 && var2.v[1] == 4) {
         var9.j = 1;
      }

      var1.a(var2, var9);
      var2.F(((bzn)this.c).c);
      var2.A(((bzn)this.c).d);
      bzn var6 = (bzn)this.c;
      var2.G = var6.f;
      var2.x(var6.e);
      var6 = (bzn)this.c;
      var6.h = 0;
      return var6.g;
   }

   public final void l(bzg var1, int var2, int var3, int var4) {
      long var7;
      if (var1.d != null) {
         var7 = System.nanoTime();
      } else {
         var7 = 0L;
      }

      int var6 = var1.ad;
      int var5 = var1.ae;
      var1.E(0);
      var1.D(0);
      var1.F(var3);
      var1.A(var4);
      var1.E(var6);
      var1.D(var5);
      Object var11 = this.b;
      ((bzg)var11).b = var2;
      ((bzm)var11).V();
      if (var1.d != null) {
         long var9 = System.nanoTime();
         byw var12 = var1.d;
         ++var12.I;
         var12.b += var9 - var7;
      }

   }

   public final mek m(msp var1) {
      flz var2;
      if (var1 == msp.a) {
         var2 = flj.f;
      } else {
         var2 = flj.g;
      }

      otw var3 = otw.i((Integer)((flx)this.a).a(var2).orElse((Object)null));
      if (var3.h()) {
         switch((Integer)var3.c()) {
         case 144:
            return mek.b;
         case 240:
            return mek.c;
         case 288:
            return mek.d;
         case 480:
            return mek.f;
         case 720:
            return mek.g;
         case 1080:
            return mek.i;
         case 2160:
            return mek.k;
         default:
            String var6 = var3.c().toString();
            String var8 = var2.a;
            StringBuilder var9 = new StringBuilder();
            var9.append("Value ");
            var9.append(var6);
            var9.append(" for ADB flag ");
            var9.append(var8);
            var9.append(" not supported.");
            throw new IllegalArgumentException(var9.toString());
         }
      } else if (var1 == msp.a) {
         return mek.i;
      } else {
         Object var4 = this.c;
         jhl var7 = jgz.F;
         mek var5;
         if ((Boolean)((jhd)var4).b(var7)) {
            var5 = mek.k;
         } else {
            var5 = mek.i;
         }

         return var5;
      }
   }

   public final boolean n(Context var1, msp var2) {
      if (var2.equals(msp.b)) {
         return true;
      } else if (((flx)this.a).m(fmd.ca)) {
         Display var3 = var1.getDisplay();
         var3.getClass();
         return kfq.l(var1, var3).getWidth() < 600 ? ((flx)this.a).m(flj.al) : false;
      } else {
         return ((flx)this.a).m(flj.al);
      }
   }

   public final boolean o() {
      Object var4 = this.a;
      flz var3 = flj.a;
      ((flx)var4).c();
      Object var5 = this.c;
      jhl var6 = jgz.D;
      boolean var2 = (Boolean)((jhd)var5).b(var6);
      boolean var1 = false;
      if (var2 && ((flx)this.a).m(flj.q)) {
         if (!((mnb)this.b).d()) {
            return false;
         }

         var1 = true;
      }

      return var1;
   }

   public final boolean p() {
      Object var1 = this.c;
      jhl var2 = jgz.C;
      return (Boolean)((jhd)var1).b(var2);
   }

   public final boolean q() {
      return ((flx)this.a).l(flj.t);
   }

   public final boolean r(Class var1, Class var2) {
      return ((Class)this.a).isAssignableFrom(var1) && var2.isAssignableFrom((Class)this.b);
   }

   public final boolean s(Class var1) {
      return ((Class)this.b).isAssignableFrom(var1);
   }

   public final void t(SensorEventListener var1) {
      if (this.a != null) {
         ((Executor)this.b).execute(new jdy(this, var1, 1, (byte[])null));
      }

   }

   public final void u(SensorEventListener var1) {
      if (this.a != null) {
         ((Executor)this.b).execute(new jdy(this, var1, 0, (byte[])null));
      }

   }

   public final Bitmap v(Bitmap var1, int var2, msp var3) {
      return this.w(var1, var2, var3, true);
   }

   public final Bitmap w(Bitmap var1, int var2, msp var3, boolean var4) {
      if (var1 != null && this.x(var3)) {
         Matrix var5 = new Matrix();
         System.currentTimeMillis();
         if (var2 != mho.b.e && var2 != mho.d.e) {
            var5.postScale(-1.0F, 1.0F);
         } else {
            var5.postScale(1.0F, -1.0F);
         }

         if (var4) {
            var5.postRotate((float)var2);
         }

         var1 = Bitmap.createBitmap(var1, 0, 0, var1.getWidth(), var1.getHeight(), var5, true);
         System.currentTimeMillis();
         return var1;
      } else {
         return var1;
      }
   }

   public final boolean x(msp var1) {
      boolean var3 = ((flx)this.a).m(fmd.bq);
      boolean var2 = false;
      if (!var3) {
         ((mdq)this.b).a(false);
      }

      if ((Boolean)((mdh)this.b).eZ()) {
         if (!var1.equals(msp.a)) {
            if (var1.equals(msp.b) && (Boolean)((mdh)this.c).eZ()) {
               return true;
            }
         } else {
            var2 = true;
         }
      }

      return var2;
   }

   public final boolean z(jcn var1) {
      Object var4 = this.b;
      long var2 = var1.c();
      return ((jbq)var4).c.containsKey(var2);
   }
}
