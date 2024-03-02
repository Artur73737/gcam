import com.google.android.apps.lightcycle.panorama.vSAD.IUDuAuCIaH;

public class cnk implements cnj {
   public static cnk c;
   public static final cno d;

   static {
      d = cna.b;
   }

   public cnh a(Class var1) {
      String var2 = IUDuAuCIaH.VsZdoKHVKMNCmzC;

      StringBuilder var3;
      try {
         Object var8 = var1.getDeclaredConstructor().newInstance();
         var8.getClass();
         cnh var9 = (cnh)var8;
         return var9;
      } catch (NoSuchMethodException var5) {
         var3 = new StringBuilder();
         var3.append(var2);
         var3.append(var1);
         throw new RuntimeException(var2.concat(var1.toString()), var5);
      } catch (InstantiationException var6) {
         StringBuilder var4 = new StringBuilder();
         var4.append(var2);
         var4.append(var1);
         throw new RuntimeException(var2.concat(var1.toString()), var6);
      } catch (IllegalAccessException var7) {
         var3 = new StringBuilder();
         var3.append(var2);
         var3.append(var1);
         throw new RuntimeException(var2.concat(var1.toString()), var7);
      }
   }

   // $FF: synthetic method
   public cnh b(Class var1, cnp var2) {
      return ckm.d(this, var1);
   }
}
