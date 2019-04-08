package 朱磊.DesignMode.观察者模式;

/**
 * @Author: zl
 * @Date: 2019/4/2 12:36
 * @Description: 有一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息。
 */
public class Test {

    public static void main(String[] args) {
        // 初始化微信服务器
        WeChatServer server = new WeChatServer();
        // 初始化用户信息
        Observer longshao = new User("longshao");
        Observer jieyin = new User("jieyin");
        Observer zhaozhiqiang = new User("zhaozhiqiang");
        // 用户关注微信公众号
        server.registerObserver(longshao);
        server.registerObserver(jieyin);
        server.registerObserver(zhaozhiqiang);
        // 公众号推送消息
        server.setInfomation("PHP是世界上最好的语言！");

        System.out.println("----------------------------------------------");
        // 某一用户取消关注公众号
        server.removeObserver(longshao);
        server.setInfomation("JAVA是世界上最好的语言！");

    }
}
