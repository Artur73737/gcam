import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.Layout.Alignment;
import android.text.TextUtils.TruncateAt;
import com.google.lullaby.modules.audio.nwj.OtvMV;

final class bth {
   public final CharSequence a;
   public final int b;
   public final TextPaint c;
   public final int d;
   public final TextDirectionHeuristic e;
   public final Alignment f;
   public final int g;
   public final TruncateAt h;
   public final int i;
   public final int j;
   public final int k;
   public final int l;
   public final int m;
   public final int n;

   public bth(CharSequence var1, int var2, TextPaint var3, int var4, TextDirectionHeuristic var5, Alignment var6, int var7, TruncateAt var8, int var9, int var10, int var11, int var12, int var13, int var14) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
      this.j = var10;
      this.k = var11;
      this.l = var12;
      this.m = var13;
      this.n = var14;
      if (var2 >= 0) {
         var10 = var1.length();
         if (var2 >= 0 && var2 <= var10) {
            if (var7 >= 0) {
               if (var4 >= 0) {
                  if (var9 < 0) {
                     throw new IllegalArgumentException(OtvMV.QRAdUUApTLEseN);
                  }
               } else {
                  throw new IllegalArgumentException("invalid width value");
               }
            } else {
               throw new IllegalArgumentException("invalid maxLines value");
            }
         } else {
            throw new IllegalArgumentException("invalid end value");
         }
      } else {
         throw new IllegalArgumentException("invalid start value");
      }
   }
}
