import androidx.wear.ambient.AmbientMode$AmbientController;

public final class adb extends qwq implements qvt {
   final Object a;
   final Object b;
   final Object c;
   private final int d;

   public adb(ais var1, ora var2, bjw var3, int var4) {
      super(1);
      this.d = var4;
      this.b = var1;
      this.a = var2;
      this.c = var3;
   }

   public adb(aiy var1, bke var2, bjw var3, int var4) {
      super(1);
      this.d = var4;
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public adb(Object var1, Object var2, Object var3, int var4) {
      super(1);
      this.d = var4;
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public adb(Object var1, Object var2, Object var3, int var4, byte[] var5) {
      super(1);
      this.d = var4;
      this.c = var1;
      this.b = var2;
      this.a = var3;
   }

   public adb(Object var1, Object var2, Object var3, int var4, char[] var5) {
      super(1);
      this.d = var4;
      this.b = var1;
      this.c = var2;
      this.a = var3;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var5 = this.d;
      int var4 = 0;
      Object var11;
      Object var26;
      switch(var5) {
      case 0:
         float var3 = ((Number)var1).floatValue();
         float var2;
         if (!((ade)this.a).c) {
            var2 = -1.0F;
         } else {
            var2 = 1.0F;
         }

         var2 *= ((afj)this.b).a(var2 * var3);
         if (Math.abs(var2) < Math.abs(var3)) {
            var1 = this.c;
            StringBuilder var28 = new StringBuilder();
            var28.append("Scroll animation cancelled because scroll was not consumed (");
            var28.append(var2);
            var28.append(" < ");
            var28.append(var3);
            var28.append(')');
            qzy.y((rbd)var1, var28.toString());
         }

         return qsn.a;
      case 1:
         bdo var22 = (bdo)var1;
         var22.getClass();
         var22.c = yd.a((avi)this.a);
         var22.a = yd.b((avi)this.b);
         var22.b = yd.b((avi)this.b);
         var22.i = ((bdx)((avi)this.c).a()).b;
         return qsn.a;
      case 2:
         ((bkd)var1).getClass();
         long var9 = ((bxw)((ain)this.a).a.eo(this.b)).b;
         if (((ain)this.a).b) {
            var1 = this.c;
            var4 = bxw.a(var9);
            var5 = bxw.b(var9);
            bkd.f((bke)var1, var4, var5);
         } else {
            var1 = this.c;
            var5 = bxw.a(var9);
            var4 = bxw.b(var9);
            bkd.g((bke)var1, var5, var4, (qvt)null, 12);
         }

         return qsn.a;
      case 3:
         ((bkd)var1).getClass();
         aiy var21 = (aiy)this.a;
         if (var21.e) {
            var11 = this.c;
            var4 = ((bjw)this.b).eJ(var21.b);
            var5 = ((bjw)this.b).eJ(((aiy)this.a).a);
            bkd.e((bke)var11, var4, var5);
         } else {
            var11 = this.c;
            var5 = ((bjw)this.b).eJ(var21.b);
            var4 = ((bjw)this.b).eJ(((aiy)this.a).a);
            bkd.b((bke)var11, var5, var4);
         }

         return qsn.a;
      case 4:
         ((bkd)var1).getClass();
         var11 = this.c;
         var1 = this.b;
         var4 = ((bjw)var1).eJ(((aiq)this.a).a.a(((bjw)var1).j()));
         var5 = ((bjw)this.b).eJ(((aiq)this.a).a.a);
         bkd.b((bke)var11, var4, var5);
         return qsn.a;
      case 5:
         ((bkd)var1).getClass();
         var26 = this.b;
         var1 = this.a;
         bxy var25 = ((bjw)this.c).j();
         var25.getClass();
         ora var16 = (ora)var1;

         for(var5 = var16.c; var4 < var5; ++var4) {
            ais var14 = (ais)var26;
            bke var15 = var14.e[var4];
            var15.getClass();
            Object var13 = var16.d;
            var1 = ((bjs)var14.d.get(var4)).c();
            if (var1 instanceof ait) {
               ait var19 = (ait)var1;
            }

            int var6 = var16.b;
            ail var17 = var14.c;
            int var7 = var14.a(var15);
            bxy var20;
            if (var14.g == 1) {
               var20 = bxy.a;
            } else {
               var20 = var25;
            }

            var6 = var17.a(var6 - var7, var20);
            if (var14.g == 1) {
               bkd.b(var15, ((int[])var13)[var4], var6);
            } else {
               bkd.b(var15, var6, ((int[])var13)[var4]);
            }
         }

         return qsn.a;
      case 6:
         var4 = ((Number)var1).intValue();
         aji var24 = (aji)((qvi)this.b).a();
         if (var4 >= 0 && var4 < var24.b()) {
            qwo.o((qzv)this.c, (qui)null, 0, new alb((AmbientMode$AmbientController)this.a, var4, (que)null), 3);
            return true;
         }

         StringBuilder var18 = new StringBuilder();
         var18.append("Can't scroll to index ");
         var18.append(var4);
         var18.append(", it is out of bounds [0, ");
         var18.append(var24.b());
         var18.append(')');
         throw new IllegalArgumentException(var18.toString());
      case 7:
         ((nd)var1).getClass();
         kil var12 = new kil((att)this.a, 1);
         var11 = this.c;
         var1 = this.b;
         ((cmk)var11).d((cmc)var1, var12);
         return new aaj(this.c, var12, 4);
      default:
         ((nd)var1).getClass();
         boolean var8 = ((azb)this.b).b.containsKey(this.c);
         var1 = this.c;
         if (var8 ^ true) {
            ((azb)this.b).a.remove(var1);
            ((azb)this.b).b.put(this.c, this.a);
            var11 = this.a;
            var26 = this.b;
            var1 = this.c;
            azb var27 = (azb)var26;
            return new aza((ayz)var11, var27, var1);
         } else {
            IllegalArgumentException var23 = new IllegalArgumentException(c.aF(var1, "Key ", " was used multiple times "));
            throw var23;
         }
      }
   }
}
