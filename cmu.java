import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class cmu implements ActivityLifecycleCallbacks {
   public static final cmt Companion = new cmt();

   public static final void registerIn(Activity var0) {
      cmt.a(var0);
   }

   public void onActivityCreated(Activity var1, Bundle var2) {
      var1.getClass();
   }

   public void onActivityDestroyed(Activity var1) {
      var1.getClass();
   }

   public void onActivityPaused(Activity var1) {
      var1.getClass();
   }

   public void onActivityPostCreated(Activity var1, Bundle var2) {
      var1.getClass();
      int var3 = cmv.a;
      ciu.i(var1, clv.ON_CREATE);
   }

   public void onActivityPostResumed(Activity var1) {
      var1.getClass();
      int var2 = cmv.a;
      ciu.i(var1, clv.ON_RESUME);
   }

   public void onActivityPostStarted(Activity var1) {
      var1.getClass();
      int var2 = cmv.a;
      ciu.i(var1, clv.ON_START);
   }

   public void onActivityPreDestroyed(Activity var1) {
      var1.getClass();
      int var2 = cmv.a;
      ciu.i(var1, clv.ON_DESTROY);
   }

   public void onActivityPrePaused(Activity var1) {
      var1.getClass();
      int var2 = cmv.a;
      ciu.i(var1, clv.ON_PAUSE);
   }

   public void onActivityPreStopped(Activity var1) {
      var1.getClass();
      int var2 = cmv.a;
      ciu.i(var1, clv.ON_STOP);
   }

   public void onActivityResumed(Activity var1) {
      var1.getClass();
   }

   public void onActivitySaveInstanceState(Activity var1, Bundle var2) {
      var1.getClass();
      var2.getClass();
   }

   public void onActivityStarted(Activity var1) {
      var1.getClass();
   }

   public void onActivityStopped(Activity var1) {
      var1.getClass();
   }
}
