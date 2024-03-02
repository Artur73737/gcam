package android.support.v8.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.ui.mars.uPk.TRoaEYDrhZZT;
import com.google.android.apps.camera.ui.zoomlock.ySvq.diyLl;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import org.brotli.wrapper.dec.Hm.CLzmcq;

public class Allocation extends BaseObj {
   public static final int USAGE_GRAPHICS_TEXTURE = 2;
   public static final int USAGE_IO_INPUT = 32;
   public static final int USAGE_IO_OUTPUT = 64;
   public static final int USAGE_SCRIPT = 1;
   public static final int USAGE_SHARED = 128;
   static Options mBitmapOptions;
   Allocation mAdaptedAllocation;
   boolean mAutoPadding = false;
   Bitmap mBitmap;
   ByteBuffer mByteBuffer = null;
   long mByteBufferStride = 0L;
   boolean mConstrainedFace;
   boolean mConstrainedLOD;
   boolean mConstrainedY;
   boolean mConstrainedZ;
   int mCurrentCount;
   int mCurrentDimX;
   int mCurrentDimY;
   int mCurrentDimZ;
   boolean mIncAllocDestroyed;
   long mIncCompatAllocation;
   boolean mReadAllowed = true;
   Type$CubemapFace mSelectedFace;
   int mSelectedLOD;
   int mSelectedY;
   int mSelectedZ;
   int mSize;
   public Type mType;
   int mUsage;
   boolean mWriteAllowed = true;

   static {
      Options var0 = new Options();
      mBitmapOptions = var0;
      var0.inScaled = false;
   }

