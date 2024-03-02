import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.util.ArrayList;

public final class ai {
   public final ArrayList a = new ArrayList();

   public final void a(aj var1) {
      this.a.clear();

      int var3;
      int var4;
      for(var3 = 1; var3 < var1.e; ++var3) {
         ak var8 = ((ak[])var1.g.a)[var3];

         for(var4 = 0; var4 < 6; ++var4) {
            var8.e[var4] = 0.0F;
         }

         var8.e[var8.c] = 1.0F;
         if (var8.h == 4) {
            this.a.add(var8);
         }
      }

      int var6 = this.a.size();

      for(var3 = 0; var3 < var6; ++var3) {
         ak var9 = (ak)this.a.get(var3);
         var4 = var9.b;
         if (var4 != -1) {
            ag var11 = var1.c[var4].d;
            int var7 = var11.a;

            for(var4 = 0; var4 < var7; ++var4) {
               ak var10 = var11.d(var4);
               if (var10 != null) {
                  float var2 = var11.b(var4);

                  for(int var5 = 0; var5 < 6; ++var5) {
                     float[] var12 = var10.e;
                     var12[var5] += var9.e[var5] * var2;
                  }

                  if (!this.a.contains(var10)) {
                     this.a.add(var10);
                  }
               }
            }

            for(var4 = 0; var4 < 6; ++var4) {
               var9.e[var4] = 0.0F;
            }
         }
      }

   }

   public final String toString() {
      int var3 = this.a.size();
      String var4 = "Goal: ";

      for(int var1 = 0; var1 < var3; ++var1) {
         ak var6 = (ak)this.a.get(var1);
         StringBuilder var5 = new StringBuilder();
         var5.append(var6);
         var5.append("[");
         String var8 = "null[";
         int var2 = 0;

         while(true) {
            float[] var7 = var6.e;
            if (var2 >= 6) {
               var4 = var4.concat(var8);
               break;
            }

            StringBuilder var10 = new StringBuilder();
            var10.append(var8);
            var10.append(var6.e[var2]);
            String var11 = var10.toString();
            float[] var9 = var6.e;
            if (var2 < 5) {
               var8 = ", ";
            } else {
               var8 = zBdGS.XucomUOXvsy;
            }

            var8 = var11.concat(var8);
            ++var2;
         }
      }

      return var4;
   }
}
