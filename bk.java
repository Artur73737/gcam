import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.camera.contentprovider.Eboh.wAtBWCNpqMjxj;

public class bk extends bv implements OnCancelListener, OnDismissListener {
   public final OnDismissListener a = new bh(this);
   private final OnCancelListener af = new bg(this);
   private int ag = 0;
   private int ah = 0;
   private boolean ai = true;
   private int aj = -1;
   private boolean ak;
   private final cmm al = new bi(this);
   private boolean am;
   private boolean an;
   private boolean ao;
   public boolean b = true;
   public Dialog c;
   public boolean d = false;

   public final void c(cp var1, String var2) {
      this.an = false;
      this.ao = true;
      cw var3 = var1.i();
      var3.p();
      var3.n(this, var2);
      var3.g();
   }

   public Dialog d() {
      if (cp.S(3)) {
         StringBuilder var1 = new StringBuilder();
         var1.append("onCreateDialog called for DialogFragment ");
         var1.append(this);
      }

      return new os(this.requireContext(), this.ah);
   }

   public final ca gf() {
      return new bj(this, super.gf());
   }

   public final void gg(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      super.gg(var1, var2, var3);
      if (this.O == null && this.c != null && var3 != null) {
         Bundle var4 = var3.getBundle("android:savedDialogState");
         if (var4 != null) {
            this.c.onRestoreInstanceState(var4);
         }
      }

   }

   public final void onAttach(Context var1) {
      super.onAttach(var1);
      cml var3 = super.Z;
      cmm var2 = this.al;
      cmk.b("observeForever");
      cmh var4 = new cmh(var3, var2);
      cmj var5 = (cmj)var3.c.f(var2, var4);
      if (!(var5 instanceof cmi)) {
         if (var5 == null) {
            var4.d(true);
         }

         if (!this.ao) {
            this.an = false;
         }

      } else {
         throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
      }
   }

