package xyz.haibofaith.miaosha.redis;

/**
 * @author:haibo.xiong
 * @date:2019/5/7
 * @description:
 */
public class UserKey extends BasePrefix{

    private UserKey(String prefix) {
        super(prefix);
    }
    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}