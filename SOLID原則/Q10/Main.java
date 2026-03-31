package SOLID原則.Q10;

class Main {
    public static void main(String[] args) {        
        Bird p = new Sparrow();
        p.whoAmI(); //顯示"我是鳥"
        p.move(); //顯示"麻雀飛行"

        p = new Penguin();
        p.whoAmI(); //顯示"我是企鵝"
        p.move(); //顯示"企鵝走路"
  }
}