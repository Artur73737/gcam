import com.google.android.apps.camera.facedeblur.deeprestore.jni.lt.SFjQQF;
import com.google.googlex.gcam.base.HmAh.MBdHSCLVFh;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlinx.coroutines.android.cCLd.DzzpnVggahPIX;

final class at extends cw implements cn {
   final cp a;
   boolean b;
   int c;

   public at(cp var1) {
      var1.h();
      cd var2 = var1.i;
      if (var2 != null) {
         var2.c.getClassLoader();
      }

      super();
      this.c = -1;
      this.a = var1;
   }

   final void a(int var1) {
      if (this.j) {
         if (cp.S(2)) {
            StringBuilder var4 = new StringBuilder();
            var4.append("Bump nesting in ");
            var4.append(this);
            var4.append(" by ");
            var4.append(var1);
         }

         int var3 = this.d.size();

         for(int var2 = 0; var2 < var3; ++var2) {
            cv var6 = (cv)this.d.get(var2);
            bv var5 = var6.b;
            if (var5 != null) {
               var5.y += var1;
               if (cp.S(2)) {
                  StringBuilder var7 = new StringBuilder();
                  var7.append(DzzpnVggahPIX.sGWYrLZkPe);
                  var7.append(var6.b);
                  var7.append(" to ");
                  var7.append(var6.b.y);
               }
            }
         }

      }
   }

   public final void b() {
      this.o();
      this.a.E(this, false);
   }

   public final void c(int var1, bv var2, String var3, int var4) {
      String var6 = var2.mPreviousWho;
      if (var6 != null) {
         ckr.a(var2, var6);
      }

      Class var9 = var2.getClass();
      int var5 = var9.getModifiers();
      if (var9.isAnonymousClass() || !Modifier.isPublic(var5) || var9.isMemberClass() && !Modifier.isStatic(var5)) {
         StringBuilder var7 = new StringBuilder();
         var7.append("Fragment ");
         var7.append(var9.getCanonicalName());
         var7.append(" must be a public static class to be  properly recreated from instance state.");
         throw new IllegalStateException(var7.toString());
      } else {
         StringBuilder var10;
         if (var3 != null) {
            var6 = var2.F;
            if (var6 != null && !var3.equals(var6)) {
               var10 = new StringBuilder();
               var10.append("Can't change tag of fragment ");
               var10.append(var2);
               var10.append(": was ");
               var10.append(var2.F);
               var10.append(" now ");
               var10.append(var3);
               throw new IllegalStateException(var10.toString());
            }

            var2.F = var3;
         }

         if (var1 != 0) {
            if (var1 == -1) {
               var10 = new StringBuilder();
               var10.append("Can't add fragment ");
               var10.append(var2);
               var10.append(" with tag ");
               var10.append(var3);
               var10.append(" to container view with no id");
               throw new IllegalArgumentException(var10.toString());
            }

            var5 = var2.D;
            if (var5 != 0 && var5 != var1) {
               StringBuilder var8 = new StringBuilder();
               var8.append("Can't change container ID of fragment ");
               var8.append(var2);
               var8.append(": was ");
               var8.append(var2.D);
               var8.append(" now ");
               var8.append(var1);
               throw new IllegalStateException(var8.toString());
            }

            var2.D = var1;
            var2.E = var1;
         }

         this.k(new cv(var4, var2));
         var2.z = this.a;
      }
   }

   public final void d(String var1, PrintWriter var2) {
      this.e(var1, var2, true);
   }

