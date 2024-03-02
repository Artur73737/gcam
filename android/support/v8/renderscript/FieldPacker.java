package android.support.v8.renderscript;

import android.util.Log;
import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;
import com.google.android.libraries.lens.lenslite.dynamicloading.LjhL.gThp;
import java.util.BitSet;

public class FieldPacker {
   private BitSet mAlignment;
   private byte[] mData;
   private int mLen;
   private int mPos;

   public FieldPacker(int var1) {
      this.mPos = 0;
      this.mLen = var1;
      this.mData = new byte[var1];
      this.mAlignment = new BitSet();
   }

   public FieldPacker(byte[] var1) {
      int var2 = var1.length;
      this.mPos = var2;
      this.mLen = var2;
      this.mData = var1;
      this.mAlignment = new BitSet();
   }

   private void addSafely(Object var1) {
      int var2 = this.mPos;

      while(true) {
         try {
            addToPack(this, var1);
            return;
         } catch (ArrayIndexOutOfBoundsException var5) {
            this.mPos = var2;
            int var3 = this.mLen;
            this.resize(var3 + var3);
         }
      }
   }

   private static void addToPack(FieldPacker var0, Object var1) {
      if (var1 instanceof Boolean) {
         var0.addBoolean((Boolean)var1);
      } else if (var1 instanceof Byte) {
         var0.addI8((Byte)var1);
      } else if (var1 instanceof Short) {
         var0.addI16((Short)var1);
      } else if (var1 instanceof Integer) {
         var0.addI32((Integer)var1);
      } else if (var1 instanceof Long) {
         var0.addI64((Long)var1);
      } else if (var1 instanceof Float) {
         var0.addF32((Float)var1);
      } else if (var1 instanceof Double) {
         var0.addF64((Double)var1);
      } else if (var1 instanceof Byte2) {
         var0.addI8((Byte2)var1);
      } else if (var1 instanceof Byte3) {
         var0.addI8((Byte3)var1);
      } else if (var1 instanceof Byte4) {
         var0.addI8((Byte4)var1);
      } else if (var1 instanceof Short2) {
         var0.addI16((Short2)var1);
      } else if (var1 instanceof Short3) {
         var0.addI16((Short3)var1);
      } else if (var1 instanceof Short4) {
         var0.addI16((Short4)var1);
      } else if (var1 instanceof Int2) {
         var0.addI32((Int2)var1);
      } else if (var1 instanceof Int3) {
         var0.addI32((Int3)var1);
      } else if (var1 instanceof Int4) {
         var0.addI32((Int4)var1);
      } else if (var1 instanceof Long2) {
         var0.addI64((Long2)var1);
      } else if (var1 instanceof Long3) {
         var0.addI64((Long3)var1);
      } else if (var1 instanceof Long4) {
         var0.addI64((Long4)var1);
      } else if (var1 instanceof Float2) {
         var0.addF32((Float2)var1);
      } else if (var1 instanceof Float3) {
         var0.addF32((Float3)var1);
      } else if (var1 instanceof Float4) {
         var0.addF32((Float4)var1);
      } else if (var1 instanceof Double2) {
         var0.addF64((Double2)var1);
      } else if (var1 instanceof Double3) {
         var0.addF64((Double3)var1);
      } else if (var1 instanceof Double4) {
         var0.addF64((Double4)var1);
      } else if (var1 instanceof Matrix2f) {
         var0.addMatrix((Matrix2f)var1);
      } else if (var1 instanceof Matrix3f) {
         var0.addMatrix((Matrix3f)var1);
      } else if (var1 instanceof Matrix4f) {
         var0.addMatrix((Matrix4f)var1);
      } else {
         if (var1 instanceof BaseObj) {
            var0.addObj((BaseObj)var1);
         }

      }
   }

   static FieldPacker createFieldPack(Object[] var0) {
      int var4 = var0.length;
      byte var3 = 0;
      int var1 = 0;

      int var2;
      for(var2 = 0; var1 < var4; ++var1) {
         var2 += getPackedSize(var0[var1]);
      }

      FieldPacker var5 = new FieldPacker(var2);
      var2 = var0.length;

      for(var1 = var3; var1 < var2; ++var1) {
         addToPack(var5, var0[var1]);
      }

      return var5;
   }

   static FieldPacker createFromArray(Object[] var0) {
      FieldPacker var3 = new FieldPacker(RenderScript.sPointerSize * 8);
      int var2 = var0.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3.addSafely(var0[var1]);
      }

