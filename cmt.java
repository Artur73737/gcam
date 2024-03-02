import android.app.Activity;

public final class cmt {
   public static final void a(Activity var0) {
      var0.getClass();
      var0.registerActivityLifecycleCallbacks(new cmu());
   }

   public static final cnp b(cnm var0) {
      Object var1;
      if (var0 instanceof clr) {
         var1 = ((clr)var0).getDefaultViewModelCreationExtras();
      } else {
         var1 = cnn.a;
      }

      return (cnp)var1;
   }
}
