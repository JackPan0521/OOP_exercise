package MidExam115.Q2;

public class LegacyInventorySystemAdapter implements InventoryService{
     private LegacyInventorySystem legacySystem = new LegacyInventorySystem();

    // 實作新介面的方法，內部呼叫舊系統方法
    @Override
    public void updateStock(String item, int quantity) {
        legacySystem.updateLegacyStock(item, quantity);
    }
}
