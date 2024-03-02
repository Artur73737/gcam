public final class rx {
   private final int a;

   // $FF: synthetic method
   private rx(int var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public static final rx a(int var0) {
      return new rx(var0);
   }

   public static final String b(int var0) {
      if (!c.n(var0, 0)) {
         if (!c.n(var0, 34)) {
            if (!c.n(var0, 1144402265)) {
               if (!c.n(var0, 1768253795)) {
                  if (!c.n(var0, 257)) {
                     if (!c.n(var0, 41)) {
                        if (!c.n(var0, 42)) {
                           if (!c.n(var0, 1212500294)) {
                              if (!c.n(var0, 256)) {
                                 if (!c.n(var0, 16)) {
                                    if (!c.n(var0, 17)) {
                                       if (!c.n(var0, 37)) {
                                          if (!c.n(var0, 38)) {
                                             if (!c.n(var0, 4098)) {
                                                if (!c.n(var0, 36)) {
                                                   if (!c.n(var0, 32)) {
                                                      if (!c.n(var0, 4)) {
                                                         if (!c.n(var0, 842094169)) {
                                                            if (!c.n(var0, 540422489)) {
                                                               if (!c.n(var0, 538982489)) {
                                                                  if (!c.n(var0, 35)) {
                                                                     if (!c.n(var0, 39)) {
                                                                        if (!c.n(var0, 40)) {
                                                                           if (!c.n(var0, 20)) {
                                                                              if (c.n(var0, 842094169)) {
                                                                                 return "YV12";
                                                                              } else {
                                                                                 qwo.c(16);
                                                                                 String var1 = Integer.toString(var0, 16);
                                                                                 var1.getClass();
                                                                                 return "UNKNOWN-".concat(var1);
                                                                              }
                                                                           } else {
                                                                              return "YUY2";
                                                                           }
                                                                        } else {
                                                                           return "YUV_444_888";
                                                                        }
                                                                     } else {
                                                                        return "YUV_422_888";
                                                                     }
                                                                  } else {
                                                                     return "YUV_420_888";
                                                                  }
                                                               } else {
                                                                  return "Y8";
                                                               }
                                                            } else {
                                                               return "Y16";
                                                            }
                                                         } else {
                                                            return "Y12";
                                                         }
                                                      } else {
                                                         return "RGB_565";
                                                      }
                                                   } else {
                                                      return "RAW_SENSOR";
                                                   }
                                                } else {
                                                   return "RAW_PRIVATE";
                                                }
                                             } else {
                                                return "RAW_DEPTH";
                                             }
                                          } else {
                                             return "RAW12";
                                          }
                                       } else {
                                          return "RAW10";
                                       }
                                    } else {
                                       return "NV21";
                                    }
                                 } else {
                                    return "NV16";
                                 }
                              } else {
                                 return "JPEG";
                              }
                           } else {
                              return "HEIC";
                           }
                        } else {
                           return "FLEX_RGBA_8888";
                        }
                     } else {
                        return "FLEX_RGB_888";
                     }
                  } else {
                     return "DEPTH_POINT_CLOUD";
                  }
               } else {
                  return "DEPTH_JPEG";
               }
            } else {
               return "DEPTH16";
            }
         } else {
            return "PRIVATE";
         }
      } else {
         return "UNKNOWN";
      }
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof rx;
      int var2 = this.a;
      return var3 && var2 == ((rx)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      int var1 = this.a;
      StringBuilder var2 = new StringBuilder();
      var2.append("StreamFormat(");
      var2.append(b(var1));
      var2.append(')');
      return var2.toString();
   }
}
