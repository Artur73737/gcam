import android.os.Looper;

public final class bod {
   public static final void a(cht var0, bro var1) {
      var0.getClass();
      var1.getClass();
      if (bom.e(var1) && (brc)la.l(var1.c, brk.f) != null) {
         var0.h(new chr(16908349, (CharSequence)null));
      }

   }

   public static final bxy b(int var0) {
      bxy var1;
      switch(var0) {
      case 0:
         var1 = bxy.a;
         break;
      case 1:
         var1 = bxy.b;
         break;
      default:
         var1 = bxy.a;
      }

      return var1;
   }

   public static final boolean c() {
      return Looper.myLooper() == Looper.getMainLooper();
   }

   public static final qui d() {
      return (qui)boy.a.a();
   }
}
