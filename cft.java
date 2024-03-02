import android.view.View;
import android.view.ViewTreeObserver;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class cft implements OnPreDrawListener, OnAttachStateChangeListener {
   private final View a;
   private ViewTreeObserver b;
   private final Runnable c;

   private cft(View var1, Runnable var2) {
      this.a = var1;
      this.b = var1.getViewTreeObserver();
      this.c = var2;
   }

   public static void b(View var0, Runnable var1) {
      if (var0 != null) {
         cft var2 = new cft(var0, var1);
         var0.getViewTreeObserver().addOnPreDrawListener(var2);
         var0.addOnAttachStateChangeListener(var2);
      } else {
         throw new NullPointerException("view == null");
      }
   }

   public final void a() {
      if (this.b.isAlive()) {
         this.b.removeOnPreDrawListener(this);
      } else {
         this.a.getViewTreeObserver().removeOnPreDrawListener(this);
      }

      this.a.removeOnAttachStateChangeListener(this);
   }

   public final boolean onPreDraw() {
      this.a();
      this.c.run();
      return true;
   }

   public final void onViewAttachedToWindow(View var1) {
      this.b = var1.getViewTreeObserver();
   }

   public final void onViewDetachedFromWindow(View var1) {
      this.a();
   }
}
