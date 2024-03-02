import android.view.View;
import android.view.ViewParent;
import android.view.View.OnAttachStateChangeListener;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Iterator;

public final class bpz implements OnAttachStateChangeListener {
   final Object a;
   private final int b;

   public bpz(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void onViewAttachedToWindow(View var1) {
      switch(this.b) {
      case 0:
         var1.getClass();
         return;
      case 1:
         var1.getClass();
         bol var2 = (bol)this.a;
         var2.d.addAccessibilityStateChangeListener(var2.e);
         var2 = (bol)this.a;
         var2.d.addTouchExplorationStateChangeListener(var2.f);
         Object var3 = this.a;
         cgk.c(var1, 1);
         ContentCaptureSession var4 = cgj.b(var1);
         var2 = null;
         ebt var5;
         if (var4 == null) {
            var5 = var2;
         } else {
            var5 = new ebt(var4, var1, (byte[])null);
         }

         ((bol)var3).z = var5;
         return;
      default:
         var1.getClass();
      }
   }

   public final void onViewDetachedFromWindow(View var1) {
      switch(this.b) {
      case 0:
         var1.getClass();
         Iterator var2 = qwo.f(((View)this.a).getParent(), cgt.a).a();

         while(var2.hasNext()) {
            ViewParent var4 = (ViewParent)var2.next();
            if (var4 instanceof View) {
               var1 = (View)var4;
               var1.getClass();
               Object var5 = var1.getTag(2131427790);
               Boolean var6;
               if (var5 instanceof Boolean) {
                  var6 = (Boolean)var5;
               } else {
                  var6 = null;
               }

               if (var6 != null && var6) {
                  return;
               }
            }
         }

         ((bno)this.a).b();
         return;
      case 1:
         var1.getClass();
         bol var3 = (bol)this.a;
         var3.h.removeCallbacks(var3.w);
         var3 = (bol)this.a;
         var3.d.removeAccessibilityStateChangeListener(var3.e);
         var3 = (bol)this.a;
         var3.d.removeTouchExplorationStateChangeListener(var3.f);
         ((bol)this.a).z = null;
         return;
      default:
         var1.getClass();
         var1.removeOnAttachStateChangeListener(this);
         qxb.r((rbd)this.a);
      }
   }
}
