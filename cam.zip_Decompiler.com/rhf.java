public final class rhf extends quq implements ref, qur {
   public final ref a;
   public final qui b;
   public final int c;
   private qui d;
   private que e;

   public rhf(ref var1, qui var2) {
      var1.getClass();
      super(rhb.a, quj.a);
      this.a = var1;
      this.b = var2;
      this.c = ((Number)var2.fold(0, rhe.a)).intValue();
   }

   public final Object a(Object var1, que var2) {
      Throwable var10000;
      label333: {
         qui var3;
         qui var4;
         boolean var10001;
         try {
            var3 = var2.n();
            qzy.s(var3);
            var4 = this.d;
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label333;
         }

         label327: {
            label334: {
               if (var4 != var3) {
                  try {
                     if (var4 instanceof rgz) {
                        break label334;
                     }

                     var3.getClass();
                     ajb var39 = new ajb(this, 19);
                     if (((Number)var3.fold(0, var39)).intValue() != this.c) {
                        break label327;
                     }

                     this.d = var3;
                  } catch (Throwable var34) {
                     var10000 = var34;
                     var10001 = false;
                     break label333;
                  }
               }

               try {
                  this.e = var2;
                  var1 = rhh.a.a(this.a, var1, this);
                  if (!c.E(var1, qul.a)) {
                     this.e = null;
                  }
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label333;
               }

               if (var1 == qul.a) {
                  return var1;
               }

               return qsn.a;
            }

            try {
               rgz var41 = (rgz)var4;
               Throwable var42 = var41.a;
               StringBuilder var43 = new StringBuilder();
               var43.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
               var43.append(var42);
               var43.append(", but then emission attempt of value '");
               var43.append(var1);
               var43.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
               IllegalStateException var38 = new IllegalStateException(qwp.j(var43.toString()));
               throw var38;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label333;
            }
         }

         label310:
         try {
            qui var36 = this.b;
            StringBuilder var40 = new StringBuilder();
            var40.append("Flow invariant is violated:\n\t\tFlow was collected in ");
            var40.append(var36);
            var40.append(",\n\t\tbut emission happened in ");
            var40.append(var3);
            var40.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
            IllegalStateException var5 = new IllegalStateException(var40.toString());
            throw var5;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label310;
         }
      }

      Throwable var37 = var10000;
      this.d = new rgz(var37, var2.n());
      throw var37;
   }

   public final Object b(Object var1) {
      Throwable var2 = qsi.a(var1);
      if (var2 != null) {
         this.d = new rgz(var2, this.n());
      }

      que var3 = this.e;
      if (var3 != null) {
         var3.gP(var1);
      }

      return qul.a;
   }

   public final StackTraceElement el() {
      return null;
   }

   public final qur em() {
      que var1 = this.e;
      return var1 instanceof qur ? (qur)var1 : null;
   }

   public final void f() {
      super.f();
   }

   public final qui n() {
      qui var2 = this.d;
      Object var1 = var2;
      if (var2 == null) {
         var1 = quj.a;
      }

      return (qui)var1;
   }
}
