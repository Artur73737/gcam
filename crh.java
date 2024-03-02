import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

public final class crh implements csg, csf {
   public static final TreeMap a = new TreeMap();
   public final long[] b;
   public final double[] c;
   public final String[] d;
   public final byte[][] e;
   private final int f;
   private volatile String g;
   private final int[] h;
   private int i;

   public crh(int var1) {
      this.f = var1++;
      this.h = new int[var1];
      this.b = new long[var1];
      this.c = new double[var1];
      this.d = new String[var1];
      this.e = new byte[var1][];
   }

   public static final crh a(String var0, int var1) {
      TreeMap var3 = a;
      synchronized(var3){}

      Throwable var10000;
      label91: {
         boolean var10001;
         Entry var2;
         try {
            var2 = var3.ceilingEntry(var1);
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label91;
         }

         crh var11;
         crh var12;
         if (var2 == null) {
            var12 = new crh(var1);
            var12.i(var0, var1);
            var11 = var12;
            return var11;
         }

         try {
            var3.remove(var2.getKey());
            var12 = (crh)var2.getValue();
            var12.i(var0, var1);
            var12.getClass();
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label91;
         }

         var11 = var12;
         return var11;
      }

      Throwable var10 = var10000;
      throw var10;
   }

   public final String b() {
      String var1 = this.g;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException("Required value was null.");
      }
   }

   public final void c(int var1, byte[] var2) {
      throw null;
   }

   public final void close() {
   }

   public final void d(int var1, double var2) {
      throw null;
   }

   public final void e(int var1, long var2) {
      this.h[var1] = 2;
      this.b[var1] = var2;
   }

   public final void f(int var1) {
      this.h[var1] = 1;
   }

   public final void g(int var1, String var2) {
      this.h[var1] = 4;
      this.d[var1] = var2;
   }

   public final void h(csf var1) {
      int var3 = this.i;
      if (var3 > 0) {
         int var2 = 1;

         while(true) {
            switch(this.h[var2]) {
            case 1:
               var1.f(var2);
               break;
            case 2:
               var1.e(var2, this.b[var2]);
               break;
            case 3:
               var1.d(var2, this.c[var2]);
               break;
            case 4:
               String var5 = this.d[var2];
               if (var5 == null) {
                  throw new IllegalArgumentException("Required value was null.");
               }

               var1.g(var2, var5);
               break;
            case 5:
               byte[] var4 = this.e[var2];
               if (var4 == null) {
                  throw new IllegalArgumentException("Required value was null.");
               }

               var1.c(var2, var4);
            }

            if (var2 == var3) {
               break;
            }

            ++var2;
         }
      }

   }

   public final void i(String var1, int var2) {
      this.g = var1;
      this.i = var2;
   }

   public final void j() {
      TreeMap var2 = a;
      synchronized(var2){}

      Throwable var10000;
      label90: {
         int var1;
         boolean var10001;
         Iterator var3;
         try {
            var2.put(this.f, this);
            if (var2.size() <= 15) {
               return;
            }

            var1 = var2.size() - 10;
            var3 = var2.descendingKeySet().iterator();
            var3.getClass();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label90;
         }

         while(true) {
            if (var1 <= 0) {
               return;
            }

            try {
               var3.next();
               var3.remove();
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }

            --var1;
         }
      }

      Throwable var10 = var10000;
      throw var10;
   }
}
