import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;
import java.io.File;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class bmc extends qwq implements qvi {
   final Object a;
   private final int b;

   public bmc(Object var1, int var2) {
      super(0);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a() {
      int var6 = this.b;
      float var2 = 0.0F;
      float var3 = 0.0F;
      Class var14 = null;
      Class var12 = null;
      Method var13 = null;
      boolean var7 = true;
      int var4 = 1;
      byte var5 = 1;
      boolean var8 = true;
      boolean var9 = true;
      float var1;
      int var17;
      Method var18;
      Class var20;
      Object var29;
      Object var33;
      bsf var35;
      switch(var6) {
      case 0:
         ((bmd)this.a).o.c();
         return qsn.a;
      case 1:
         var33 = this.a;
         baz var34 = ((bky)var33).a;
         var34.getClass();
         ((bht)var34).e((bkt)var33);
         return qsn.a;
      case 2:
         bmz var39 = ((bmz)this.a).p;
         if (var39 != null) {
            var39.Y();
         }

         return qsn.a;
      case 3:
         ((qvt)this.a).eo(bmz.j);
         return qsn.a;
      case 4:
         MotionEvent var37 = ((boa)this.a).t;
         if (var37 != null) {
            switch(var37.getActionMasked()) {
            case 7:
            case 9:
               var33 = this.a;
               long var10 = SystemClock.uptimeMillis();
               ((boa)var33).u = var10;
               boa var38 = (boa)this.a;
               var38.post(var38.x);
            case 8:
            }
         }

         return qsn.a;
      case 5:
         return (bpe)((boa)this.a).p.a();
      case 6:
         Locale var36 = ((brw)this.a).a.b.getTextLocale();
         var36.getClass();
         return new btc(var36, ((brw)this.a).b.j());
      case 7:
         List var31 = ((bsd)this.a).c;
         if (var31.isEmpty()) {
            var33 = var14;
         } else {
            var29 = var31.get(0);
            var1 = ((bsf)var29).a.a();
            var6 = pwm.al(var31);
            var33 = var29;
            if (var6 > 0) {
               var4 = var5;

               while(true) {
                  var33 = var31.get(var4);
                  var3 = ((bsf)var33).a.a();
                  var17 = Float.compare(var1, var3);
                  if (var17 < 0) {
                     var1 = var3;
                  }

                  if (var17 < 0) {
                     var29 = var33;
                  }

                  var33 = var29;
                  if (var4 == var6) {
                     break;
                  }

                  ++var4;
               }
            }
         }

         var35 = (bsf)var33;
         if (var35 != null) {
            var1 = var35.a.a();
         } else {
            var1 = var2;
         }

         return var1;
      case 8:
         List var32 = ((bsd)this.a).c;
         if (var32.isEmpty()) {
            var33 = var13;
         } else {
            var29 = var32.get(0);
            var1 = ((bsf)var29).a.b();
            var17 = pwm.al(var32);
            var33 = var29;
            if (var17 > 0) {
               while(true) {
                  var33 = var32.get(var4);
                  var2 = ((bsf)var33).a.b();
                  var6 = Float.compare(var1, var2);
                  if (var6 < 0) {
                     var1 = var2;
                  }

                  if (var6 < 0) {
                     var29 = var33;
                  }

                  var33 = var29;
                  if (var4 == var17) {
                     break;
                  }

                  ++var4;
               }
            }
         }

         var35 = (bsf)var33;
         if (var35 != null) {
            var1 = var35.a.b();
         } else {
            var1 = var3;
         }

         return var1;
      case 9:
         return new bsz(((btk)this.a).b);
      case 10:
         var33 = ((View)((dmw)this.a).a).getContext().getSystemService("input_method");
         var33.getClass();
         return (InputMethodManager)var33;
      case 11:
         return new BaseInputConnection((View)((bwc)this.a).a, false);
      case 12:
         return this.a;
      case 13:
         return cnb.b((cnm)this.a);
      case 14:
         return ((crj)this.a).f();
      case 15:
         csm var21 = (csm)this.a;
         String var19 = var21.b;
         pde var15;
         csl var22;
         if (var19 != null && var21.d) {
            File var23 = var21.a.getNoBackupFilesDir();
            var23.getClass();
            File var25 = new File(var23, ((csm)this.a).b);
            Context var26 = ((csm)this.a).a;
            String var27 = var25.getAbsolutePath();
            var15 = new pde((char[])null);
            csm var30 = (csm)this.a;
            var22 = new csl(var26, var27, var15, var30.c, var30.e);
         } else {
            Context var28 = var21.a;
            var15 = new pde((char[])null);
            var21 = (csm)this.a;
            var22 = new csl(var28, var19, var15, var21.c, var21.e);
         }

         cbv.n(var22, ((csm)this.a).g);
         return var22;
      case 16:
         var12 = ((ClassLoader)((gfv)this.a).a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
         var12.getClass();
         return var12;
      case 17:
         var12 = ((ClassLoader)((gfv)this.a).a).loadClass("androidx.window.extensions.WindowExtensionsProvider");
         var12.getClass();
         var18 = var12.getDeclaredMethod("getWindowExtensions");
         var20 = ((gfv)this.a).t();
         var18.getClass();
         if (!cwm.d(var18, var20) || !cwm.e(var18)) {
            var7 = false;
         }

         return var7;
      case 18:
         return BigInteger.valueOf((long)((cyi)this.a).b).shiftLeft(32).or(BigInteger.valueOf((long)((cyi)this.a).c)).shiftLeft(32).or(BigInteger.valueOf((long)((cyi)this.a).d));
      case 19:
         var14 = ((ClassLoader)((ve)this.a).b).loadClass("androidx.window.extensions.layout.FoldingFeature");
         var14.getClass();
         var13 = var14.getMethod("getBounds");
         var18 = var14.getMethod("getType");
         Method var24 = var14.getMethod("getState");
         var13.getClass();
         if (cwm.g(var13, qxa.a(Rect.class)) && cwm.e(var13)) {
            var18.getClass();
            if (cwm.g(var18, qxa.a(Integer.TYPE)) && cwm.e(var18)) {
               var24.getClass();
               if (cwm.g(var24, qxa.a(Integer.TYPE)) && cwm.e(var24)) {
                  var7 = var9;
                  return var7;
               }
            }
         }

         var7 = false;
         return var7;
      default:
         var29 = ((ve)this.a).a;

         label153: {
            try {
               var20 = ((cyd)var29).a();
            } catch (ClassNotFoundException var16) {
               break label153;
            }

            var12 = var20;
         }

         Boolean var40;
         if (var12 == null) {
            var40 = false;
         } else {
            label147: {
               var14 = ((ve)this.a).e();
               var13 = var14.getMethod("addWindowLayoutInfoListener", Activity.class, var12);
               var18 = var14.getMethod(tRYpVduhjf.ABPX, var12);
               var13.getClass();
               if (cwm.e(var13)) {
                  var18.getClass();
                  if (cwm.e(var18)) {
                     var7 = var8;
                     break label147;
                  }
               }

               var7 = false;
            }

            var40 = var7;
         }

         return var40;
      }
   }
}
