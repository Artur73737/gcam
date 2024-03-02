import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class cve {
   final xo a;
   final xo b;
   final xo c;
   public final Parcel d;
   private final SparseIntArray e;
   private final int f;
   private final int g;
   private final String h;
   private int i;
   private int j;
   private int k;

   public cve(Parcel var1) {
      this(var1, var1.dataPosition(), var1.dataSize(), "", new xo(), new xo(), new xo());
   }

   private cve(Parcel var1, int var2, int var3, String var4, xo var5, xo var6, xo var7) {
      this.a = var5;
      this.b = var6;
      this.c = var7;
      this.e = new SparseIntArray();
      this.i = -1;
      this.k = -1;
      this.d = var1;
      this.f = var2;
      this.g = var3;
      this.j = var2;
      this.h = var4;
   }

   private final Class v(Class var1) {
      Class var3 = (Class)this.c.get(var1.getName());
      Class var2 = var3;
      if (var3 == null) {
         var2 = Class.forName(String.format("%s.%sParcelizer", var1.getPackage().getName(), var1.getSimpleName()), false, var1.getClassLoader());
         this.c.put(var1.getName(), var2);
      }

      return var2;
   }

   public final int a(int var1, int var2) {
      return !this.s(var2) ? var1 : this.d.readInt();
   }

   public final Parcelable b(Parcelable var1, int var2) {
      if (!this.s(var2)) {
         return var1;
      } else {
         Class var3 = this.getClass();
         return this.d.readParcelable(var3.getClassLoader());
      }
   }

   public final cvf c() {
      String var3 = this.n();
      if (var3 == null) {
         return null;
      } else {
         cve var2 = this.m();

         InvocationTargetException var23;
         label66: {
            IllegalAccessException var24;
            label65: {
               NoSuchMethodException var22;
               label64: {
                  ClassNotFoundException var10000;
                  label72: {
                     Method var1;
                     boolean var10001;
                     try {
                        var1 = (Method)this.a.get(var3);
                     } catch (IllegalAccessException var12) {
                        var24 = var12;
                        var10001 = false;
                        break label65;
                     } catch (InvocationTargetException var13) {
                        var23 = var13;
                        var10001 = false;
                        break label66;
                     } catch (NoSuchMethodException var14) {
                        var22 = var14;
                        var10001 = false;
                        break label64;
                     } catch (ClassNotFoundException var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label72;
                     }

                     if (var1 == null) {
                        try {
                           var1 = Class.forName(var3, true, cve.class.getClassLoader()).getDeclaredMethod("read", cve.class);
                           this.a.put(var3, var1);
                        } catch (IllegalAccessException var8) {
                           var24 = var8;
                           var10001 = false;
                           break label65;
                        } catch (InvocationTargetException var9) {
                           var23 = var9;
                           var10001 = false;
                           break label66;
                        } catch (NoSuchMethodException var10) {
                           var22 = var10;
                           var10001 = false;
                           break label64;
                        } catch (ClassNotFoundException var11) {
                           var10000 = var11;
                           var10001 = false;
                           break label72;
                        }
                     }

                     try {
                        cvf var21 = (cvf)var1.invoke((Object)null, var2);
                        return var21;
                     } catch (IllegalAccessException var4) {
                        var24 = var4;
                        var10001 = false;
                        break label65;
                     } catch (InvocationTargetException var5) {
                        var23 = var5;
                        var10001 = false;
                        break label66;
                     } catch (NoSuchMethodException var6) {
                        var22 = var6;
                        var10001 = false;
                        break label64;
                     } catch (ClassNotFoundException var7) {
                        var10000 = var7;
                        var10001 = false;
                     }
                  }

                  ClassNotFoundException var16 = var10000;
                  throw new RuntimeException(var16);
               }

               NoSuchMethodException var17 = var22;
               throw new RuntimeException(var17);
            }

            IllegalAccessException var20 = var24;
            throw new RuntimeException(var20);
         }

         InvocationTargetException var18 = var23;
         Throwable var19 = var18.getCause();
         if (!(var19 instanceof RuntimeException)) {
            if (var19 instanceof Error) {
               throw (Error)var19;
            } else {
               throw new RuntimeException(var18);
            }
         } else {
            throw (RuntimeException)var19;
         }
      }
   }

   public final CharSequence d(CharSequence var1, int var2) {
      return !this.s(var2) ? var1 : (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
   }

   public final String e(String var1, int var2) {
      return !this.s(var2) ? var1 : this.n();
   }

   public final void f(boolean var1, int var2) {
      this.p(var2);
      this.d.writeInt(var1);
   }

   public final void g(CharSequence var1, int var2) {
      this.p(var2);
      TextUtils.writeToParcel(var1, this.d, 0);
   }

   public final void h(int var1, int var2) {
      this.p(var2);
      this.q(var1);
   }

   public final void i(Parcelable var1, int var2) {
      this.p(var2);
      this.d.writeParcelable(var1, 0);
   }

   public final void j(String var1, int var2) {
      this.p(var2);
      this.r(var1);
   }

   public final void k(cvf var1) {
      if (var1 != null) {
         Class var2;
         try {
            var2 = this.v(var1.getClass());
         } catch (ClassNotFoundException var5) {
            throw new RuntimeException(String.valueOf(var1.getClass().getSimpleName()).concat(" does not have a Parcelizer"), var5);
         }

         this.r(var2.getName());
         cve var3 = this.m();

         label72: {
            NoSuchMethodException var24;
            label71: {
               ClassNotFoundException var10000;
               label78: {
                  InvocationTargetException var25;
                  label69: {
                     IllegalAccessException var26;
                     label79: {
                        Class var4;
                        boolean var10001;
                        Method var21;
                        try {
                           var4 = var1.getClass();
                           var21 = (Method)this.b.get(var4.getName());
                        } catch (IllegalAccessException var14) {
                           var26 = var14;
                           var10001 = false;
                           break label79;
                        } catch (InvocationTargetException var15) {
                           var25 = var15;
                           var10001 = false;
                           break label69;
                        } catch (NoSuchMethodException var16) {
                           var24 = var16;
                           var10001 = false;
                           break label71;
                        } catch (ClassNotFoundException var17) {
                           var10000 = var17;
                           var10001 = false;
                           break label78;
                        }

                        if (var21 == null) {
                           try {
                              var21 = this.v(var4).getDeclaredMethod("write", var4, cve.class);
                              this.b.put(var4.getName(), var21);
                           } catch (IllegalAccessException var10) {
                              var26 = var10;
                              var10001 = false;
                              break label79;
                           } catch (InvocationTargetException var11) {
                              var25 = var11;
                              var10001 = false;
                              break label69;
                           } catch (NoSuchMethodException var12) {
                              var24 = var12;
                              var10001 = false;
                              break label71;
                           } catch (ClassNotFoundException var13) {
                              var10000 = var13;
                              var10001 = false;
                              break label78;
                           }
                        }

                        try {
                           var21.invoke((Object)null, var1, var3);
                           break label72;
                        } catch (IllegalAccessException var6) {
                           var26 = var6;
                           var10001 = false;
                        } catch (InvocationTargetException var7) {
                           var25 = var7;
                           var10001 = false;
                           break label69;
                        } catch (NoSuchMethodException var8) {
                           var24 = var8;
                           var10001 = false;
                           break label71;
                        } catch (ClassNotFoundException var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label78;
                        }
                     }

                     IllegalAccessException var22 = var26;
                     throw new RuntimeException(var22);
                  }

                  InvocationTargetException var20 = var25;
                  Throwable var23 = var20.getCause();
                  if (!(var23 instanceof RuntimeException)) {
                     if (var23 instanceof Error) {
                        throw (Error)var23;
                     }

                     throw new RuntimeException(var20);
                  }

                  throw (RuntimeException)var23;
               }

               ClassNotFoundException var18 = var10000;
               throw new RuntimeException(var18);
            }

            NoSuchMethodException var19 = var24;
            throw new RuntimeException(var19);
         }

         var3.o();
      } else {
         this.r((String)null);
      }
   }

   public final boolean l(boolean var1, int var2) {
      if (this.s(var2)) {
         if (this.d.readInt() != 0) {
            return true;
         }

         var1 = false;
      }

      return var1;
   }

   protected final cve m() {
      Parcel var8 = this.d;
      int var3 = var8.dataPosition();
      int var2 = this.j;
      int var1 = var2;
      if (var2 == this.f) {
         var1 = this.g;
      }

      String var6 = this.h;
      xo var5 = this.a;
      xo var7 = this.b;
      xo var4 = this.c;
      return new cve(var8, var3, var1, var6.concat("  "), var5, var7, var4);
   }

   public final String n() {
      return this.d.readString();
   }

   public final void o() {
      int var1 = this.i;
      if (var1 >= 0) {
         int var2 = this.e.get(var1);
         var1 = this.d.dataPosition();
         this.d.setDataPosition(var2);
         this.d.writeInt(var1 - var2);
         this.d.setDataPosition(var1);
      }

   }

   public final void p(int var1) {
      this.o();
      this.i = var1;
      this.e.put(var1, this.d.dataPosition());
      this.q(0);
      this.q(var1);
   }

   public final void q(int var1) {
      this.d.writeInt(var1);
   }

   public final void r(String var1) {
      this.d.writeString(var1);
   }

   public final boolean s(int var1) {
      while(this.j < this.g) {
         int var2 = this.k;
         if (var2 == var1) {
            return true;
         }

         if (String.valueOf(var2).compareTo(String.valueOf(var1)) > 0) {
            return false;
         }

         this.d.setDataPosition(this.j);
         var2 = this.d.readInt();
         this.k = this.d.readInt();
         this.j += var2;
      }

      if (this.k == var1) {
         return true;
      } else {
         return false;
      }
   }

   public final cvf t(cvf var1) {
      return !this.s(1) ? var1 : this.c();
   }

   public final void u(cvf var1) {
      this.p(1);
      this.k(var1);
   }
}
