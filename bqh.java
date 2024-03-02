import android.view.View;

final class bqh implements bqj {
   public static final bqh a = new bqh();

   public bqh() {
   }

   public final auo a(View var1) {
      quj var3 = quj.a;
      var3.get(quf.k);
      qsd var2 = boy.a;
      qui var10;
      if (bod.c()) {
         var10 = bod.d();
      } else {
         var10 = (qui)boy.b.get();
         if (var10 == null) {
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
         }
      }

      qui var7 = var10.plus(var3);
      atr var11 = (atr)var7.get(atr.d);
      Object var5 = null;
      Object var4;
      Object var12;
      bpa var13;
      if (var11 != null) {
         var13 = new bpa(var11, 1);
         var4 = var13.a;
         var12 = ((atn)var4).a;
         synchronized(var12){}

         try {
            ((atn)var4).d = false;
         } finally {
            ;
         }
      } else {
         var13 = null;
      }

      qwz var6 = new qwz();
      bbe var14 = (bbe)var7.get(bbe.a);
      var12 = var14;
      if (var14 == null) {
         var12 = new bpt();
         var6.a = var12;
      }

      if (var13 != null) {
         var4 = var13;
      } else {
         var4 = quj.a;
      }

      qui var15 = var7.plus((qui)var4).plus((qui)var12);
      auo var19 = new auo(var15);
      var19.s();
      qzv var20 = qzy.h(var15);
      cmc var17 = car.c(var1);
      clx var18;
      if (var17 != null) {
         var18 = var17.getLifecycle();
      } else {
         var18 = (clx)var5;
      }

      if (var18 != null) {
         var1.addOnAttachStateChangeListener(new bqm(var1, var19));
         var18.a(new bqp(var20, var13, var19, var6, var1));
         return var19;
      } else {
         StringBuilder var16 = new StringBuilder();
         var16.append("ViewTreeLifecycleOwner not found from ");
         var16.append(var1);
         throw new IllegalStateException("ViewTreeLifecycleOwner not found from ".concat(var1.toString()));
      }
   }
}
