package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_prod
 */
@TableName(value ="t_prod")
@Data
public class Prod implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String sub;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String price;

    /**
     * 
     */
    private String des;

    /**
     * 
     */
    private String imglist;

    /**
     * 
     */
    private String clrlist;

    /**
     * 
     */
    private String cltlist;

    /**
     * 
     */
    private String sizelist;

    /**
     * 
     */
    private String intr;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Prod other = (Prod) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSub() == null ? other.getSub() == null : this.getSub().equals(other.getSub()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getImglist() == null ? other.getImglist() == null : this.getImglist().equals(other.getImglist()))
            && (this.getClrlist() == null ? other.getClrlist() == null : this.getClrlist().equals(other.getClrlist()))
            && (this.getCltlist() == null ? other.getCltlist() == null : this.getCltlist().equals(other.getCltlist()))
            && (this.getSizelist() == null ? other.getSizelist() == null : this.getSizelist().equals(other.getSizelist()))
            && (this.getIntr() == null ? other.getIntr() == null : this.getIntr().equals(other.getIntr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSub() == null) ? 0 : getSub().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getImglist() == null) ? 0 : getImglist().hashCode());
        result = prime * result + ((getClrlist() == null) ? 0 : getClrlist().hashCode());
        result = prime * result + ((getCltlist() == null) ? 0 : getCltlist().hashCode());
        result = prime * result + ((getSizelist() == null) ? 0 : getSizelist().hashCode());
        result = prime * result + ((getIntr() == null) ? 0 : getIntr().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sub=").append(sub);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", desc=").append(des);
        sb.append(", imglist=").append(imglist);
        sb.append(", clrlist=").append(clrlist);
        sb.append(", cltlist=").append(cltlist);
        sb.append(", sizelist=").append(sizelist);
        sb.append(", intr=").append(intr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}