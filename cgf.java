import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.DragShadowBuilder;

public final class cgf {
   static void a(View var0) {
      var0.cancelDragAndDrop();
   }

   static void b(View var0) {
      var0.dispatchFinishTemporaryDetach();
   }

   static void c(View var0) {
      var0.dispatchStartTemporaryDetach();
   }

   public static void d(View var0, PointerIcon var1) {
      var0.setPointerIcon(var1);
   }

   static void e(View var0, DragShadowBuilder var1) {
      var0.updateDragShadow(var1);
   }

   static boolean f(View var0, ClipData var1, DragShadowBuilder var2, Object var3, int var4) {
      return var0.startDragAndDrop(var1, var2, var3, var4);
   }
}