   public Allocation(long var1, RenderScript var3, Type var4, int var5) {
      super(var1, var3);
      this.mSelectedFace = Type$CubemapFace.POSITIVE_X;
      if ((var5 & -228) == 0) {
         if ((var5 & 32) != 0) {
            this.mWriteAllowed = false;
            if ((var5 & -36) != 0) {
               throw new RSIllegalArgumentException("Invalid usage combination.");
            }
         }

         this.mType = var4;
         this.mUsage = var5;
         this.mIncCompatAllocation = 0L;
         this.mIncAllocDestroyed = false;
         if (var4 != null) {
            this.mSize = var4.getCount() * this.mType.getElement().getBytesSize();
            this.updateCacheInfo(var4);
         }

         if (RenderScript.sUseGCHooks) {
            try {
               RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, this.mSize);
            } catch (Exception var6) {
               StringBuilder var7 = new StringBuilder();
               var7.append("Couldn't invoke registerNativeAllocation:");
               var7.append(var6);
               Log.e("RenderScript_jni", "Couldn't invoke registerNativeAllocation:".concat(var6.toString()));
               var7 = new StringBuilder();
               var7.append("Couldn't invoke registerNativeAllocation:");
               var7.append(var6);
               throw new RSRuntimeException("Couldn't invoke registerNativeAllocation:".concat(var6.toString()));
            }
         }
      } else {
         throw new RSIllegalArgumentException("Unknown usage specified.");
      }
   }

   private void copy1DRangeFromUnchecked(int var1, int var2, Object var3, Element$DataType var4, int var5) {
      int var6 = this.mType.mElement.getBytesSize() * var2;
      boolean var7;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         var7 = true;
      } else {
         var7 = false;
      }

      this.data1DChecks(var1, var2, var5 * var4.mSize, var6, var7);
      this.mRS.nAllocationData1D(this.getIDSafe(), var1, this.mSelectedLOD, var2, var3, var6, var4, this.mType.mElement.mType.mSize, var7);
   }

   private void copy1DRangeToUnchecked(int var1, int var2, Object var3, Element$DataType var4, int var5) {
      int var6 = this.mType.mElement.getBytesSize() * var2;
      boolean var7;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         var7 = true;
      } else {
         var7 = false;
      }

      this.data1DChecks(var1, var2, var5 * var4.mSize, var6, var7);
      this.mRS.nAllocationRead1D(this.getIDSafe(), var1, this.mSelectedLOD, var2, var3, var6, var4, this.mType.mElement.mType.mSize, var7);
   }

   private void copy3DRangeFromUnchecked(int var1, int var2, int var3, int var4, int var5, int var6, Object var7, Element$DataType var8, int var9) {
      this.mRS.validate();
      this.validate3DRange(var1, var2, var3, var4, var5, var6);
      int var10 = this.mType.mElement.getBytesSize();
      var9 = var8.mSize * var9;
      var10 = var10 * var4 * var5 * var6;
      boolean var11;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         if (var10 / 4 * 3 > var9) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var9 = var10;
         var11 = true;
      } else {
         if (var10 > var9) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var11 = false;
      }

      this.mRS.nAllocationData3D(this.getIDSafe(), var1, var2, var3, this.mSelectedLOD, var4, var5, var6, var7, var9, var8, this.mType.mElement.mType.mSize, var11);
   }

   private void copyFromUnchecked(Object var1, Element$DataType var2, int var3) {
      this.mRS.validate();
      int var4 = this.mCurrentDimZ;
      if (var4 > 0) {
         this.copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, var4, var1, var2, var3);
      } else {
         var4 = this.mCurrentDimY;
         if (var4 > 0) {
            this.copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, var4, var1, var2, var3);
         } else {
            this.copy1DRangeFromUnchecked(0, this.mCurrentCount, var1, var2, var3);
         }
      }
   }

   private void copyTo(Object var1, Element$DataType var2, int var3) {
      this.mRS.validate();
      boolean var4;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var4) {
         if (var2.mSize * var3 < this.mSize / 4 * 3) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
         }
      } else if (var2.mSize * var3 < this.mSize) {
         throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
      }

      RenderScript var5 = this.mRS;
      var5.nAllocationRead(this.getID(var5), var1, var2, this.mType.mElement.mType.mSize, var4);
   }

   public static Allocation createCubemapFromBitmap(RenderScript var0, Bitmap var1) {
      return createCubemapFromBitmap(var0, var1, Allocation$MipmapControl.MIPMAP_NONE, 2);
   }

   public static Allocation createCubemapFromBitmap(RenderScript var0, Bitmap var1, Allocation$MipmapControl var2, int var3) {
      var0.validate();
      int var4 = var1.getHeight();
      int var5 = var1.getWidth();
      if (var5 % 6 == 0) {
         if (var5 / 6 == var4) {
            if ((var4 - 1 & var4) == 0) {
               Element var9 = elementFromBitmap(var0, var1);
               Type$Builder var10 = new Type$Builder(var0, var9);
               var10.setX(var4);
               var10.setY(var4);
               boolean var6 = true;
               var10.setFaces(true);
               if (var2 != Allocation$MipmapControl.MIPMAP_FULL) {
                  var6 = false;
               }

               var10.setMipmaps(var6);
               Type var11 = var10.create();
               long var7 = var0.nAllocationCubeCreateFromBitmap(var11.getID(var0), var2.mID, var1, var3);
               if (var7 != 0L) {
                  return new Allocation(var7, var0, var11, var3);
               } else {
                  throw new RSRuntimeException(.c.aH(var9, var1, "Load failed for bitmap ", CLzmcq.JGkMUFxrTa));
               }
            } else {
               throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
            }
         } else {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
         }
      } else {
         throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
      }
   }

   public static Allocation createCubemapFromCubeFaces(RenderScript var0, Bitmap var1, Bitmap var2, Bitmap var3, Bitmap var4, Bitmap var5, Bitmap var6) {
      Allocation$MipmapControl var7 = Allocation$MipmapControl.MIPMAP_NONE;
      return null;
   }

   public static Allocation createCubemapFromCubeFaces(RenderScript var0, Bitmap var1, Bitmap var2, Bitmap var3, Bitmap var4, Bitmap var5, Bitmap var6, Allocation$MipmapControl var7, int var8) {
      return null;
   }

   public static Allocation createFromBitmap(RenderScript var0, Bitmap var1) {
      return createFromBitmap(var0, var1, Allocation$MipmapControl.MIPMAP_NONE, 131);
   }

   public static Allocation createFromBitmap(RenderScript var0, Bitmap var1, Allocation$MipmapControl var2, int var3) {
      var0.validate();
      if (var1.getConfig() == null) {
         if ((var3 & 128) == 0) {
            Bitmap var8 = Bitmap.createBitmap(var1.getWidth(), var1.getHeight(), Config.ARGB_8888);
            (new Canvas(var8)).drawBitmap(var1, 0.0F, 0.0F, (Paint)null);
            return createFromBitmap(var0, var8, var2, var3);
         } else {
            throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
         }
      } else {
         Type var6 = typeFromBitmap(var0, var1, var2);
         long var4;
         if (var2 == Allocation$MipmapControl.MIPMAP_NONE && var6.getElement().isCompatible(Element.RGBA_8888(var0)) && var3 == 131) {
            var4 = var0.nAllocationCreateBitmapBackedAllocation(var6.getID(var0), var2.mID, var1, 131);
            if (var4 != 0L) {
               Allocation var7 = new Allocation(var4, var0, var6, 131);
               var7.setBitmap(var1);
               return var7;
            } else {
               throw new RSRuntimeException("Load failed.");
            }
         } else {
            var4 = var0.nAllocationCreateFromBitmap(var6.getID(var0), var2.mID, var1, var3);
            if (var4 != 0L) {
               return new Allocation(var4, var0, var6, var3);
            } else {
               throw new RSRuntimeException("Load failed.");
            }
         }
      }
   }

   public static Allocation createFromBitmapResource(RenderScript var0, Resources var1, int var2) {
      return createFromBitmapResource(var0, var1, var2, Allocation$MipmapControl.MIPMAP_NONE, 3);
   }

   public static Allocation createFromBitmapResource(RenderScript var0, Resources var1, int var2, Allocation$MipmapControl var3, int var4) {
      var0.validate();
      if ((var4 & 224) == 0) {
         Bitmap var6 = BitmapFactory.decodeResource(var1, var2);
         Allocation var5 = createFromBitmap(var0, var6, var3, var4);
         var6.recycle();
         return var5;
      } else {
         throw new RSIllegalArgumentException("Unsupported usage specified.");
      }
   }

   public static Allocation createFromString(RenderScript var0, String var1, int var2) {
      var0.validate();

      try {
         byte[] var5 = var1.getBytes("UTF-8");
         Allocation var4 = createSized(var0, Element.U8(var0), var5.length, var2);
         var4.copyFrom(var5);
         return var4;
      } catch (Exception var3) {
         throw new RSRuntimeException("Could not convert string to utf-8.");
      }
   }

   public static Allocation createSized(RenderScript var0, Element var1, int var2) {
      return createSized(var0, var1, var2, 1);
   }

   public static Allocation createSized(RenderScript var0, Element var1, int var2, int var3) {
      var0.validate();
      Type$Builder var6 = new Type$Builder(var0, var1);
      var6.setX(var2);
      Type var7 = var6.create();
      long var4 = var0.nAllocationCreateTyped(var7.getID(var0), Allocation$MipmapControl.MIPMAP_NONE.mID, var3, 0L);
      if (var4 != 0L) {
         return new Allocation(var4, var0, var7, var3);
      } else {
         throw new RSRuntimeException("Allocation creation failed.");
      }
   }

   public static Allocation createTyped(RenderScript var0, Type var1) {
      return createTyped(var0, var1, Allocation$MipmapControl.MIPMAP_NONE, 1);
   }

   public static Allocation createTyped(RenderScript var0, Type var1, int var2) {
      return createTyped(var0, var1, Allocation$MipmapControl.MIPMAP_NONE, var2);
   }

   public static Allocation createTyped(RenderScript var0, Type var1, Allocation$MipmapControl var2, int var3) {
      var0.validate();
      if (var1.getID(var0) != 0L) {
         if (!var0.usingIO() && (var3 & 32) != 0) {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
         } else {
            long var4 = var0.nAllocationCreateTyped(var1.getID(var0), var2.mID, var3, 0L);
            if (var4 != 0L) {
               return new Allocation(var4, var0, var1, var3);
            } else {
               throw new RSRuntimeException("Allocation creation failed.");
            }
         }
      } else {
         throw new RSInvalidStateException("Bad Type");
      }
   }

   private void data1DChecks(int var1, int var2, int var3, int var4, boolean var5) {
      this.mRS.validate();
      if (var1 >= 0) {
         if (var2 > 0) {
            if (var1 + var2 <= this.mCurrentCount) {
               if (var5) {
                  if (var3 < var4 / 4 * 3) {
                     throw new RSIllegalArgumentException("Array too small for allocation type.");
                  }
               } else if (var3 < var4) {
                  throw new RSIllegalArgumentException("Array too small for allocation type.");
               }

            } else {
               StringBuilder var6 = new StringBuilder();
               var6.append(CLzmcq.uJXjGurqnMpBTcF);
               var6.append(this.mCurrentCount);
               var6.append(", got ");
               var6.append(var2);
               var6.append(" at offset ");
               var6.append(var1);
               var6.append(".");
               throw new RSIllegalArgumentException(var6.toString());
            }
         } else {
            throw new RSIllegalArgumentException("Count must be >= 1.");
         }
      } else {
         throw new RSIllegalArgumentException("Offset must be >= 0.");
      }
   }

   static Element elementFromBitmap(RenderScript var0, Bitmap var1) {
      Config var3 = var1.getConfig();
      if (var3 == Config.ALPHA_8) {
         return Element.A_8(var0);
      } else if (var3 == Config.ARGB_4444) {
         return Element.RGBA_4444(var0);
      } else if (var3 == Config.ARGB_8888) {
         return Element.RGBA_8888(var0);
      } else if (var3 == Config.RGB_565) {
         return Element.RGB_565(var0);
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("Bad bitmap type: ");
         var2.append(var3);
         throw new RSInvalidStateException("Bad bitmap type: ".concat(String.valueOf(var3)));
      }
   }

   private long getIDSafe() {
      Allocation var1 = this.mAdaptedAllocation;
      return var1 != null ? var1.getID(this.mRS) : this.getID(this.mRS);
   }

   private void setBitmap(Bitmap var1) {
      this.mBitmap = var1;
   }

   static Type typeFromBitmap(RenderScript var0, Bitmap var1, Allocation$MipmapControl var2) {
      Type$Builder var4 = new Type$Builder(var0, elementFromBitmap(var0, var1));
      var4.setX(var1.getWidth());
      var4.setY(var1.getHeight());
      boolean var3;
      if (var2 == Allocation$MipmapControl.MIPMAP_FULL) {
         var3 = true;
      } else {
         var3 = false;
      }

      var4.setMipmaps(var3);
      return var4.create();
   }

   private void updateCacheInfo(Type var1) {
      this.mCurrentDimX = var1.getX();
      this.mCurrentDimY = var1.getY();
      int var4 = var1.getZ();
      this.mCurrentDimZ = var4;
      int var3 = this.mCurrentDimX;
      this.mCurrentCount = var3;
      int var5 = this.mCurrentDimY;
      int var2 = var3;
      if (var5 > 1) {
         var2 = var3 * var5;
         this.mCurrentCount = var2;
      }

      if (var4 > 1) {
         this.mCurrentCount = var2 * var4;
      }

   }

   private void validate2DRange(int var1, int var2, int var3, int var4) {
      if (this.mAdaptedAllocation == null) {
         if (var1 >= 0 && var2 >= 0) {
            if (var4 >= 0 && var3 >= 0) {
               if (var1 + var3 > this.mCurrentDimX || var2 + var4 > this.mCurrentDimY) {
                  throw new RSIllegalArgumentException("Updated region larger than allocation.");
               }
            } else {
               throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
         } else {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
         }
      }
   }

   private void validate3DRange(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.mAdaptedAllocation == null) {
         if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
            if (var5 >= 0 && var4 >= 0 && var6 >= 0) {
               if (var1 + var4 > this.mCurrentDimX || var2 + var5 > this.mCurrentDimY || var3 + var6 > this.mCurrentDimZ) {
                  throw new RSIllegalArgumentException("Updated region larger than allocation.");
               }
            } else {
               throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
         } else {
            throw new RSIllegalArgumentException("Offset cannot be negative.");
         }
      }
   }

   private void validateBitmapFormat(Bitmap var1) {
      // $FF: Couldn't be decompiled
   }

   private void validateBitmapSize(Bitmap var1) {
      if (this.mCurrentDimX != var1.getWidth() || this.mCurrentDimY != var1.getHeight()) {
         throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
      }
   }

   private void validateIsFloat32() {
      if (this.mType.mElement.mType != Element$DataType.FLOAT_32) {
         StringBuilder var2 = new StringBuilder();
         var2.append("32 bit float source does not match allocation type ");
         Element$DataType var1 = this.mType.mElement.mType;
         var2.append(var1);
         throw new RSIllegalArgumentException("32 bit float source does not match allocation type ".concat(String.valueOf(var1)));
      }
   }

   private void validateIsFloat64() {
      if (this.mType.mElement.mType != Element$DataType.FLOAT_64) {
         StringBuilder var1 = new StringBuilder();
         var1.append("64 bit float source does not match allocation type ");
         Element$DataType var2 = this.mType.mElement.mType;
         var1.append(var2);
         throw new RSIllegalArgumentException("64 bit float source does not match allocation type ".concat(String.valueOf(var2)));
      }
   }

   private void validateIsInt16() {
      if (this.mType.mElement.mType != Element$DataType.SIGNED_16 && this.mType.mElement.mType != Element$DataType.UNSIGNED_16) {
         StringBuilder var1 = new StringBuilder();
         var1.append("16 bit integer source does not match allocation type ");
         Element$DataType var2 = this.mType.mElement.mType;
         var1.append(var2);
         throw new RSIllegalArgumentException("16 bit integer source does not match allocation type ".concat(String.valueOf(var2)));
      }
   }

   private void validateIsInt32() {
      if (this.mType.mElement.mType != Element$DataType.SIGNED_32 && this.mType.mElement.mType != Element$DataType.UNSIGNED_32) {
         StringBuilder var1 = new StringBuilder();
         var1.append("32 bit integer source does not match allocation type ");
         Element$DataType var2 = this.mType.mElement.mType;
         var1.append(var2);
         throw new RSIllegalArgumentException("32 bit integer source does not match allocation type ".concat(String.valueOf(var2)));
      }
   }

   private void validateIsInt64() {
      if (this.mType.mElement.mType != Element$DataType.SIGNED_64 && this.mType.mElement.mType != Element$DataType.UNSIGNED_64) {
         StringBuilder var2 = new StringBuilder();
         var2.append("64 bit integer source does not match allocation type ");
         Element$DataType var1 = this.mType.mElement.mType;
         var2.append(var1);
         throw new RSIllegalArgumentException("64 bit integer source does not match allocation type ".concat(String.valueOf(var1)));
      }
   }

   private void validateIsInt8() {
      if (this.mType.mElement.mType != Element$DataType.SIGNED_8 && this.mType.mElement.mType != Element$DataType.UNSIGNED_8) {
         StringBuilder var2 = new StringBuilder();
         String var3 = TRoaEYDrhZZT.qApHlX;
         var2.append(var3);
         Element$DataType var1 = this.mType.mElement.mType;
         var2.append(var1);
         throw new RSIllegalArgumentException(var3.concat(String.valueOf(var1)));
      }
   }

   private void validateIsObject() {
      if (this.mType.mElement.mType != Element$DataType.RS_ELEMENT) {
         Element$DataType var1 = this.mType.mElement.mType;
         if (var1 != Element$DataType.RS_TYPE && var1 != Element$DataType.RS_ALLOCATION && var1 != Element$DataType.RS_SAMPLER && var1 != Element$DataType.RS_SCRIPT) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Object source does not match allocation type ");
            var1 = this.mType.mElement.mType;
            var2.append(var1);
            throw new RSIllegalArgumentException("Object source does not match allocation type ".concat(String.valueOf(var1)));
         }
      }

   }

   private Element$DataType validateObjectIsPrimitiveArray(Object var1, boolean var2) {
      Class var3 = var1.getClass();
      if (var3.isArray()) {
         var3 = var3.getComponentType();
         if (var3.isPrimitive()) {
            if (var3 == Long.TYPE) {
               if (var2) {
                  this.validateIsInt64();
                  return this.mType.mElement.mType;
               } else {
                  return Element$DataType.SIGNED_64;
               }
            } else if (var3 == Integer.TYPE) {
               if (var2) {
                  this.validateIsInt32();
                  return this.mType.mElement.mType;
               } else {
                  return Element$DataType.SIGNED_32;
               }
            } else if (var3 == Short.TYPE) {
               if (var2) {
                  this.validateIsInt16();
                  return this.mType.mElement.mType;
               } else {
                  return Element$DataType.SIGNED_16;
               }
            } else if (var3 == Byte.TYPE) {
               if (var2) {
                  this.validateIsInt8();
                  return this.mType.mElement.mType;
               } else {
                  return Element$DataType.SIGNED_8;
               }
            } else if (var3 == Float.TYPE) {
               if (var2) {
                  this.validateIsFloat32();
               }

               return Element$DataType.FLOAT_32;
            } else if (var3 == Double.TYPE) {
               if (var2) {
                  this.validateIsFloat64();
               }

               return Element$DataType.FLOAT_64;
            } else {
               return null;
            }
         } else {
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
         }
      } else {
         throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
      }
   }

   public void copy1DRangeFrom(int var1, int var2, Allocation var3, int var4) {
      this.mRS.nAllocationData2D(this.getIDSafe(), var1, 0, this.mSelectedLOD, this.mSelectedFace.mID, var2, 1, var3.getID(this.mRS), var4, 0, var3.mSelectedLOD, var3.mSelectedFace.mID);
   }

   public void copy1DRangeFrom(int var1, int var2, Object var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, this.validateObjectIsPrimitiveArray(var3, true), Array.getLength(var3));
   }

   public void copy1DRangeFrom(int var1, int var2, byte[] var3) {
      this.validateIsInt8();
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_8, var3.length);
   }

   public void copy1DRangeFrom(int var1, int var2, float[] var3) {
      this.validateIsFloat32();
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.FLOAT_32, var3.length);
   }

   public void copy1DRangeFrom(int var1, int var2, int[] var3) {
      this.validateIsInt32();
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_32, var3.length);
   }

   public void copy1DRangeFrom(int var1, int var2, short[] var3) {
      this.validateIsInt16();
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_16, var3.length);
   }

   public void copy1DRangeFromUnchecked(int var1, int var2, Object var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, this.validateObjectIsPrimitiveArray(var3, false), Array.getLength(var3));
   }

   public void copy1DRangeFromUnchecked(int var1, int var2, byte[] var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_8, var3.length);
   }

   public void copy1DRangeFromUnchecked(int var1, int var2, float[] var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.FLOAT_32, var3.length);
   }

   public void copy1DRangeFromUnchecked(int var1, int var2, int[] var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_32, var3.length);
   }

   public void copy1DRangeFromUnchecked(int var1, int var2, short[] var3) {
      this.copy1DRangeFromUnchecked(var1, var2, var3, Element$DataType.SIGNED_16, var3.length);
   }

   public void copy1DRangeTo(int var1, int var2, Object var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, this.validateObjectIsPrimitiveArray(var3, true), Array.getLength(var3));
   }

   public void copy1DRangeTo(int var1, int var2, byte[] var3) {
      this.validateIsInt8();
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_8, var3.length);
   }

   public void copy1DRangeTo(int var1, int var2, float[] var3) {
      this.validateIsFloat32();
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.FLOAT_32, var3.length);
   }

   public void copy1DRangeTo(int var1, int var2, int[] var3) {
      this.validateIsInt32();
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_32, var3.length);
   }

   public void copy1DRangeTo(int var1, int var2, short[] var3) {
      this.validateIsInt16();
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_16, var3.length);
   }

   public void copy1DRangeToUnchecked(int var1, int var2, Object var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, this.validateObjectIsPrimitiveArray(var3, false), Array.getLength(var3));
   }

   public void copy1DRangeToUnchecked(int var1, int var2, byte[] var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_8, var3.length);
   }

   public void copy1DRangeToUnchecked(int var1, int var2, float[] var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.FLOAT_32, var3.length);
   }

   public void copy1DRangeToUnchecked(int var1, int var2, int[] var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_32, var3.length);
   }

   public void copy1DRangeToUnchecked(int var1, int var2, short[] var3) {
      this.copy1DRangeToUnchecked(var1, var2, var3, Element$DataType.SIGNED_16, var3.length);
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, Allocation var5, int var6, int var7) {
      this.mRS.validate();
      this.validate2DRange(var1, var2, var3, var4);
      this.mRS.nAllocationData2D(this.getIDSafe(), var1, var2, this.mSelectedLOD, this.mSelectedFace.mID, var3, var4, var5.getID(this.mRS), var6, var7, var5.mSelectedLOD, var5.mSelectedFace.mID);
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, Object var5) {
      this.copy2DRangeFromUnchecked(var1, var2, var3, var4, var5, this.validateObjectIsPrimitiveArray(var5, true), Array.getLength(var5));
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, byte[] var5) {
      this.validateIsInt8();
      this.copy2DRangeFromUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_8, var5.length);
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, float[] var5) {
      this.validateIsFloat32();
      this.copy2DRangeFromUnchecked(var1, var2, var3, var4, var5, Element$DataType.FLOAT_32, var5.length);
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, int[] var5) {
      this.validateIsInt32();
      this.copy2DRangeFromUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_32, var5.length);
   }

   public void copy2DRangeFrom(int var1, int var2, int var3, int var4, short[] var5) {
      this.validateIsInt16();
      this.copy2DRangeFromUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_16, var5.length);
   }

   public void copy2DRangeFrom(int var1, int var2, Bitmap var3) {
      this.mRS.validate();
      if (var3.getConfig() == null) {
         Bitmap var4 = Bitmap.createBitmap(var3.getWidth(), var3.getHeight(), Config.ARGB_8888);
         (new Canvas(var4)).drawBitmap(var3, 0.0F, 0.0F, (Paint)null);
         this.copy2DRangeFrom(var1, var2, var4);
      } else {
         this.validateBitmapFormat(var3);
         this.validate2DRange(var1, var2, var3.getWidth(), var3.getHeight());
         this.mRS.nAllocationData2D(this.getIDSafe(), var1, var2, this.mSelectedLOD, this.mSelectedFace.mID, var3);
      }
   }

   public void copy2DRangeFromUnchecked(int var1, int var2, int var3, int var4, Object var5, Element$DataType var6, int var7) {
      this.mRS.validate();
      this.validate2DRange(var1, var2, var3, var4);
      int var8 = this.mType.mElement.getBytesSize();
      var7 = var6.mSize * var7;
      var8 = var8 * var3 * var4;
      boolean var9;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         if (var8 / 4 * 3 > var7) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var7 = var8;
         var9 = true;
      } else {
         if (var8 > var7) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var9 = false;
      }

      this.mRS.nAllocationData2D(this.getIDSafe(), var1, var2, this.mSelectedLOD, this.mSelectedFace.mID, var3, var4, var5, var7, var6, this.mType.mElement.mType.mSize, var9);
   }

   public void copy2DRangeTo(int var1, int var2, int var3, int var4, Object var5) {
      this.copy2DRangeToUnchecked(var1, var2, var3, var4, var5, this.validateObjectIsPrimitiveArray(var5, true), Array.getLength(var5));
   }

   public void copy2DRangeTo(int var1, int var2, int var3, int var4, byte[] var5) {
      this.validateIsInt8();
      this.copy2DRangeToUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_8, var5.length);
   }

   public void copy2DRangeTo(int var1, int var2, int var3, int var4, float[] var5) {
      this.validateIsFloat32();
      this.copy2DRangeToUnchecked(var1, var2, var3, var4, var5, Element$DataType.FLOAT_32, var5.length);
   }

   public void copy2DRangeTo(int var1, int var2, int var3, int var4, int[] var5) {
      this.validateIsInt32();
      this.copy2DRangeToUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_32, var5.length);
   }

   public void copy2DRangeTo(int var1, int var2, int var3, int var4, short[] var5) {
      this.validateIsInt16();
      this.copy2DRangeToUnchecked(var1, var2, var3, var4, var5, Element$DataType.SIGNED_16, var5.length);
   }

   public void copy2DRangeToUnchecked(int var1, int var2, int var3, int var4, Object var5, Element$DataType var6, int var7) {
      this.mRS.validate();
      this.validate2DRange(var1, var2, var3, var4);
      int var8 = this.mType.mElement.getBytesSize();
      var7 = var6.mSize * var7;
      var8 = var8 * var3 * var4;
      boolean var9;
      if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
         if (var8 / 4 * 3 > var7) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var7 = var8;
         var9 = true;
      } else {
         if (var8 > var7) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
         }

         var9 = false;
      }

      this.mRS.nAllocationRead2D(this.getIDSafe(), var1, var2, this.mSelectedLOD, this.mSelectedFace.mID, var3, var4, var5, var7, var6, this.mType.mElement.mType.mSize, var9);
   }

   public void copy3DRangeFrom(int var1, int var2, int var3, int var4, int var5, int var6, Allocation var7, int var8, int var9, int var10) {
      this.mRS.validate();
      this.validate3DRange(var1, var2, var3, var4, var5, var6);
      this.mRS.nAllocationData3D(this.getIDSafe(), var1, var2, var3, this.mSelectedLOD, var4, var5, var6, var7.getID(this.mRS), var8, var9, var10, var7.mSelectedLOD);
   }

   public void copy3DRangeFrom(int var1, int var2, int var3, int var4, int var5, int var6, Object var7) {
      this.copy3DRangeFromUnchecked(var1, var2, var3, var4, var5, var6, var7, this.validateObjectIsPrimitiveArray(var7, true), Array.getLength(var7));
   }

   public void copyFrom(Bitmap var1) {
      this.mRS.validate();
      if (var1.getConfig() == null) {
         Bitmap var3 = Bitmap.createBitmap(var1.getWidth(), var1.getHeight(), Config.ARGB_8888);
         (new Canvas(var3)).drawBitmap(var1, 0.0F, 0.0F, (Paint)null);
         this.copyFrom(var3);
      } else {
         this.validateBitmapSize(var1);
         this.validateBitmapFormat(var1);
         RenderScript var2 = this.mRS;
         var2.nAllocationCopyFromBitmap(this.getID(var2), var1);
      }
   }

   public void copyFrom(Allocation var1) {
      this.mRS.validate();
      if (this.mType.equals(var1.getType())) {
         this.copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, var1, 0, 0);
      } else {
         throw new RSIllegalArgumentException("Types of allocations must match.");
      }
   }

   public void copyFrom(Object var1) {
      this.copyFromUnchecked(var1, this.validateObjectIsPrimitiveArray(var1, true), Array.getLength(var1));
   }

   public void copyFrom(byte[] var1) {
      this.validateIsInt8();
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_8, var1.length);
   }

   public void copyFrom(float[] var1) {
      this.validateIsFloat32();
      this.copyFromUnchecked(var1, Element$DataType.FLOAT_32, var1.length);
   }

   public void copyFrom(int[] var1) {
      this.validateIsInt32();
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_32, var1.length);
   }

   public void copyFrom(BaseObj[] var1) {
      this.mRS.validate();
      this.validateIsObject();
      int var2 = var1.length;
      if (var2 != this.mCurrentCount) {
         StringBuilder var4 = new StringBuilder();
         var4.append("Array size mismatch, allocation sizeX = ");
         var4.append(this.mCurrentCount);
         var4.append(", array length = ");
         var4.append(var2);
         RSIllegalArgumentException var5 = new RSIllegalArgumentException(var4.toString());
         throw var5;
      } else if (RenderScript.sPointerSize == 8) {
         long[] var6 = new long[var2 * 4];

         for(var2 = 0; var2 < var1.length; ++var2) {
            var6[var2 * 4] = var1[var2].getID(this.mRS);
         }

         this.copy1DRangeFromUnchecked(0, this.mCurrentCount, (Object)var6);
      } else {
         int[] var3 = new int[var2];

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3[var2] = (int)var1[var2].getID(this.mRS);
         }

         this.copy1DRangeFromUnchecked(0, this.mCurrentCount, (int[])var3);
      }
   }

   public void copyFrom(short[] var1) {
      this.validateIsInt16();
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_16, var1.length);
   }

   public void copyFromUnchecked(Object var1) {
      this.copyFromUnchecked(var1, this.validateObjectIsPrimitiveArray(var1, false), Array.getLength(var1));
   }

   public void copyFromUnchecked(byte[] var1) {
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_8, var1.length);
   }

   public void copyFromUnchecked(float[] var1) {
      this.copyFromUnchecked(var1, Element$DataType.FLOAT_32, var1.length);
   }

   public void copyFromUnchecked(int[] var1) {
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_32, var1.length);
   }

   public void copyFromUnchecked(short[] var1) {
      this.copyFromUnchecked(var1, Element$DataType.SIGNED_16, var1.length);
   }

   public void copyTo(Bitmap var1) {
      this.mRS.validate();
      this.validateBitmapFormat(var1);
      this.validateBitmapSize(var1);
      RenderScript var2 = this.mRS;
      var2.nAllocationCopyToBitmap(this.getID(var2), var1);
   }

   public void copyTo(Object var1) {
      this.copyTo(var1, this.validateObjectIsPrimitiveArray(var1, true), Array.getLength(var1));
   }

   public void copyTo(byte[] var1) {
      this.validateIsInt8();
      this.copyTo(var1, Element$DataType.SIGNED_8, var1.length);
   }

   public void copyTo(float[] var1) {
      this.validateIsFloat32();
      this.copyTo(var1, Element$DataType.FLOAT_32, var1.length);
   }

   public void copyTo(int[] var1) {
      this.validateIsInt32();
      this.copyTo(var1, Element$DataType.SIGNED_32, var1.length);
   }

   public void copyTo(short[] var1) {
      this.validateIsInt16();
      this.copyTo(var1, Element$DataType.SIGNED_16, var1.length);
   }

   public void destroy() {
      if (this.mIncCompatAllocation != 0L) {
         synchronized(this){}

         boolean var1;
         label309: {
            Throwable var10000;
            boolean var10001;
            label301: {
               label310: {
                  label299: {
                     try {
                        if (!this.mIncAllocDestroyed) {
                           break label299;
                        }
                     } catch (Throwable var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label301;
                     }

                     var1 = false;
                     break label310;
                  }

                  var1 = true;

                  try {
                     this.mIncAllocDestroyed = true;
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label301;
                  }
               }

               label290:
               try {
                  break label309;
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label290;
               }
            }

            while(true) {
               Throwable var2 = var10000;

               try {
                  throw var2;
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var1) {
            ReadLock var23 = this.mRS.mRWLock.readLock();
            var23.lock();
            if (this.mRS.isAlive()) {
               this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
            }

            var23.unlock();
            this.mIncCompatAllocation = 0L;
         }
      }

      if ((this.mUsage & 96) != 0) {
         this.setSurface((Surface)null);
      }

      super.destroy();
   }

   protected void finalize() {
      if (RenderScript.sUseGCHooks) {
         RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, this.mSize);
      }

      super.finalize();
   }

   public void generateMipmaps() {
      RenderScript var1 = this.mRS;
      var1.nAllocationGenerateMipmaps(this.getID(var1));
   }

   public ByteBuffer getByteBuffer() {
      int var1 = this.mType.getX() * this.mType.getElement().getBytesSize();
      if (this.mRS.getDispatchAPILevel() < 21) {
         if (this.mType.getZ() > 0) {
            return null;
         } else {
            byte[] var3;
            if (this.mType.getY() > 0) {
               var3 = new byte[this.mType.getY() * var1];
               this.copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), var3, Element$DataType.SIGNED_8, var1 * this.mType.getY());
            } else {
               var3 = new byte[var1];
               this.copy1DRangeToUnchecked(0, this.mType.getX(), (byte[])var3);
            }

            ByteBuffer var4 = ByteBuffer.wrap(var3).asReadOnlyBuffer();
            this.mByteBufferStride = (long)var1;
            return var4;
         }
      } else {
         if (this.mByteBuffer == null || (this.mUsage & 32) != 0) {
            RenderScript var2 = this.mRS;
            this.mByteBuffer = var2.nAllocationGetByteBuffer(this.getID(var2), var1, this.mType.getY(), this.mType.getZ());
         }

         return this.mByteBuffer;
      }
   }

   public int getBytesSize() {
      Type var3 = this.mType;
      if (var3.mDimYuv != 0) {
         double var1 = (double)(var3.getCount() * this.mType.getElement().getBytesSize());
         Double.isNaN(var1);
         return (int)Math.ceil(var1 * 1.5D);
      } else {
         return var3.getCount() * this.mType.getElement().getBytesSize();
      }
   }

   public Element getElement() {
      return this.mType.getElement();
   }

   public long getIncAllocID() {
      return this.mIncCompatAllocation;
   }

   public long getStride() {
      long var1 = this.mByteBufferStride;
      if (var1 == 0L) {
         if (this.mRS.getDispatchAPILevel() > 21) {
            RenderScript var3 = this.mRS;
            var1 = var3.nAllocationGetStride(this.getID(var3));
            this.mByteBufferStride = var1;
         } else {
            var1 = (long)(this.mType.getX() * this.mType.getElement().getBytesSize());
            this.mByteBufferStride = var1;
         }
      }

      return var1;
   }

   public Type getType() {
      return this.mType;
   }

   public int getUsage() {
      return this.mUsage;
   }

   public void ioReceive() {
      if ((this.mUsage & 32) != 0) {
         this.mRS.validate();
         RenderScript var1 = this.mRS;
         var1.nAllocationIoReceive(this.getID(var1));
      } else {
         throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
      }
   }

   public void ioSend() {
      if ((this.mUsage & 64) != 0) {
         this.mRS.validate();
         RenderScript var1 = this.mRS;
         var1.nAllocationIoSend(this.getID(var1));
      } else {
         throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
      }
   }

   public void ioSendOutput() {
      this.ioSend();
   }

   public void setAutoPadding(boolean var1) {
      this.mAutoPadding = var1;
   }

   public void setFromFieldPacker(int var1, int var2, FieldPacker var3) {
      this.mRS.validate();
      if (var2 < this.mType.mElement.mElements.length) {
         if (var1 >= 0) {
            byte[] var6 = var3.getData();
            int var4 = var3.getPos();
            int var5 = this.mType.mElement.mElements[var2].getBytesSize() * this.mType.mElement.mArraySizes[var2];
            if (var4 == var5) {
               this.mRS.nAllocationElementData1D(this.getIDSafe(), var1, this.mSelectedLOD, var2, var6, var4);
            } else {
               throw new RSIllegalArgumentException(.c.aI(var5, var4, "Field packer sizelength ", " does not match component size ", "."));
            }
         } else {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
         }
      } else {
         throw new RSIllegalArgumentException(.c.aK(var2, "Component_number ", diyLl.goQRilGq));
      }
   }

   public void setFromFieldPacker(int var1, FieldPacker var2) {
      this.mRS.validate();
      int var4 = this.mType.mElement.getBytesSize();
      byte[] var6 = var2.getData();
      int var5 = var2.getPos();
      int var3 = var5 / var4;
      if (var4 * var3 == var5) {
         this.copy1DRangeFromUnchecked(var1, var3, var6);
      } else {
         throw new RSIllegalArgumentException(.c.aI(var4, var5, "Field packer length ", " not divisible by element size ", "."));
      }
   }

   public void setIncAllocID(long var1) {
      this.mIncCompatAllocation = var1;
   }

   public void setSurface(Surface var1) {
      this.mRS.validate();
      if ((this.mUsage & 64) != 0) {
         RenderScript var2 = this.mRS;
         var2.nAllocationSetSurface(this.getID(var2), var1);
      } else {
         throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
      }
   }

   public void syncAll(int var1) {
      switch(var1) {
      case 1:
      case 2:
         this.mRS.validate();
         this.mRS.nAllocationSyncAll(this.getIDSafe(), var1);
         return;
      default:
         throw new RSIllegalArgumentException("Source must be exactly one usage type.");
      }
   }
}
