import java.util.List;

final class vg implements qrz {
   private final vj a;
   private final vh b;
   private final int c;

   public vg(vj var1, vh var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Object get() {
      Object var1;
      vh var2;
      List var3;
      bwc var12;
      Object var16;
      wu var17;
      ws var26;
      switch(this.c) {
      case 0:
         var2 = this.b;
         var1 = var2.l.a;
         sz var11 = (sz)var2.b.get();
         fwf var9 = (fwf)this.a.r.get();
         wk var24 = (wk)this.b.g.get();
         wk var6 = (wk)this.b.g.get();
         var26 = (ws)this.b.h.get();
         jmt var21 = (jmt)this.b.j.get();
         wu var28 = (wu)this.b.a.get();
         sx var7 = (sx)this.b.i.get();
         ns var8 = (ns)this.b.c.get();
         wn var10 = (wn)this.b.e.get();
         return new wa((qr)var1, var11, var9, var24, var6, var26, var21, var28, var7, var8, var10);
      case 1:
         var2 = this.b;
         var1 = var2.l.a;
         var17 = (wu)var2.a.get();
         var17.getClass();
         return var17.a(((qr)var1).a);
      case 2:
         var17 = (wu)this.a.n.get();
         li var14 = (li)this.a.q.get();
         var17.getClass();
         var14.getClass();
         return var17.c;
      case 3:
         var12 = (bwc)this.a.b.get();
         vh var18 = this.b;
         var16 = var18.l.a;
         ns var5 = (ns)var18.c.get();
         qzv var4 = (qzv)this.b.d.get();
         var3 = (List)this.b.f.get();
         return new wk(var12, (qr)var16, var5, var4, var3);
      case 4:
         return new ns();
      case 5:
         var12 = (bwc)this.a.b.get();
         var12.getClass();
         var16 = var12.d;
         qzu var13 = new qzu("CXCP-Graph");
         return qzy.h(((qua)var16).plus(var13));
      case 6:
         var2 = this.b;
         var1 = var2.l.a;
         wn var15 = (wn)var2.e.get();
         var15.getClass();
         var3 = pwm.ao(new rs[]{var15});
         var3.add(var15);
         var3.addAll(((qr)var1).i);
         return var3;
      case 7:
         return new wn();
      case 8:
         return new ws((sz)this.b.b.get(), (qr)this.b.l.a);
      case 9:
         return new jmt((ws)this.b.h.get(), (sx)this.b.i.get(), (rf)this.a.p.get());
      default:
         var2 = this.b;
         var1 = var2.l.a;
         wu var25 = (wu)var2.a.get();
         li var29 = (li)this.a.q.get();
         wk var22 = (wk)this.b.g.get();
         var26 = (ws)this.b.h.get();
         var25.getClass();
         var29.getClass();
         var22.getClass();
         var26.getClass();
         Object var27 = var25.b;
         ve var30 = new ve(var1, var22, var26);
         bnc var19 = (bnc)var27;
         var19.b = var30;
         pwm.bA(var19.b, ve.class);
         var16 = var19.a;
         ve var20 = (ve)var19.b;
         sx var23 = (sx)((qrz)(new bng((vj)var16, var20)).b).get();
         var23.getClass();
         return var23;
      }
   }
}
