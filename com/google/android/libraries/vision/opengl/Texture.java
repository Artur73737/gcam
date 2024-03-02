package com.google.android.libraries.vision.opengl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;

public class Texture {
   private boolean generated;
   private int height;
   private int name;
   private int type;
   private int width;

   public Texture(int var1, int var2) {
      this(var1, var2, 3553);
   }

   public Texture(int var1, int var2, int var3) {
      this.name = -1;
      this.type = -1;
      this.width = -1;
      this.height = -1;
      this.generated = false;
      this.name = createTexture(var3);
      this.type = var3;
      this.width = var1;
      this.height = var2;
      this.generated = true;
   }

   public Texture(int var1, int var2, int var3, int var4) {
      this.generated = false;
      this.name = var4;
      this.type = var3;
      this.width = var1;
      this.height = var2;
   }

   public Texture(Bitmap var1) {
      this.name = -1;
      this.width = -1;
      this.height = -1;
      this.generated = false;
      this.type = 3553;
      this.width = var1.getWidth();
      this.height = var1.getHeight();
      int var2 = createTexture(this.type);
      this.name = var2;
      this.generated = true;
      GLES20.glBindTexture(this.type, var2);
      GLUtils.texImage2D(this.type, 0, var1, 0);
   }

   private static int createTexture(int var0) {
      int[] var1 = new int[1];
      GLES20.glGenTextures(1, var1, 0);
      GLES20.glBindTexture(var0, var1[0]);
      GLES20.glTexParameteri(var0, 10242, 33071);
      GLES20.glTexParameteri(var0, 10243, 33071);
      GLES20.glTexParameteri(var0, 10240, 9729);
      GLES20.glTexParameteri(var0, 10241, 9729);
      return var1[0];
   }

   public void allocate() {
      GLES20.glTexImage2D(this.type, 0, 6408, this.width, this.height, 0, 6408, 5121, (Buffer)null);
   }

   public void bind() {
      int var1 = this.name;
      if (var1 >= 0) {
         GLES20.glBindTexture(this.type, var1);
      }
   }

   public void delete() {
      int var1 = this.name;
      if (var1 >= 0 && this.generated) {
         GLES20.glDeleteTextures(1, new int[]{var1}, 0);
         this.name = -1;
         this.width = -1;
         this.height = -1;
      }

   }

   public int getHeight() {
      return this.height;
   }

   public int getName() {
      return this.name;
   }

   public int getType() {
      return this.type;
   }

   public int getWidth() {
      return this.width;
   }

   public void unbind() {
      GLES20.glBindTexture(this.type, 0);
   }
}
