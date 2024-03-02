import android.content.Context;
import android.graphics.Rect;
import android.text.BoringLayout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.BoringLayout.Metrics;
import android.text.Layout.Alignment;
import android.text.TextUtils.TruncateAt;
import android.text.style.MetricAffectingSpan;

public final class bsv {
   public static final Metrics a(CharSequence var0, TextPaint var1, TextDirectionHeuristic var2) {
      var0.getClass();
      var1.getClass();
      var2.getClass();
      return BoringLayout.isBoring(var0, var1, var2, true, (Metrics)null);
   }

   public static final BoringLayout b(CharSequence var0, TextPaint var1, int var2, Alignment var3, float var4, float var5, Metrics var6, boolean var7, boolean var8, TruncateAt var9, int var10) {
      var0.getClass();
      var1.getClass();
      var3.getClass();
      var6.getClass();
      return new BoringLayout(var0, var1, var2, var3, var4, var5, var6, var7, var9, var10, var8);
   }

   public static final Rect c(TextPaint var0, CharSequence var1, int var2, int var3) {
      if (var1 instanceof Spanned) {
         Spanned var6 = (Spanned)var1;
         if (var6.nextSpanTransition(var2 - 1, var3, MetricAffectingSpan.class) != var3) {
            Rect var7 = new Rect();
            Rect var10 = new Rect();

            int var5;
            for(TextPaint var8 = new TextPaint(); var2 < var3; var2 = var5) {
               var5 = var6.nextSpanTransition(var2, var3, MetricAffectingSpan.class);
               MetricAffectingSpan[] var9 = (MetricAffectingSpan[])var6.getSpans(var2, var5, MetricAffectingSpan.class);
               var8.set(var0);
               var9.getClass();

               for(int var4 = 0; var4 < var9.length; ++var4) {
                  MetricAffectingSpan var11 = var9[var4];
                  if (var6.getSpanStart(var11) != var6.getSpanEnd(var11)) {
                     var11.updateMeasureState(var8);
                  }
               }

               btb.a(var8, var1, var2, var5, var10);
               var7.right += var10.width();
               var7.top = Math.min(var7.top, var10.top);
               var7.bottom = Math.max(var7.bottom, var10.bottom);
            }

            return var7;
         }
      }

      Rect var12 = new Rect();
      btb.a(var0, var1, var2, var3, var12);
      return var12;
   }

   // $FF: synthetic method
   public static bup d(int var0, bvc var1, int var2, int var3) {
      if ((var3 & 2) != 0) {
         var1 = bvc.l;
      }

      byte var4;
      if ((var3 & 4) != 0) {
         var4 = 0;
      } else {
         var4 = 1;
      }

      var1.getClass();
      return new bvi(var0, var1, var2 & var4, new bvb(new bva[0]));
   }

   public static final fwf e(Context var0) {
      return new fwf(new dmw(var0), new buf(var0.getResources().getConfiguration().fontWeightAdjustment), bus.b, new buw(bus.a));
   }
}
