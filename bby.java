public final class bby {
   public static final bby a = new bby();
   public static final bby b = new bby();
   public final axf c = new axf(new bca[16]);

   public final boolean a() {
      if (this == a) {
         IllegalStateException var18 = new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
         throw var18;
      } else if (this != b) {
         axf var7 = this.c;
         if (!var7.n()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
         } else {
            int var4 = var7.b;
            boolean var5 = false;
            if (var4 > 0) {
               Object[] var12 = var7.a;
               int var1 = 0;
               boolean var6 = false;

               int var2;
               do {
                  bca var8 = (bca)var12[var1];
                  if (!var8.n().y) {
                     throw new IllegalStateException("visitChildren called on an unattached node");
                  }

                  axf var13 = new axf(new bba[16]);
                  bba var14 = var8.n().t;
                  if (var14 == null) {
                     jj.j(var13, var8.n());
                  } else {
                     var13.p(var14);
                  }

                  label99:
                  while(true) {
                     label97:
                     while(true) {
                        var5 = var6;
                        if (!var13.n()) {
                           break label99;
                        }

                        var14 = (bba)var13.c(var13.b - 1);
                        bba var10 = var14;
                        if ((var14.r & 1024) == 0) {
                           jj.j(var13, var14);
                        } else {
                           while(var10 != null) {
                              if ((var10.q & 1024) != 0) {
                                 axf var9 = null;

                                 while(true) {
                                    int var3;
                                    do {
                                       if (var10 == null) {
                                          continue label97;
                                       }

                                       if (var10 instanceof bcd) {
                                          bcd var17 = (bcd)var10;
                                          if (((bbw)var17.d()).a) {
                                             var5 = ej.p(var17);
                                          } else {
                                             var5 = er.m(var17, 7, axa.i);
                                          }

                                          var7 = var9;
                                          if (var5) {
                                             var5 = true;
                                             break label99;
                                          }
                                          break;
                                       }

                                       var7 = var9;
                                       if ((var10.q & 1024) == 0) {
                                          break;
                                       }

                                       var7 = var9;
                                       if (!(var10 instanceof blh)) {
                                          break;
                                       }

                                       bba var15 = ((blh)var10).A;
                                       var3 = 0;

                                       for(var7 = var9; var15 != null; var3 = var2) {
                                          bba var16 = var10;
                                          axf var11 = var7;
                                          var2 = var3;
                                          if ((var15.q & 1024) != 0) {
                                             var2 = var3 + 1;
                                             if (var2 == 1) {
                                                var16 = var15;
                                                var11 = var7;
                                             } else {
                                                var9 = var7;
                                                if (var7 == null) {
                                                   var9 = new axf(new bba[16]);
                                                }

                                                if (var10 != null) {
                                                   var9.p(var10);
                                                }

                                                var9.p(var15);
                                                var7 = null;
                                                var11 = var9;
                                                var16 = var7;
                                             }
                                          }

                                          var15 = var15.t;
                                          var10 = var16;
                                          var7 = var11;
                                       }

                                       var9 = var7;
                                    } while(var3 == 1);

                                    var10 = jj.f(var7);
                                    var9 = var7;
                                 }
                              }

                              var10 = var10.t;
                           }
                        }
                     }
                  }

                  var2 = var1 + 1;
                  var1 = var2;
                  var6 = var5;
               } while(var2 < var4);
            }

            return var5;
         }
      } else {
         throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
      }
   }
}
