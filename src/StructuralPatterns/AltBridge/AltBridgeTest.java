package StructuralPatterns.AltBridge;

public class AltBridgeTest {

    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println("The valkyrie receives an enchanted hammer.");
        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }


}
