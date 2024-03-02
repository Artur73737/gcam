public final class wv implements ref {
   final Object a;
   private final int b;

   public wv(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, que var2) {
      switch(this.b) {
      case 0:
         iy var12 = (iy)var1;
         if (var12 instanceof rb) {
            ((fwf)this.a).i(var12, (String)null);
         } else if (var12 instanceof ra) {
            Object var13 = this.a;
            String var9 = ((ra)var12).a;
            ((fwf)var13).i(var12, var9);
         }

         return qsn.a;
      case 1:
         kh var6 = (kh)var1;
         Object var11 = this.a;
         var1 = ((vd)var11).c;
         synchronized(var1){}

         try {
            if (var6 instanceof tp) {
               un var5 = new un((sc)((tp)var6).a);
               ((vd)var11).e = var5;
               tp var14 = new tp(var5);
               ((vd)var11).c(var14);
            } else {
               ((vd)var11).c(var6);
            }
         } finally {
            ;
         }

         return qsn.a;
      case 2:
         boolean var4 = (Boolean)var1;
         ((att)this.a).b(var4);
         return qsn.a;
      case 3:
         float var3 = ((Number)var1).floatValue();
         ((bpt)this.a).b(var3);
         return qsn.a;
      default:
         cxk var10 = (cxk)var1;
         ((cew)this.a).accept(var10);
         return qsn.a;
      }
   }
}
