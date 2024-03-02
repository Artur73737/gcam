import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class bwc {
   public final Object a;
   public final Object b;
   public final Object c;
   public final Object d;
   public final Object e;
   public final Object f;

   public bwc() {
      this.e = new int[]{2131231021, 2131231019, 2131230945};
      this.d = new int[]{2131230969, 2131231004, 2131230976, 2131230971, 2131230972, 2131230975, 2131230974};
      this.a = new int[]{2131231018, 2131231020, 2131230962, 2131231014, 2131231015, 2131231016, 2131231017};
      this.c = new int[]{2131230994, 2131230960, 2131230993};
      this.b = new int[]{2131231012, 2131231022};
      this.f = new int[]{2131230948, 2131230954, 2131230949, 2131230955};
   }

   public bwc(View var1) {
      this.a = var1;
      this.b = bwb.a;
      this.c = bwb.b;
      long var2 = bsr.a;
      this.d = new bwa(new bry(""), var2);
      this.e = new ArrayList();
      this.f = pwm.bu(3, new bmc(this, 11));
      new Builder();
      new Matrix();
   }

   public bwc(Object var1, qvi var2, zb var3) {
      var3.getClass();
      super();
      this.c = var2;
      new AtomicReference((Object)null);
      rjp.a();
      this.e = sg.d(var1);
      avg.a(new amc(this, 3));
      this.d = avg.a(new amc(this, 2));
      this.b = lg.c(Float.NaN);
      avg.b(aup.c, new amp(this, 2));
      lg.c(0.0F);
      this.f = sg.d((Object)null);
      this.a = sg.d(new aof(qtg.a));
   }

   public bwc(qzv var1, qzr var2, Executor var3, qzr var4, qvi var5, qvi var6) {
      this.b = var1;
      this.f = var2;
      this.c = var3;
      this.d = var4;
      this.e = pwm.bt(new ov(var5, 3));
      this.a = pwm.bt(new ov(var6, 2));
   }

   public static final boolean g(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public static final ColorStateList h(Context var0, int var1) {
      int var4 = ne.b(var0, 2130968945);
      int var2 = ne.a(var0, 2130968942);
      int[] var6 = ne.a;
      int[] var7 = ne.c;
      int var3 = cdg.c(var4, var1);
      int[] var5 = ne.b;
      var4 = cdg.c(var4, var1);
      return new ColorStateList(new int[][]{var6, var7, var5, ne.e}, new int[]{var2, var3, var4, var1});
   }

   public static final LayerDrawable i(mq var0, Context var1, int var2) {
      var2 = var1.getResources().getDimensionPixelSize(var2);
      Drawable var4 = var0.c(var1, 2131231008);
      Drawable var3 = var0.c(var1, 2131231009);
      BitmapDrawable var7;
      BitmapDrawable var9;
      if (var4 instanceof BitmapDrawable && var4.getIntrinsicWidth() == var2 && var4.getIntrinsicHeight() == var2) {
         var7 = (BitmapDrawable)var4;
         var9 = new BitmapDrawable(var7.getBitmap());
      } else {
         Bitmap var8 = Bitmap.createBitmap(var2, var2, Config.ARGB_8888);
         Canvas var6 = new Canvas(var8);
         var4.setBounds(0, 0, var2, var2);
         var4.draw(var6);
         var7 = new BitmapDrawable(var8);
         var9 = new BitmapDrawable(var8);
      }

      var9.setTileModeX(TileMode.REPEAT);
      BitmapDrawable var11;
      if (var3 instanceof BitmapDrawable && var3.getIntrinsicWidth() == var2 && var3.getIntrinsicHeight() == var2) {
         var11 = (BitmapDrawable)var3;
      } else {
         Bitmap var5 = Bitmap.createBitmap(var2, var2, Config.ARGB_8888);
         Canvas var12 = new Canvas(var5);
         var3.setBounds(0, 0, var2, var2);
         var3.draw(var12);
         var11 = new BitmapDrawable(var5);
      }

      LayerDrawable var10 = new LayerDrawable(new Drawable[]{var7, var11, var9});
      var10.setId(0, 16908288);
      var10.setId(1, 16908303);
      var10.setId(2, 16908301);
      return var10;
   }

   public static final void j(Drawable var0, int var1, Mode var2) {
      Rect var3 = ke.a;
      Drawable var5 = var0.mutate();
      Mode var4 = var2;
      if (var2 == null) {
         var4 = im.a;
      }

      var5.setColorFilter(im.b(var1, var4));
   }

   public final float a() {
      return ((auy)this.b).f();
   }

   public final Object b() {
      return ((avi)this.e).a();
   }

   public final Object c() {
      return ((avi)this.f).a();
   }

   public final void d() {
      aof var1 = (aof)((avi)this.a).a();
   }

   public final Handler e() {
      return (Handler)((qsd)this.e).a();
   }

   public final Executor f() {
      return (Executor)((qsd)this.a).a();
   }
}
