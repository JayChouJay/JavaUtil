package structure.flyweight;

/**
 * 汽车模具类，包含模具的参数信息
 */
public class CarMold {
    /**
     * 模具的形状和材料
     */
    private String shape;
    private String material;

    /**
     * 生成汽车
     */
    public void produceCar(String brand) {
        System.out.println("生产一辆" + brand + "品牌的汽车，模具形状：" + shape + "，模具材料：" + material);
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
