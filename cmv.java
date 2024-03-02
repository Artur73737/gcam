import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public final class cmv extends Fragment {
   public static final int a = 0;

   public static final void a(Activity var0) {
      cmt var1 = cmu.Companion;
      cmt.a(var0);
      FragmentManager var2 = var0.getFragmentManager();
      if (var2.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
         var2.beginTransaction().add(new cmv(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
         var2.executePendingTransactions();
      }

   }

   public final void onActivityCreated(Bundle var1) {
      super.onActivityCreated(var1);
      clu var2 = clv.Companion;
   }

   public final void onDestroy() {
      super.onDestroy();
      clu var1 = clv.Companion;
   }

   public final void onPause() {
      super.onPause();
      clu var1 = clv.Companion;
   }

   public final void onResume() {
      super.onResume();
      clu var1 = clv.Companion;
   }

   public final void onStart() {
      super.onStart();
      clu var1 = clv.Companion;
   }

   public final void onStop() {
      super.onStop();
      clu var1 = clv.Companion;
   }
}
