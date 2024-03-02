import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;

// $FF: synthetic class
public final class bcp {
   public static final int[] a;
   public static final int[] b;

   static {
      int[] var0 = new int[Style.values().length];

      try {
         var0[Style.STROKE.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      var0 = new int[Cap.values().length];

      try {
         var0[Cap.BUTT.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         var0[Cap.ROUND.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         var0[Cap.SQUARE.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      a = var0;
      var0 = new int[Join.values().length];

      try {
         var0[Join.MITER.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         var0[Join.BEVEL.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         var0[Join.ROUND.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      b = var0;
   }
}