   public final void e(String var1, PrintWriter var2, boolean var3) {
      if (var3) {
         var2.print(var1);
         var2.print("mName=");
         var2.print(this.l);
         var2.print(" mIndex=");
         var2.print(this.c);
         var2.print(" mCommitted=");
         var2.println(this.b);
         if (this.i != 0) {
            var2.print(var1);
            var2.print("mTransition=#");
            var2.print(Integer.toHexString(this.i));
         }

         if (this.e != 0 || this.f != 0) {
            var2.print(var1);
            var2.print("mEnterAnim=#");
            var2.print(Integer.toHexString(this.e));
            var2.print(" mExitAnim=#");
            var2.println(Integer.toHexString(this.f));
         }

         if (this.g != 0 || this.h != 0) {
            var2.print(var1);
            var2.print(SFjQQF.fsLEZG);
            var2.print(Integer.toHexString(this.g));
            var2.print(" mPopExitAnim=#");
            var2.println(Integer.toHexString(this.h));
         }

         if (this.m != 0 || this.n != null) {
            var2.print(var1);
            var2.print("mBreadCrumbTitleRes=#");
            var2.print(Integer.toHexString(this.m));
            var2.print(" mBreadCrumbTitleText=");
            var2.println(this.n);
         }

         if (this.o != 0 || this.p != null) {
            var2.print(var1);
            var2.print("mBreadCrumbShortTitleRes=#");
            var2.print(Integer.toHexString(this.o));
            var2.print(" mBreadCrumbShortTitleText=");
            var2.println(this.p);
         }
      }

      if (!this.d.isEmpty()) {
         var2.print(var1);
         var2.println("Operations:");
         int var5 = this.d.size();

         for(int var4 = 0; var4 < var5; ++var4) {
            cv var7 = (cv)this.d.get(var4);
            String var6;
            switch(var7.a) {
            case 0:
               var6 = "NULL";
               break;
            case 1:
               var6 = "ADD";
               break;
            case 2:
               var6 = "REPLACE";
               break;
            case 3:
               var6 = "REMOVE";
               break;
            case 4:
               var6 = "HIDE";
               break;
            case 5:
               var6 = MBdHSCLVFh.NyvB;
               break;
            case 6:
               var6 = "DETACH";
               break;
            case 7:
               var6 = "ATTACH";
               break;
            case 8:
               var6 = "SET_PRIMARY_NAV";
               break;
            case 9:
               var6 = "UNSET_PRIMARY_NAV";
               break;
            case 10:
               var6 = "OP_SET_MAX_LIFECYCLE";
               break;
            default:
               StringBuilder var8 = new StringBuilder();
               var8.append("cmd=");
               var8.append(var7.a);
               var6 = var8.toString();
            }

            var2.print(var1);
            var2.print("  Op #");
            var2.print(var4);
            var2.print(": ");
            var2.print(var6);
            var2.print(" ");
            var2.println(var7.b);
            if (var3) {
               if (var7.d != 0 || var7.e != 0) {
                  var2.print(var1);
                  var2.print("enterAnim=#");
                  var2.print(Integer.toHexString(var7.d));
                  var2.print(" exitAnim=#");
                  var2.println(Integer.toHexString(var7.e));
               }

               if (var7.f != 0 || var7.g != 0) {
                  var2.print(var1);
                  var2.print("popEnterAnim=#");
                  var2.print(Integer.toHexString(var7.f));
                  var2.print(" popExitAnim=#");
                  var2.println(Integer.toHexString(var7.g));
               }
            }
         }
      }

   }

   public final boolean f(ArrayList var1, ArrayList var2) {
      if (cp.S(2)) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Run: ");
         var3.append(this);
      }

      var1.add(this);
      var2.add(false);
      if (this.j) {
         cp var4 = this.a;
         if (var4.b == null) {
            var4.b = new ArrayList();
         }

         var4.b.add(this);
      }

      return true;
   }

   public final void g() {
      this.i(false);
   }

   public final void h() {
      this.i(true);
   }

   final void i(boolean var1) {
      if (!this.b) {
         if (cp.S(2)) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Commit: ");
            var2.append(this);
            PrintWriter var3 = new PrintWriter(new dg());
            this.d("  ", var3);
            var3.close();
         }

         this.b = true;
         if (this.j) {
            this.c = this.a.f.getAndIncrement();
         } else {
            this.c = -1;
         }

         this.a.D(this, var1);
      } else {
         throw new IllegalStateException("commit already called");
      }
   }

   public final void j(bv var1) {
      cp var2 = var1.z;
      if (var2 != null && var2 != this.a) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
         var3.append(var1.toString());
         var3.append(" is already attached to a FragmentManager.");
         throw new IllegalStateException(var3.toString());
      } else {
         this.k(new cv(3, var1));
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("BackStackEntry{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      if (this.c >= 0) {
         var1.append(" #");
         var1.append(this.c);
      }

      if (this.l != null) {
         var1.append(" ");
         var1.append(this.l);
      }

      var1.append("}");
      return var1.toString();
   }
}
