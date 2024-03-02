import android.view.ViewParent;

public final class bqv {
   public static final bqv a = new bqv();

   private bqv() {
   }

   public final void a(boa var1) {
      var1.getClass();
      ViewParent var2 = var1.getParent();
      if (var2 != null) {
         var2.onDescendantInvalidated(var1, var1);
      }

   }
}
