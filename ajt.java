import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Iterator;
import java.util.Map;

public final class ajt extends qwq implements qvx {
   public static final ajt a = new ajt(0);
   public static final ajt b = new ajt(1);
   public static final ajt c = new ajt(2);
   public static final ajt d = new ajt(3);
   public static final ajt e = new ajt(4);
   public static final ajt f = new ajt(5);
   public static final ajt g = new ajt(6);
   public static final ajt h = new ajt(7);
   public static final ajt i = new ajt(8);
   public static final ajt j = new ajt(9);
   public static final ajt k = new ajt(10);
   public static final ajt l = new ajt(12);
   public static final ajt m = new ajt(13);
   public static final ajt n = new ajt(14);
   public static final ajt o = new ajt(15);
   public static final ajt p = new ajt(16);
   public static final ajt q = new ajt(17);
   public static final ajt r = new ajt(18);
   public static final ajt s = new ajt(19);
   public static final ajt t = new ajt(20);
   private final int u;

   public ajt(int var1) {
      super(2);
      this.u = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      float var3;
      bfd var7;
      AmbientMode$AmbientController var19;
      AmbientMode$AmbientController var20;
      switch(this.u) {
      case 0:
         var19 = (AmbientMode$AmbientController)var1;
         ajz var15 = (ajz)var2;
         var19.getClass();
         var15.getClass();
         return pwm.aS(new Integer[]{var15.e(), var15.f()});
      case 1:
         int var5 = ((Number)var1).intValue();
         bxy var23 = (bxy)var2;
         var23.getClass();
         int var4 = bar.a;
         return baq.f.a(var5, var23);
      case 2:
         var20 = (AmbientMode$AmbientController)var1;
         ald var21 = (ald)var2;
         var20.getClass();
         var21.getClass();
         ayy var24 = var21.a();
         if (var24 != null) {
            Iterator var14 = var21.c.iterator();

            while(var14.hasNext()) {
               var24.e(var14.next());
            }
         }

         Map var22 = var21.a.c();
         return var22.isEmpty() ? null : var22;
      case 3:
         return c.Q(var1, var2);
      case 4:
         return c.Q(var1, var2);
      case 5:
         return c.Q(var1, var2);
      case 6:
         var19 = (AmbientMode$AmbientController)var1;
         lmk var13 = (lmk)var2;
         var19.getClass();
         var13.getClass();
         return (anu)((bwc)var13.a).b();
      case 7:
         var19 = (AmbientMode$AmbientController)var1;
         apu var11 = (apu)var2;
         var19.getClass();
         var11.getClass();
         return var11.c();
      case 8:
         ((Number)var1).floatValue();
         ((Number)var2).floatValue();
         return 0.0F;
      case 9:
         return c.Q(var1, var2);
      case 10:
         return c.Q(var1, var2);
      case 11:
         asm var18 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var18.G()) {
            var18.q();
            return qsn.a;
         }

         throw null;
      case 12:
         var20 = (AmbientMode$AmbientController)var1;
         azb var16 = (azb)var2;
         var20.getClass();
         var16.getClass();
         Map var10 = pwm.ag(var16.a);
         Iterator var17 = var16.b.values().iterator();

         while(var17.hasNext()) {
            ((ayz)var17.next()).a(var10);
         }

         if (var10.isEmpty()) {
            return null;
         }

         return var10;
      case 13:
         String var12 = (String)var1;
         baz var9 = (baz)var2;
         var12.getClass();
         var9.getClass();
         if (var12.length() == 0) {
            var12 = var9.toString();
         } else {
            StringBuilder var6 = new StringBuilder();
            var6.append(var12);
            var6.append(", ");
            var6.append(var9);
            var12 = var6.toString();
         }

         return var12;
      case 14:
         var7 = (bfd)var1;
         String var8 = (String)var2;
         var7.getClass();
         var8.getClass();
         var7.f(var8);
         return qsn.a;
      case 15:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.f = var3;
         var7.i = true;
         var7.k();
         return qsn.a;
      case 16:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.g(var3);
         return qsn.a;
      case 17:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.h(var3);
         return qsn.a;
      case 18:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.i(var3);
         return qsn.a;
      case 19:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.j(var3);
         return qsn.a;
      default:
         var7 = (bfd)var1;
         var3 = ((Number)var2).floatValue();
         var7.getClass();
         var7.g = var3;
         var7.i = true;
         var7.k();
         return qsn.a;
      }
   }
}
