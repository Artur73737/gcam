package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;

public class VrCoreLibraryLoader {
   public static long loadNativeDlsymMethod(Context var0) {
      return 0L;
   }

   public static long loadNativeGvrLibrary(Context var0) {
      return loadNativeGvrLibrary(var0, .qnz.b, .qnz.a);
   }

   public static long loadNativeGvrLibrary(Context var0, .qnz var1, .qnz var2) {
      Object var172;
      label482: {
         .qog var184;
         label481: {
            IllegalArgumentException var183;
            label480: {
               IllegalStateException var182;
               label479: {
                  SecurityException var181;
                  label478: {
                     UnsatisfiedLinkError var180;
                     label477: {
                        RemoteException var10000;
                        label476: {
                           ApplicationInfo var8;
                           boolean var10001;
                           label475: {
                              try {
                                 try {
                                    var8 = var0.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                                    break label475;
                                 } catch (NameNotFoundException var156) {
                                 }
                              } catch (.qog var157) {
                                 var184 = var157;
                                 var10001 = false;
                                 break label481;
                              } catch (IllegalArgumentException var158) {
                                 var183 = var158;
                                 var10001 = false;
                                 break label480;
                              } catch (IllegalStateException var159) {
                                 var182 = var159;
                                 var10001 = false;
                                 break label479;
                              } catch (SecurityException var160) {
                                 var181 = var160;
                                 var10001 = false;
                                 break label478;
                              } catch (UnsatisfiedLinkError var161) {
                                 var180 = var161;
                                 var10001 = false;
                                 break label477;
                              } catch (RemoteException var162) {
                                 var10000 = var162;
                                 var10001 = false;
                                 break label476;
                              }

                              try {
                                 .qog var166 = new .qog(VrCoreUtils.a(var0));
                                 throw var166;
                              } catch (.qog var12) {
                                 var184 = var12;
                                 var10001 = false;
                                 break label481;
                              } catch (IllegalArgumentException var13) {
                                 var183 = var13;
                                 var10001 = false;
                                 break label480;
                              } catch (IllegalStateException var14) {
                                 var182 = var14;
                                 var10001 = false;
                                 break label479;
                              } catch (SecurityException var15) {
                                 var181 = var15;
                                 var10001 = false;
                                 break label478;
                              } catch (UnsatisfiedLinkError var16) {
                                 var180 = var16;
                                 var10001 = false;
                                 break label477;
                              } catch (RemoteException var17) {
                                 var10000 = var17;
                                 var10001 = false;
                                 break label476;
                              }
                           }

                           .qog var163;
                           if (var8 != null) {
                              label466: {
                                 label465: {
                                    label464: {
                                       label484: {
                                          String var173;
                                          try {
                                             if (!var8.enabled) {
                                                break label484;
                                             }

                                             if (var8.metaData == null) {
                                                break label464;
                                             }

                                             var173 = var8.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                                             if (var173.isEmpty()) {
                                                break label465;
                                             }
                                          } catch (.qog var144) {
                                             var184 = var144;
                                             var10001 = false;
                                             break label481;
                                          } catch (IllegalArgumentException var145) {
                                             var183 = var145;
                                             var10001 = false;
                                             break label480;
                                          } catch (IllegalStateException var146) {
                                             var182 = var146;
                                             var10001 = false;
                                             break label479;
                                          } catch (SecurityException var147) {
                                             var181 = var147;
                                             var10001 = false;
                                             break label478;
                                          } catch (UnsatisfiedLinkError var148) {
                                             var180 = var148;
                                             var10001 = false;
                                             break label477;
                                          } catch (RemoteException var149) {
                                             var10000 = var149;
                                             var10001 = false;
                                             break label466;
                                          }

                                          .qnz var9;
                                          try {
                                             var173 = var173.substring(1);
                                             var9 = .qnz.a(var173);
                                          } catch (.qog var120) {
                                             var184 = var120;
                                             var10001 = false;
                                             break label481;
                                          } catch (IllegalArgumentException var121) {
                                             var183 = var121;
                                             var10001 = false;
                                             break label480;
                                          } catch (IllegalStateException var122) {
                                             var182 = var122;
                                             var10001 = false;
                                             break label479;
                                          } catch (SecurityException var123) {
                                             var181 = var123;
                                             var10001 = false;
                                             break label478;
                                          } catch (UnsatisfiedLinkError var124) {
                                             var180 = var124;
                                             var10001 = false;
                                             break label477;
                                          } catch (RemoteException var125) {
                                             var10000 = var125;
                                             var10001 = false;
                                             break label466;
                                          }

                                          if (var9 != null) {
                                             int var3;
                                             int var4;
                                             try {
                                                var3 = var9.c;
                                                var4 = var1.c;
                                             } catch (.qog var108) {
                                                var184 = var108;
                                                var10001 = false;
                                                break label481;
                                             } catch (IllegalArgumentException var109) {
                                                var183 = var109;
                                                var10001 = false;
                                                break label480;
                                             } catch (IllegalStateException var110) {
                                                var182 = var110;
                                                var10001 = false;
                                                break label479;
                                             } catch (SecurityException var111) {
                                                var181 = var111;
                                                var10001 = false;
                                                break label478;
                                             } catch (UnsatisfiedLinkError var112) {
                                                var180 = var112;
                                                var10001 = false;
                                                break label477;
                                             } catch (RemoteException var113) {
                                                var10000 = var113;
                                                var10001 = false;
                                                break label466;
                                             }

                                             if (var3 <= var4) {
                                                label493: {
                                                   if (var3 >= var4) {
                                                      try {
                                                         var3 = var9.d;
                                                         var4 = var1.d;
                                                      } catch (.qog var102) {
                                                         var184 = var102;
                                                         var10001 = false;
                                                         break label481;
                                                      } catch (IllegalArgumentException var103) {
                                                         var183 = var103;
                                                         var10001 = false;
                                                         break label480;
                                                      } catch (IllegalStateException var104) {
                                                         var182 = var104;
                                                         var10001 = false;
                                                         break label479;
                                                      } catch (SecurityException var105) {
                                                         var181 = var105;
                                                         var10001 = false;
                                                         break label478;
                                                      } catch (UnsatisfiedLinkError var106) {
                                                         var180 = var106;
                                                         var10001 = false;
                                                         break label477;
                                                      } catch (RemoteException var107) {
                                                         var10000 = var107;
                                                         var10001 = false;
                                                         break label466;
                                                      }

                                                      if (var3 > var4) {
                                                         break label493;
                                                      }

                                                      if (var3 >= var4) {
                                                         try {
                                                            var4 = var9.e;
                                                            var3 = var1.e;
                                                         } catch (.qog var96) {
                                                            var184 = var96;
                                                            var10001 = false;
                                                            break label481;
                                                         } catch (IllegalArgumentException var97) {
                                                            var183 = var97;
                                                            var10001 = false;
                                                            break label480;
                                                         } catch (IllegalStateException var98) {
                                                            var182 = var98;
                                                            var10001 = false;
                                                            break label479;
                                                         } catch (SecurityException var99) {
                                                            var181 = var99;
                                                            var10001 = false;
                                                            break label478;
                                                         } catch (UnsatisfiedLinkError var100) {
                                                            var180 = var100;
                                                            var10001 = false;
                                                            break label477;
                                                         } catch (RemoteException var101) {
                                                            var10000 = var101;
                                                            var10001 = false;
                                                            break label466;
                                                         }

                                                         if (var4 > var3 || var4 >= var3) {
                                                            break label493;
                                                         }
                                                      }
                                                   }

                                                   try {
                                                      Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", var173, var1.toString()));
                                                      var163 = new .qog(4);
                                                      throw var163;
                                                   } catch (.qog var90) {
                                                      var184 = var90;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (IllegalArgumentException var91) {
                                                      var183 = var91;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (IllegalStateException var92) {
                                                      var182 = var92;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (SecurityException var93) {
                                                      var181 = var93;
                                                      var10001 = false;
                                                      break label478;
                                                   } catch (UnsatisfiedLinkError var94) {
                                                      var180 = var94;
                                                      var10001 = false;
                                                      break label477;
                                                   } catch (RemoteException var95) {
                                                      var10000 = var95;
                                                      var10001 = false;
                                                      break label466;
                                                   }
                                                }
                                             }

                                             Context var10;
                                             .qpd var174;
                                             try {
                                                var10 = .pgn.R(var0);
                                                .pgn.R(var0);
                                                var3 = .pgn.c;
                                                var174 = .pgn.d;
                                             } catch (.qog var84) {
                                                var184 = var84;
                                                var10001 = false;
                                                break label481;
                                             } catch (IllegalArgumentException var85) {
                                                var183 = var85;
                                                var10001 = false;
                                                break label480;
                                             } catch (IllegalStateException var86) {
                                                var182 = var86;
                                                var10001 = false;
                                                break label479;
                                             } catch (SecurityException var87) {
                                                var181 = var87;
                                                var10001 = false;
                                                break label478;
                                             } catch (UnsatisfiedLinkError var88) {
                                                var180 = var88;
                                                var10001 = false;
                                                break label477;
                                             } catch (RemoteException var89) {
                                                var10000 = var89;
                                                var10001 = false;
                                                break label466;
                                             }

                                             var9 = null;
                                             if (var174 == null) {
                                                IBinder var175;
                                                try {
                                                   var175 = .pgn.S(.pgn.R(var0).getClassLoader());
                                                } catch (.qog var72) {
                                                   var184 = var72;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (IllegalArgumentException var73) {
                                                   var183 = var73;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (IllegalStateException var74) {
                                                   var182 = var74;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (SecurityException var75) {
                                                   var181 = var75;
                                                   var10001 = false;
                                                   break label478;
                                                } catch (UnsatisfiedLinkError var76) {
                                                   var180 = var76;
                                                   var10001 = false;
                                                   break label477;
                                                } catch (RemoteException var77) {
                                                   var10000 = var77;
                                                   var10001 = false;
                                                   break label466;
                                                }

                                                if (var175 == null) {
                                                   var174 = null;
                                                } else {
                                                   label494: {
                                                      try {
                                                         IInterface var11 = var175.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                                                         if (var11 instanceof .qpd) {
                                                            var174 = (.qpd)var11;
                                                            break label494;
                                                         }
                                                      } catch (.qog var78) {
                                                         var184 = var78;
                                                         var10001 = false;
                                                         break label481;
                                                      } catch (IllegalArgumentException var79) {
                                                         var183 = var79;
                                                         var10001 = false;
                                                         break label480;
                                                      } catch (IllegalStateException var80) {
                                                         var182 = var80;
                                                         var10001 = false;
                                                         break label479;
                                                      } catch (SecurityException var81) {
                                                         var181 = var81;
                                                         var10001 = false;
                                                         break label478;
                                                      } catch (UnsatisfiedLinkError var82) {
                                                         var180 = var82;
                                                         var10001 = false;
                                                         break label477;
                                                      } catch (RemoteException var83) {
                                                         var10000 = var83;
                                                         var10001 = false;
                                                         break label466;
                                                      }

                                                      try {
                                                         var174 = new .qpd(var175);
                                                      } catch (.qog var66) {
                                                         var184 = var66;
                                                         var10001 = false;
                                                         break label481;
                                                      } catch (IllegalArgumentException var67) {
                                                         var183 = var67;
                                                         var10001 = false;
                                                         break label480;
                                                      } catch (IllegalStateException var68) {
                                                         var182 = var68;
                                                         var10001 = false;
                                                         break label479;
                                                      } catch (SecurityException var69) {
                                                         var181 = var69;
                                                         var10001 = false;
                                                         break label478;
                                                      } catch (UnsatisfiedLinkError var70) {
                                                         var180 = var70;
                                                         var10001 = false;
                                                         break label477;
                                                      } catch (RemoteException var71) {
                                                         var10000 = var71;
                                                         var10001 = false;
                                                         break label466;
                                                      }
                                                   }
                                                }

                                                try {
                                                   .pgn.d = var174;
                                                } catch (.qog var60) {
                                                   var184 = var60;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (IllegalArgumentException var61) {
                                                   var183 = var61;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (IllegalStateException var62) {
                                                   var182 = var62;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (SecurityException var63) {
                                                   var181 = var63;
                                                   var10001 = false;
                                                   break label478;
                                                } catch (UnsatisfiedLinkError var64) {
                                                   var180 = var64;
                                                   var10001 = false;
                                                   break label477;
                                                } catch (RemoteException var65) {
                                                   var10000 = var65;
                                                   var10001 = false;
                                                   break label466;
                                                }
                                             }

                                             IBinder var165;
                                             Parcel var179;
                                             try {
                                                var174 = .pgn.d;
                                                .edx var177 = ObjectWrapper.b(var10);
                                                .edx var164 = ObjectWrapper.b(var0);
                                                Parcel var178 = var174.a();
                                                .edy.d(var178, var177);
                                                .edy.d(var178, var164);
                                                var179 = var174.y(4, var178);
                                                var165 = var179.readStrongBinder();
                                             } catch (.qog var54) {
                                                var184 = var54;
                                                var10001 = false;
                                                break label481;
                                             } catch (IllegalArgumentException var55) {
                                                var183 = var55;
                                                var10001 = false;
                                                break label480;
                                             } catch (IllegalStateException var56) {
                                                var182 = var56;
                                                var10001 = false;
                                                break label479;
                                             } catch (SecurityException var57) {
                                                var181 = var57;
                                                var10001 = false;
                                                break label478;
                                             } catch (UnsatisfiedLinkError var58) {
                                                var180 = var58;
                                                var10001 = false;
                                                break label477;
                                             } catch (RemoteException var59) {
                                                var10000 = var59;
                                                var10001 = false;
                                                break label466;
                                             }

                                             .qpe var167;
                                             if (var165 == null) {
                                                var167 = var9;
                                             } else {
                                                label497: {
                                                   try {
                                                      IInterface var176 = var165.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                                                      if (var176 instanceof .qpe) {
                                                         var167 = (.qpe)var176;
                                                         break label497;
                                                      }
                                                   } catch (.qog var48) {
                                                      var184 = var48;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (IllegalArgumentException var49) {
                                                      var183 = var49;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (IllegalStateException var50) {
                                                      var182 = var50;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (SecurityException var51) {
                                                      var181 = var51;
                                                      var10001 = false;
                                                      break label478;
                                                   } catch (UnsatisfiedLinkError var52) {
                                                      var180 = var52;
                                                      var10001 = false;
                                                      break label477;
                                                   } catch (RemoteException var53) {
                                                      var10000 = var53;
                                                      var10001 = false;
                                                      break label466;
                                                   }

                                                   try {
                                                      var167 = new .qpe(var165);
                                                   } catch (.qog var42) {
                                                      var184 = var42;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (IllegalArgumentException var43) {
                                                      var183 = var43;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (IllegalStateException var44) {
                                                      var182 = var44;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (SecurityException var45) {
                                                      var181 = var45;
                                                      var10001 = false;
                                                      break label478;
                                                   } catch (UnsatisfiedLinkError var46) {
                                                      var180 = var46;
                                                      var10001 = false;
                                                      break label477;
                                                   } catch (RemoteException var47) {
                                                      var10000 = var47;
                                                      var10001 = false;
                                                      break label466;
                                                   }
                                                }
                                             }

                                             try {
                                                var179.recycle();
                                             } catch (.qog var36) {
                                                var184 = var36;
                                                var10001 = false;
                                                break label481;
                                             } catch (IllegalArgumentException var37) {
                                                var183 = var37;
                                                var10001 = false;
                                                break label480;
                                             } catch (IllegalStateException var38) {
                                                var182 = var38;
                                                var10001 = false;
                                                break label479;
                                             } catch (SecurityException var39) {
                                                var181 = var39;
                                                var10001 = false;
                                                break label478;
                                             } catch (UnsatisfiedLinkError var40) {
                                                var180 = var40;
                                                var10001 = false;
                                                break label477;
                                             } catch (RemoteException var41) {
                                                var10000 = var41;
                                                var10001 = false;
                                                break label466;
                                             }

                                             if (var167 == null) {
                                                try {
                                                   Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                                                   return 0L;
                                                } catch (.qog var18) {
                                                   var184 = var18;
                                                   var10001 = false;
                                                   break label481;
                                                } catch (IllegalArgumentException var19) {
                                                   var183 = var19;
                                                   var10001 = false;
                                                   break label480;
                                                } catch (IllegalStateException var20) {
                                                   var182 = var20;
                                                   var10001 = false;
                                                   break label479;
                                                } catch (SecurityException var21) {
                                                   var181 = var21;
                                                   var10001 = false;
                                                   break label478;
                                                } catch (UnsatisfiedLinkError var22) {
                                                   var180 = var22;
                                                   var10001 = false;
                                                   break label477;
                                                } catch (RemoteException var23) {
                                                   var10000 = var23;
                                                   var10001 = false;
                                                   break label466;
                                                }
                                             } else {
                                                long var6;
                                                Parcel var171;
                                                if (var3 < 19) {
                                                   try {
                                                      var4 = var2.c;
                                                      int var5 = var2.d;
                                                      var3 = var2.e;
                                                      Parcel var168 = var167.a();
                                                      var168.writeInt(var4);
                                                      var168.writeInt(var5);
                                                      var168.writeInt(var3);
                                                      var171 = var167.y(2, var168);
                                                      var6 = var171.readLong();
                                                      var171.recycle();
                                                      return var6;
                                                   } catch (.qog var24) {
                                                      var184 = var24;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (IllegalArgumentException var25) {
                                                      var183 = var25;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (IllegalStateException var26) {
                                                      var182 = var26;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (SecurityException var27) {
                                                      var181 = var27;
                                                      var10001 = false;
                                                      break label478;
                                                   } catch (UnsatisfiedLinkError var28) {
                                                      var180 = var28;
                                                      var10001 = false;
                                                      break label477;
                                                   } catch (RemoteException var29) {
                                                      var10000 = var29;
                                                      var10001 = false;
                                                      break label466;
                                                   }
                                                } else {
                                                   try {
                                                      String var169 = var1.toString();
                                                      String var170 = var2.toString();
                                                      var179 = var167.a();
                                                      var179.writeString(var169);
                                                      var179.writeString(var170);
                                                      var171 = var167.y(5, var179);
                                                      var6 = var171.readLong();
                                                      var171.recycle();
                                                      return var6;
                                                   } catch (.qog var30) {
                                                      var184 = var30;
                                                      var10001 = false;
                                                      break label481;
                                                   } catch (IllegalArgumentException var31) {
                                                      var183 = var31;
                                                      var10001 = false;
                                                      break label480;
                                                   } catch (IllegalStateException var32) {
                                                      var182 = var32;
                                                      var10001 = false;
                                                      break label479;
                                                   } catch (SecurityException var33) {
                                                      var181 = var33;
                                                      var10001 = false;
                                                      break label478;
                                                   } catch (UnsatisfiedLinkError var34) {
                                                      var180 = var34;
                                                      var10001 = false;
                                                      break label477;
                                                   } catch (RemoteException var35) {
                                                      var10000 = var35;
                                                      var10001 = false;
                                                      break label466;
                                                   }
                                                }
                                             }
                                          } else {
                                             try {
                                                var163 = new .qog(4);
                                                throw var163;
                                             } catch (.qog var114) {
                                                var184 = var114;
                                                var10001 = false;
                                                break label481;
                                             } catch (IllegalArgumentException var115) {
                                                var183 = var115;
                                                var10001 = false;
                                                break label480;
                                             } catch (IllegalStateException var116) {
                                                var182 = var116;
                                                var10001 = false;
                                                break label479;
                                             } catch (SecurityException var117) {
                                                var181 = var117;
                                                var10001 = false;
                                                break label478;
                                             } catch (UnsatisfiedLinkError var118) {
                                                var180 = var118;
                                                var10001 = false;
                                                break label477;
                                             } catch (RemoteException var119) {
                                                var10000 = var119;
                                                var10001 = false;
                                                break label466;
                                             }
                                          }
                                       }

                                       try {
                                          var163 = new .qog(2);
                                          throw var163;
                                       } catch (.qog var138) {
                                          var184 = var138;
                                          var10001 = false;
                                          break label481;
                                       } catch (IllegalArgumentException var139) {
                                          var183 = var139;
                                          var10001 = false;
                                          break label480;
                                       } catch (IllegalStateException var140) {
                                          var182 = var140;
                                          var10001 = false;
                                          break label479;
                                       } catch (SecurityException var141) {
                                          var181 = var141;
                                          var10001 = false;
                                          break label478;
                                       } catch (UnsatisfiedLinkError var142) {
                                          var180 = var142;
                                          var10001 = false;
                                          break label477;
                                       } catch (RemoteException var143) {
                                          var10000 = var143;
                                          var10001 = false;
                                          break label466;
                                       }
                                    }

                                    try {
                                       var163 = new .qog(4);
                                       throw var163;
                                    } catch (.qog var132) {
                                       var184 = var132;
                                       var10001 = false;
                                       break label481;
                                    } catch (IllegalArgumentException var133) {
                                       var183 = var133;
                                       var10001 = false;
                                       break label480;
                                    } catch (IllegalStateException var134) {
                                       var182 = var134;
                                       var10001 = false;
                                       break label479;
                                    } catch (SecurityException var135) {
                                       var181 = var135;
                                       var10001 = false;
                                       break label478;
                                    } catch (UnsatisfiedLinkError var136) {
                                       var180 = var136;
                                       var10001 = false;
                                       break label477;
                                    } catch (RemoteException var137) {
                                       var10000 = var137;
                                       var10001 = false;
                                       break label466;
                                    }
                                 }

                                 try {
                                    var163 = new .qog(4);
                                    throw var163;
                                 } catch (.qog var126) {
                                    var184 = var126;
                                    var10001 = false;
                                    break label481;
                                 } catch (IllegalArgumentException var127) {
                                    var183 = var127;
                                    var10001 = false;
                                    break label480;
                                 } catch (IllegalStateException var128) {
                                    var182 = var128;
                                    var10001 = false;
                                    break label479;
                                 } catch (SecurityException var129) {
                                    var181 = var129;
                                    var10001 = false;
                                    break label478;
                                 } catch (UnsatisfiedLinkError var130) {
                                    var180 = var130;
                                    var10001 = false;
                                    break label477;
                                 } catch (RemoteException var131) {
                                    var10000 = var131;
                                    var10001 = false;
                                 }
                              }
                           } else {
                              try {
                                 var163 = new .qog(8);
                                 throw var163;
                              } catch (.qog var150) {
                                 var184 = var150;
                                 var10001 = false;
                                 break label481;
                              } catch (IllegalArgumentException var151) {
                                 var183 = var151;
                                 var10001 = false;
                                 break label480;
                              } catch (IllegalStateException var152) {
                                 var182 = var152;
                                 var10001 = false;
                                 break label479;
                              } catch (SecurityException var153) {
                                 var181 = var153;
                                 var10001 = false;
                                 break label478;
                              } catch (UnsatisfiedLinkError var154) {
                                 var180 = var154;
                                 var10001 = false;
                                 break label477;
                              } catch (RemoteException var155) {
                                 var10000 = var155;
                                 var10001 = false;
                              }
                           }
                        }

                        var172 = var10000;
                        break label482;
                     }

                     var172 = var180;
                     break label482;
                  }

                  var172 = var181;
                  break label482;
               }

               var172 = var182;
               break label482;
            }

            var172 = var183;
            break label482;
         }

         var172 = var184;
      }

      Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore:\n  ".concat(var172.toString()));
      return 0L;
   }
}
