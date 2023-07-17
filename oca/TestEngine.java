package oca;

class Engine {
    int hp;
    String model;
    Engine(){
        hp = 80;
        model = "Junior";
    }
}

class TestEngine {
        public static void main(String[] args) {
        Engine e1 = new Engine();
        Engine e2 = test1(e1);
        test2(e2);
        System.out.println(e1.hp + " " + e2.model);
    }
        
        public static Engine test1(Engine e) {
            e.model = "Senior";
            e.hp = 120;
            return e;
        }
        
        public static void test2(Engine e) {
            e.model = "Grandpa";
            e.hp = 180;
        }

}
