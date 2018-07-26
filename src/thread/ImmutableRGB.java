package thread;

/**
 * Created by yi.yh on 2018/7/25.
 * 以下规则定义了用于创建不可变对象的简单策略。并非所有记录为“不可变”的类都遵循这些规则。这并不一定意味着这些课程的创造者是草率的 - 他们可能有充分的理由相信他们的课程实例在建造后永远不会改变。但是，这种策略需要复杂的分析，不适合初学者。

 不要提供“setter”方法 - 修改字段引用的字段或对象的方法。
 制作所有字段final和private。
 不允许子类重写方法。最简单的方法是将类声明为final。更复杂的方法是private在工厂方法中构造构造函数和构造实例。
 如果实例字段包含对可变对象的引用，则不允许更改这些对象：
 不要提供修改可变对象的方法。
 不要共享对可变对象的引用。永远不要存储对传递给构造函数的外部可变对象的引用; 如有必要，创建副本并存储对副本的引用。同样，必要时创建内部可变对象的副本，以避免在方法中返回原始对象。
 将此策略应用于SynchronizedRGB以下步骤：

 这个类中有两个setter方法。第一个，set任意转换对象，并且在类的不可变版本中没有位置。第二个，invert可以通过让它创建一个新对象而不是修改现有对象来进行调整。
 所有领域都已private; 他们进一步被认定为final。
 类本身已声明final。
 只有一个字段引用一个对象，该对象本身是不可变的。因此，不需要防止改变“包含的”可变对象的状态的保护措施。
 */
final public class ImmutableRGB  {
    // Values must be between 0 and 255.
    final private int red;
    final private int green;
    final private int blue;
    final private String name;

    private void check(int red,
                       int green,
                       int blue) {
        if (red < 0 || red > 255
                || green < 0 || green > 255
                || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public ImmutableRGB(int red,
                        int green,
                        int blue,
                        String name) {
        check(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }


    public int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public String getName() {
        return name;
    }

    public ImmutableRGB invert() {
        return new ImmutableRGB(255 - red,
                255 - green,
                255 - blue,
                "Inverse of " + name);
    }
}
