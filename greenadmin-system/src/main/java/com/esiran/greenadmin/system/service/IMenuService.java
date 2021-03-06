package com.esiran.greenadmin.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.esiran.greenadmin.common.entity.APIException;
import com.esiran.greenadmin.common.exception.PostResourceException;
import com.esiran.greenadmin.system.entity.Menu;
import com.esiran.greenadmin.system.entity.MenuTreeNode;
import com.esiran.greenadmin.system.entity.TreeNode;
import com.esiran.greenadmin.system.entity.dot.MenuDTO;
import com.esiran.greenadmin.system.entity.vo.MenuTreeVo;
import io.swagger.models.auth.In;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * <p>
 * 系统菜单 服务类
 * </p>
 *
 * @author Militch
 * @since 2020-04-13
 */
public interface IMenuService extends IService<Menu> {

    List<MenuTreeVo> menuList();
    List<Menu> getMenusByUserId(Integer userId);
    List<MenuTreeNode> selectMenuTreeByUserId(Integer userId);
    IPage<Menu> menuTreeList(Page<Menu> menuPage);

    List<MenuTreeVo> getMenuTreeByType(int type);

    List<MenuTreeVo> getMenuTreeByType(Integer usserId, int type);

    List<MenuTreeVo> getMenuTreeByRoleId(Integer roleId);

    List<MenuTreeVo> getMenuTreeByUserId(Integer userId);

    List<Menu> getMenuListByRoleId(Integer roleId);

    List<Menu> getMenuListByUserId(Integer userId);

    boolean removeMenuByid(Integer menudId) throws APIException;
    void removeMenuById(Integer menuId) throws APIException, PostResourceException;

    List<Menu> findMenusByParentId(Integer parentId);
    List<MenuDTO> fa(List<Menu> menus, int deep);
    List<MenuDTO> all();

    void addMenu(MenuDTO menuDTO) throws APIException;

    MenuDTO selectMenuById(Long userId) throws APIException;

    ResponseEntity selectAllUserMenue(Page<Menu> iPage);

    ResponseEntity selectMenu(Integer id);

     ResponseEntity selectMenuAll();
}
