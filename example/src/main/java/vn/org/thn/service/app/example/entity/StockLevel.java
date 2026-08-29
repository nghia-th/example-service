package vn.org.thn.service.app.example.entity;

import vn.org.thn.service.base.db.mybatis.annotation.Entity;
import vn.org.thn.service.base.db.mybatis.annotation.Id;
import vn.org.thn.service.base.db.mybatis.annotation.Table;

import java.math.BigDecimal;

/**
 * DB test entity #2: composite primary key {@code (warehouseCode, sku)}, no auto-generated
 * column - one row per warehouse/SKU pair. Exercises {@code BaseRepository#findByIds}/
 * {@code #existsByIds}/{@code #deleteByIds} (the composite-key path {@code save()} also goes
 * through internally when both key columns are supplied), plus a {@link BigDecimal} column to
 * check numeric type mapping.
 */
@Entity
@Table(name = "stock_level")
public class StockLevel {

    @Id
    private String warehouseCode;

    @Id
    private String sku;

    private Integer quantity = 0;
    private BigDecimal unitPrice;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
