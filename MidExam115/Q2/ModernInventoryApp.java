package MidExam115.Q2;

public class ModernInventoryApp {
    private InventoryService inventoryService;

    public ModernInventoryApp(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void updateStock(String item, int quantity) {
        inventoryService.updateStock(item, quantity);
    }
}