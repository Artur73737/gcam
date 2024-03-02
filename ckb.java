import android.text.Editable;
import android.text.Editable.Factory;

public final class ckb extends Factory {
   private static final Object a = new Object();
   private static volatile Factory b;
   private static Class c;

   private ckb() {
      try {
         c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, this.getClass().getClassLoader());
      } finally {
         return;
      }
   }

   public static Factory a() {
      if (b == null) {
         Object var0 = a;
         synchronized(var0){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (b == null) {
                  ckb var1 = new ckb();
                  b = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return b;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      } else {
         return b;
      }
   }

   public final Editable newEditable(CharSequence var1) {
      Class var2 = c;
      return (Editable)(var2 != null ? new cka(var2, var1) : super.newEditable(var1));
   }
}
