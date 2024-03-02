package androidx.media;

import android.util.SparseIntArray;

public class AudioAttributesCompat implements .cvf {
   public static final int b = 0;
   private static final SparseIntArray c;
   public AudioAttributesImpl a;

   static {
      SparseIntArray var0 = new SparseIntArray();
      c = var0;
      var0.put(5, 1);
      var0.put(6, 2);
      var0.put(7, 2);
      var0.put(8, 1);
      var0.put(9, 1);
      var0.put(10, 1);
   }

   public final boolean equals(Object var1) {
      if (!(var1 instanceof AudioAttributesCompat)) {
         return false;
      } else {
         AudioAttributesCompat var3 = (AudioAttributesCompat)var1;
         AudioAttributesImpl var2 = this.a;
         if (var2 == null) {
            return var3.a == null;
         } else {
            return var2.equals(var3.a);
         }
      }
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      return this.a.toString();
   }
}
