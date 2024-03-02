import android.widget.PopupWindow;

public final class cir {
   static int a(PopupWindow var0) {
      return var0.getWindowLayoutType();
   }

   public static void b(PopupWindow var0, boolean var1) {
      var0.setOverlapAnchor(var1);
   }

   public static void c(PopupWindow var0, int var1) {
      var0.setWindowLayoutType(var1);
   }

   static boolean d(PopupWindow var0) {
      return var0.getOverlapAnchor();
   }

   public static final void e(cnh param0, crx param1, clx param2) {
      // $FF: Couldn't be decompiled
   }

   public static final void f(crx var0, clx var1) {
      clw var2 = var1.b;
      if (var2 != clw.b && !var2.a(clw.d)) {
         var1.a(new clt(var1, var0));
      } else {
         var0.c(cls.class);
      }
   }
}
