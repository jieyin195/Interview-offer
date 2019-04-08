package 朱磊.DesignMode.代理者模式.动态代理;

/**
 * @Author: zl
 * @Date: 2019/4/2 17:34
 * @Description:
 */
public class BookFacadeImpl implements BookFacade {

    @Override
    public void addBook() {
        System.out.println("增加图书方法。。。");
    }

}
