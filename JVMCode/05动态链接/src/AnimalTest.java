/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/21
 * @Content: 动态链接
 */
class Animal {
    public void eat(){
        System.out.println("Animal Eat");
    }
}
interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    @Override
    public void hunt() {
        System.out.println("狗不抓老鼠");
    }
}

class Cat extends Animal implements Huntable {

    public Cat() {
        super();
    }

    public Cat(String name) {
        this();
    }

    @Override
    public void eat() {
        super.eat(); // 早期绑定
        System.out.println("猫吃老鼠");
    }
    @Override
    public void hunt() {
        System.out.println("猫抓老鼠");
    }
}

public class AnimalTest {
    public void showAnimal(Animal animal) {
        animal.eat(); // 晚期绑定
    }
    public void showHunt(Huntable h){
        h.hunt(); // 晚期绑定
    }
}
