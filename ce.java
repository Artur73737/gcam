import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater.Factory2;
import org.brotli.wrapper.dec.Hm.CLzmcq;

public final class ce implements Factory2 {
   public final cp a;

   public ce(cp var1) {
      this.a = var1;
   }

   public final View onCreateView(View var1, String var2, Context var3, AttributeSet var4) {
      if (cb.class.getName().equals(var2)) {
         return new cb(var3, var4, this.a);
      } else {
         boolean var8 = "fragment".equals(var2);
         bv var16 = null;
         if (!var8) {
            return null;
         } else {
            String var9 = var4.getAttributeValue((String)null, "class");
            TypedArray var12 = var3.obtainStyledAttributes(var4, as.a);
            int var5 = 0;
            String var10 = var9;
            if (var9 == null) {
               var10 = var12.getString(0);
            }

            int var6 = var12.getResourceId(1, -1);
            String var11 = var12.getString(2);
            var12.recycle();
            if (var10 != null) {
               ClassLoader var23 = var3.getClassLoader();
               int var7 = cc.a;

               try {
                  var8 = bv.class.isAssignableFrom(cc.a(var23, var10));
               } catch (ClassNotFoundException var13) {
                  return null;
               }

               if (var8) {
                  if (var1 != null) {
                     var5 = var1.getId();
                  }

                  if (var5 == -1) {
                     if (var6 == -1) {
                        if (var11 == null) {
                           throw new IllegalArgumentException(c.aG(var10, var4, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                        }

                        var5 = -1;
                        var6 = -1;
                     } else {
                        var5 = -1;
                     }
                  }

                  if (var6 != -1) {
                     var16 = this.a.d(var6);
                  }

                  bv var24 = var16;
                  if (var16 == null) {
                     var24 = var16;
                     if (var11 != null) {
                        var24 = this.a.e(var11);
                     }
                  }

                  var16 = var24;
                  if (var24 == null) {
                     var16 = var24;
                     if (var5 != -1) {
                        var16 = this.a.d(var5);
                     }
                  }

                  cp var17;
                  llo var18;
                  StringBuilder var19;
                  bv var20;
                  llo var25;
                  if (var16 == null) {
                     cc var21 = this.a.h();
                     var3.getClassLoader();
                     var16 = var21.b(var10);
                     var16.u = true;
                     if (var6 != 0) {
                        var7 = var6;
                     } else {
                        var7 = var5;
                     }

                     var16.D = var7;
                     var16.E = var5;
                     var16.F = var11;
                     var16.v = true;
                     var16.z = this.a;
                     var17 = this.a;
                     var16.A = var17.i;
                     var16.onInflate(var17.i.c, var4, var16.g);
                     var25 = this.a.ac(var16);
                     var20 = var16;
                     var18 = var25;
                     if (cp.S(2)) {
                        var19 = new StringBuilder();
                        var19.append("Fragment ");
                        var19.append(var16);
                        var19.append(" has been inflated via the <fragment> tag: id=0x");
                        var19.append(Integer.toHexString(var6));
                        var20 = var16;
                        var18 = var25;
                     }
                  } else {
                     if (var16.v) {
                        StringBuilder var15 = new StringBuilder();
                        var15.append(var4.getPositionDescription());
                        var15.append(CLzmcq.QnPc);
                        var15.append(Integer.toHexString(var6));
                        var15.append(", tag ");
                        var15.append(var11);
                        var15.append(", or parent id 0x");
                        var15.append(Integer.toHexString(var5));
                        var15.append(" with another fragment for ");
                        var15.append(var10);
                        throw new IllegalArgumentException(var15.toString());
                     }

                     var16.v = true;
                     var16.z = this.a;
                     var17 = this.a;
                     var16.A = var17.i;
                     var16.onInflate(var17.i.c, var4, var16.g);
                     var25 = this.a.ad(var16);
                     var20 = var16;
                     var18 = var25;
                     if (cp.S(2)) {
                        var19 = new StringBuilder();
                        var19.append("Retained Fragment ");
                        var19.append(var16);
                        var19.append(" has been re-attached via the <fragment> tag: id=0x");
                        var19.append(Integer.toHexString(var6));
                        var18 = var25;
                        var20 = var16;
                     }
                  }

                  ViewGroup var22 = (ViewGroup)var1;
                  var5 = ckr.a;
                  var20.getClass();
                  cks var14 = new cks(var20, var22);
                  ckr.d(var14);
                  ckq var26 = ckr.b(var20);
                  if (var26.b.contains(ckp.d) && ckr.e(var26, var20.getClass(), var14.getClass())) {
                     ckr.c(var26, var14);
                  }

                  var20.N = var22;
                  var18.e();
                  var18.d();
                  var1 = var20.O;
                  if (var1 != null) {
                     if (var6 != 0) {
                        var1.setId(var6);
                     }

                     if (var20.O.getTag() == null) {
                        var20.O.setTag(var11);
                     }

                     var20.O.addOnAttachStateChangeListener(new hyz(this, var18, 1));
                     return var20.O;
                  }

                  throw new IllegalStateException(c.aA(var10, "Fragment ", " did not create a view."));
               }
            }

            return null;
         }
      }
   }

   public final View onCreateView(String var1, Context var2, AttributeSet var3) {
      return this.onCreateView((View)null, var1, var2, var3);
   }
}
