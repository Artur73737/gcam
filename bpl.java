import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

public final class bpl {
   public static final int a = 0;
   private static final Class[] b = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

   public static final boolean a(Object var0) {
      if (var0 instanceof azu) {
         azu var3 = (azu)var0;
         if (var3.g() != aup.b && var3.g() != aup.c && var3.g() != aup.a) {
            return false;
         } else {
            var0 = var3.a();
            return var0 == null ? true : a(var0);
         }
      } else if (var0 instanceof qsa && var0 instanceof Serializable) {
         return false;
      } else {
         Class[] var2 = b;

         for(int var1 = 0; var1 < 7; ++var1) {
            if (var2[var1].isInstance(var0)) {
               return true;
            }
         }

         return false;
      }
   }
}
