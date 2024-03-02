package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class LifecycleLifecycle implements .ebd, .cmb {
   private final Set a = new HashSet();
   private final .clx b;

   public LifecycleLifecycle(.clx var1) {
      this.b = var1;
      var1.a(this);
   }

   public final void a(.ebe var1) {
      this.a.add(var1);
      if (this.b.b == .clw.a) {
         var1.g();
      } else if (this.b.b.a(.clw.d)) {
         var1.h();
      } else {
         var1.i();
      }
   }

   public final void b(.ebe var1) {
      this.a.remove(var1);
   }

   @OnLifecycleEvent(
      a = .clv.ON_DESTROY
   )
   public void onDestroy(.cmc var1) {
      Iterator var2 = .edh.f(this.a).iterator();

      while(var2.hasNext()) {
         ((.ebe)var2.next()).g();
      }

      var1.getLifecycle().c(this);
   }

   @OnLifecycleEvent(
      a = .clv.ON_START
   )
   public void onStart(.cmc var1) {
      Iterator var2 = .edh.f(this.a).iterator();

      while(var2.hasNext()) {
         ((.ebe)var2.next()).h();
      }

   }

   @OnLifecycleEvent(
      a = .clv.ON_STOP
   )
   public void onStop(.cmc var1) {
      Iterator var2 = .edh.f(this.a).iterator();

      while(var2.hasNext()) {
         ((.ebe)var2.next()).i();
      }

   }
}
