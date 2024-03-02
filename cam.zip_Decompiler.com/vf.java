public final class vf implements qrz {
   private final vj a;
   private final int b;
   private final bng c;

   public vf(vj var1, bng var2, int var3) {
      this.a = var1;
      this.c = var2;
      this.b = var3;
   }

   public final Object get() {
      bwc var1;
      Object var2;
      ve var3;
      Object var4;
      Object var9;
      bwc var10;
      fwf var13;
      Object var16;
      ws var17;
      switch(this.b) {
      case 0:
         qzv var14 = (qzv)((qrz)this.c.c).get();
         bng var19 = this.c;
         var3 = (ve)var19.a;
         var9 = var3.a;
         var16 = var3.b;
         tt var22 = (tt)((qrz)var19.d).get();
         bng var7 = this.c;
         bwc var6 = (bwc)((vj)var7.e).b.get();
         ve var8 = (ve)var7.a;
         Object var5 = var8.a;
         Object var26 = var8.c;
         lmk var24 = (lmk)((vj)var7.e).i.get();
         ws var27 = (ws)var26;
         ve var23 = new ve(var6, (qr)var5, var27, var24);
         nwu var25 = (nwu)this.a.l.get();
         rf var28 = (rf)this.a.p.get();
         nl var20 = (nl)this.a.f.get();
         wk var21 = (wk)var16;
         return new sx(var14, (qr)var9, var21, var22, var23, var25, var28, var20);
      case 1:
         var1 = (bwc)this.a.b.get();
         var1.getClass();
         var2 = var1.d;
         qzu var15 = new qzu("CXCP-Camera2Controller");
         return qzy.h(((qua)var2).plus(var15));
      case 2:
         bng var12 = this.c;
         var9 = var12.g;
         var16 = var12.f;
         tt var11;
         if (c.E(((qr)((ve)var12.a).a).f, qt.c)) {
            var11 = (tt)((qrz)var16).get();
         } else {
            var11 = (tt)((qrz)var9).get();
         }

         return var11;
      case 3:
         return new sk((bwc)this.a.b.get(), 1, (byte[])null);
      case 4:
         var10 = (bwc)this.a.b.get();
         var9 = ((ve)this.c.a).a;
         return new sk(var10, 2, (char[])null);
      case 5:
         return new sk((bwc)this.a.b.get(), 0);
      case 6:
         var10 = (bwc)this.a.b.get();
         var3 = (ve)this.c.a;
         var9 = var3.c;
         var4 = var3.a;
         var13 = (fwf)this.a.g.get();
         qr var18 = (qr)var4;
         return new sl(var10, (ws)var9, var18, var13, 0);
      case 7:
         var1 = (bwc)this.a.b.get();
         var3 = (ve)this.c.a;
         var2 = var3.a;
         var4 = var3.c;
         var13 = (fwf)this.a.g.get();
         var17 = (ws)var4;
         return new sn(var1, (qr)var2, var17, var13);
      default:
         var1 = (bwc)this.a.b.get();
         var3 = (ve)this.c.a;
         var2 = var3.a;
         var4 = var3.c;
         var13 = (fwf)this.a.g.get();
         var17 = (ws)var4;
         return new sl(var1, (qr)var2, var17, var13, 1);
      }
   }
}