      var3.resize(var3.mPos);
      return var3;
   }

   private static int getPackedSize(Object var0) {
      if (var0 instanceof Boolean) {
         return 1;
      } else if (var0 instanceof Byte) {
         return 1;
      } else if (var0 instanceof Short) {
         return 2;
      } else if (var0 instanceof Integer) {
         return 4;
      } else if (var0 instanceof Long) {
         return 8;
      } else if (var0 instanceof Float) {
         return 4;
      } else if (var0 instanceof Double) {
         return 8;
      } else if (var0 instanceof Byte2) {
         return 2;
      } else if (var0 instanceof Byte3) {
         return 3;
      } else if (var0 instanceof Byte4) {
         return 4;
      } else if (var0 instanceof Short2) {
         return 4;
      } else if (var0 instanceof Short3) {
         return 6;
      } else if (var0 instanceof Short4) {
         return 8;
      } else if (var0 instanceof Int2) {
         return 8;
      } else if (var0 instanceof Int3) {
         return 12;
      } else if (var0 instanceof Int4) {
         return 16;
      } else if (var0 instanceof Long2) {
         return 16;
      } else if (var0 instanceof Long3) {
         return 24;
      } else if (var0 instanceof Long4) {
         return 32;
      } else if (var0 instanceof Float2) {
         return 8;
      } else if (var0 instanceof Float3) {
         return 12;
      } else if (var0 instanceof Float4) {
         return 16;
      } else if (var0 instanceof Double2) {
         return 16;
      } else if (var0 instanceof Double3) {
         return 24;
      } else if (var0 instanceof Double4) {
         return 32;
      } else if (var0 instanceof Matrix2f) {
         return 16;
      } else if (var0 instanceof Matrix3f) {
         return 36;
      } else if (var0 instanceof Matrix4f) {
         return 64;
      } else if (var0 instanceof BaseObj) {
         return RenderScript.sPointerSize == 8 ? 32 : 4;
      } else {
         return 0;
      }
   }

   private boolean resize(int var1) {
      if (var1 == this.mLen) {
         return false;
      } else {
         byte[] var2 = new byte[var1];
         System.arraycopy(this.mData, 0, var2, 0, this.mPos);
         this.mData = var2;
         this.mLen = var1;
         return true;
      }
   }

   public void addBoolean(boolean var1) {
      this.addI8(var1);
   }

   public void addF32(float var1) {
      this.addI32(Float.floatToRawIntBits(var1));
   }

   public void addF32(Float2 var1) {
      this.addF32(var1.x);
      this.addF32(var1.y);
   }

   public void addF32(Float3 var1) {
      this.addF32(var1.x);
      this.addF32(var1.y);
      this.addF32(var1.z);
   }

   public void addF32(Float4 var1) {
      this.addF32(var1.x);
      this.addF32(var1.y);
      this.addF32(var1.z);
      this.addF32(var1.w);
   }

   public void addF64(double var1) {
      this.addI64(Double.doubleToRawLongBits(var1));
   }

   public void addF64(Double2 var1) {
      this.addF64(var1.x);
      this.addF64(var1.y);
   }

   public void addF64(Double3 var1) {
      this.addF64(var1.x);
      this.addF64(var1.y);
      this.addF64(var1.z);
   }

   public void addF64(Double4 var1) {
      this.addF64(var1.x);
      this.addF64(var1.y);
      this.addF64(var1.z);
      this.addF64(var1.w);
   }

   public void addI16(Short2 var1) {
      this.addI16(var1.x);
      this.addI16(var1.y);
   }

   public void addI16(Short3 var1) {
      this.addI16(var1.x);
      this.addI16(var1.y);
      this.addI16(var1.z);
   }

   public void addI16(Short4 var1) {
      this.addI16(var1.x);
      this.addI16(var1.y);
      this.addI16(var1.z);
      this.addI16(var1.w);
   }

   public void addI16(short var1) {
      this.align(2);
      byte[] var4 = this.mData;
      int var2 = this.mPos;
      int var3 = var2 + 1;
      this.mPos = var3;
      var4[var2] = (byte)(var1 & 255);
      this.mPos = var3 + 1;
      var4[var3] = (byte)(var1 >> 8);
   }

   public void addI32(int var1) {
      this.align(4);
      byte[] var4 = this.mData;
      int var3 = this.mPos;
      int var2 = var3 + 1;
      this.mPos = var2;
      var4[var3] = (byte)(var1 & 255);
      var3 = var2 + 1;
      this.mPos = var3;
      var4[var2] = (byte)(var1 >> 8 & 255);
      var2 = var3 + 1;
      this.mPos = var2;
      var4[var3] = (byte)(var1 >> 16 & 255);
      this.mPos = var2 + 1;
      var4[var2] = (byte)(var1 >> 24 & 255);
   }

   public void addI32(Int2 var1) {
      this.addI32(var1.x);
      this.addI32(var1.y);
   }

   public void addI32(Int3 var1) {
      this.addI32(var1.x);
      this.addI32(var1.y);
      this.addI32(var1.z);
   }

   public void addI32(Int4 var1) {
      this.addI32(var1.x);
      this.addI32(var1.y);
      this.addI32(var1.z);
      this.addI32(var1.w);
   }

   public void addI64(long var1) {
      this.align(8);
      byte[] var5 = this.mData;
      int var3 = this.mPos;
      int var4 = var3 + 1;
      this.mPos = var4;
      var5[var3] = (byte)((int)(var1 & 255L));
      var3 = var4 + 1;
      this.mPos = var3;
      var5[var4] = (byte)((int)(var1 >> 8 & 255L));
      var4 = var3 + 1;
      this.mPos = var4;
      var5[var3] = (byte)((int)(var1 >> 16 & 255L));
      var3 = var4 + 1;
      this.mPos = var3;
      var5[var4] = (byte)((int)(var1 >> 24 & 255L));
      var4 = var3 + 1;
      this.mPos = var4;
      var5[var3] = (byte)((int)(var1 >> 32 & 255L));
      var3 = var4 + 1;
      this.mPos = var3;
      var5[var4] = (byte)((int)(var1 >> 40 & 255L));
      var4 = var3 + 1;
      this.mPos = var4;
      var5[var3] = (byte)((int)(var1 >> 48 & 255L));
      this.mPos = var4 + 1;
      var5[var4] = (byte)((int)(var1 >> 56 & 255L));
   }

   public void addI64(Long2 var1) {
      this.addI64(var1.x);
      this.addI64(var1.y);
   }

   public void addI64(Long3 var1) {
      this.addI64(var1.x);
      this.addI64(var1.y);
      this.addI64(var1.z);
   }

   public void addI64(Long4 var1) {
      this.addI64(var1.x);
      this.addI64(var1.y);
      this.addI64(var1.z);
      this.addI64(var1.w);
   }

   public void addI8(byte var1) {
      byte[] var3 = this.mData;
      int var2 = this.mPos++;
      var3[var2] = var1;
   }

   public void addI8(Byte2 var1) {
      this.addI8(var1.x);
      this.addI8(var1.y);
   }

   public void addI8(Byte3 var1) {
      this.addI8(var1.x);
      this.addI8(var1.y);
      this.addI8(var1.z);
   }

   public void addI8(Byte4 var1) {
      this.addI8(var1.x);
      this.addI8(var1.y);
      this.addI8(var1.z);
      this.addI8(var1.w);
   }

   public void addMatrix(Matrix2f var1) {
      int var2 = 0;

      while(true) {
         float[] var3 = var1.mMat;
         if (var2 >= var3.length) {
            return;
         }

         this.addF32(var3[var2]);
         ++var2;
      }
   }

   public void addMatrix(Matrix3f var1) {
      int var2 = 0;

      while(true) {
         float[] var3 = var1.mMat;
         if (var2 >= var3.length) {
            return;
         }

         this.addF32(var3[var2]);
         ++var2;
      }
   }

   public void addMatrix(Matrix4f var1) {
      int var2 = 0;

      while(true) {
         float[] var3 = var1.mMat;
         if (var2 >= var3.length) {
            return;
         }

         this.addF32(var3[var2]);
         ++var2;
      }
   }

   public void addObj(BaseObj var1) {
      if (var1 != null) {
         if (RenderScript.sPointerSize == 8) {
            this.addI64(var1.getID((RenderScript)null));
            this.addI64(0L);
            this.addI64(0L);
            this.addI64(0L);
         } else {
            this.addI32((int)var1.getID((RenderScript)null));
         }
      } else if (RenderScript.sPointerSize == 8) {
         this.addI64(0L);
         this.addI64(0L);
         this.addI64(0L);
         this.addI64(0L);
      } else {
         this.addI32(0);
      }
   }

   public void addU16(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.align(2);
         byte[] var4 = this.mData;
         int var2 = this.mPos;
         int var3 = var2 + 1;
         this.mPos = var3;
         var4[var2] = (byte)(var1 & 255);
         this.mPos = var3 + 1;
         var4[var3] = (byte)(var1 >> 8);
      } else {
         Log.e("rs", .c.aK(var1, gThp.ImFLLUodvdrAc, " )"));
         throw new IllegalArgumentException("Saving value out of range for type");
      }
   }

   public void addU16(Int2 var1) {
      this.addU16(var1.x);
      this.addU16(var1.y);
   }

   public void addU16(Int3 var1) {
      this.addU16(var1.x);
      this.addU16(var1.y);
      this.addU16(var1.z);
   }

   public void addU16(Int4 var1) {
      this.addU16(var1.x);
      this.addU16(var1.y);
      this.addU16(var1.z);
      this.addU16(var1.w);
   }

   public void addU32(long var1) {
      if (var1 >= 0L && var1 <= 4294967295L) {
         this.align(4);
         byte[] var5 = this.mData;
         int var4 = this.mPos;
         int var3 = var4 + 1;
         this.mPos = var3;
         var5[var4] = (byte)((int)(var1 & 255L));
         var4 = var3 + 1;
         this.mPos = var4;
         var5[var3] = (byte)((int)(var1 >> 8 & 255L));
         var3 = var4 + 1;
         this.mPos = var3;
         var5[var4] = (byte)((int)(255L & var1 >> 16));
         this.mPos = var3 + 1;
         var5[var3] = (byte)((int)(var1 >> 24));
      } else {
         Log.e("rs", .nx.b(var1, "FieldPacker.addU32( ", " )"));
         throw new IllegalArgumentException("Saving value out of range for type");
      }
   }

   public void addU32(Long2 var1) {
      this.addU32(var1.x);
      this.addU32(var1.y);
   }

   public void addU32(Long3 var1) {
      this.addU32(var1.x);
      this.addU32(var1.y);
      this.addU32(var1.z);
   }

   public void addU32(Long4 var1) {
      this.addU32(var1.x);
      this.addU32(var1.y);
      this.addU32(var1.z);
      this.addU32(var1.w);
   }

   public void addU64(long var1) {
      if (var1 >= 0L) {
         this.align(8);
         byte[] var5 = this.mData;
         int var3 = this.mPos;
         int var4 = var3 + 1;
         this.mPos = var4;
         var5[var3] = (byte)((int)(var1 & 255L));
         var3 = var4 + 1;
         this.mPos = var3;
         var5[var4] = (byte)((int)(var1 >> 8 & 255L));
         var4 = var3 + 1;
         this.mPos = var4;
         var5[var3] = (byte)((int)(var1 >> 16 & 255L));
         var3 = var4 + 1;
         this.mPos = var3;
         var5[var4] = (byte)((int)(var1 >> 24 & 255L));
         var4 = var3 + 1;
         this.mPos = var4;
         var5[var3] = (byte)((int)(var1 >> 32 & 255L));
         var3 = var4 + 1;
         this.mPos = var3;
         var5[var4] = (byte)((int)(var1 >> 40 & 255L));
         var4 = var3 + 1;
         this.mPos = var4;
         var5[var3] = (byte)((int)(255L & var1 >> 48));
         this.mPos = var4 + 1;
         var5[var4] = (byte)((int)(var1 >> 56));
      } else {
         Log.e("rs", .nx.b(var1, "FieldPacker.addU64( ", " )"));
         throw new IllegalArgumentException("Saving value out of range for type");
      }
   }

   public void addU64(Long2 var1) {
      this.addU64(var1.x);
      this.addU64(var1.y);
   }

   public void addU64(Long3 var1) {
      this.addU64(var1.x);
      this.addU64(var1.y);
      this.addU64(var1.z);
   }

   public void addU64(Long4 var1) {
      this.addU64(var1.x);
      this.addU64(var1.y);
      this.addU64(var1.z);
      this.addU64(var1.w);
   }

   public void addU8(Short2 var1) {
      this.addU8(var1.x);
      this.addU8(var1.y);
   }

   public void addU8(Short3 var1) {
      this.addU8(var1.x);
      this.addU8(var1.y);
      this.addU8(var1.z);
   }

   public void addU8(Short4 var1) {
      this.addU8(var1.x);
      this.addU8(var1.y);
      this.addU8(var1.z);
      this.addU8(var1.w);
   }

   public void addU8(short var1) {
      if (var1 >= 0 && var1 <= 255) {
         byte[] var3 = this.mData;
         int var2 = this.mPos++;
         var3[var2] = (byte)var1;
      } else {
         Log.e("rs", .c.aK(var1, diyLl.XboUXoAAkUFySmP, " )"));
         throw new IllegalArgumentException("Saving value out of range for type");
      }
   }

   public void align(int var1) {
      if (var1 > 0) {
         int var2 = var1 - 1;
         if ((var1 & var2) == 0) {
            while(true) {
               var1 = this.mPos;
               if ((var1 & var2) == 0) {
                  return;
               }

               this.mAlignment.flip(var1);
               byte[] var4 = this.mData;
               var1 = this.mPos++;
               var4[var1] = 0;
            }
         }
      }

      RSIllegalArgumentException var3 = new RSIllegalArgumentException(.c.aE(var1, "argument must be a non-negative non-zero power of 2: "));
      throw var3;
   }

   public final byte[] getData() {
      return this.mData;
   }

   public int getPos() {
      return this.mPos;
   }

   public void reset() {
      this.mPos = 0;
   }

   public void reset(int var1) {
      if (var1 >= 0 && var1 <= this.mLen) {
         this.mPos = var1;
      } else {
         throw new RSIllegalArgumentException(.c.aE(var1, "out of range argument: "));
      }
   }

   public void skip(int var1) {
      int var2 = this.mPos + var1;
      if (var2 >= 0 && var2 <= this.mLen) {
         this.mPos = var2;
      } else {
         throw new RSIllegalArgumentException(.c.aE(var1, "out of range argument: "));
      }
   }

   public boolean subBoolean() {
      return this.subI8() == 1;
   }

   public Byte2 subByte2() {
      Byte2 var1 = new Byte2();
      var1.y = this.subI8();
      var1.x = this.subI8();
      return var1;
   }

   public Byte3 subByte3() {
      Byte3 var1 = new Byte3();
      var1.z = this.subI8();
      var1.y = this.subI8();
      var1.x = this.subI8();
      return var1;
   }

   public Byte4 subByte4() {
      Byte4 var1 = new Byte4();
      var1.w = this.subI8();
      var1.z = this.subI8();
      var1.y = this.subI8();
      var1.x = this.subI8();
      return var1;
   }

   public Double2 subDouble2() {
      Double2 var1 = new Double2();
      var1.y = this.subF64();
      var1.x = this.subF64();
      return var1;
   }

   public Double3 subDouble3() {
      Double3 var1 = new Double3();
      var1.z = this.subF64();
      var1.y = this.subF64();
      var1.x = this.subF64();
      return var1;
   }

   public Double4 subDouble4() {
      Double4 var1 = new Double4();
      var1.w = this.subF64();
      var1.z = this.subF64();
      var1.y = this.subF64();
      var1.x = this.subF64();
      return var1;
   }

   public float subF32() {
      return Float.intBitsToFloat(this.subI32());
   }

   public double subF64() {
      return Double.longBitsToDouble(this.subI64());
   }

   public Float2 subFloat2() {
      Float2 var1 = new Float2();
      var1.y = this.subF32();
      var1.x = this.subF32();
      return var1;
   }

   public Float3 subFloat3() {
      Float3 var1 = new Float3();
      var1.z = this.subF32();
      var1.y = this.subF32();
      var1.x = this.subF32();
      return var1;
   }

   public Float4 subFloat4() {
      Float4 var1 = new Float4();
      var1.w = this.subF32();
      var1.z = this.subF32();
      var1.y = this.subF32();
      var1.x = this.subF32();
      return var1;
   }

   public short subI16() {
      this.subalign(2);
      byte[] var3 = this.mData;
      int var2 = this.mPos - 1;
      this.mPos = var2;
      byte var1 = var3[var2];
      --var2;
      this.mPos = var2;
      return (short)(var3[var2] & 255 | (short)((var1 & 255) << 8));
   }

   public int subI32() {
      this.subalign(4);
      byte[] var5 = this.mData;
      int var2 = this.mPos - 1;
      this.mPos = var2;
      byte var1 = var5[var2];
      int var3 = var2 - 1;
      this.mPos = var3;
      byte var6 = var5[var3];
      int var4 = var3 - 1;
      this.mPos = var4;
      byte var7 = var5[var4];
      --var4;
      this.mPos = var4;
      return var5[var4] & 255 | (var1 & 255) << 24 | (var6 & 255) << 16 | (var7 & 255) << 8;
   }

   public long subI64() {
      this.subalign(8);
      byte[] var16 = this.mData;
      int var1 = this.mPos - 1;
      this.mPos = var1;
      long var6 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var14 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var2 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var8 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var10 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var12 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      long var4 = (long)var16[var1];
      --var1;
      this.mPos = var1;
      return (long)var16[var1] & 255L | (var6 & 255L) << 56 | (var14 & 255L) << 48 | (var2 & 255L) << 40 | (var8 & 255L) << 32 | (var10 & 255L) << 24 | (var12 & 255L) << 16 | (var4 & 255L) << 8;
   }

   public byte subI8() {
      this.subalign(1);
      byte[] var2 = this.mData;
      int var1 = this.mPos - 1;
      this.mPos = var1;
      return var2[var1];
   }

   public Int2 subInt2() {
      Int2 var1 = new Int2();
      var1.y = this.subI32();
      var1.x = this.subI32();
      return var1;
   }

   public Int3 subInt3() {
      Int3 var1 = new Int3();
      var1.z = this.subI32();
      var1.y = this.subI32();
      var1.x = this.subI32();
      return var1;
   }

   public Int4 subInt4() {
      Int4 var1 = new Int4();
      var1.w = this.subI32();
      var1.z = this.subI32();
      var1.y = this.subI32();
      var1.x = this.subI32();
      return var1;
   }

   public Long2 subLong2() {
      Long2 var1 = new Long2();
      var1.y = this.subI64();
      var1.x = this.subI64();
      return var1;
   }

   public Long3 subLong3() {
      Long3 var1 = new Long3();
      var1.z = this.subI64();
      var1.y = this.subI64();
      var1.x = this.subI64();
      return var1;
   }

   public Long4 subLong4() {
      Long4 var1 = new Long4();
      var1.w = this.subI64();
      var1.z = this.subI64();
      var1.y = this.subI64();
      var1.x = this.subI64();
      return var1;
   }

   public Matrix2f subMatrix2f() {
      Matrix2f var2 = new Matrix2f();

      for(int var1 = var2.mMat.length - 1; var1 >= 0; --var1) {
         var2.mMat[var1] = this.subF32();
      }

      return var2;
   }

   public Matrix3f subMatrix3f() {
      Matrix3f var2 = new Matrix3f();

      for(int var1 = var2.mMat.length - 1; var1 >= 0; --var1) {
         var2.mMat[var1] = this.subF32();
      }

      return var2;
   }

   public Matrix4f subMatrix4f() {
      Matrix4f var2 = new Matrix4f();

      for(int var1 = var2.mMat.length - 1; var1 >= 0; --var1) {
         var2.mMat[var1] = this.subF32();
      }

      return var2;
   }

   public Short2 subShort2() {
      Short2 var1 = new Short2();
      var1.y = this.subI16();
      var1.x = this.subI16();
      return var1;
   }

   public Short3 subShort3() {
      Short3 var1 = new Short3();
      var1.z = this.subI16();
      var1.y = this.subI16();
      var1.x = this.subI16();
      return var1;
   }

   public Short4 subShort4() {
      Short4 var1 = new Short4();
      var1.w = this.subI16();
      var1.z = this.subI16();
      var1.y = this.subI16();
      var1.x = this.subI16();
      return var1;
   }

   public void subalign(int var1) {
      int var2 = var1 - 1;
      if ((var1 & var2) != 0) {
         RSIllegalArgumentException var3 = new RSIllegalArgumentException(.c.aE(var1, "argument must be a non-negative non-zero power of 2: "));
         throw var3;
      } else {
         while(true) {
            var1 = this.mPos;
            if ((var1 & var2) == 0) {
               if (var1 > 0) {
                  while(this.mAlignment.get(this.mPos - 1)) {
                     var1 = this.mPos - 1;
                     this.mPos = var1;
                     this.mAlignment.flip(var1);
                  }
               }

               return;
            }

            this.mPos = var1 - 1;
         }
      }
   }
}
