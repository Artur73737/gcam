package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder$InternalRewinder {
   private final ParcelFileDescriptor a;

   public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor var1) {
      this.a = var1;
   }

   public ParcelFileDescriptor rewind() {
      try {
         Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
      } catch (ErrnoException var2) {
         throw new IOException(var2);
      }

      return this.a;
   }
}
