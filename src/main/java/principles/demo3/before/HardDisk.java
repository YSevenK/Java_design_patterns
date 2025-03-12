package principles.demo3.before;

/**
 * 希捷硬盘
 */
public class HardDisk {
    public void save(String data) {
        System.out.println("硬盘存储数据为: " + data);
    }

    public String get() {
        System.out.println("取数据");
        return "数据";
    }
}
