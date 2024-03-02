package com.google.googlex.gcam.hdrplus;

import java.nio.ByteBuffer;

@FunctionalInterface
public interface EncodedBlobCallback {
   void onDataAvailable(int var1, ByteBuffer var2, int var3, int var4);
}
