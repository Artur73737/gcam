import java.util.List;

public final class ahb {
   public static final qvy a = new agd((que)null);

   public static final Object a(bij var0, que var1) {
      int var2;
      agf var8;
      label67: {
         if (var1 instanceof agf) {
            agf var5 = (agf)var1;
            var2 = var5.b;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var5.b = var2 + Integer.MIN_VALUE;
               var8 = var5;
               break label67;
            }
         }

         var8 = new agf(var1);
      }

      Object var9 = var8.a;
      qul var7 = qul.a;
      byte var3;
      int var4;
      List var6;
      bhl var10;
      Object var11;
      switch(var8.b) {
      case 0:
         pwm.bs(var9);
         var8.c = var0;
         var8.b = 1;
         var11 = hf.e(var0, var8);
         if (var11 == var7) {
            return var7;
         }

         var10 = (bhl)var11;
         var6 = var10.a;
         var4 = var6.size();
         var3 = 0;
         var2 = 0;
         break;
      case 1:
         var0 = var8.c;
         pwm.bs(var9);
         var10 = (bhl)var9;
         var6 = var10.a;
         var4 = var6.size();
         var3 = 0;
         var2 = 0;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      while(true) {
         while(var2 >= var4) {
            List var12 = var10.a;
            var4 = var12.size();
            var2 = var3;
            if (var3 >= var4) {
               return qsn.a;
            }

            while(!((bhw)var12.get(var2)).d) {
               ++var2;
               if (var2 >= var4) {
                  return qsn.a;
               }
            }

            var8.c = var0;
            var8.b = 1;
            var11 = hf.e(var0, var8);
            if (var11 == var7) {
               return var7;
            }

            var10 = (bhl)var11;
            var6 = var10.a;
            var4 = var6.size();
            var3 = 0;
            var2 = 0;
         }

         ((bhw)var6.get(var2)).b();
         ++var2;
      }
   }

   public static final Object b(bij var0, boolean var1, int var2, que var3) {
      int var4;
      age var11;
      label65: {
         if (var3 instanceof age) {
            age var7 = (age)var3;
            var4 = var7.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var7.c = var4 + Integer.MIN_VALUE;
               var11 = var7;
               break label65;
            }
         }

         var11 = new age(var3);
      }

      Object var12 = var11.b;
      qul var9 = qul.a;
      int var5;
      boolean var6;
      bhl var8;
      List var13;
      Object var14;
      switch(var11.c) {
      case 0:
         pwm.bs(var12);
         var11.e = var0;
         var11.d = var2;
         var11.a = var1;
         var11.c = 1;
         var14 = var0.p(var2, var11);
         var6 = var1;
         if (var14 == var9) {
            return var9;
         }

         var8 = (bhl)var14;
         var13 = var8.a;
         var5 = var13.size();
         var4 = 0;
         break;
      case 1:
         var6 = var11.a;
         var2 = var11.d;
         var0 = var11.e;
         pwm.bs(var12);
         var8 = (bhl)var12;
         var13 = var8.a;
         var5 = var13.size();
         var4 = 0;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      while(var4 < var5) {
         bhw var10 = (bhw)var13.get(var4);
         if (var6) {
            var10.getClass();
            if (!var10.c()) {
               if (!var10.h) {
                  if (var10.d) {
                     var1 = true;
                  } else {
                     var1 = false;
                  }
               } else {
                  var1 = false;
               }
            } else {
               var1 = false;
            }
         } else {
            var1 = iy.l(var10);
         }

         if (!var1) {
            var11.e = var0;
            var11.d = var2;
            var11.a = var6;
            var11.c = 1;
            var14 = var0.p(var2, var11);
            var6 = var6;
            if (var14 == var9) {
               return var9;
            }

            var8 = (bhl)var14;
            var13 = var8.a;
            var5 = var13.size();
            var4 = 0;
         } else {
            ++var4;
         }
      }

      return var8.a.get(0);
   }

   public static final Object c(bij param0, int param1, que param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static Object d(bij var0, que var1, int var2) {
      boolean var3 = true;
      if (1 != (var2 & 1)) {
         var3 = false;
      }

      return b(var0, var3, 2, var1);
   }

   // $FF: synthetic method
   public static Object e(bij var0, que var1) {
      return c(var0, 2, var1);
   }
}
