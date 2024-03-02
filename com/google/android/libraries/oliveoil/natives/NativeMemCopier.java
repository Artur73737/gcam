package com.google.android.libraries.oliveoil.natives;

import com.google.android.libraries.oliveoil.util.JniUtil;
import java.nio.ByteBuffer;

public class NativeMemCopier implements .njc {
   private final boolean a;

   public NativeMemCopier() {
      boolean var2;
      label13: {
         try {
            int var1 = JniUtil.a;
         } catch (UnsatisfiedLinkError var4) {
            var2 = false;
            break label13;
         }

         var2 = true;
      }

      this.a = var2;
   }

   public final boolean a(ByteBuffer var1, ByteBuffer var2) {
      return this.a && var1.isDirect() && var2.isDirect();
   }

   public native void copyBytes(ByteBuffer var1, ByteBuffer var2, int var3, int var4, int var5);

   public native void copyBytes2D(ByteBuffer var1, ByteBuffer var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public native void copyBytes2D(ByteBuffer var1, ByteBuffer var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

   public final String toString() {
      return this.getClass().getSimpleName();
   }
}
