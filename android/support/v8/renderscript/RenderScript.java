package android.support.v8.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.hdrplus.fusion.api.qAwe.yGCWWDnsImN;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class RenderScript {
   private static final String CACHE_PATH = "com.android.renderscript.cache";
   public static final int CREATE_FLAG_NONE = 0;
   static final boolean DEBUG = false;
   static final boolean LOG_ENABLED = false;
   static final String LOG_TAG = "RenderScript_jni";
   static final int SUPPORT_LIB_API = 23;
   static final int SUPPORT_LIB_VERSION = 2301;
   static Object lock = new Object();
   private static String mBlackList = "";
   static String mCachePath;
   private static ArrayList mProcessContextList = new ArrayList();
   static Method registerNativeAllocation;
   static Method registerNativeFree;
   static boolean sInitialized;
   private static int sNative = -1;
   static int sPointerSize;
   static Object sRuntime;
   private static int sSdkVersion = -1;
   static boolean sUseGCHooks;
   private static boolean useIOlib = false;
   private static boolean useNative;
   private Context mApplicationContext;
   long mContext;
   private int mContextFlags = 0;
   private int mContextSdkVersion = 0;
   RenderScript$ContextType mContextType;
   private boolean mDestroyed = false;
   private int mDispatchAPILevel = 0;
   Element mElement_ALLOCATION;
   Element mElement_A_8;
   Element mElement_BOOLEAN;
   Element mElement_CHAR_2;
   Element mElement_CHAR_3;
   Element mElement_CHAR_4;
   Element mElement_DOUBLE_2;
   Element mElement_DOUBLE_3;
   Element mElement_DOUBLE_4;
   Element mElement_ELEMENT;
   Element mElement_F32;
   Element mElement_F64;
   Element mElement_FLOAT_2;
   Element mElement_FLOAT_3;
   Element mElement_FLOAT_4;
   Element mElement_I16;
   Element mElement_I32;
   Element mElement_I64;
   Element mElement_I8;
   Element mElement_INT_2;
   Element mElement_INT_3;
   Element mElement_INT_4;
   Element mElement_LONG_2;
   Element mElement_LONG_3;
   Element mElement_LONG_4;
   Element mElement_MATRIX_2X2;
   Element mElement_MATRIX_3X3;
   Element mElement_MATRIX_4X4;
   Element mElement_RGBA_4444;
   Element mElement_RGBA_5551;
   Element mElement_RGBA_8888;
   Element mElement_RGB_565;
   Element mElement_RGB_888;
   Element mElement_SAMPLER;
   Element mElement_SCRIPT;
   Element mElement_SHORT_2;
   Element mElement_SHORT_3;
   Element mElement_SHORT_4;
   Element mElement_TYPE;
   Element mElement_U16;
   Element mElement_U32;
   Element mElement_U64;
   Element mElement_U8;
   Element mElement_UCHAR_2;
   Element mElement_UCHAR_3;
   Element mElement_UCHAR_4;
   Element mElement_UINT_2;
   Element mElement_UINT_3;
   Element mElement_UINT_4;
   Element mElement_ULONG_2;
   Element mElement_ULONG_3;
   Element mElement_ULONG_4;
   Element mElement_USHORT_2;
   Element mElement_USHORT_3;
   Element mElement_USHORT_4;
   private boolean mEnableMultiInput = false;
   RenderScript$RSErrorHandler mErrorCallback = null;
   long mIncCon;
   boolean mIncLoaded;
   private boolean mIsProcessContext = false;
   RenderScript$RSMessageHandler mMessageCallback = null;
   RenderScript$MessageThread mMessageThread;
   private String mNativeLibDir;
   ReentrantReadWriteLock mRWLock;
   Sampler mSampler_CLAMP_LINEAR;
   Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
   Sampler mSampler_CLAMP_NEAREST;
   Sampler mSampler_MIRRORED_REPEAT_LINEAR;
   Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
   Sampler mSampler_MIRRORED_REPEAT_NEAREST;
   Sampler mSampler_WRAP_LINEAR;
   Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
   Sampler mSampler_WRAP_NEAREST;

   public RenderScript(Context var1) {
      this.mContextType = RenderScript$ContextType.NORMAL;
      if (var1 != null) {
         var1 = var1.getApplicationContext();
         this.mApplicationContext = var1;
         this.mNativeLibDir = var1.getApplicationInfo().nativeLibraryDir;
      }

      this.mIncCon = 0L;
      this.mIncLoaded = false;
      this.mRWLock = new ReentrantReadWriteLock();
   }

   public static RenderScript create(Context var0) {
      return create(var0, RenderScript$ContextType.NORMAL);
   }

   public static RenderScript create(Context var0, int var1) {
      return create(var0, var1, RenderScript$ContextType.NORMAL, 0);
   }

   public static RenderScript create(Context var0, int var1, RenderScript$ContextType var2) {
      return create(var0, var1, var2, 0);
   }

   public static RenderScript create(Context var0, int var1, RenderScript$ContextType var2, int var3) {
      ArrayList var4 = mProcessContextList;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label224: {
         Iterator var5;
         try {
            var5 = mProcessContextList.iterator();
         } catch (Throwable var26) {
            var10000 = var26;
            var10001 = false;
            break label224;
         }

         try {
            while(var5.hasNext()) {
               RenderScript var6 = (RenderScript)var5.next();
               if (var6.mContextType == var2 && var6.mContextFlags == var3 && var6.mContextSdkVersion == var1) {
                  return var6;
               }
            }
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label224;
         }

         label214:
         try {
            RenderScript var28 = internalCreate(var0, var1, var2, var3);
            var28.mIsProcessContext = true;
            mProcessContextList.add(var28);
            return var28;
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label214;
         }
      }

      while(true) {
         Throwable var27 = var10000;

         try {
            throw var27;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            continue;
         }
      }
   }

   public static RenderScript create(Context var0, RenderScript$ContextType var1) {
      return create(var0, var1, 0);
   }

   public static RenderScript create(Context var0, RenderScript$ContextType var1, int var2) {
      return create(var0, var0.getApplicationInfo().targetSdkVersion, var1, var2);
   }

   public static RenderScript createMultiContext(Context var0, RenderScript$ContextType var1, int var2, int var3) {
      return internalCreate(var0, var3, var1, var2);
   }

   public static void forceCompat() {
      sNative = 0;
   }

   private void helpDestroy() {
      synchronized(this){}

      boolean var1;
      boolean var2;
      label345: {
         Throwable var10000;
         boolean var10001;
         label346: {
            boolean var4;
            try {
               var4 = this.mDestroyed;
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label346;
            }

            var2 = false;
            if (!var4) {
               try {
                  this.mDestroyed = true;
               } catch (Throwable var29) {
                  var10000 = var29;
                  var10001 = false;
                  break label346;
               }

               var1 = true;
            } else {
               var1 = false;
            }

            label332:
            try {
               break label345;
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               break label332;
            }
         }

         while(true) {
            Throwable var5 = var10000;

            try {
               throw var5;
            } catch (Throwable var26) {
               var10000 = var26;
               var10001 = false;
               continue;
            }
         }
      }

      if (var1) {
         this.nContextFinish();
         if (this.mIncCon != 0L) {
            this.nIncContextFinish();
            this.nIncContextDestroy();
            this.mIncCon = 0L;
         }

         this.nContextDeinitToClient(this.mContext);
         RenderScript$MessageThread var31 = this.mMessageThread;
         var31.mRun = false;
         var31.interrupt();
         boolean var3 = false;
         var1 = var2;
         var2 = var3;

         while(!var1) {
            try {
               this.mMessageThread.join();
            } catch (InterruptedException var27) {
               var2 = true;
               continue;
            }

            var1 = true;
         }

         if (var2) {
            Thread.currentThread().interrupt();
         }

         this.nContextDestroy();
      }

   }

   private static RenderScript internalCreate(Context param0, int param1, RenderScript$ContextType param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static void releaseAllContexts() {
      // $FF: Couldn't be decompiled
   }

   static native int rsnSystemGetPointerSize();

   public static void setBlackList(String var0) {
      if (var0 != null) {
         mBlackList = var0;
      }

   }

   public static void setupDiskCache(File var0) {
      var0 = new File(var0, "com.android.renderscript.cache");
      mCachePath = var0.getAbsolutePath();
      var0.mkdirs();
   }

   private static boolean setupNative(int var0, Context var1) {
      if (sNative == -1) {
         label54: {
            label49: {
               try {
                  Method var4 = Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE);
                  Integer var5 = new Integer(0);
                  var0 = (Integer)var4.invoke((Object)null, "debug.rs.forcecompat", var5);
               } catch (Exception var8) {
                  break label49;
               }

               if (var0 != 0) {
                  sNative = 0;
                  break label54;
               }
            }

            sNative = 1;

            ApplicationInfo var9;
            try {
               var9 = var1.getPackageManager().getApplicationInfo(var1.getPackageName(), 128);
            } catch (NameNotFoundException var7) {
               return true;
            }

            long var2;
            try {
               var2 = (Long)Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID").invoke((Object)null);
            } catch (Exception var6) {
               var2 = 0L;
            }

            if (var9.metaData != null) {
               if (var9.metaData.getBoolean("com.android.support.v8.renderscript.EnableAsyncTeardown") && var2 == 0L) {
                  sNative = 0;
               }

               var9.metaData.getBoolean("com.android.support.v8.renderscript.EnableBlurWorkaround");
            }
         }
      }

      if (sNative == 1) {
         if (mBlackList.length() > 0) {
            StringBuilder var10 = new StringBuilder();
            var10.append('(');
            var10.append(Build.MANUFACTURER);
            var10.append(':');
            var10.append(Build.PRODUCT);
            var10.append(':');
            var10.append(Build.MODEL);
            var10.append(')');
            String var11 = var10.toString();
            if (mBlackList.contains(var11)) {
               sNative = 0;
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void contextDump() {
      this.validate();
      this.nContextDump(0);
   }

   public void destroy() {
      if (!this.mIsProcessContext) {
         this.validate();
         this.helpDestroy();
      }
   }

   protected void finalize() {
      this.helpDestroy();
      super.finalize();
   }

   public void finish() {
      this.nContextFinish();
   }

   public final Context getApplicationContext() {
      return this.mApplicationContext;
   }

   public int getDispatchAPILevel() {
      return this.mDispatchAPILevel;
   }

   public RenderScript$RSErrorHandler getErrorHandler() {
      return this.mErrorCallback;
   }

   public RenderScript$RSMessageHandler getMessageHandler() {
      return this.mMessageCallback;
   }

   public boolean isAlive() {
      return this.mContext != 0L;
   }

   public boolean isUseNative() {
      return useNative;
   }

   public void nAllocationCopyFromBitmap(long var1, Bitmap var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationCopyFromBitmap(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   public void nAllocationCopyToBitmap(long var1, Bitmap var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationCopyToBitmap(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   public long nAllocationCreateBitmapBackedAllocation(long var1, int var3, Bitmap var4, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationCreateBitmapBackedAllocation(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   long nAllocationCreateBitmapRef(long var1, Bitmap var3) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationCreateBitmapRef(this.mContext, var1, var3);
      } finally {
         ;
      }

      return var1;
   }

   long nAllocationCreateFromAssetStream(int var1, int var2, int var3) {
      synchronized(this){}

      long var4;
      try {
         this.validate();
         var4 = this.rsnAllocationCreateFromAssetStream(this.mContext, var1, var2, var3);
      } finally {
         ;
      }

      return var4;
   }

   public long nAllocationCreateFromBitmap(long var1, int var3, Bitmap var4, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationCreateFromBitmap(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public long nAllocationCreateTyped(long var1, int var3, int var4, long var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationCreateTyped(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public long nAllocationCubeCreateFromBitmap(long var1, int var3, Bitmap var4, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationCubeCreateFromBitmap(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public void nAllocationData1D(long var1, int var3, int var4, int var5, Object var6, int var7, Element$DataType var8, int var9, boolean var10) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData1D(this.mContext, var1, var3, var4, var5, var6, var7, var8.mID, var9, var10);
      } finally {
         ;
      }

   }

   public void nAllocationData2D(long var1, int var3, int var4, int var5, int var6, int var7, int var8, long var9, int var11, int var12, int var13, int var14) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData2D(this.mContext, var1, var3, var4, var5, var6, var7, var8, var9, var11, var12, var13, var14);
      } finally {
         ;
      }

   }

   public void nAllocationData2D(long var1, int var3, int var4, int var5, int var6, int var7, int var8, Object var9, int var10, Element$DataType var11, int var12, boolean var13) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData2D(this.mContext, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11.mID, var12, var13);
      } finally {
         ;
      }

   }

   public void nAllocationData2D(long var1, int var3, int var4, int var5, int var6, Bitmap var7) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData2D(this.mContext, var1, var3, var4, var5, var6, var7);
      } finally {
         ;
      }

   }

   public void nAllocationData3D(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, int var14, int var15) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData3D(this.mContext, var1, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13, var14, var15);
      } finally {
         ;
      }

   }

   public void nAllocationData3D(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Object var10, int var11, Element$DataType var12, int var13, boolean var14) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationData3D(this.mContext, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12.mID, var13, var14);
      } finally {
         ;
      }

   }

   public void nAllocationElementData1D(long var1, int var3, int var4, int var5, byte[] var6, int var7) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationElementData1D(this.mContext, var1, var3, var4, var5, var6, var7);
      } finally {
         ;
      }

   }

   public void nAllocationGenerateMipmaps(long var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationGenerateMipmaps(this.mContext, var1);
      } finally {
         ;
      }

   }

   public ByteBuffer nAllocationGetByteBuffer(long var1, int var3, int var4, int var5) {
      synchronized(this){}

      ByteBuffer var6;
      try {
         this.validate();
         var6 = this.rsnAllocationGetByteBuffer(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var6;
   }

   public long nAllocationGetStride(long var1) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationGetStride(this.mContext, var1);
      } finally {
         ;
      }

      return var1;
   }

   long nAllocationGetType(long var1) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnAllocationGetType(this.mContext, var1);
      } finally {
         ;
      }

      return var1;
   }

   public void nAllocationIoReceive(long var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationIoReceive(this.mContext, var1);
      } finally {
         ;
      }

   }

   public void nAllocationIoSend(long var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationIoSend(this.mContext, var1);
      } finally {
         ;
      }

   }

   public void nAllocationRead(long var1, Object var3, Element$DataType var4, int var5, boolean var6) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationRead(this.mContext, var1, var3, var4.mID, var5, var6);
      } finally {
         ;
      }

   }

   public void nAllocationRead1D(long var1, int var3, int var4, int var5, Object var6, int var7, Element$DataType var8, int var9, boolean var10) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationRead1D(this.mContext, var1, var3, var4, var5, var6, var7, var8.mID, var9, var10);
      } finally {
         ;
      }

   }

   public void nAllocationRead2D(long var1, int var3, int var4, int var5, int var6, int var7, int var8, Object var9, int var10, Element$DataType var11, int var12, boolean var13) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationRead2D(this.mContext, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11.mID, var12, var13);
      } finally {
         ;
      }

   }

   void nAllocationResize1D(long var1, int var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationResize1D(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   void nAllocationResize2D(long var1, int var3, int var4) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationResize2D(this.mContext, var1, var3, var4);
      } finally {
         ;
      }

   }

   public void nAllocationSetSurface(long var1, Surface var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationSetSurface(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   public void nAllocationSyncAll(long var1, int var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnAllocationSyncAll(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   public long nClosureCreate(long var1, long var3, long[] var5, long[] var6, int[] var7, long[] var8, long[] var9) {
      synchronized(this){}

      Throwable var10000;
      label72: {
         boolean var10001;
         try {
            this.validate();
            var1 = this.rsnClosureCreate(this.mContext, var1, var3, var5, var6, var7, var8, var9);
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label72;
         }

         if (var1 != 0L) {
            return var1;
         }

         label63:
         try {
            RSRuntimeException var17 = new RSRuntimeException("Failed creating closure.");
            throw var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label63;
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public void nClosureSetArg(long var1, int var3, long var4, int var6) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnClosureSetArg(this.mContext, var1, var3, var4, var6);
      } finally {
         ;
      }

   }

   public void nClosureSetGlobal(long var1, long var3, long var5, int var7) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnClosureSetGlobal(this.mContext, var1, var3, var5, var7);
      } finally {
         ;
      }

   }

   public long nContextCreate(long var1, int var3, int var4, int var5, String var6) {
      synchronized(this){}

      try {
         var1 = this.rsnContextCreate(var1, var3, var4, var5, var6);
      } finally {
         ;
      }

      return var1;
   }

   public native void nContextDeinitToClient(long var1);

   public void nContextDestroy() {
      synchronized(this){}

      try {
         this.validate();
         WriteLock var3 = this.mRWLock.writeLock();
         var3.lock();
         long var1 = this.mContext;
         this.mContext = 0L;
         var3.unlock();
         this.rsnContextDestroy(var1);
      } finally {
         ;
      }

   }

   public void nContextDump(int var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnContextDump(this.mContext, var1);
      } finally {
         ;
      }

   }

   public void nContextFinish() {
      synchronized(this){}

      try {
         this.validate();
         this.rsnContextFinish(this.mContext);
      } finally {
         ;
      }

   }

   public native String nContextGetErrorMessage(long var1);

   public native int nContextGetUserMessage(long var1, int[] var3);

   public native void nContextInitToClient(long var1);

   public native int nContextPeekMessage(long var1, int[] var3);

   public void nContextSendMessage(int var1, int[] var2) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnContextSendMessage(this.mContext, var1, var2);
      } finally {
         ;
      }

   }

   public void nContextSetPriority(int var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnContextSetPriority(this.mContext, var1);
      } finally {
         ;
      }

   }

   public native long nDeviceCreate();

   native void nDeviceDestroy(long var1);

   native void nDeviceSetConfig(long var1, int var3, int var4);

   public long nElementCreate(long var1, int var3, boolean var4, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnElementCreate(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public long nElementCreate2(long[] var1, String[] var2, int[] var3) {
      synchronized(this){}

      long var4;
      try {
         this.validate();
         var4 = this.rsnElementCreate2(this.mContext, var1, var2, var3);
      } finally {
         ;
      }

      return var4;
   }

   void nElementGetNativeData(long var1, int[] var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnElementGetNativeData(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   void nElementGetSubElements(long var1, long[] var3, String[] var4, int[] var5) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnElementGetSubElements(this.mContext, var1, var3, var4, var5);
      } finally {
         ;
      }

   }

   public long nIncAllocationCreateTyped(long var1, long var3, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, var1, var3, var5);
      } finally {
         ;
      }

      return var1;
   }

   public long nIncContextCreate(long var1, int var3, int var4, int var5) {
      synchronized(this){}

      try {
         var1 = this.rsnIncContextCreate(var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public void nIncContextDestroy() {
      synchronized(this){}

      try {
         this.validate();
         WriteLock var3 = this.mRWLock.writeLock();
         var3.lock();
         long var1 = this.mIncCon;
         this.mIncCon = 0L;
         var3.unlock();
         this.rsnIncContextDestroy(var1);
      } finally {
         ;
      }

   }

   public void nIncContextFinish() {
      synchronized(this){}

      try {
         this.validate();
         this.rsnIncContextFinish(this.mIncCon);
      } finally {
         ;
      }

   }

   public native long nIncDeviceCreate();

   native void nIncDeviceDestroy(long var1);

   public long nIncElementCreate(long var1, int var3, boolean var4, int var5) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnIncElementCreate(this.mIncCon, var1, var3, var4, var5);
      } finally {
         ;
      }

      return var1;
   }

   public native boolean nIncLoadSO(int var1, String var2);

   public void nIncObjDestroy(long var1) {
      long var3 = this.mIncCon;
      if (var3 != 0L) {
         this.rsnIncObjDestroy(var3, var1);
      }

   }

   public long nIncTypeCreate(long var1, int var3, int var4, int var5, boolean var6, boolean var7, int var8) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnIncTypeCreate(this.mIncCon, var1, var3, var4, var5, var6, var7, var8);
      } finally {
         ;
      }

      return var1;
   }

   public long nInvokeClosureCreate(long var1, byte[] var3, long[] var4, long[] var5, int[] var6) {
      synchronized(this){}

      Throwable var10000;
      label72: {
         boolean var10001;
         try {
            this.validate();
            var1 = this.rsnInvokeClosureCreate(this.mContext, var1, var3, var4, var5, var6);
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            break label72;
         }

         if (var1 != 0L) {
            return var1;
         }

         label63:
         try {
            RSRuntimeException var14 = new RSRuntimeException("Failed creating closure.");
            throw var14;
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label63;
         }
      }

      Throwable var13 = var10000;
      throw var13;
   }

   public native boolean nLoadIOSO();

   public native boolean nLoadSO(boolean var1, int var2, String var3);

   public void nObjDestroy(long var1) {
      long var3 = this.mContext;
      if (var3 != 0L) {
         this.rsnObjDestroy(var3, var1);
      }

   }

   public long nSamplerCreate(int var1, int var2, int var3, int var4, int var5, float var6) {
      synchronized(this){}

      long var7;
      try {
         this.validate();
         var7 = this.rsnSamplerCreate(this.mContext, var1, var2, var3, var4, var5, var6);
      } finally {
         ;
      }

      return var7;
   }

   public void nScriptBindAllocation(long var1, long var3, int var5, boolean var6) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var7;
         try {
            this.validate();
            var7 = this.mContext;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label124;
         }

         if (var6) {
            try {
               var7 = this.mIncCon;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptBindAllocation(var7, var1, var3, var5, var6);
            return;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label111;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public long nScriptCCreate(String var1, String var2, byte[] var3, int var4) {
      synchronized(this){}

      long var5;
      try {
         this.validate();
         var5 = this.rsnScriptCCreate(this.mContext, var1, var2, var3, var4);
      } finally {
         ;
      }

      return var5;
   }

   public long nScriptFieldIDCreate(long var1, int var3, boolean var4) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var5;
         try {
            this.validate();
            var5 = this.mContext;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label124;
         }

         if (var4) {
            try {
               var5 = this.mIncCon;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            var1 = this.rsnScriptFieldIDCreate(var5, var1, var3, var4);
            return var1;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label111;
         }
      }

      Throwable var7 = var10000;
      throw var7;
   }

   public void nScriptForEach(long var1, int var3, long var4, long var6, byte[] var8, boolean var9) {
      synchronized(this){}

      Throwable var10000;
      label113: {
         boolean var10001;
         try {
            this.validate();
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label113;
         }

         if (var8 == null) {
            label106: {
               try {
                  this.rsnScriptForEach(this.mContext, this.mIncCon, var1, var3, var4, var6, var9);
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label106;
               }

               return;
            }
         } else {
            label109: {
               try {
                  this.rsnScriptForEach(this.mContext, this.mIncCon, var1, var3, var4, var6, var8, var9);
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label109;
               }

               return;
            }
         }
      }

      Throwable var22 = var10000;
      throw var22;
   }

   public void nScriptForEach(long var1, int var3, long[] var4, long var5, byte[] var7, int[] var8) {
      synchronized(this){}

      try {
         if (!this.mEnableMultiInput) {
            Log.e("RenderScript_jni", "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
            RSRuntimeException var11 = new RSRuntimeException("Multi-input kernels are not supported before API 23)");
            throw var11;
         }

         this.validate();
         this.rsnScriptForEach(this.mContext, var1, var3, var4, var5, var7, var8);
      } finally {
         ;
      }

   }

   public void nScriptForEachClipped(long var1, int var3, long var4, long var6, byte[] var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15) {
      label194: {
         synchronized(this){}

         Throwable var10000;
         label185: {
            boolean var10001;
            try {
               this.validate();
            } catch (Throwable var39) {
               var10000 = var39;
               var10001 = false;
               break label185;
            }

            if (var8 == null) {
               label190: {
                  long var16;
                  long var18;
                  try {
                     var16 = this.mContext;
                     var18 = this.mIncCon;
                  } catch (Throwable var38) {
                     var10000 = var38;
                     var10001 = false;
                     break label190;
                  }

                  try {
                     this.rsnScriptForEachClipped(var16, var18, var1, var3, var4, var6, var9, var10, var11, var12, var13, var14, var15);
                  } finally {
                     throw var8;
                  }

               }
            } else {
               label177: {
                  try {
                     this.rsnScriptForEachClipped(this.mContext, this.mIncCon, var1, var3, var4, var6, (byte[])var8, var9, var10, var11, var12, var13, var14, var15);
                  } catch (Throwable var37) {
                     var10000 = var37;
                     var10001 = false;
                     break label177;
                  }

                  return;
               }
            }
         }

         var8 = var10000;
         throw var8;
      }
   }

   public long nScriptGroup2Create(String var1, String var2, long[] var3) {
      synchronized(this){}

      long var4;
      try {
         this.validate();
         var4 = this.rsnScriptGroup2Create(this.mContext, var1, var2, var3);
      } finally {
         ;
      }

      return var4;
   }

   public void nScriptGroup2Execute(long var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptGroup2Execute(this.mContext, var1);
      } finally {
         ;
      }

   }

   public long nScriptGroupCreate(long[] var1, long[] var2, long[] var3, long[] var4, long[] var5) {
      synchronized(this){}

      long var6;
      try {
         this.validate();
         var6 = this.rsnScriptGroupCreate(this.mContext, var1, var2, var3, var4, var5);
      } finally {
         ;
      }

      return var6;
   }

   public void nScriptGroupExecute(long var1) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptGroupExecute(this.mContext, var1);
      } finally {
         ;
      }

   }

   public void nScriptGroupSetInput(long var1, long var3, long var5) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptGroupSetInput(this.mContext, var1, var3, var5);
      } finally {
         ;
      }

   }

   public void nScriptGroupSetOutput(long var1, long var3, long var5) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptGroupSetOutput(this.mContext, var1, var3, var5);
      } finally {
         ;
      }

   }

   public void nScriptIntrinsicBLAS_BNNM(long var1, int var3, int var4, int var5, long var6, int var8, long var9, int var11, long var12, int var14, int var15, boolean var16) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, var1, var3, var4, var5, var6, var8, var9, var11, var12, var14, var15, var16);
      } finally {
         ;
      }

   }

   public void nScriptIntrinsicBLAS_Complex(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, float var12, float var13, long var14, long var16, float var18, float var19, long var20, int var22, int var23, int var24, int var25, boolean var26) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var16, var18, var19, var20, var22, var23, var24, var25, var26);
      } finally {
         ;
      }

   }

   public void nScriptIntrinsicBLAS_Double(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, double var12, long var14, long var16, double var18, long var20, int var22, int var23, int var24, int var25, boolean var26) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, var16, var18, var20, var22, var23, var24, var25, var26);
      } finally {
         ;
      }

   }

   public void nScriptIntrinsicBLAS_Single(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, float var12, long var13, long var15, float var17, long var18, int var20, int var21, int var22, int var23, boolean var24) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var15, var17, var18, var20, var21, var22, var23, var24);
      } finally {
         ;
      }

   }

   public void nScriptIntrinsicBLAS_Z(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, double var12, double var14, long var16, long var18, double var20, double var22, long var24, int var26, int var27, int var28, int var29, boolean var30) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, var16, var18, var20, var22, var24, var26, var27, var28, var29, var30);
      } finally {
         ;
      }

   }

   public long nScriptIntrinsicCreate(int param1, long param2, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public void nScriptInvoke(long var1, int var3, boolean var4) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var5;
         try {
            this.validate();
            var5 = this.mContext;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label124;
         }

         if (var4) {
            try {
               var5 = this.mIncCon;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptInvoke(var5, var1, var3, var4);
            return;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label111;
         }
      }

      Throwable var7 = var10000;
      throw var7;
   }

   public long nScriptInvokeIDCreate(long var1, int var3) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnScriptInvokeIDCreate(this.mContext, var1, var3);
      } finally {
         ;
      }

      return var1;
   }

   public void nScriptInvokeV(long var1, int var3, byte[] var4, boolean var5) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var6;
         try {
            this.validate();
            var6 = this.mContext;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label124;
         }

         if (var5) {
            try {
               var6 = this.mIncCon;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptInvokeV(var6, var1, var3, var4, var5);
            return;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label111;
         }
      }

      Throwable var20 = var10000;
      throw var20;
   }

   public long nScriptKernelIDCreate(long var1, int var3, int var4, boolean var5) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var6;
         try {
            this.validate();
            var6 = this.mContext;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label124;
         }

         if (var5) {
            try {
               var6 = this.mIncCon;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            var1 = this.rsnScriptKernelIDCreate(var6, var1, var3, var4, var5);
            return var1;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label111;
         }
      }

      Throwable var8 = var10000;
      throw var8;
   }

   public void nScriptReduce(long var1, int var3, long[] var4, long var5, int[] var7) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnScriptReduce(this.mContext, var1, var3, var4, var5, var7);
      } finally {
         ;
      }

   }

   public void nScriptSetTimeZone(long var1, byte[] var3, boolean var4) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var5;
         try {
            this.validate();
            var5 = this.mContext;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label124;
         }

         if (var4) {
            try {
               var5 = this.mIncCon;
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetTimeZone(var5, var1, var3, var4);
            return;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label111;
         }
      }

      Throwable var19 = var10000;
      throw var19;
   }

   public void nScriptSetVarD(long var1, int var3, double var4, boolean var6) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var7;
         try {
            this.validate();
            var7 = this.mContext;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label124;
         }

         if (var6) {
            try {
               var7 = this.mIncCon;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarD(var7, var1, var3, var4, var6);
            return;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label111;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public void nScriptSetVarF(long var1, int var3, float var4, boolean var5) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var6;
         try {
            this.validate();
            var6 = this.mContext;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label124;
         }

         if (var5) {
            try {
               var6 = this.mIncCon;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarF(var6, var1, var3, var4, var5);
            return;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label111;
         }
      }

      Throwable var8 = var10000;
      throw var8;
   }

   public void nScriptSetVarI(long var1, int var3, int var4, boolean var5) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var6;
         try {
            this.validate();
            var6 = this.mContext;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label124;
         }

         if (var5) {
            try {
               var6 = this.mIncCon;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarI(var6, var1, var3, var4, var5);
            return;
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label111;
         }
      }

      Throwable var8 = var10000;
      throw var8;
   }

   public void nScriptSetVarJ(long var1, int var3, long var4, boolean var6) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var7;
         try {
            this.validate();
            var7 = this.mContext;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label124;
         }

         if (var6) {
            try {
               var7 = this.mIncCon;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarJ(var7, var1, var3, var4, var6);
            return;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label111;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public void nScriptSetVarObj(long var1, int var3, long var4, boolean var6) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var7;
         try {
            this.validate();
            var7 = this.mContext;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label124;
         }

         if (var6) {
            try {
               var7 = this.mIncCon;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarObj(var7, var1, var3, var4, var6);
            return;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label111;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   public void nScriptSetVarV(long var1, int var3, byte[] var4, boolean var5) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         boolean var10001;
         long var6;
         try {
            this.validate();
            var6 = this.mContext;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            break label124;
         }

         if (var5) {
            try {
               var6 = this.mIncCon;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarV(var6, var1, var3, var4, var5);
            return;
         } catch (Throwable var17) {
            var10000 = var17;
            var10001 = false;
            break label111;
         }
      }

      Throwable var20 = var10000;
      throw var20;
   }

   public void nScriptSetVarVE(long var1, int var3, byte[] var4, long var5, int[] var7, boolean var8) {
      synchronized(this){}

      Throwable var10000;
      label124: {
         long var9;
         boolean var10001;
         try {
            this.validate();
            var9 = this.mContext;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label124;
         }

         if (var8) {
            try {
               var9 = this.mIncCon;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label124;
            }
         }

         label111:
         try {
            this.rsnScriptSetVarVE(var9, var1, var3, var4, var5, var7, var8);
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label111;
         }
      }

      Throwable var23 = var10000;
      throw var23;
   }

   public long nTypeCreate(long var1, int var3, int var4, int var5, boolean var6, boolean var7, int var8) {
      synchronized(this){}

      try {
         this.validate();
         var1 = this.rsnTypeCreate(this.mContext, var1, var3, var4, var5, var6, var7, var8);
      } finally {
         ;
      }

      return var1;
   }

   void nTypeGetNativeData(long var1, long[] var3) {
      synchronized(this){}

      try {
         this.validate();
         this.rsnTypeGetNativeData(this.mContext, var1, var3);
      } finally {
         ;
      }

   }

   public native void rsnAllocationCopyFromBitmap(long var1, long var3, Bitmap var5);

   public native void rsnAllocationCopyToBitmap(long var1, long var3, Bitmap var5);

   public native long rsnAllocationCreateBitmapBackedAllocation(long var1, long var3, int var5, Bitmap var6, int var7);

   public native long rsnAllocationCreateBitmapRef(long var1, long var3, Bitmap var5);

   public native long rsnAllocationCreateFromAssetStream(long var1, int var3, int var4, int var5);

   public native long rsnAllocationCreateFromBitmap(long var1, long var3, int var5, Bitmap var6, int var7);

   public native long rsnAllocationCreateTyped(long var1, long var3, int var5, int var6, long var7);

   public native long rsnAllocationCubeCreateFromBitmap(long var1, long var3, int var5, Bitmap var6, int var7);

   public native void rsnAllocationData1D(long var1, long var3, int var5, int var6, int var7, Object var8, int var9, int var10, int var11, boolean var12);

   public native void rsnAllocationData2D(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, long var11, int var13, int var14, int var15, int var16);

   public native void rsnAllocationData2D(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, Object var11, int var12, int var13, int var14, boolean var15);

   public native void rsnAllocationData2D(long var1, long var3, int var5, int var6, int var7, int var8, Bitmap var9);

   public native void rsnAllocationData3D(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, long var12, int var14, int var15, int var16, int var17);

   public native void rsnAllocationData3D(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Object var12, int var13, int var14, int var15, boolean var16);

   public native void rsnAllocationElementData1D(long var1, long var3, int var5, int var6, int var7, byte[] var8, int var9);

   public native void rsnAllocationGenerateMipmaps(long var1, long var3);

   public native ByteBuffer rsnAllocationGetByteBuffer(long var1, long var3, int var5, int var6, int var7);

   public native long rsnAllocationGetStride(long var1, long var3);

   public native long rsnAllocationGetType(long var1, long var3);

   public native void rsnAllocationIoReceive(long var1, long var3);

   public native void rsnAllocationIoSend(long var1, long var3);

   public native void rsnAllocationRead(long var1, long var3, Object var5, int var6, int var7, boolean var8);

   public native void rsnAllocationRead1D(long var1, long var3, int var5, int var6, int var7, Object var8, int var9, int var10, int var11, boolean var12);

   public native void rsnAllocationRead2D(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, Object var11, int var12, int var13, int var14, boolean var15);

   public native void rsnAllocationResize1D(long var1, long var3, int var5);

   public native void rsnAllocationResize2D(long var1, long var3, int var5, int var6);

   public native void rsnAllocationSetSurface(long var1, long var3, Surface var5);

   public native void rsnAllocationSyncAll(long var1, long var3, int var5);

   public native long rsnClosureCreate(long var1, long var3, long var5, long[] var7, long[] var8, int[] var9, long[] var10, long[] var11);

   public native void rsnClosureSetArg(long var1, long var3, int var5, long var6, int var8);

   public native void rsnClosureSetGlobal(long var1, long var3, long var5, long var7, int var9);

   public native long rsnContextCreate(long var1, int var3, int var4, int var5, String var6);

   public native void rsnContextDestroy(long var1);

   public native void rsnContextDump(long var1, int var3);

   public native void rsnContextFinish(long var1);

   public native void rsnContextSendMessage(long var1, int var3, int[] var4);

   public native void rsnContextSetPriority(long var1, int var3);

   public native long rsnElementCreate(long var1, long var3, int var5, boolean var6, int var7);

   public native long rsnElementCreate2(long var1, long[] var3, String[] var4, int[] var5);

   public native void rsnElementGetNativeData(long var1, long var3, int[] var5);

   public native void rsnElementGetSubElements(long var1, long var3, long[] var5, String[] var6, int[] var7);

   public native long rsnIncAllocationCreateTyped(long var1, long var3, long var5, long var7, int var9);

   public native long rsnIncContextCreate(long var1, int var3, int var4, int var5);

   public native void rsnIncContextDestroy(long var1);

   public native void rsnIncContextFinish(long var1);

   public native long rsnIncElementCreate(long var1, long var3, int var5, boolean var6, int var7);

   public native void rsnIncObjDestroy(long var1, long var3);

   public native long rsnIncTypeCreate(long var1, long var3, int var5, int var6, int var7, boolean var8, boolean var9, int var10);

   public native long rsnInvokeClosureCreate(long var1, long var3, byte[] var5, long[] var6, long[] var7, int[] var8);

   public native void rsnObjDestroy(long var1, long var3);

   public native long rsnSamplerCreate(long var1, int var3, int var4, int var5, int var6, int var7, float var8);

   public native void rsnScriptBindAllocation(long var1, long var3, long var5, int var7, boolean var8);

   public native long rsnScriptCCreate(long var1, String var3, String var4, byte[] var5, int var6);

   public native long rsnScriptFieldIDCreate(long var1, long var3, int var5, boolean var6);

   public native void rsnScriptForEach(long var1, long var3, int var5, long[] var6, long var7, byte[] var9, int[] var10);

   public native void rsnScriptForEach(long var1, long var3, long var5, int var7, long var8, long var10, boolean var12);

   public native void rsnScriptForEach(long var1, long var3, long var5, int var7, long var8, long var10, byte[] var12, boolean var13);

   public native void rsnScriptForEachClipped(long var1, long var3, long var5, int var7, long var8, long var10, int var12, int var13, int var14, int var15, int var16, int var17, boolean var18);

   public native void rsnScriptForEachClipped(long var1, long var3, long var5, int var7, long var8, long var10, byte[] var12, int var13, int var14, int var15, int var16, int var17, int var18, boolean var19);

   public native long rsnScriptGroup2Create(long var1, String var3, String var4, long[] var5);

   public native void rsnScriptGroup2Execute(long var1, long var3);

   public native long rsnScriptGroupCreate(long var1, long[] var3, long[] var4, long[] var5, long[] var6, long[] var7);

   public native void rsnScriptGroupExecute(long var1, long var3);

   public native void rsnScriptGroupSetInput(long var1, long var3, long var5, long var7);

   public native void rsnScriptGroupSetOutput(long var1, long var3, long var5, long var7);

   public native void rsnScriptIntrinsicBLAS_BNNM(long var1, long var3, long var5, int var7, int var8, int var9, long var10, int var12, long var13, int var15, long var16, int var18, int var19, boolean var20);

   public native void rsnScriptIntrinsicBLAS_Complex(long var1, long var3, long var5, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, float var16, float var17, long var18, long var20, float var22, float var23, long var24, int var26, int var27, int var28, int var29, boolean var30);

   public native void rsnScriptIntrinsicBLAS_Double(long var1, long var3, long var5, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, double var16, long var18, long var20, double var22, long var24, int var26, int var27, int var28, int var29, boolean var30);

   public native void rsnScriptIntrinsicBLAS_Single(long var1, long var3, long var5, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, float var16, long var17, long var19, float var21, long var22, int var24, int var25, int var26, int var27, boolean var28);

   public native void rsnScriptIntrinsicBLAS_Z(long var1, long var3, long var5, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, double var16, double var18, long var20, long var22, double var24, double var26, long var28, int var30, int var31, int var32, int var33, boolean var34);

   public native long rsnScriptIntrinsicCreate(long var1, int var3, long var4, boolean var6);

   public native void rsnScriptInvoke(long var1, long var3, int var5, boolean var6);

   public native long rsnScriptInvokeIDCreate(long var1, long var3, int var5);

   public native void rsnScriptInvokeV(long var1, long var3, int var5, byte[] var6, boolean var7);

   public native long rsnScriptKernelIDCreate(long var1, long var3, int var5, int var6, boolean var7);

   public native void rsnScriptReduce(long var1, long var3, int var5, long[] var6, long var7, int[] var9);

   public native void rsnScriptSetTimeZone(long var1, long var3, byte[] var5, boolean var6);

   public native void rsnScriptSetVarD(long var1, long var3, int var5, double var6, boolean var8);

   public native void rsnScriptSetVarF(long var1, long var3, int var5, float var6, boolean var7);

   public native void rsnScriptSetVarI(long var1, long var3, int var5, int var6, boolean var7);

   public native void rsnScriptSetVarJ(long var1, long var3, int var5, long var6, boolean var8);

   public native void rsnScriptSetVarObj(long var1, long var3, int var5, long var6, boolean var8);

   public native void rsnScriptSetVarV(long var1, long var3, int var5, byte[] var6, boolean var7);

   public native void rsnScriptSetVarVE(long var1, long var3, int var5, byte[] var6, long var7, int[] var9, boolean var10);

   public native long rsnTypeCreate(long var1, long var3, int var5, int var6, int var7, boolean var8, boolean var9, int var10);

   public native void rsnTypeGetNativeData(long var1, long var3, long[] var5);

   public long safeID(BaseObj var1) {
      return var1 != null ? var1.getID(this) : 0L;
   }

   public void sendMessage(int var1, int[] var2) {
      this.nContextSendMessage(var1, var2);
   }

   public void setErrorHandler(RenderScript$RSErrorHandler var1) {
      this.mErrorCallback = var1;
   }

   public void setMessageHandler(RenderScript$RSMessageHandler var1) {
      this.mMessageCallback = var1;
   }

   public void setPriority(RenderScript$Priority var1) {
      this.validate();
      this.nContextSetPriority(var1.mID);
   }

   public boolean usingIO() {
      return useIOlib;
   }

   public void validate() {
      if (this.mContext == 0L) {
         throw new RSInvalidStateException("Calling RS with no Context active.");
      }
   }

   public void validateObject(BaseObj var1) {
      if (var1 != null && var1.mRS != this) {
         throw new RSIllegalArgumentException(yGCWWDnsImN.tUTQoCzrLKB);
      }
   }
}
