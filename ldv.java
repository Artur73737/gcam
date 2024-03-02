import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class ldv extends ConstraintLayout implements Checkable {
   static final int[] a = new int[]{-16842910};
   static final int[] b = new int[]{16842910, -16842912};
   static final int[] c = new int[]{16842910, 16842912};
   private static final int[] j = new int[]{16842912};
   protected ColorStateList d;
   protected ColorStateList e;
   public ImageView f;
   protected boolean g;
   protected boolean h;
   protected boolean i;
   private ColorStateList k;
   private ColorStateList l;
   private final Set m;

   public ldv(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ldv(Context var1, AttributeSet var2) {
      this(var1, var2, 2130970473);
   }

   public ldv(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.g = false;
      HashSet var4 = new HashSet();
      this.m = var4;
      this.d = null;
      var3 = mzx.dF(var1, 2130968959);
      this.e = a(var3, var3);
      var4.add(new mzx());
      cgm.g(this, new ldu(this));
   }

   public static ColorStateList a(int var0, int var1) {
      return new ColorStateList(new int[][]{b, c, a}, new int[]{var1, var0, var1});
   }

   private static int g(ColorStateList var0) {
      return var0 == null ? 0 : var0.getColorForState(c, 0);
   }

   private static int h(ColorStateList var0) {
      return var0 == null ? 0 : var0.getColorForState(b, 0);
   }

   public final String b() {
      Class var1;
      if (!this.h) {
         var1 = Button.class;
      } else {
         var1 = CompoundButton.class;
      }

      return var1.getName();
   }

   protected void c(ColorStateList var1) {
      Drawable var2 = this.getBackground();
      if (var2 != null) {
         var2.mutate().setTintList(var1);
      }

      this.refreshDrawableState();
   }

   protected final void d(AttributeSet var1, int var2) {
      TypedArray var6 = this.getContext().getTheme().obtainStyledAttributes(var1, lds.a, var2, 2132084096);

      label1830: {
         Throwable var10000;
         label1834: {
            boolean var10001;
            boolean var190;
            label1828: {
               label1827: {
                  label1826: {
                     label1825: {
                        try {
                           if (!var6.hasValue(4)) {
                              if (!var6.hasValue(8) && !var6.hasValue(3)) {
                                 if (var6.hasValue(7)) {
                                    break label1827;
                                 }
                                 break label1826;
                              }
                              break label1825;
                           }
                        } catch (Throwable var188) {
                           var10000 = var188;
                           var10001 = false;
                           break label1834;
                        }

                        var190 = true;
                        break label1828;
                     }

                     var190 = true;
                     break label1828;
                  }

                  var190 = false;
                  break label1828;
               }

               var190 = true;
            }

            try {
               if (var6.hasValue(10)) {
                  this.f(var6.getResourceId(10, 0));
               }
            } catch (Throwable var187) {
               var10000 = var187;
               var10001 = false;
               break label1834;
            }

            label1838: {
               try {
                  if (var6.hasValueOrEmpty(6)) {
                     this.k = var6.getColorStateList(6);
                     break label1838;
                  }
               } catch (Throwable var186) {
                  var10000 = var186;
                  var10001 = false;
                  break label1834;
               }

               try {
                  this.k = this.d;
               } catch (Throwable var185) {
                  var10000 = var185;
                  var10001 = false;
                  break label1834;
               }
            }

            label1796: {
               try {
                  if (var6.hasValueOrEmpty(5)) {
                     this.l = var6.getColorStateList(5);
                     break label1796;
                  }
               } catch (Throwable var184) {
                  var10000 = var184;
                  var10001 = false;
                  break label1834;
               }

               try {
                  this.l = this.e;
               } catch (Throwable var183) {
                  var10000 = var183;
                  var10001 = false;
                  break label1834;
               }
            }

            if (var190) {
               int var3;
               int var4;
               try {
                  var3 = var6.getColor(4, g(this.k));
                  var4 = var6.getColor(8, h(this.k));
               } catch (Throwable var182) {
                  var10000 = var182;
                  var10001 = false;
                  break label1834;
               }

               ColorStateList var189;
               label1784: {
                  var2 = var3;
                  if (var3 == 0) {
                     if (var4 == 0) {
                        var189 = null;
                        break label1784;
                     }

                     var2 = 0;
                  }

                  try {
                     var189 = a(var2, var4);
                  } catch (Throwable var181) {
                     var10000 = var181;
                     var10001 = false;
                     break label1834;
                  }
               }

               try {
                  this.k = var189;
                  this.l = a(var6.getColor(3, g(this.l)), var6.getColor(7, h(this.l)));
               } catch (Throwable var180) {
                  var10000 = var180;
                  var10001 = false;
                  break label1834;
               }
            }

            Drawable var5;
            try {
               this.f.setImageTintList(this.k);
               this.c(this.l);
               var2 = (int)var6.getDimension(9, 0.0F);
               var5 = this.getBackground();
            } catch (Throwable var179) {
               var10000 = var179;
               var10001 = false;
               break label1834;
            }

            Drawable var191 = var5;

            try {
               if (var5 instanceof LayerDrawable) {
                  var191 = ((LayerDrawable)var5).findDrawableByLayerId(16908288);
               }
            } catch (Throwable var178) {
               var10000 = var178;
               var10001 = false;
               break label1834;
            }

            try {
               if (var191 instanceof GradientDrawable) {
                  ((GradientDrawable)var191).setCornerRadius((float)var2);
               }
            } catch (Throwable var177) {
               var10000 = var177;
               var10001 = false;
               break label1834;
            }

            label1765:
            try {
               this.setEnabled(var6.getBoolean(0, true));
               this.e(var6.getBoolean(2, false));
               this.setChecked(var6.getBoolean(1, false));
               this.i = var6.getBoolean(12, false);
               this.setClipToOutline(true);
               break label1830;
            } catch (Throwable var176) {
               var10000 = var176;
               var10001 = false;
               break label1765;
            }
         }

         Throwable var192 = var10000;
         var6.recycle();
         throw var192;
      }

      var6.recycle();
   }

   public final void e(boolean var1) {
      this.h = var1 | this.getParent() instanceof ldw;
      this.refreshDrawableState();
   }

   public abstract void f(int var1);

   public final boolean isChecked() {
      return this.g;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.getParent() instanceof ldw) {
         this.e(true);
      }

   }

   public final int[] onCreateDrawableState(int var1) {
      int[] var7 = super.onCreateDrawableState(var1 + 2);
      if (this.g) {
         mergeDrawableStates(var7, j);
      }

      ColorStateList var6 = this.l;
      if (var6 == null) {
         var1 = 0;
      } else {
         var1 = var6.getColorForState(var7, 0);
      }

      double var2 = cdg.a(cdg.c(var1, -16777216));
      int var5 = var7.length;
      int var4 = var5 - 1;

      for(var1 = var4; var1 >= 0 && var7[var1] == 0; --var1) {
      }

      int[] var8 = var7;
      if (var1 == var4) {
         var8 = new int[var5 + 1];
         System.arraycopy(var7, 0, var8, 0, var5);
      }

      if (var2 >= 0.5D) {
         var4 = 2130970147;
      } else {
         var4 = -2130970147;
      }

      var8[var1 + 1] = var4;
      return var8;
   }

   public final boolean performClick() {
      if (this.h && this.isEnabled() && this.i) {
         this.toggle();
      }

      return super.performClick();
   }

   public void setBackground(Drawable var1) {
      if (var1 != null) {
         var1.mutate().setTintMode(Mode.SRC_ATOP);
      }

      super.setBackground(var1);
      this.c(this.l);
   }

   public final void setBackgroundColor(int var1) {
      ColorStateList var2 = ColorStateList.valueOf(var1);
      this.l = var2;
      this.c(var2);
      this.refreshDrawableState();
   }

   public void setChecked(boolean var1) {
      if (this.h && var1 != this.g) {
         this.g = var1;
         this.refreshDrawableState();

         mzx var3;
         for(Iterator var2 = Collections.unmodifiableSet(this.m).iterator(); var2.hasNext(); var3 = (mzx)var2.next()) {
         }
      }

   }

   public final void toggle() {
      this.setChecked(this.g ^ true);
   }
}
