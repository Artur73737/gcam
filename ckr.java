import android.os.Handler;
import android.os.Looper;
import java.util.Set;

public final class ckr {
   public static final int a = 0;
   private static final ckq b;

   static {
      b = ckq.a;
   }

   public static final void a(bv var0, String var1) {
      var0.getClass();
      cko var3 = new cko(var0, var1);
      d(var3);
      ckq var2 = b(var0);
      if (var2.b.contains(ckp.c) && e(var2, var0.getClass(), var3.getClass())) {
         c(var2, var3);
      }

   }

   public static final ckq b(bv var0) {
      for(; var0 != null; var0 = var0.C) {
         if (var0.isAdded()) {
            var0.getParentFragmentManager();
         }
      }

      return b;
   }

   public static final void c(ckq var0, clb var1) {
      bv var2 = var1.a;
      String var3 = var2.getClass().getName();
      var0.b.contains(ckp.a);
      if (var0.b.contains(ckp.b)) {
         ay var4 = new ay(var3, var1, 12, (byte[])null);
         if (var2.isAdded()) {
            Handler var5 = var2.getParentFragmentManager().i.d;
            if (c.E(var5.getLooper(), Looper.myLooper())) {
               var4.run();
               return;
            }

            var5.post(var4);
            return;
         }

         var4.run();
      }

   }

   public static final void d(clb var0) {
      if (cp.S(3)) {
         var0.a.getClass().getName();
      }

   }

   public static final boolean e(ckq var0, Class var1, Class var2) {
      String var4 = var1.getName();
      Set var3 = (Set)var0.c.get(var4);
      if (var3 == null) {
         return true;
      } else if (!c.E(var2.getSuperclass(), clb.class) && pwm.aH(var3, var2.getSuperclass())) {
         return false;
      } else {
         return !var3.contains(var2);
      }
   }
}
