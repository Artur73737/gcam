import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.view.View;
import java.util.List;

public final class bpf extends qwq implements qvx {
   public static final bpf a = new bpf(0);
   public static final bpf b = new bpf(1);
   public static final bpf c = new bpf(2);
   public static final bpf d = new bpf(3);
   public static final bpf e = new bpf(4);
   public static final bpf f = new bpf(5);
   public static final bpf g = new bpf(6);
   public static final bpf h = new bpf(7);
   public static final bpf i = new bpf(8);
   public static final bpf j = new bpf(9);
   public static final bpf k = new bpf(10);
   public static final bpf l = new bpf(11);
   public static final bpf m = new bpf(12);
   public static final bpf n = new bpf(13);
   public static final bpf o = new bpf(14);
   public static final bpf p = new bpf(15);
   public static final bpf q = new bpf(16);
   public static final bpf r = new bpf(17);
   public static final bpf s = new bpf(18);
   public static final bpf t = new bpf(19);
   public static final bpf u = new bpf(20);
   private final int v;

   public bpf(int var1) {
      super(2);
      this.v = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var4 = this.v;
      boolean var5 = false;
      qui var8;
      qug var9;
      List var14;
      Matrix var15;
      String var16;
      asm var19;
      List var26;
      switch(var4) {
      case 0:
         return c.Q(var1, var2);
      case 1:
         bro var31 = (bro)var1;
         bro var17 = (bro)var2;
         var31.getClass();
         float var3 = ((Number)var31.e().b(brp.n, bor.b)).floatValue();
         var17.getClass();
         return Float.compare(var3, ((Number)var17.e().b(brp.n, bor.b)).floatValue());
      case 2:
         eze var30 = (eze)var1;
         var15 = (Matrix)var2;
         var30.getClass();
         var15.getClass();
         ((RenderNode)var30.a).getMatrix(var15);
         return qsn.a;
      case 3:
         View var29 = (View)var1;
         var15 = (Matrix)var2;
         var29.getClass();
         var15.getClass();
         var15.set(var29.getMatrix());
         return qsn.a;
      case 4:
         List var22 = (List)var1;
         var26 = (List)var2;
         var26.getClass();
         if (var22 != null) {
            var14 = pwm.aE(var22);
            var14.addAll(var26);
            return var14;
         }

         return var26;
      case 5:
         qsn var28 = (qsn)var1;
         ((qsn)var2).getClass();
         return var28;
      case 6:
         var16 = (String)var1;
         ((String)var2).getClass();
         throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
      case 7:
         bri var27 = (bri)var1;
         var4 = ((bri)var2).a;
         return var27;
      case 8:
         var16 = (String)var1;
         ((String)var2).getClass();
         return var16;
      case 9:
         var26 = (List)var1;
         var14 = (List)var2;
         var14.getClass();
         if (var26 != null) {
            var26 = pwm.aE(var26);
            var26.addAll(var14);
            return var26;
         }

         return var14;
      case 10:
         Float var25 = (Float)var1;
         ((Number)var2).floatValue();
         return var25;
      case 11:
         Boolean var24 = (Boolean)var1;
         (Boolean)var2;
         return var24;
      case 12:
         brc var20 = (brc)var1;
         brc var13 = (brc)var2;
         var13.getClass();
         qsa var23;
         if (var20 != null) {
            var23 = var20.a;
         } else {
            var23 = var13.a;
         }

         return new brc(var23);
      case 13:
         var19 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var19.G()) {
            var19.q();
         } else {
            apw.c((bbb)null, 0L, 0L, 0L, 0L, 0, false, 0, (qvt)null, (bss)null, var19, 6, 0);
         }

         return qsn.a;
      case 14:
         var19 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var19.G()) {
            var19.q();
         } else {
            kfq.S((knt)null, var19, 0);
         }

         return qsn.a;
      case 15:
         var19 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var19.G()) {
            var19.q();
         } else {
            qvx var12 = knc.a;
            jbc.aE(knc.a, var19, 54);
         }

         return qsn.a;
      case 16:
         ksn var18 = (ksn)var1;
         ksn var10 = (ksn)var2;
         var18.getClass();
         var10.getClass();
         return new aoc();
      case 17:
         var16 = (String)var1;
         var9 = (qug)var2;
         var16.getClass();
         var9.getClass();
         if (var16.length() == 0) {
            var16 = var9.toString();
         } else {
            StringBuilder var21 = new StringBuilder();
            var21.append(var16);
            var21.append(", ");
            var21.append(var9);
            var16 = var21.toString();
         }

         return var16;
      case 18:
         var8 = (qui)var1;
         var9 = (qug)var2;
         var8.getClass();
         var9.getClass();
         qui var7 = var8.minusKey(var9.getKey());
         var1 = var9;
         if (var7 != quj.a) {
            quf var11 = (quf)var7.get(quf.k);
            if (var11 == null) {
               var1 = new qud(var7, var9);
            } else {
               var7 = var7.minusKey(quf.k);
               if (var7 == quj.a) {
                  var1 = new qud(var9, var11);
               } else {
                  var1 = new qud(new qud(var7, var9), var11);
               }
            }
         }

         return var1;
      case 19:
         var8 = (qui)var1;
         var9 = (qug)var2;
         var8.getClass();
         var9.getClass();
         if (var9 instanceof qzm) {
            var8 = var8.plus(((qzm)var9).a());
         } else {
            var8 = var8.plus(var9);
         }

         return var8;
      default:
         boolean var6 = (Boolean)var1;
         qug var32 = (qug)var2;
         var32.getClass();
         if (!var6) {
            if (var32 instanceof qzm) {
               var5 = true;
            }
         } else {
            var5 = true;
         }

         return var5;
      }
   }
}
