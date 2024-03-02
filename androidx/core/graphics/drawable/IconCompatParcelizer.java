package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
   public static IconCompat read(.cve var0) {
      IconCompat var3 = new IconCompat();
      var3.b = var0.a(var3.b, 1);
      byte[] var2 = var3.d;
      if (var0.s(2)) {
         int var1 = var0.d.readInt();
         if (var1 < 0) {
            var2 = null;
         } else {
            var2 = new byte[var1];
            var0.d.readByteArray(var2);
         }
      }

      var3.d = var2;
      var3.e = var0.b(var3.e, 3);
      var3.f = var0.a(var3.f, 4);
      var3.g = var0.a(var3.g, 5);
      var3.h = (ColorStateList)var0.b(var3.h, 6);
      var3.j = var0.e(var3.j, 7);
      var3.k = var0.e(var3.k, 8);
      var3.i = Mode.valueOf(var3.j);
      Parcelable var4;
      switch(var3.b) {
      case -1:
         var4 = var3.e;
         if (var4 == null) {
            throw new IllegalArgumentException("Invalid icon");
         }
         break;
      case 0:
      default:
         return var3;
      case 1:
      case 5:
         var4 = var3.e;
         if (var4 == null) {
            byte[] var5 = var3.d;
            var3.c = var5;
            var3.b = 3;
            var3.f = 0;
            var3.g = var5.length;
            return var3;
         }
         break;
      case 2:
      case 4:
      case 6:
         var3.c = new String(var3.d, Charset.forName("UTF-16"));
         if (var3.b == 2 && var3.k == null) {
            var3.k = ((String)var3.c).split(":", -1)[0];
         }

         return var3;
      case 3:
         var3.c = var3.d;
         return var3;
      }

      var3.c = var4;
      return var3;
   }

   public static void write(IconCompat var0, .cve var1) {
      var0.j = var0.i.name();
      switch(var0.b) {
      case -1:
         var0.e = (Parcelable)var0.c;
      case 0:
      default:
         break;
      case 1:
      case 5:
         var0.e = (Parcelable)var0.c;
         break;
      case 2:
         var0.d = ((String)var0.c).getBytes(Charset.forName("UTF-16"));
         break;
      case 3:
         var0.d = (byte[])var0.c;
         break;
      case 4:
      case 6:
         var0.d = var0.c.toString().getBytes(Charset.forName("UTF-16"));
      }

      int var2 = var0.b;
      if (var2 != -1) {
         var1.h(var2, 1);
      }

      byte[] var3 = var0.d;
      if (var3 != null) {
         var1.p(2);
         var1.d.writeInt(var3.length);
         var1.d.writeByteArray(var3);
      }

      Parcelable var5 = var0.e;
      if (var5 != null) {
         var1.i(var5, 3);
      }

      var2 = var0.f;
      if (var2 != 0) {
         var1.h(var2, 4);
      }

      var2 = var0.g;
      if (var2 != 0) {
         var1.h(var2, 5);
      }

      ColorStateList var6 = var0.h;
      if (var6 != null) {
         var1.i(var6, 6);
      }

      String var7 = var0.j;
      if (var7 != null) {
         var1.j(var7, 7);
      }

      String var4 = var0.k;
      if (var4 != null) {
         var1.j(var4, 8);
      }

   }
}
