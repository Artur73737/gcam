import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public final class cdo {
   static Drawable a(Icon var0, Context var1) {
      return var0.loadDrawable(var1);
   }

   public static Icon b(IconCompat var0, Context var1) {
      int var2 = var0.b;
      Icon var6;
      StringBuilder var7;
      switch(var2) {
      case -1:
         return (Icon)var0.c;
      case 0:
      default:
         throw new IllegalArgumentException("Unknown type");
      case 1:
         var6 = Icon.createWithBitmap((Bitmap)var0.c);
         break;
      case 2:
         String var8;
         if (var2 == -1) {
            var8 = cdq.d(var0.c);
         } else {
            if (var2 != 2) {
               var7 = new StringBuilder();
               var7.append("called getResPackage() on ");
               var7.append(var0);
               throw new IllegalStateException("called getResPackage() on ".concat(var0.toString()));
            }

            var8 = var0.k;
            if (var8 != null && !TextUtils.isEmpty(var8)) {
               var8 = var0.k;
            } else {
               var8 = ((String)var0.c).split(":", -1)[0];
            }
         }

         var6 = Icon.createWithResource(var8, var0.f);
         break;
      case 3:
         var6 = Icon.createWithData((byte[])var0.c, var0.f, var0.g);
         break;
      case 4:
         var6 = Icon.createWithContentUri((String)var0.c);
         break;
      case 5:
         var6 = cdp.b((Bitmap)var0.c);
         break;
      case 6:
         Uri var5;
         if (var2 == -1) {
            var5 = c(var0.c);
         } else {
            if (var2 != 4 && var2 != 6) {
               var7 = new StringBuilder();
               var7.append("called getUri() on ");
               var7.append(var0);
               throw new IllegalStateException("called getUri() on ".concat(var0.toString()));
            }

            var5 = Uri.parse((String)var0.c);
         }

         var6 = cdr.a(var5);
      }

      ColorStateList var3 = var0.h;
      if (var3 != null) {
         var6.setTintList(var3);
      }

      Mode var4 = var0.i;
      if (var4 != IconCompat.a) {
         var6.setTintMode(var4);
      }

      return var6;
   }

   static Uri c(Object var0) {
      return cdq.c(var0);
   }
}
