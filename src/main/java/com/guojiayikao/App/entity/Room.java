package com.guojiayikao.App.entity;

import java.io.Serializable;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2020-09-07 11:17:32
 */
public class Room implements Serializable {
    private static final long serialVersionUID = -87696582170350544L;

    private Integer roomid;

    private String roomtype;

    private Integer roomprice;

    private Integer roomstock;

    private String image;

    private String remark;


    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Integer roomprice) {
        this.roomprice = roomprice;
    }

    public Integer getRoomstock() {
        return roomstock;
    }

    public void setRoomstock(Integer roomstock) {
        this.roomstock = roomstock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}