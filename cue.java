import android.util.Property;
import android.view.View;

final class cue extends Property {
   public cue(Class var1) {
      super(var1, "translationAlpha");
   }

   // $FF: synthetic method
   public final Object get(Object var1) {
      View var3 = (View)var1;
      int var2 = cug.b;
      return var3.getTransitionAlpha();
   }

   // $FF: synthetic method
   public final void set(Object var1, Object var2) {
      View var5 = (View)var1;
      float var3 = (Float)var2;
      int var4 = cug.b;
      var5.setTransitionAlpha(var3);
   }
}
