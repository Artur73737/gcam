import java.util.concurrent.atomic.AtomicInteger;

@qus(
   b = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2",
   c = "Combine.kt",
   d = "invokeSuspend",
   e = {57, 79, 82}
)
public final class rgy extends quw implements qvx {
   Object a;
   Object b;
   int c;
   int d;
   int e;
   final ree[] f;
   final qvi g;
   final qvy h;
   final ref i;
   private Object j;

   public rgy(ree[] var1, qvi var2, qvy var3, ref var4, que var5) {
      super(2, var5);
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   public final Object b(Object var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      rgy var7;
      Object var8;
      Object var9;
      Object var11;
      ref var12;
      qul var13;
      Object[] var15;
      Object[] var16;
      qti var20;
      byte[] var21;
      Object var22;
      qti var23;
      qvy var24;
      qul var6 = qul.a;
      Object[] var10;
      label89:
      switch(this.e) {
      case 0:
         pwm.bs(var1);
         qzv var17 = (qzv)this.j;
         var3 = this.f.length;
         if (var3 == 0) {
            return qsn.a;
         }

         Object[] var19 = new Object[var3];
         pwm.bl(var19, rhd.b);
         var9 = quy.B(var3, 0, 6);
         AtomicInteger var25 = new AtomicInteger(var3);
         var2 = 0;

         for(var13 = var6; var2 < var3; ++var2) {
            qwo.o(var17, (qui)null, 0, new rgx(this.f, var2, var25, (rdb)var9, (que)null), 3);
         }

         var21 = new byte[var3];
         var7 = this;
         byte var14 = 0;
         var15 = var19;
         var8 = var21;
         var2 = var3;
         var3 = var14;
         break;
      case 1:
         var3 = this.d;
         var2 = this.c;
         var8 = this.b;
         var9 = this.a;
         var16 = (Object[])this.j;
         pwm.bs(var1);
         var11 = ((rdf)var1).b;
         var13 = var6;
         var20 = (qti)rdf.a(var11);
         if (var20 == null) {
            var22 = qsn.a;
            return var22;
         }

         var4 = var2;

         while(true) {
            var5 = var20.a;
            var11 = var16[var5];
            var16[var5] = var20.b;
            var2 = var4;
            if (var11 == rhd.b) {
               var2 = var4 - 1;
            }

            var21 = (byte[])var8;
            if (var21[var5] != var3) {
               var21[var5] = (byte)var3;
               var23 = (qti)rdf.a(((rdb)var9).d());
               var4 = var2;
               var20 = var23;
               if (var23 != null) {
                  continue;
               }
            }

            if (var2 == 0) {
               var22 = this.g.a();
               pwm.bn(var16, (Object[])var22, 0, 0, 0, 14);
               var24 = this.h;
               var12 = this.i;
               this.j = var16;
               this.a = var9;
               this.b = var8;
               this.c = 0;
               this.d = var3;
               this.e = 3;
               if (var24.a(var12, var22, this) == var6) {
                  return var6;
               }
            }

            var7 = this;
            var15 = var16;
            break label89;
         }
      case 2:
         var3 = this.d;
         var2 = this.c;
         var8 = this.b;
         var9 = this.a;
         var10 = (Object[])this.j;
         pwm.bs(var1);
         var7 = this;
         var13 = var6;
         var15 = var10;
         break;
      default:
         var3 = this.d;
         var2 = this.c;
         var8 = this.b;
         var9 = this.a;
         var10 = (Object[])this.j;
         pwm.bs(var1);
         var7 = this;
         var13 = var6;
         var15 = var10;
      }

      while(true) {
         var7.j = var15;
         var7.a = var9;
         var7.b = var8;
         var7.c = var2;
         var3 = (byte)(var3 + 1);
         var7.d = var3;
         var7.e = 1;
         var11 = ((rdb)var9).c(var7);
         var22 = var13;
         if (var11 == var13) {
            break;
         }

         var16 = var15;
         var20 = (qti)rdf.a(var11);
         if (var20 == null) {
            var22 = qsn.a;
            break;
         }

         var4 = var2;

         while(true) {
            var5 = var20.a;
            var11 = var16[var5];
            var16[var5] = var20.b;
            var2 = var4;
            if (var11 == rhd.b) {
               var2 = var4 - 1;
            }

            var21 = (byte[])var8;
            if (var21[var5] != var3) {
               var21[var5] = (byte)var3;
               var23 = (qti)rdf.a(((rdb)var9).d());
               var4 = var2;
               var20 = var23;
               if (var23 != null) {
                  continue;
               }
            }

            if (var2 == 0) {
               var22 = var7.g.a();
               pwm.bn(var16, (Object[])var22, 0, 0, 0, 14);
               var24 = var7.h;
               var12 = var7.i;
               var7.j = var16;
               var7.a = var9;
               var7.b = var8;
               var7.c = 0;
               var7.d = var3;
               var7.e = 3;
               if (var24.a(var12, var22, var7) == var13) {
                  return var13;
               }
            }

            var7 = var7;
            var15 = var16;
            break;
         }
      }

      return var22;
   }

   public final que c(Object var1, que var2) {
      rgy var3 = new rgy(this.f, this.g, this.h, this.i, var2);
      var3.j = var1;
      return var3;
   }
}
