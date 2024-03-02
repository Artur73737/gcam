package com.google.googlex.gcam.base;

import j$.util.Objects;

public final class LongPair {
   public long first;
   public long second;

   public LongPair() {
      this.first = 0L;
      this.second = 0L;
   }

   public LongPair(long var1, long var3) {
      this.first = var1;
      this.second = var3;
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof LongPair) {
         LongPair var2 = (LongPair)var1;
         if (this.first == var2.first && this.second == var2.second) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      return Objects.hash(this.first, this.second);
   }
}
