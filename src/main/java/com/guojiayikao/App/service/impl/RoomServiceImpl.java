package com.guojiayikao.App.service.impl;

import com.guojiayikao.App.dao.RoomDao;
import com.guojiayikao.App.entity.Room;
import com.guojiayikao.App.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Room)表服务实现类
 *
 * @author makejava
 * @since 2020-09-07 11:17:36
 */
@Service("roomService")
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomDao roomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roomid 主键
     * @return 实例对象
     */
    @Override
    public Room queryById(Integer roomid) {
        System.out.println("service.serviceImpl.queryById:提供者服务被调用了");
        return this.roomDao.queryById(roomid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Room> queryAllByLimit(int offset, int limit) {
        return this.roomDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room insert(Room room) {
        this.roomDao.insert(room);
        return room;
    }

    /**
     * 修改数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room update(Room room) {
        this.roomDao.update(room);
        return this.queryById(room.getRoomid());
    }

    /**
     * 通过主键删除数据
     *
     * @param roomid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roomid) {
        return this.roomDao.deleteById(roomid) > 0;
    }
}