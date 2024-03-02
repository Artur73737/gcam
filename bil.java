import java.util.ArrayList;
import java.util.List;

public final class bil extends bba implements bxr, bni {
   public qvx a;
   public bhl b;
   public final axf c;
   public long d;
   private rbd e;
   private final axf f;
   private bhl g;

   public bil(qvx var1) {
      this.a = var1;
      this.b = big.a;
      this.c = new axf(new bij[16]);
      this.f = new axf(new bij[16]);
      this.d = 0L;
   }

   private final void w(bhl var1, int var2) {
      axf var6 = this.c;
      synchronized(var6){}

      try {
         axf var7 = this.f;
         axf var8 = this.c;
         var7.q(var7.b, var8);
      } finally {
         ;
      }

      label655: {
         Throwable var10000;
         int var3;
         int var4;
         boolean var10001;
         Object[] var82;
         label654:
         switch(var2 - 1) {
         case 0:
         case 2:
            int var5;
            try {
               var6 = this.f;
               var5 = var6.b;
            } catch (Throwable var76) {
               var10000 = var76;
               var10001 = false;
               break;
            }

            if (var5 <= 0) {
               break label655;
            }

            try {
               var82 = var6.a;
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break;
            }

            var3 = 0;

            while(true) {
               try {
                  ((bij)var82[var3]).q(var1, var2);
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label654;
               }

               var4 = var3 + 1;
               var3 = var4;
               if (var4 >= var5) {
                  break label655;
               }
            }
         case 1:
         default:
            label659: {
               try {
                  var6 = this.f;
               } catch (Throwable var80) {
                  var10000 = var80;
                  var10001 = false;
                  break label659;
               }

               try {
                  var3 = var6.b;
               } catch (Throwable var79) {
                  var10000 = var79;
                  var10001 = false;
                  break label659;
               }

               if (var3 <= 0) {
                  break label655;
               }

               --var3;

               try {
                  var82 = var6.a;
               } catch (Throwable var78) {
                  var10000 = var78;
                  var10001 = false;
                  break label659;
               }

               while(true) {
                  try {
                     ((bij)var82[var3]).q(var1, var2);
                  } catch (Throwable var77) {
                     var10000 = var77;
                     var10001 = false;
                     break;
                  }

                  var4 = var3 - 1;
                  var3 = var4;
                  if (var4 < 0) {
                     break label655;
                  }
               }
            }
         }

         Throwable var81 = var10000;
         this.f.g();
         throw var81;
      }

      this.f.g();
   }

   public final float a() {
      return jj.h(this).i.a();
   }

   public final float b() {
      return jj.h(this).i.b();
   }

   public final void eA() {
      this.m();
   }

   public final void eB() {
      this.m();
   }

   public final void eC(bhl var1, int var2, long var3) {
      this.d = var3;
      if (var2 == 1) {
         this.b = var1;
      }

      if (this.e == null) {
         this.e = qwo.o(this.o(), (qui)null, 4, new bik(this, (que)null), 1);
      }

      this.w(var1, var2);
      List var6 = var1.a;
      int var5 = var6.size();
      var2 = 0;

      while(true) {
         if (var2 >= var5) {
            var1 = null;
            break;
         }

         if (!iy.n((bhw)var6.get(var2))) {
            break;
         }

         ++var2;
      }

      this.g = var1;
   }

   // $FF: synthetic method
   public final float eF(float var1) {
      return car.P(this, var1);
   }

   // $FF: synthetic method
   public final float eG(int var1) {
      return car.Q(this, var1);
   }

   // $FF: synthetic method
   public final float eH(long var1) {
      return car.R(this, var1);
   }

   // $FF: synthetic method
   public final float eI(float var1) {
      return car.S(this, var1);
   }

   // $FF: synthetic method
   public final int eJ(float var1) {
      return car.T(this, var1);
   }

   // $FF: synthetic method
   public final long eK(long var1) {
      return car.U(this, var1);
   }

   public final void ey() {
      bhl var12 = this.g;
      if (var12 != null) {
         List var13 = var12.a;
         int var4 = var13.size();
         byte var3 = 0;

         for(int var2 = 0; var2 < var4; ++var2) {
            if (((bhw)var13.get(var2)).d) {
               var13 = var12.a;
               ArrayList var14 = new ArrayList(var13.size());
               var4 = var13.size();

               for(var2 = var3; var2 < var4; ++var2) {
                  bhw var15 = (bhw)var13.get(var2);
                  long var10 = var15.a;
                  long var6 = var15.c;
                  long var8 = var15.b;
                  float var1 = var15.e;
                  boolean var5 = var15.d;
                  var14.add(new bhw(var10, var8, var6, false, var1, var8, var6, var5, var5, 1, bci.a));
               }

               var12 = new bhl(var14);
               this.b = var12;
               this.w(var12, 1);
               this.w(var12, 2);
               this.w(var12, 3);
               this.g = null;
               break;
            }
         }

      }
   }

   public final void ez() {
      this.m();
   }

   // $FF: synthetic method
   public final void i() {
   }

   public final bqa j() {
      return jj.h(this).k;
   }

   // $FF: synthetic method
   public final void k() {
   }

   public final Object l(qvx var1, que var2) {
      qza var5 = new qza(quy.h(var2), 1);
      var5.r();
      bij var3 = new bij(this, var5);
      axf var8 = this.c;
      synchronized(var8){}

      try {
         this.c.p(var3);
         quk var4 = new quk(quy.h(quy.g(var1, var3, var3)), qul.a);
         var4.gP(qsn.a);
      } finally {
         ;
      }

      var5.s(new arh(var3, 20));
      return var5.c();
   }

   public final void m() {
      rbd var1 = this.e;
      if (var1 != null) {
         var1.s(new bic());
         this.e = null;
      }

   }
}
