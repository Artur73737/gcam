public enum ckp {
   a,
   b,
   c,
   d,
   e,
   f,
   g,
   h,
   i;

   private static final ckp[] j;

   static {
      ckp var0 = new ckp("PENALTY_LOG", 0);
      a = var0;
      ckp var8 = new ckp("PENALTY_DEATH", 1);
      b = var8;
      ckp var2 = new ckp("DETECT_FRAGMENT_REUSE", 2);
      c = var2;
      ckp var5 = new ckp("DETECT_FRAGMENT_TAG_USAGE", 3);
      d = var5;
      ckp var4 = new ckp("DETECT_WRONG_NESTED_HIERARCHY", 4);
      e = var4;
      ckp var7 = new ckp("DETECT_RETAIN_INSTANCE_USAGE", 5);
      f = var7;
      ckp var1 = new ckp("DETECT_SET_USER_VISIBLE_HINT", 6);
      g = var1;
      ckp var3 = new ckp("DETECT_TARGET_FRAGMENT_USAGE", 7);
      h = var3;
      ckp var6 = new ckp("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
      i = var6;
      j = new ckp[]{var0, var8, var2, var5, var4, var7, var1, var3, var6};
   }
}
