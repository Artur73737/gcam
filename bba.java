public class bba implements blg {
   private qzv a;
   public bba p = this;
   public int q;
   public int r = -1;
   public bba s;
   public bba t;
   public bnb u;
   public bmz v;
   public boolean w;
   public boolean x;
   public boolean y;

   public void eA() {
   }

   public void en() {
   }

   public void er() {
   }

   public final bba n() {
      return this.p;
   }

   public final qzv o() {
      qzv var2 = this.a;
      qzv var1 = var2;
      if (var2 == null) {
         var1 = qzy.h(jj.k(this).s.plus(qzy.v((rbd)jj.k(this).s.get(rbd.c))));
         this.a = var1;
      }

      return var1;
   }

   public void p() {
      if (!this.y) {
         if (this.v != null) {
            this.y = true;
         } else {
            throw new IllegalStateException("attach invoked on a node without a coordinator");
         }
      } else {
         throw new IllegalStateException("node attached multiple times");
      }
   }

   public void q() {
      if (this.y) {
         this.y = false;
         qzv var1 = this.a;
         if (var1 != null) {
            qzy.i(var1, new bbc());
            this.a = null;
         }

      } else {
         throw new IllegalStateException("Cannot detach a node that is not attached");
      }
   }

   public void r() {
      if (this.y) {
         this.en();
      } else {
         throw new IllegalStateException("reset() called on an unattached node");
      }
   }

   public void s() {
      if (this.y) {
         this.er();
      } else {
         throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
      }
   }

   public void t() {
      if (this.y) {
         if (this.v != null) {
            this.eA();
         } else {
            throw new IllegalStateException("detach invoked on a node without a coordinator");
         }
      } else {
         throw new IllegalStateException("node detached multiple times");
      }
   }

   public void u(bmz var1) {
      this.v = var1;
   }

   public boolean v() {
      return true;
   }
}
