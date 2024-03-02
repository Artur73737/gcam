import java.util.List;

@qus(
   b = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1",
   c = "Scrollable.kt",
   d = "invokeSuspend",
   e = {612}
)
final class aew extends quv implements qvx {
   int a;
   final aey b;
   private Object c;

   public aew(aey var1, que var2) {
      super(var2);
      this.b = var1;
   }

   public final Object b(Object var1) {
      qul var11 = qul.a;
      int var2;
      byte var3;
      int var4;
      bij var7;
      aew var8;
      Object var10;
      List var12;
      bij var14;
      bhl var18;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         var14 = (bij)this.c;
         this.c = var14;
         this.a = 1;
         var10 = afs.a(var14, this);
         var7 = var14;
         var8 = this;
         if (var10 == var11) {
            return var11;
         }

         var18 = (bhl)var10;
         var12 = var18.a;
         var4 = var12.size();
         var3 = 0;
         var2 = 0;
         break;
      default:
         var7 = (bij)this.c;
         pwm.bs(var1);
         var8 = this;
         var18 = (bhl)var1;
         var12 = var18.a;
         var4 = var12.size();
         var3 = 0;
         var2 = 0;
      }

      while(true) {
         while(true) {
            aew var9;
            if (var2 < var4) {
               var14 = var7;
               var9 = var8;
               if (!((bhw)var12.get(var2)).c()) {
                  ++var2;
                  continue;
               }
            } else {
               aey var17 = var8.b;
               var7.j();
               var7.getClass();
               var18.getClass();
               var12 = var18.a;
               bci var15 = bci.i(bci.a);
               var4 = var12.size();

               for(var2 = 0; var2 < var4; ++var2) {
                  bhw var13 = (bhw)var12.get(var2);
                  var15 = bci.i(bci.f(var15.d, var13.j));
               }

               long var5 = bci.g(var15.d, -var7.eI(64.0F));
               agc var16 = var17.a;
               qwo.o(var17.o(), (qui)null, 0, new aev(var16, var5, (que)null), 3);
               List var19 = var18.a;
               var4 = var19.size();
               var2 = var3;

               while(true) {
                  var14 = var7;
                  var9 = var8;
                  if (var2 >= var4) {
                     break;
                  }

                  ((bhw)var19.get(var2)).b();
                  ++var2;
               }
            }

            var9.c = var14;
            var9.a = 1;
            var10 = afs.a(var14, var9);
            var7 = var14;
            var8 = var9;
            if (var10 == var11) {
               return var11;
            }

            var18 = (bhl)var10;
            var12 = var18.a;
            var4 = var12.size();
            var3 = 0;
            var2 = 0;
         }
      }
   }

   public final que c(Object var1, que var2) {
      aew var3 = new aew(this.b, var2);
      var3.c = var1;
      return var3;
   }
}
