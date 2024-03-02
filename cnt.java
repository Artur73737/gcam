import android.util.Log;
import java.io.PrintWriter;

public final class cnt {
   public final cmc a;
   public final cnx b;

   public cnt() {
   }

   public cnt(cmc var1, gfv var2) {
      this.a = var1;
      cnj var4 = cnx.a;
      var2.getClass();
      cnn var3 = cnn.a;
      var3.getClass();
      this.b = (cnx)clu.c(cnx.class, var2, var4, var3);
   }

   public static cnt a(cmc var0) {
      return new cnt(var0, ((cnm)var0).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging$ar$class_merging());
   }

   public static boolean b(int var0) {
      return Log.isLoggable("LoaderManager", var0);
   }

   @Deprecated
   public final void c(String var1, PrintWriter var2) {
      cnx var7 = this.b;
      if (var7.b.b() > 0) {
         var2.print(var1);
         var2.println("Loaders:");
         String var6 = String.valueOf(var1);

         for(int var3 = 0; var3 < var7.b.b(); ++var3) {
            String var8 = var6.concat("    ");
            cnu var5 = (cnu)var7.b.c(var3);
            var2.print(var1);
            var2.print("  #");
            var2.print(var7.b.a(var3));
            var2.print(": ");
            var2.println(var5.toString());
            var2.print(var8);
            var2.print("mId=");
            var2.print(var5.j);
            var2.print(" mArgs=");
            var2.println((Object)null);
            var2.print(var8);
            var2.print("mLoader=");
            var2.println(var5.k);
            coa var10 = var5.k;
            String var9 = var8.concat("  ");
            var2.print(var9);
            var2.print("mId=");
            var2.print(var10.d);
            var2.print(" mListener=");
            var2.println(var10.j);
            if (var10.f || var10.i) {
               var2.print(var9);
               var2.print("mStarted=");
               var2.print(var10.f);
               var2.print(" mContentChanged=");
               var2.print(var10.i);
               var2.print(" mProcessingChange=");
               var2.println(false);
            }

            if (var10.g || var10.h) {
               var2.print(var9);
               var2.print("mAbandoned=");
               var2.print(var10.g);
               var2.print(" mReset=");
               var2.println(var10.h);
            }

            cnz var13 = (cnz)var10;
            boolean var4;
            if (var13.a != null) {
               var2.print(var9);
               var2.print("mTask=");
               var2.print(var13.a);
               var2.print(" waiting=");
               var4 = var13.a.a;
               var2.println(false);
            }

            if (var13.b != null) {
               var2.print(var9);
               var2.print("mCancellingTask=");
               var2.print(var13.b);
               var2.print(" waiting=");
               var4 = var13.b.a;
               var2.println(false);
            }

            if (var5.l != null) {
               var2.print(var8);
               var2.print("mCallbacks=");
               var2.println(var5.l);
               cnv var11 = var5.l;
               var2.print(var8.concat("  "));
               var2.print("mDeliveredData=");
               var2.println(var11.b);
            }

            var2.print(var8);
            var2.print("mData=");
            coa var12 = var5.k;
            var2.println(coa.e(var5.a()));
            var2.print(var8);
            var2.print("mStarted=");
            if (var5.d > 0) {
               var4 = true;
            } else {
               var4 = false;
            }

            var2.println(var4);
         }
      }

   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("LoaderManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      var1.append(this.a.getClass().getSimpleName());
      var1.append("{");
      var1.append(Integer.toHexString(System.identityHashCode(this.a)));
      var1.append("}}");
      return var1.toString();
   }
}
