package principles.demo1;

public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SougouInput input = new SougouInput();

        // 2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        MySkin mySkin = new MySkin();

        // 3.将皮肤设置到输入法
        // input.setSkin(skin);
        input.setSkin(mySkin);

        input.display();
    }
}
