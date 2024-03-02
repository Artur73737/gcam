import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cra {
   private static final String[] m = new String[]{"UPDATE", "DELETE", "INSERT"};
   public final crc a;
   public final Map b;
   public final Map c;
   public final AtomicBoolean d;
   public volatile boolean e;
   public final qh f;
   public final Object g;
   public final Runnable h;
   public volatile csp i;
   public cps j;
   public cbj k;
   public final mdf l;
   private final Map n;
   private final String[] o;
   private final Object p;

   public cra(crc var1, Map var2, Map var3, String... var4) {
      this.a = var1;
      this.n = var2;
      this.b = var3;
      int var5 = 0;
      this.d = new AtomicBoolean(false);
      int var6 = var4.length;
      this.l = new mdf(var6);
      Collections.newSetFromMap(new IdentityHashMap()).getClass();
      this.f = new qh();
      this.p = new Object();
      this.g = new Object();
      this.c = new LinkedHashMap();

      String var10;
      String[] var11;
      for(var11 = new String[var6]; var5 < var6; ++var5) {
         String var8 = var4[var5];
         Locale var9 = Locale.US;
         var9.getClass();
         var10 = var8.toLowerCase(var9);
         var10.getClass();
         this.c.put(var10, var5);
         var8 = (String)this.n.get(var4[var5]);
         if (var8 != null) {
            Locale var7 = Locale.US;
            var7.getClass();
            var8 = var8.toLowerCase(var7);
            var8.getClass();
         } else {
            var8 = null;
         }

         if (var8 == null) {
            var8 = var10;
         }

         var11[var5] = var8;
      }

      this.o = var11;
      Iterator var12 = this.n.entrySet().iterator();

      while(var12.hasNext()) {
         Entry var13 = (Entry)var12.next();
         var10 = (String)var13.getValue();
         Locale var15 = Locale.US;
         var15.getClass();
         var10 = var10.toLowerCase(var15);
         var10.getClass();
         if (this.c.containsKey(var10)) {
            String var14 = (String)var13.getKey();
            var15 = Locale.US;
            var15.getClass();
            var14 = var14.toLowerCase(var15);
            var14.getClass();
            Map var16 = this.c;
            var16.put(var14, pwm.ac(var16, var10));
         }
      }

      this.h = new cqz(this);
   }

   public final void a(cqy var1) {
      qh var8 = this.f;
      synchronized(var8){}

      dub var9;
      try {
         var9 = (dub)this.f.b(var1);
      } finally {
         ;
      }

      if (var9 != null) {
         mdf var30 = this.l;
         int[] var31 = (int[])var9.a;
         int[] var34 = Arrays.copyOf(var31, var31.length);
         var34.getClass();
         synchronized(var30){}

         Throwable var10000;
         label281: {
            int var4;
            boolean var10001;
            try {
               var4 = var34.length;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break label281;
            }

            int var2 = 0;
            boolean var3 = false;

            while(true) {
               if (var2 >= var4) {
                  if (var3) {
                     this.b();
                     return;
                  }

                  return;
               }

               int var5 = var34[var2];

               long var6;
               try {
                  Object var32 = var30.c;
                  var6 = ((long[])var32)[var5];
                  ((long[])var32)[var5] = -1L + var6;
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break;
               }

               if (var6 == 1L) {
                  var3 = true;

                  try {
                     var30.a = true;
                  } catch (Throwable var27) {
                     var10000 = var27;
                     var10001 = false;
                     break;
                  }
               }

               ++var2;
            }
         }

         Throwable var33 = var10000;
         throw var33;
      }
   }

   public final void b() {
      if (this.a.s()) {
         this.c(this.a.c().a());
      }
   }

   public final void c(csa param1) {
      // $FF: Couldn't be decompiled
   }
}
