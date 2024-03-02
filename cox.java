import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import com.google.android.libraries.memorymonitor.Xhk.PUdPFKr;
import com.google.babelfish.device.avenh.l2l.modelutils.androidmodelextractor.MtR.NgAyRSYlmLoD;
import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cox {
   public final List a;
   private final AtomicBoolean b;
   private final coq c;
   private final FileOutputStream d;
   private final FileChannel e;
   private long f;
   private long g;
   private long h;
   private pbq i;
   private final nbu j;

   public cox(FileOutputStream var1, nbu var2, coq var3) {
      this.j = var2;
      this.d = var1;
      this.e = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(var1.getChannel());
      this.c = var3;
      this.b = new AtomicBoolean(false);
      this.a = new ArrayList();
      Long var4 = 0L;
      this.i = pbq.e(var4, var4);
   }

   private final ByteBuffer c() {
      long var14 = Long.MAX_VALUE;

      int var5;
      for(var5 = 0; var5 < this.a.size(); ++var5) {
         cow var28 = (cow)this.a.get(var5);
         if (!var28.c.isEmpty()) {
            var14 = Math.min(((BufferInfo)var28.c.get(0)).presentationTimeUs, var14);
         }
      }

      ByteBuffer var50;
      if (var14 == Long.MAX_VALUE) {
         var50 = ByteBuffer.allocate(0);
      } else {
         nbu var49 = this.j;
         List var36 = this.a;
         ArrayList var35 = new ArrayList();
         var5 = 0;
         long var16 = 0L;
         int var6 = 1;

         while(true) {
            int var7;
            boolean var13;
            ByteBuffer var32;
            ByteBuffer var34;
            ByteBuffer var53;
            ByteBuffer var60;
            String var62;
            if (var5 >= var36.size()) {
               var7 = ((cot)var49.b).d;
               var5 = cor.a;
               var53 = ByteBuffer.allocate(200);
               var53.putInt(0);
               var53.putInt(var7);
               var53.putInt(var7);
               var53.putInt(10000);
               var53.putInt((int)cbh.e(var16, 10000L));
               var53.putInt(65536);
               var53.putShort((short)256);
               var53.putShort((short)0);
               var53.putInt(0);
               var53.putInt(0);

               for(var5 = 0; var5 < 9; ++var5) {
                  var53.putInt((new int[]{65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824})[var5]);
               }

               for(var5 = 0; var5 < 6; ++var5) {
                  var53.putInt(0);
               }

               var53.putInt(var6);
               var53.flip();
               ByteBuffer var58 = cbg.e("mvhd", var53);
               cou var56 = ((cot)var49.b).b;
               if (var56 == null) {
                  var53 = ByteBuffer.allocate(0);
               } else {
                  var62 = String.format(Locale.US, "%+.4f%+.4f/", var56.a, var56.b);
                  var53 = ByteBuffer.allocate(var62.length() + 4);
                  var53.putShort((short)(var53.capacity() - 4));
                  var53.putShort((short)5575);
                  var53.put(com.b(var62));
                  if (var53.limit() == var53.capacity()) {
                     var13 = true;
                  } else {
                     var13 = false;
                  }

                  cav.f(var13);
                  var53.flip();
                  var53 = cbg.e("udta", cbg.f(new byte[]{-87, 120, 121, 122}, var53));
               }

               if (((cot)var49.b).c.isEmpty()) {
                  var50 = ByteBuffer.allocate(0);
               } else {
                  var60 = cor.a("mdta", "");
                  ArrayList var68 = osh.r(((cot)var49.b).c.keySet());
                  var32 = ByteBuffer.allocate(200);
                  var32.putInt(0);
                  var32.putInt(var68.size());

                  for(var5 = 0; var5 < var68.size(); ++var5) {
                     var32.put(cbg.e("mdta", ByteBuffer.wrap(com.b((String)var68.get(var5)))));
                  }

                  var32.flip();
                  var32 = cbg.e("keys", var32);
                  var68 = osh.r(((cot)var49.b).c.values());
                  var34 = ByteBuffer.allocate(200);

                  for(var5 = 0; var5 < var68.size(); var5 = var6) {
                     var6 = var5 + 1;
                     Object var70 = var68.get(var5);
                     if (var70 instanceof String) {
                        byte[] var71 = com.b((String)var70);
                        var50 = ByteBuffer.allocate(var71.length + 8);
                        var50.putInt(1);
                        var50.putInt(0);
                        var50.put(var71);
                     } else {
                        if (!(var70 instanceof Float)) {
                           throw new IllegalArgumentException("Unknown metadata type: ".concat(String.valueOf(String.valueOf(var70.getClass()))));
                        }

                        var50 = ByteBuffer.allocate(12);
                        var50.putInt(23);
                        var50.putInt(0);
                        var50.putFloat((Float)var70);
                     }

                     var50.flip();
                     var50 = cbg.e("data", var50);
                     var34.putInt(var50.remaining() + 8);
                     var34.putInt(var6);
                     var34.put(var50);
                  }

                  var34.flip();
                  var50 = cbg.d("meta", Arrays.asList(var60, var32, cbg.e("ilst", var34)));
               }

               var60 = ByteBuffer.allocate(0);
               ArrayList var75 = new ArrayList();
               var75.add(var58);
               var75.add(var53);
               var75.add(var50);
               var75.addAll(var35);
               var75.add(var60);
               var50 = cbg.d("moov", var75);
               break;
            }

            cow var37 = (cow)var36.get(var5);
            if (var37.b().isEmpty()) {
               var7 = var5;
            } else {
               coi var38 = var37.a;
               String var29 = var38.a;
               if (var29 == null) {
                  var29 = null;
               } else {
                  HashMap var30 = com.a;
                  Locale var52 = Locale.forLanguageTag(var29);
                  if (!var52.getISO3Language().isEmpty()) {
                     var29 = var52.getISO3Language();
                  }
               }

               oyz var54 = var37.b();
               int var10 = var37.a();
               int var9 = var49.a;
               ArrayList var31 = new ArrayList();
               int var8 = 0;
               long var18 = 0L;
               long var20 = var16;

               while(true) {
                  var7 = var5;
                  if (var8 >= var54.size()) {
                     long var22 = var14;
                     if (var31.size() <= 2) {
                        var5 = 0;
                        var18 = 0L;
                     } else {
                        switch(var9) {
                        case 0:
                           if ((Long)osh.H(var31) == 0L) {
                              var13 = true;
                           } else {
                              var13 = false;
                           }

                           cav.f(var13);
                           var5 = 0;
                           var18 = 0L;
                           break;
                        default:
                           var31.set(var31.size() - 1, (Long)var31.get(var31.size() - 2));
                           var5 = 0;
                           var18 = 0L;
                        }
                     }

                     while(var5 < var31.size()) {
                        var18 += (Long)var31.get(var5);
                        ++var5;
                     }

                     var16 = (long)var37.a();
                     var14 = 1000000L * var18;
                     int var11 = coj.a(var38.f);
                     var32 = ByteBuffer.allocate(var31.size() * 8 + 200);
                     var32.putInt(0);
                     int var12 = var32.position();
                     var32.putInt(0);
                     long var24 = -1L;
                     var8 = 0;
                     var5 = 0;

                     for(var10 = -1; var5 < var31.size(); var8 = var9) {
                        long var26 = (Long)var31.get(var5);
                        if (var24 != var26) {
                           var9 = var32.position();
                           var32.putInt(1);
                           var32.putInt((int)var26);
                           var10 = var8 + 1;
                           var24 = var26;
                           var8 = var9;
                           var9 = var10;
                        } else {
                           var32.putInt(var10, var32.getInt(var10) + 1);
                           var9 = var8;
                           var8 = var10;
                        }

                        ++var5;
                        var10 = var8;
                     }

                     var32.putInt(var12, var8);
                     var32.flip();
                     ByteBuffer var33 = cbg.e("stts", var32);
                     oyz var59 = var37.b();
                     var50 = ByteBuffer.allocate(var59.size() * 4 + 200);
                     var50.putInt(0);
                     var50.putInt(0);
                     var50.putInt(var59.size());

                     for(var5 = 0; var5 < var59.size(); ++var5) {
                        var50.putInt(((BufferInfo)var59.get(var5)).size);
                     }

                     var50.flip();
                     var34 = cbg.e("stsz", var50);
                     oyz var51 = oyz.k(var37.e);
                     var60 = ByteBuffer.allocate(var51.size() * 12 + 200);
                     var60.putInt(0);
                     var60.putInt(var51.size());
                     var5 = 0;

                     for(var8 = 1; var5 < var51.size(); ++var5) {
                        var9 = (Integer)var51.get(var5);
                        var60.putInt(var8);
                        var60.putInt(var9);
                        var60.putInt(1);
                        ++var8;
                     }

                     var60.flip();
                     ByteBuffer var39 = cbg.e("stsc", var60);
                     var51 = oyz.k(var37.d);
                     var60 = ByteBuffer.allocate(var51.size() * 8 + 200);
                     var60.putInt(0);
                     var60.putInt(var51.size());
                     byte var46 = 0;
                     var5 = var6;

                     for(var6 = var46; var6 < var51.size(); ++var6) {
                        var60.putLong((Long)var51.get(var6));
                     }

                     byte var45;
                     String var65;
                     String var67;
                     label467: {
                        var60.flip();
                        ByteBuffer var40 = cbg.e("co64", var60);
                        ByteBuffer var78;
                        switch(var11) {
                        case -1:
                        case 5:
                           var50 = ByteBuffer.allocate(200);
                           var50.putInt(0);
                           var50.flip();
                           var32 = cbg.e("nmhd", var50);
                           var50 = ByteBuffer.allocate(200);
                           var62 = var38.f;
                           cav.g(var62);
                           byte[] var72 = com.b(var62);
                           var50.put(var72);
                           var50.put((byte)0);
                           var50.put(var72);
                           var50.put((byte)0);
                           var50.flip();
                           var60 = cor.b(cor.c(cbg.e("mett", var50)), var33, var34, var39, var40);
                           var65 = "MetaHandle";
                           var67 = "meta";
                           break label467;
                        case 0:
                        case 3:
                        case 4:
                        default:
                           throw new IllegalArgumentException("Unsupported track type");
                        case 1:
                           var50 = ByteBuffer.allocate(200);
                           var50.putInt(0);
                           var50.putShort((short)0);
                           var50.putShort((short)0);
                           var50.flip();
                           var32 = cbg.e("smhd", var50);
                           String var55 = var38.f;
                           cav.g(var55);
                           cav.e(var55.equals("audio/mp4a-latm"), "Unsupported audio format: ".concat(var55));
                           cav.e(var38.h.isEmpty() ^ true, "csd-0 not found in the format.");
                           var78 = ByteBuffer.allocate(ByteBuffer.wrap((byte[])var38.h.get(0)).limit() + 200);
                           var78.putInt(0);
                           var78.putShort((short)0);
                           var78.putShort((short)1);
                           var78.putInt(0);
                           var78.putInt(0);
                           var78.putShort((short)var38.o);
                           var78.putShort((short)16);
                           var78.putShort((short)0);
                           var78.putShort((short)0);
                           var78.putInt(var38.p << 16);
                           cav.e(var38.h.isEmpty() ^ true, "csd-0 is not found in the format.");
                           var60 = ByteBuffer.wrap((byte[])var38.h.get(0));
                           var9 = var60.limit();
                           var50 = ByteBuffer.allocate(var9 + 200);
                           var50.putInt(0);
                           var50.put((byte)3);
                           if (var9 + 21 < 127) {
                              var13 = true;
                           } else {
                              var13 = false;
                           }

                           cav.e(var13, "CSD too long; we might need variable-length encoding?");
                           var50.put((byte)(var9 + 23));
                           var50.putShort((short)0);
                           var50.put((byte)0);
                           var50.put((byte)4);
                           var50.put((byte)(var9 + 15));
                           var50.put((byte)64);
                           var50.put((byte)21);
                           var50.putShort((short)3);
                           var50.put((byte)0);
                           var8 = var38.c;
                           var6 = var8;
                           if (var8 == -1) {
                              var6 = 0;
                           }

                           var50.putInt(var6);
                           if (var38.b != -1) {
                              var6 = var38.d;
                           } else {
                              var6 = 0;
                           }

                           var50.putInt(var6);
                           var50.put((byte)5);
                           var50.put((byte)var9);
                           var50.put(var60);
                           var60.rewind();
                           var50.put((byte)6);
                           var50.put((byte)1);
                           var50.put((byte)2);
                           var50.flip();
                           var78.put(cbg.e("esds", var50));
                           var78.flip();
                           var60 = cor.b(cor.c(cbg.e("mp4a", var78)), var33, var34, var39, var40);
                           var67 = "soun";
                           var65 = "SoundHandle";
                           break label467;
                        case 2:
                        }

                        label385: {
                           var50 = ByteBuffer.allocate(200);
                           var50.putInt(0);
                           var50.putShort((short)0);
                           var50.putShort((short)0);
                           var50.putShort((short)0);
                           var50.putShort((short)0);
                           var50.flip();
                           var50 = cbg.e("vmhd", var50);
                           var62 = var38.f;
                           cav.g(var62);
                           switch(var62.hashCode()) {
                           case -1662735862:
                              if (var62.equals("video/av01")) {
                                 var45 = 2;
                                 break label385;
                              }
                              break;
                           case -1662541442:
                              if (var62.equals("video/hevc")) {
                                 var45 = 1;
                                 break label385;
                              }
                              break;
                           case 1331836730:
                              if (var62.equals("video/avc")) {
                                 var45 = 0;
                                 break label385;
                              }
                           }

                           var45 = -1;
                        }

                        oyz var79;
                        ByteBuffer var80;
                        oyz var64;
                        orc var81;
                        label376:
                        switch(var45) {
                        case 0:
                           if (var38.h.size() >= 2) {
                              var13 = true;
                           } else {
                              var13 = false;
                           }

                           cav.e(var13, "csd-0 and/or csd-1 not found in the format.");
                           var78 = ByteBuffer.wrap((byte[])var38.h.get(0));
                           var32 = ByteBuffer.wrap((byte[])var38.h.get(1));
                           var60 = ByteBuffer.allocate(var78.limit() + var32.limit() + 200);
                           var60.put((byte)1);
                           var79 = cbg.g(var78);
                           if (((pby)var79).c == 1) {
                              var13 = true;
                           } else {
                              var13 = false;
                           }

                           cav.e(var13, "SPS data not found in csd0.");
                           var78 = (ByteBuffer)var79.get(0);
                           var6 = var78.remaining();
                           byte[] var83 = new byte[var6];
                           var78.get(var83);
                           var78.rewind();
                           var81 = con.a(var83, var6);
                           var60.put((byte)var81.c);
                           var60.put((byte)var81.a);
                           var60.put((byte)var81.b);
                           var60.put((byte)-1);
                           var60.put((byte)-31);
                           var60.putShort((short)var78.remaining());
                           var60.put(var78);
                           var78.rewind();
                           var64 = cbg.g(var32);
                           if (((pby)var64).c != 1) {
                              throw new IllegalStateException("PPS data not found in csd1.");
                           }

                           var60.put((byte)1);
                           var32 = (ByteBuffer)var64.get(0);
                           var60.putShort((short)var32.remaining());
                           var60.put(var32);
                           var32.rewind();
                           var60.flip();
                           var60 = cbg.e("avcC", var60);
                           break;
                        case 1:
                           cav.e(var38.h.isEmpty() ^ true, "csd-0 not found in the format.");
                           var32 = ByteBuffer.wrap((byte[])var38.h.get(0));
                           var60 = ByteBuffer.allocate(var32.limit() + 200);
                           var64 = cbg.g(var32);
                           ArrayList var42 = new ArrayList();
                           var8 = 0;

                           while(true) {
                              pby var41 = (pby)var64;
                              if (var8 >= var41.c) {
                                 var60.put((byte)1);
                                 var80 = (ByteBuffer)var42.get(0);
                                 if (var80.get(var80.position()) != 64) {
                                    throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
                                 }

                                 var60.put(var80.get(6));
                                 var60.putInt(var80.getInt(7));
                                 var60.putInt(var80.getInt(11));
                                 var60.putShort(var80.getShort(15));
                                 var60.put(var80.get(17));
                                 var60.putShort((short)-4096);
                                 var60.put((byte)-4);
                                 var80 = (ByteBuffer)var64.get(1);
                                 var6 = var80.remaining();
                                 byte[] var82 = new byte[var6];
                                 var80.get(var82);
                                 var80.rewind();
                                 var81 = con.b(var82, var6);
                                 var8 = var81.c;
                                 var6 = var81.b;
                                 var9 = var81.a;
                                 var60.put((byte)(var8 | 252));
                                 var60.put((byte)(var6 | 248));
                                 var60.put((byte)(var9 | 248));
                                 var60.putShort((short)0);
                                 var60.put((byte)15);
                                 var60.put((byte)var41.c);

                                 for(var6 = 0; var6 < var41.c; ++var6) {
                                    var80 = (ByteBuffer)var64.get(var6);
                                    var60.put((byte)(var80.get(0) >> 1 & 63));
                                    var60.putShort((short)1);
                                    var60.putShort((short)var80.limit());
                                    var60.put(var80);
                                 }

                                 var60.flip();
                                 var60 = cbg.e("hvcC", var60);
                                 break label376;
                              }

                              ByteBuffer var43 = (ByteBuffer)var64.get(var8);
                              var78 = ByteBuffer.allocate(var43.limit());
                              var9 = 0;

                              for(var6 = 0; var9 < var43.limit(); ++var9) {
                                 if (var43.get(var9) != 3 || var6 < 2) {
                                    var78.put(var43.get(var9));
                                 }

                                 if (var43.get(var9) == 0) {
                                    ++var6;
                                 } else {
                                    var6 = 0;
                                 }
                              }

                              var78.flip();
                              var42.add(var78);
                              ++var8;
                           }
                        case 2:
                           cav.e(var38.h.isEmpty() ^ true, "csd-0 is not found in the format");
                           var60 = cbg.e("av1C", ByteBuffer.wrap((byte[])var38.h.get(0)).duplicate());
                           break;
                        default:
                           throw new IllegalArgumentException("Unsupported video format: ".concat(var62));
                        }

                        String var66;
                        label346: {
                           var66 = var38.f;
                           cav.g(var66);
                           switch(var66.hashCode()) {
                           case -1662735862:
                              if (var66.equals("video/av01")) {
                                 var45 = 2;
                                 break label346;
                              }
                              break;
                           case -1662541442:
                              if (var66.equals("video/hevc")) {
                                 var45 = 1;
                                 break label346;
                              }
                              break;
                           case 1331836730:
                              if (var66.equals("video/avc")) {
                                 var45 = 0;
                                 break label346;
                              }
                           }

                           var45 = -1;
                        }

                        switch(var45) {
                        case 0:
                           var66 = "avc1";
                           break;
                        case 1:
                           var66 = "hvc1";
                           break;
                        case 2:
                           var66 = "av01";
                           break;
                        default:
                           throw new IllegalArgumentException("Unsupported video format: ".concat(var66));
                        }

                        var78 = ByteBuffer.allocate(var60.limit() + 200);
                        var78.putInt(0);
                        var78.putShort((short)0);
                        var78.putShort((short)1);
                        var78.putShort((short)0);
                        var78.putShort((short)0);
                        var78.putInt(0);
                        var78.putInt(0);
                        var78.putInt(0);
                        var6 = var38.i;
                        short var2;
                        if (var6 != -1) {
                           var2 = (short)var6;
                        } else {
                           var2 = 0;
                        }

                        var78.putShort(var2);
                        var6 = var38.j;
                        if (var6 != -1) {
                           var2 = (short)var6;
                        } else {
                           var2 = 0;
                        }

                        var78.putShort(var2);
                        var78.putInt(4718592);
                        var78.putInt(4718592);
                        var78.putInt(0);
                        var78.putShort((short)1);
                        var78.putLong(0L);
                        var78.putLong(0L);
                        var78.putLong(0L);
                        var78.putLong(0L);
                        var78.putShort((short)24);
                        var78.putShort((short)-1);
                        var78.put(var60);
                        var60 = ByteBuffer.allocate(8);
                        var60.putInt(65536);
                        var60.putInt(65536);
                        var60.rewind();
                        var78.put(cbg.e("pasp", var60));
                        cog var69 = var38.n;
                        if (var69 != null && (var69.a != 0 || var69.c != 0 || var69.b != 0)) {
                           var80 = ByteBuffer.allocate(20);
                           var80.put((byte)110);
                           var80.put((byte)99);
                           var80.put((byte)108);
                           var80.put((byte)120);
                           var6 = var69.a;
                           short var3;
                           if (var6 != -1) {
                              if (var6 < 0 || var6 >= ((pby)cos.a).c) {
                                 throw new IllegalArgumentException(c.aE(var6, NgAyRSYlmLoD.xsbo));
                              }

                              var2 = (Short)((oyz)cos.a.get(var6)).get(0);
                              var3 = (Short)((oyz)cos.a.get(var6)).get(1);
                           } else {
                              var3 = 0;
                              var2 = 0;
                           }

                           byte var1;
                           short var4;
                           label468: {
                              var6 = var69.c;
                              if (var6 != -1) {
                                 if (var6 < 0 || var6 >= ((pby)cos.b).c) {
                                    throw new IllegalArgumentException(c.aE(var6, "Color transfer not implemented: "));
                                 }

                                 var4 = (Short)cos.b.get(var6);
                              } else {
                                 var4 = 0;
                              }

                              var6 = var69.b;
                              if (var6 != -1) {
                                 if (var6 < 0 || var6 > 2) {
                                    throw new IllegalArgumentException(c.aE(var6, "Color range not implemented: "));
                                 }

                                 if (var6 == 1) {
                                    var1 = -128;
                                    break label468;
                                 }
                              }

                              var1 = 0;
                           }

                           var80.putShort(var2);
                           var80.putShort(var4);
                           var80.putShort(var3);
                           var80.put(var1);
                           var80.flip();
                           var78.put(cbg.e("colr", var80));
                        }

                        var78.flip();
                        var32 = cor.c(cbg.e(var66, var78));
                        var79 = var37.b();
                        var60 = ByteBuffer.allocate(var79.size() * 4 + 200);
                        var60.putInt(0);
                        var11 = var60.position();
                        var60.putInt(var79.size());
                        var10 = 0;
                        var9 = 0;

                        for(var6 = 1; var10 < var79.size(); var9 = var8) {
                           var8 = var9;
                           if ((((BufferInfo)var79.get(var10)).flags & 1) > 0) {
                              var60.putInt(var6);
                              var8 = var9 + 1;
                           }

                           ++var6;
                           ++var10;
                        }

                        var60.putInt(var11, var9);
                        var60.flip();
                        var60 = cor.b(var32, var33, var34, var39, var40, cbg.e("stss", var60));
                        var67 = "vide";
                        var65 = PUdPFKr.QNqVnxMhnARHpnY;
                        var32 = var50;
                     }

                     var16 = var14 / var16;
                     var14 = cbh.e(var16, 10000L);
                     cot var61 = (cot)var49.b;
                     var8 = var61.d;
                     var6 = var61.a;
                     var39 = ByteBuffer.allocate(200);
                     var39.putInt(7);
                     var39.putInt(var8);
                     var39.putInt(var8);
                     var39.putInt(var5);
                     var39.putInt(0);
                     var39.putInt((int)var14);
                     var39.putInt(0);
                     var39.putInt(0);
                     var39.putInt(0);
                     short var44;
                     if (!coj.b(var38.f)) {
                        var44 = 0;
                     } else {
                        var44 = 256;
                     }

                     var39.putShort(var44);
                     var39.putShort((short)0);
                     byte[] var63;
                     switch(var6) {
                     case 0:
                        var63 = com.c(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                        break;
                     case 90:
                        var63 = com.c(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
                        break;
                     case 180:
                        var63 = com.c(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
                        break;
                     case 270:
                        var63 = com.c(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
                        break;
                     default:
                        throw new IllegalArgumentException(c.aE(var6, "invalid orientation "));
                     }

                     var39.put(var63);
                     var8 = var38.i;
                     var6 = var8;
                     if (var8 == -1) {
                        var6 = 0;
                     }

                     var9 = var38.j;
                     var8 = var9;
                     if (var9 == -1) {
                        var8 = 0;
                     }

                     var39.putInt(var6 << 16);
                     var39.putInt(var8 << 16);
                     var39.flip();
                     var50 = cbg.e("tkhd", var39);
                     var8 = var37.a();
                     var6 = ((cot)var49.b).d;
                     ByteBuffer var73 = ByteBuffer.allocate(200);
                     var73.putInt(0);
                     var73.putInt(var6);
                     var73.putInt(var6);
                     var73.putInt(var8);
                     var73.putInt((int)var18);
                     if (var29 == null) {
                        var6 = 0;
                     } else {
                        byte[] var76 = com.b(var29);
                        if (var76.length != 3) {
                           throw new IllegalArgumentException("Non-length-3 language code: ".concat(var29));
                        }

                        byte var48 = var76[2];
                        var45 = var76[1];
                        byte var47 = var76[0];
                        cav.f(true);
                        var6 = ((var47 & 31) << 10) + (var48 & 31) + ((var45 & 31) << 5);
                     }

                     var73.putShort((short)var6);
                     var73.putShort((short)0);
                     var73.flip();
                     var53 = cbg.e("mdhd", var73);
                     var33 = cor.a(var67, var65);
                     var34 = ByteBuffer.allocate(4);
                     var34.putInt(1);
                     var34.flip();
                     ByteBuffer var77 = cbg.e("url ", var34);
                     var34 = ByteBuffer.allocate(8);
                     var34.putInt(0);
                     var34.putInt(1);
                     var34.flip();
                     ArrayList var74 = new ArrayList();
                     var74.add(var34);
                     Collections.addAll(var74, new ByteBuffer[]{var77});
                     var35.add(cbg.d("trak", Arrays.asList(var50, cbg.d("mdia", Arrays.asList(var53, var33, cbg.d("minf", Arrays.asList(var32, cbg.e("dinf", cbg.d("dref", var74)), var60)))))));
                     var16 = Math.max(var20, var16);
                     var6 = var5 + 1;
                     var49 = var49;
                     var14 = var22;
                     break;
                  }

                  var16 = ((BufferInfo)var54.get(var8)).presentationTimeUs;
                  if (var8 != var54.size() - 1) {
                     var16 = ((BufferInfo)var54.get(var8 + 1)).presentationTimeUs;
                  }

                  var16 = cbh.e(var16 - var14, (long)var10);
                  var18 = var16 - var18;
                  if (var18 >= 2147483647L) {
                     throw new IllegalArgumentException(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", var18));
                  }

                  var31.add(var18);
                  ++var8;
                  var18 = var16;
                  var5 = var5;
               }
            }

            var5 = var7 + 1;
         }
      }

      return var50;
   }

   private final void d(long var1, ByteBuffer var3) {
      long var6 = (Long)this.i.j();
      boolean var5 = true;
      boolean var4;
      if (var1 >= var6) {
         var4 = true;
      } else {
         var4 = false;
      }

      cav.f(var4);
      if (var1 >= this.g) {
         var4 = var5;
      } else {
         var4 = false;
      }

      cav.f(var4);
      this.e.position(var1);
      this.e.write(cbg.e("free", var3.duplicate()));
      this.g = 8L + var1;
      this.e();
      this.i = pbq.e(var1, var1 + (long)var3.remaining());
   }

   private final void e() {
      this.e.position(this.f + 8L);
      ByteBuffer var1 = ByteBuffer.allocate(8);
      var1.putLong(this.g - this.f);
      var1.flip();
      this.e.write(var1);
   }

   public final void a() {
      boolean var3 = false;
      int var1 = 0;

      while(true) {
         label458: {
            Throwable var10000;
            label464: {
               boolean var10001;
               try {
                  if (var1 < this.a.size()) {
                     this.b((cow)this.a.get(var1));
                     break label458;
                  }
               } catch (Throwable var53) {
                  var10000 = var53;
                  var10001 = false;
                  break label464;
               }

               long var4;
               long var6;
               ByteBuffer var10;
               try {
                  if (!this.b.get()) {
                     break;
                  }

                  var10 = this.c();
                  var1 = var10.remaining();
                  var4 = this.g;
                  var6 = this.h;
               } catch (Throwable var52) {
                  var10000 = var52;
                  var10001 = false;
                  break label464;
               }

               long var8 = (long)(var1 + 8);
               boolean var2;
               if (var4 - var6 < var8) {
                  label444: {
                     label443: {
                        try {
                           this.d((Long)this.i.j() + var8, var10);
                           if (this.g - this.h >= var8) {
                              break label443;
                           }
                        } catch (Throwable var51) {
                           var10000 = var51;
                           var10001 = false;
                           break label464;
                        }

                        var2 = false;
                        break label444;
                     }

                     var2 = true;
                  }

                  try {
                     cav.f(var2);
                  } catch (Throwable var50) {
                     var10000 = var50;
                     var10001 = false;
                     break label464;
                  }
               }

               try {
                  var6 = this.h;
                  this.e.position(var6);
                  this.e.write(var10);
                  var8 = (Long)this.i.j();
               } catch (Throwable var49) {
                  var10000 = var49;
                  var10001 = false;
                  break label464;
               }

               var4 = (long)var1 + var6;
               var8 -= var4;
               if (var8 < 2147483647L) {
                  var2 = true;
               } else {
                  var2 = var3;
               }

               label432:
               try {
                  cav.f(var2);
                  ByteBuffer var11 = ByteBuffer.allocate(8);
                  var11.putInt((int)var8);
                  var11.put((byte)102);
                  var11.put((byte)114);
                  var11.put((byte)101);
                  var11.put((byte)101);
                  var11.flip();
                  this.e.write(var11);
                  this.g = var6;
                  this.e();
                  this.i = pbq.e(var6, var6 + (long)var10.limit());
                  this.e.truncate(var4);
                  break;
               } catch (Throwable var48) {
                  var10000 = var48;
                  var10001 = false;
                  break label432;
               }
            }

            Throwable var54 = var10000;
            this.e.close();
            this.d.close();
            throw var54;
         }

         ++var1;
      }

      this.e.close();
      this.d.close();
   }

   public final void b(cow var1) {
      if (!var1.f.isEmpty()) {
         AtomicBoolean var9 = this.b;
         boolean var7 = true;
         boolean var8 = var9.getAndSet(true);
         long var3 = 0L;
         long var5;
         if (!var8) {
            this.e.position(0L);
            FileChannel var12 = this.e;
            ArrayList var10 = new ArrayList();
            var10.add(ByteBuffer.wrap(com.b("isom")));
            ByteBuffer var11 = ByteBuffer.allocate(4);
            var11.putInt(131072);
            var11.flip();
            var10.add(var11);

            for(int var2 = 0; var2 < 3; ++var2) {
               var10.add(ByteBuffer.wrap(com.b((new String[]{"isom", "iso2", "mp41"})[var2])));
            }

            var12.write(cbg.d("ftyp", var10));
            this.f = this.e.position();
            ByteBuffer var13 = ByteBuffer.allocate(16);
            var13.putInt(1);
            var13.put(com.b("mdat"));
            var13.putLong(16L);
            var13.flip();
            this.e.write(var13);
            var5 = this.f + 16L;
            this.h = var5;
            this.g = var5;
         }

         for(Iterator var14 = var1.f.iterator(); var14.hasNext(); var3 += (long)((ByteBuffer)((Pair)var14.next()).second).limit()) {
         }

         var5 = this.h;
         if (var5 + var3 >= this.g) {
            var5 = Math.max(500000L, (long)((float)var5 * 0.2F));
            this.d(Math.max(this.g + var5 + var3, (Long)this.i.j()), this.c());
         }

         var1.d.add(this.h);
         var1.e.add(var1.f.size());

         do {
            Pair var15 = (Pair)var1.f.removeFirst();
            BufferInfo var16 = (BufferInfo)var15.first;
            ByteBuffer var17 = (ByteBuffer)var15.second;
            var1.c.add(var16);
            if (coj.c(var1.a.f)) {
               this.c.a(var17);
            }

            var17.rewind();
            var3 = this.h;
            this.h = var3 + (long)this.e.write(var17, var3);
         } while(!var1.f.isEmpty());

         if (this.h > this.g) {
            var7 = false;
         }

         cav.f(var7);
      }
   }
}
