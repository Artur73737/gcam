public final class cld extends clb {
   public cld(bv var1, bv var2, int var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("Attempting to nest fragment ");
      var4.append(var1);
      var4.append(" within the view of parent fragment ");
      var4.append(var2);
      var4.append(" via container with ID ");
      var4.append(var3);
      var4.append(" without using parent's childFragmentManager");
      super(var1, var4.toString());
   }
}
