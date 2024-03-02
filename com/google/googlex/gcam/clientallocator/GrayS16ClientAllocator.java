package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

public interface GrayS16ClientAllocator {
   LongPair allocate(int var1, int var2);

   void doneWriting(long var1);
}
