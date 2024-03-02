import android.view.View;
import androidx.window.sidecar.SidecarDisplayFeature;
import java.util.List;

public final class bwb extends qwq implements qvt {
   public static final bwb a = new bwb(0);
   public static final bwb b = new bwb(2);
   public static final bwb c = new bwb(3);
   public static final bwb d = new bwb(4);
   public static final bwb e = new bwb(5);
   public static final bwb f = new bwb(6);
   public static final bwb g = new bwb(7);
   public static final bwb h = new bwb(8);
   public static final bwb i = new bwb(9);
   public static final bwb j = new bwb(10);
   public static final bwb k = new bwb(11);
   public static final bwb l = new bwb(12);
   public static final bwb m = new bwb(13);
   public static final bwb n = new bwb(14);
   public static final bwb o = new bwb(15);
   public static final bwb p = new bwb(16);
   public static final bwb q = new bwb(17);
   public static final bwb r = new bwb(18);
   public static final bwb s = new bwb(19);
   public static final bwb t = new bwb(20);
   private final int u;

   public bwb(int var1) {
      super(1);
      this.u = var1;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var2 = this.u;
      boolean var3 = false;
      boolean var6 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var7 = false;
      SidecarDisplayFeature var14;
      View var16;
      switch(var2) {
      case 0:
         ((List)var1).getClass();
         return qsn.a;
      case 1:
         bva var17 = (bva)var1;
         var17.getClass();
         StringBuilder var8 = new StringBuilder();
         var8.append('\'');
         var8.append(var17.a());
         var8.append("' ");
         var8.append(var17.c());
         return var8.toString();
      case 2:
         var2 = ((bvv)var1).a;
         return qsn.a;
      case 3:
         ((cnp)var1).getClass();
         return new cnd();
      case 4:
         return c.D((View)var1);
      case 5:
         var16 = (View)var1;
         var16.getClass();
         var1 = var16.getTag(2131428421);
         if (var1 instanceof cmc) {
            return (cmc)var1;
         }

         return null;
      case 6:
         return c.D((View)var1);
      case 7:
         var16 = (View)var1;
         var16.getClass();
         var1 = var16.getTag(2131428424);
         if (var1 instanceof cnm) {
            return (cnm)var1;
         }

         return null;
      case 8:
         return c.D((View)var1);
      case 9:
         var16 = (View)var1;
         var16.getClass();
         var1 = var16.getTag(2131428423);
         if (var1 instanceof cry) {
            return (cry)var1;
         }

         return null;
      case 10:
         cyz var15 = (cyz)var1;
         var15.getClass();
         return var15;
      case 11:
         var14 = (SidecarDisplayFeature)var1;
         var14.getClass();
         if (var14.getType() != 1) {
            var3 = var4;
            if (var14.getType() != 2) {
               return var3;
            }
         }

         var3 = true;
         return var3;
      case 12:
         var14 = (SidecarDisplayFeature)var1;
         var14.getClass();
         if (var14.getRect().width() == 0) {
            var3 = var6;
            if (var14.getRect().height() == 0) {
               return var3;
            }
         }

         var3 = true;
         return var3;
      case 13:
         var14 = (SidecarDisplayFeature)var1;
         var14.getClass();
         if (var14.getType() == 1 && var14.getRect().width() != 0) {
            if (var14.getRect().height() == 0) {
               var3 = true;
            }
         } else {
            var3 = true;
         }

         return var3;
      case 14:
         var14 = (SidecarDisplayFeature)var1;
         var14.getClass();
         if (var14.getRect().left != 0) {
            var3 = var7;
            if (var14.getRect().top != 0) {
               return var3;
            }
         }

         var3 = true;
         return var3;
      case 15:
         ddd var12 = (ddd)var1;
         var12.getClass();
         String var13 = var12.getClass().getSimpleName();
         var13.getClass();
         return var13;
      case 16:
         brl var11 = (brl)var1;
         var11.getClass();
         brq.a.a(var11, brs.a[0], true);
         return qsn.a;
      case 17:
         return null;
      case 18:
         bdo var10 = (bdo)var1;
         var10.getClass();
         var10.l = 1;
         return qsn.a;
      case 19:
         nyl var9 = (nyl)var1;
         var9.getClass();
         return String.valueOf(var9.ordinal());
      default:
         var3 = var5;
         if (var1 == null) {
            var3 = true;
         }

         return var3;
      }
   }
}
