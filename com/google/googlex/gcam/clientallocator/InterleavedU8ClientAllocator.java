package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

public interface InterleavedU8ClientAllocator {
   LongPair allocate(int var1, int var2, int var3);

   void doneWriting(long var1);
}
