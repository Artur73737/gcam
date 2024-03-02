public final class afs {
   public static final qvt a;
   public static final qvy b;
   public static final afj c;
   public static final bbe d;
   public static final afq e;
   public static final lmk f;

   static {
      a = aal.h;
      b = new afo((que)null);
      c = new afp();
      f = ja.j(vk.e);
      d = new afn();
      e = new afq();
   }

   public static final Object a(bij var0, que var1) {
      afr var6;
      label37: {
         if (var1 instanceof afr) {
            afr var3 = (afr)var1;
            int var2 = var3.b;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.b = var2 + Integer.MIN_VALUE;
               var6 = var3;
               break label37;
            }
         }

         var6 = new afr(var1);
      }

      Object var7 = var6.a;
      qul var5 = qul.a;
      bhl var8;
      switch(var6.b) {
      case 0:
         pwm.bs(var7);
         break;
      case 1:
         var0 = var6.c;
         pwm.bs(var7);
         var8 = (bhl)var7;
         if (c.n(var8.c, 6)) {
            return var8;
         }
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      do {
         var6.c = var0;
         var6.b = 1;
         Object var4 = hf.e(var0, var6);
         if (var4 == var5) {
            return var5;
         }

         var8 = (bhl)var4;
      } while(!c.n(var8.c, 6));

      return var8;
   }
}