   public void onCancel(DialogInterface var1) {
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      new Handler();
      boolean var2;
      if (this.E == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.b = var2;
      if (var1 != null) {
         this.ag = var1.getInt("android:style", 0);
         this.ah = var1.getInt("android:theme", 0);
         this.ai = var1.getBoolean("android:cancelable", true);
         var2 = this.b;
         this.b = var1.getBoolean(wAtBWCNpqMjxj.kSXnJPTjrPHquK, var2);
         this.aj = var1.getInt("android:backStackId", -1);
      }

   }

   public final void onDestroyView() {
      super.onDestroyView();
      Dialog var1 = this.c;
      if (var1 != null) {
         this.am = true;
         var1.setOnDismissListener((OnDismissListener)null);
         this.c.dismiss();
         if (!this.an) {
            this.onDismiss(this.c);
         }

         this.c = null;
         this.d = false;
      }

   }

   public final void onDetach() {
      super.onDetach();
      if (!this.ao && !this.an) {
         this.an = true;
      }

      super.Z.g(this.al);
   }

   public void onDismiss(DialogInterface var1) {
      if (!this.am) {
         if (cp.S(3)) {
            StringBuilder var3 = new StringBuilder();
            var3.append("onDismiss called for DialogFragment ");
            var3.append(this);
         }

         if (!this.an) {
            this.an = true;
            this.ao = false;
            Dialog var4 = this.c;
            if (var4 != null) {
               var4.setOnDismissListener((OnDismissListener)null);
               this.c.dismiss();
            }

            this.am = true;
            if (this.aj >= 0) {
               cp var6 = this.getParentFragmentManager();
               int var2 = this.aj;
               if (var2 >= 0) {
                  var6.D(new co(var6, var2), true);
                  this.aj = -1;
                  return;
               }

               throw new IllegalArgumentException(c.aE(var2, "Bad id: "));
            }

            cw var5 = this.getParentFragmentManager().i();
            var5.p();
            var5.j(this);
            var5.h();
            return;
         }
      }

   }

   public final LayoutInflater onGetLayoutInflater(Bundle var1) {
      LayoutInflater var2 = this.getLayoutInflater(var1);
      StringBuilder var60;
      if (this.b && !this.ak) {
         if (!this.d) {
            label727: {
               Throwable var10000;
               label737: {
                  boolean var10001;
                  label725: {
                     label739: {
                        Dialog var61;
                        label738: {
                           try {
                              this.ak = true;
                              var61 = this.d();
                              this.c = var61;
                              if (!this.b) {
                                 break label739;
                              }

                              switch(this.ag) {
                              case 1:
                              case 2:
                                 break label738;
                              case 3:
                                 break;
                              default:
                                 break label725;
                              }
                           } catch (Throwable var59) {
                              var10000 = var59;
                              var10001 = false;
                              break label737;
                           }

                           Window var3;
                           try {
                              var3 = var61.getWindow();
                           } catch (Throwable var58) {
                              var10000 = var58;
                              var10001 = false;
                              break label737;
                           }

                           if (var3 != null) {
                              try {
                                 var3.addFlags(24);
                              } catch (Throwable var57) {
                                 var10000 = var57;
                                 var10001 = false;
                                 break label737;
                              }
                           }
                        }

                        try {
                           var61.requestWindowFeature(1);
                           break label725;
                        } catch (Throwable var56) {
                           var10000 = var56;
                           var10001 = false;
                           break label737;
                        }
                     }

                     try {
                        this.c = null;
                        break label727;
                     } catch (Throwable var55) {
                        var10000 = var55;
                        var10001 = false;
                        break label737;
                     }
                  }

                  try {
                     Context var62 = this.getContext();
                     if (var62 instanceof Activity) {
                        this.c.setOwnerActivity((Activity)var62);
                     }
                  } catch (Throwable var54) {
                     var10000 = var54;
                     var10001 = false;
                     break label737;
                  }

                  label695:
                  try {
                     this.c.setCancelable(this.ai);
                     this.c.setOnCancelListener(this.af);
                     this.c.setOnDismissListener(this.a);
                     this.d = true;
                     break label727;
                  } catch (Throwable var53) {
                     var10000 = var53;
                     var10001 = false;
                     break label695;
                  }
               }

               Throwable var63 = var10000;
               this.ak = false;
               throw var63;
            }

            this.ak = false;
         }

         if (cp.S(2)) {
            var60 = new StringBuilder();
            var60.append("get layout inflater for DialogFragment ");
            var60.append(this);
            var60.append(" from dialog context");
         }

         Dialog var65 = this.c;
         LayoutInflater var64 = var2;
         if (var65 != null) {
            var64 = var2.cloneInContext(var65.getContext());
         }

         return var64;
      } else {
         if (cp.S(2)) {
            var60 = new StringBuilder();
            var60.append("getting layout inflater for DialogFragment ");
            var60.append(this);
         }

         return var2;
      }
   }

   public void onSaveInstanceState(Bundle var1) {
      Dialog var3 = this.c;
      if (var3 != null) {
         Bundle var4 = var3.onSaveInstanceState();
         var4.putBoolean("android:dialogShowing", false);
         var1.putBundle("android:savedDialogState", var4);
      }

      int var2 = this.ag;
      if (var2 != 0) {
         var1.putInt("android:style", var2);
      }

      var2 = this.ah;
      if (var2 != 0) {
         var1.putInt("android:theme", var2);
      }

      if (!this.ai) {
         var1.putBoolean("android:cancelable", false);
      }

      if (!this.b) {
         var1.putBoolean("android:showsDialog", false);
      }

      var2 = this.aj;
      if (var2 != -1) {
         var1.putInt("android:backStackId", var2);
      }

   }

   public final void onStart() {
      super.onStart();
      Dialog var1 = this.c;
      if (var1 != null) {
         this.am = false;
         var1.show();
         View var2 = this.c.getWindow().getDecorView();
         car.d(var2, this);
         car.b(var2, this);
         cbu.f(var2, this);
      }

   }

   public final void onStop() {
      super.onStop();
      Dialog var1 = this.c;
      if (var1 != null) {
         var1.hide();
      }

   }

   public final void onViewStateRestored(Bundle var1) {
      super.onViewStateRestored(var1);
      if (this.c != null && var1 != null) {
         var1 = var1.getBundle("android:savedDialogState");
         if (var1 != null) {
            this.c.onRestoreInstanceState(var1);
         }
      }

   }
}
