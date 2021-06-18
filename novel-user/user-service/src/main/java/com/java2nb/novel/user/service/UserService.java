package com.java2nb.novel.user.service;


import com.java2nb.novel.common.bean.PageBean;
import com.java2nb.novel.common.bean.UserDetails;
import com.java2nb.novel.user.entity.User;
import com.java2nb.novel.user.entity.UserBookshelf;
import com.java2nb.novel.user.entity.UserFeedback;
import com.java2nb.novel.user.entity.UserReadHistory;
import com.java2nb.novel.user.vo.BookReadHistoryVO;
import com.java2nb.novel.user.vo.BookShelfVO;

import java.util.List;

/**
 * 用户服务接口
 * @author Pete
 * @version 1.0
 * @since 2021/6/17
 */
public interface UserService {

    /**
     * 根据用户名密码查询记录
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户对象，不存在返回null
     */
    User queryByUsernameAndPassword(String username, String password);

    /**
     * 用户注册
     * @param user 用户注册信息类
     * @return jwt载体信息类
     * */
    UserDetails register(User user);

    /**
     * 用户登陆
     * @param user 用户登陆信息类
     * @return jwt载体信息类
     * */
    UserDetails login(User user);


    /**
     * 根据用户名ID集合查询用户集合信息
     *
     * @param ids 用户ID集合
     * @return 用户集合对象
     */
    List<User> queryById(List<Long> ids);


    /**
     * 查询小说是否已加入书架
     *
     * @param userId 用户ID
     * @param bookId 小说ID
     * @return true:已加入书架，未加入书架
     */
    Boolean queryIsInShelf(Long userId, Long bookId);

    /**
     * 加入书架
     *
     * @param userId       用户ID
     * @param bookId       小说ID
     * @param preContentId 阅读的内容ID
     */
    void addToBookShelf(Long userId, Long bookId, Long preContentId);

    /**
     * 移出书架
     *
     * @param userId 用户ID
     * @param bookId 小说ID
     */
    void removeFromBookShelf(Long userId, Long bookId);

    /**
     * 查询书架
     *
     * @param userId   用户ID
     * @param page
     * @param pageSize
     * @return 书架分页集合
     */
    PageBean<UserBookshelf> listBookShelfByPage(Long userId, int page, int pageSize);

    /**
     * 分页查询阅读记录
     *
     * @param userId   用户id
     * @param page     页码
     * @param pageSize 分页大小
     * @return
     */
    PageBean<UserReadHistory> listReadHistoryByPage(Long userId, int page, int pageSize);

    /**
     * 添加阅读记录
     *
     * @param userId       用户id
     * @param bookId       书籍id
     * @param preContentId 阅读的目录id
     */
    void addReadHistory(Long userId, Long bookId, Long preContentId);



    /**
     * 添加反馈
     * @param userId 用户id
     * @param content 反馈内容
     * */
    void addFeedBack(Long userId, String content);

    /**
     * 分页查询我的反馈列表
     * @param userId 用户ID
     * @param page 页码
     * @param pageSize 分页大小
     * @return 反馈集合
     * */
    PageBean<UserFeedback> listUserFeedBackByPage(Long userId, int page, int pageSize);

    /**
     * 查询个人信息
     * @param userId 用户id
     * @return 用户信息
     * */
    User userInfo(Long userId);

    /**
     * 更新个人信息
     * @param userId 用户id
     * @param user 需要更新的信息
     * */
    void updateUserInfo(Long userId, User user);

    /**
     * 更新密码
     * @param userId 用户id
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * */
    void updatePassword(Long userId, String oldPassword, String newPassword);

}
