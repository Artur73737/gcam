package com.google.vr.vrcore.library.api;

public final class ObjectWrapper extends .edx {
   private final Object wrappedObject;

   private ObjectWrapper(Object var1) {
      super("com.google.vr.vrcore.library.api.IObjectWrapper");
      this.wrappedObject = var1;
   }

   public static .edx b(Object var0) {
      return new ObjectWrapper(var0);
   }
}
