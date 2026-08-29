package vn.org.thn.service.app.example.entity;

import java.io.Serializable;

/**
 * Composite id for {@link StockLevel}: (warehouseCode, sku). Field names must match
 * {@link StockLevel}'s exactly - {@code BaseRepositoryImpl#withCompositeId} reads them by field
 * name via reflection to build the WHERE clause (same mechanism as
 * {@code vn.org.thn.service.base.i18n.TranslateId}).
 */
public class StockLevelId implements Serializable {

    private String warehouseCode;
    private String sku;

    public StockLevelId() {
    }

    public StockLevelId(String warehouseCode, String sku) {
        this.warehouseCode = warehouseCode;
        this.sku = sku;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
