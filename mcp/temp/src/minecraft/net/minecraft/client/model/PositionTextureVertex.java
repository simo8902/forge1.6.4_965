package net.minecraft.client.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Vec3;

@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
public class PositionTextureVertex {

   public Vec3 field_78243_a;
   public float field_78241_b;
   public float field_78242_c;


   public PositionTextureVertex(float p_i1158_1_, float p_i1158_2_, float p_i1158_3_, float p_i1158_4_, float p_i1158_5_) {
      this(Vec3.func_72443_a((double)p_i1158_1_, (double)p_i1158_2_, (double)p_i1158_3_), p_i1158_4_, p_i1158_5_);
   }

   public PositionTextureVertex func_78240_a(float p_78240_1_, float p_78240_2_) {
      return new PositionTextureVertex(this, p_78240_1_, p_78240_2_);
   }

   public PositionTextureVertex(PositionTextureVertex p_i1159_1_, float p_i1159_2_, float p_i1159_3_) {
      this.field_78243_a = p_i1159_1_.field_78243_a;
      this.field_78241_b = p_i1159_2_;
      this.field_78242_c = p_i1159_3_;
   }

   public PositionTextureVertex(Vec3 p_i1160_1_, float p_i1160_2_, float p_i1160_3_) {
      this.field_78243_a = p_i1160_1_;
      this.field_78241_b = p_i1160_2_;
      this.field_78242_c = p_i1160_3_;
   }
}
