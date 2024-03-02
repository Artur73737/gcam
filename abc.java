import java.util.ArrayList;
import java.util.List;

@qus(
   b = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1",
   c = "AndroidOverscroll.kt",
   d = "invokeSuspend",
   e = {317, 321}
)
final class abc extends quv implements qvx {
   int a;
   final abe b;
   private Object c;

   public abc(abe var1, que var2) {
      super(var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var8 = qul.a;
      int var2;
      byte var3;
      int var4;
      bij var5;
      bhw var6;
      Object var7;
      ArrayList var9;
      abe var10;
      abc var12;
      List var13;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var5 = (bij)this.c;
         this.c = var5;
         this.a = 1;
         var1 = ahb.d(var5, this, 2);
         if (var1 == var8) {
            return var8;
         }

         var6 = (bhw)var1;
         var10 = this.b;
         var10.l = bhv.a(var6.a);
         var10.a = bci.i(var6.c);
         var12 = this;
         this.c = var5;
         this.a = 2;
         var7 = hf.e(var5, this);
         if (var7 == var8) {
            return var8;
         }

         var13 = ((bhl)var7).a;
         var9 = new ArrayList(var13.size());
         var4 = var13.size();
         var3 = 0;
         var2 = 0;
         break;
      case 1:
         var5 = (bij)this.c;
         pwm.bs(var1);
         var6 = (bhw)var1;
         var10 = this.b;
         var10.l = bhv.a(var6.a);
         var10.a = bci.i(var6.c);
         var12 = this;
         this.c = var5;
         this.a = 2;
         var7 = hf.e(var5, this);
         if (var7 == var8) {
            return var8;
         }

         var13 = ((bhl)var7).a;
         var9 = new ArrayList(var13.size());
         var4 = var13.size();
         var3 = 0;
         var2 = 0;
         break;
      default:
         var5 = (bij)this.c;
         pwm.bs(var1);
         var12 = this;
         var13 = ((bhl)var1).a;
         var9 = new ArrayList(var13.size());
         var4 = var13.size();
         var3 = 0;
         var2 = 0;
      }

      while(true) {
         while(var2 >= var4) {
            abe var14 = var12.b;
            var4 = var9.size();
            var2 = var3;

            while(true) {
               bhw var11;
               bhw var15;
               if (var2 >= var4) {
                  var1 = null;
                  var15 = (bhw)var1;
                  var11 = var15;
                  if (var15 == null) {
                     var11 = (bhw)pwm.aw(var9);
                  }

                  if (var11 != null) {
                     var14 = var12.b;
                     var14.l = bhv.a(var11.a);
                     var14.a = bci.i(var11.c);
                  }

                  if (!(var9.isEmpty() ^ true)) {
                     var12.b.l = null;
                     return qsn.a;
                  }
                  break;
               }

               var1 = var9.get(var2);
               if (bhv.c(((bhw)var1).a, var14.l)) {
                  var15 = (bhw)var1;
                  var11 = var15;
                  if (var15 == null) {
                     var11 = (bhw)pwm.aw(var9);
                  }

                  if (var11 != null) {
                     var14 = var12.b;
                     var14.l = bhv.a(var11.a);
                     var14.a = bci.i(var11.c);
                  }

                  if (!(var9.isEmpty() ^ true)) {
                     var12.b.l = null;
                     return qsn.a;
                  }
                  break;
               }

               ++var2;
            }

            var12.c = var5;
            var12.a = 2;
            var7 = hf.e(var5, var12);
            if (var7 == var8) {
               return var8;
            }

            var13 = ((bhl)var7).a;
            var9 = new ArrayList(var13.size());
            var4 = var13.size();
            var3 = 0;
            var2 = 0;
         }

         var1 = var13.get(var2);
         if (((bhw)var1).d) {
            var9.add(var1);
         }

         ++var2;
      }
   }

   public final que c(Object var1, que var2) {
      abc var3 = new abc(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
